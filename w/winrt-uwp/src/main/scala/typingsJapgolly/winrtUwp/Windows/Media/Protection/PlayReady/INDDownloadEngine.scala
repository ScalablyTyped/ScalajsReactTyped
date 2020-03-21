package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the PlayReady-ND download engine used to stream protected media content from a transmitter. */
trait INDDownloadEngine extends js.Object {
  /** Gets the maximum threshold of the sample buffer. */
  var bufferFullMaxThresholdInSamples: Double
  /** Gets the minimum number of samples a sample buffer can hold before a download engine resumes downloading. */
  var bufferFullMinThresholdInSamples: Double
  /** Gets whether the download engine supports seeking. */
  var canSeek: Boolean
  /** Gets the download engine notifier that will provide notification of download stream events from the transmitter. */
  var notifier: NDDownloadEngineNotifier
  /** Notifies the download engine to stop downloading and disconnect from the remote server. */
  def close(): Unit
  /**
    * Notifies the download engine to open the content specified by a URL.
    * @param uri The URI from which the download engine gets content.
    * @param sessionIDBytes The session identifier used to identify the session. The session identifier must be 16 bytes.
    */
  def open(uri: Uri, sessionIDBytes: js.Array[Double]): Unit
  /** Notifies the download engine to pause downloading. */
  def pause(): Unit
  /** Notifies the download engine to resume a paused download. */
  def resume(): Unit
  /**
    * Notifies the download engine to go to a specified time position in the media stream.
    * @param startPosition The position within the media stream to which to seek.
    */
  def seek(startPosition: Double): Unit
}

object INDDownloadEngine {
  @scala.inline
  def apply(
    bufferFullMaxThresholdInSamples: Double,
    bufferFullMinThresholdInSamples: Double,
    canSeek: Boolean,
    close: Callback,
    notifier: NDDownloadEngineNotifier,
    open: (Uri, js.Array[Double]) => Callback,
    pause: Callback,
    resume: Callback,
    seek: Double => Callback
  ): INDDownloadEngine = {
    val __obj = js.Dynamic.literal(bufferFullMaxThresholdInSamples = bufferFullMaxThresholdInSamples.asInstanceOf[js.Any], bufferFullMinThresholdInSamples = bufferFullMinThresholdInSamples.asInstanceOf[js.Any], canSeek = canSeek.asInstanceOf[js.Any], notifier = notifier.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("open")(js.Any.fromFunction2((t0: typingsJapgolly.winrtUwp.Windows.Foundation.Uri, t1: js.Array[scala.Double]) => open(t0, t1).runNow()))
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("resume")(resume.toJsFn)
    __obj.updateDynamic("seek")(js.Any.fromFunction1((t0: scala.Double) => seek(t0).runNow()))
    __obj.asInstanceOf[INDDownloadEngine]
  }
}

