package typingsJapgolly.winrtUwp.Windows.Media.Protection.PlayReady

import japgolly.scalajs.react.Callback
import typingsJapgolly.winrtUwp.Windows.Foundation.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the PlayReady-ND download engine used to stream protected media content from a transmitter. */
trait INDDownloadEngine extends StObject {
  
  /** Gets the maximum threshold of the sample buffer. */
  var bufferFullMaxThresholdInSamples: Double
  
  /** Gets the minimum number of samples a sample buffer can hold before a download engine resumes downloading. */
  var bufferFullMinThresholdInSamples: Double
  
  /** Gets whether the download engine supports seeking. */
  var canSeek: Boolean
  
  /** Notifies the download engine to stop downloading and disconnect from the remote server. */
  def close(): Unit
  
  /** Gets the download engine notifier that will provide notification of download stream events from the transmitter. */
  var notifier: NDDownloadEngineNotifier
  
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
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(bufferFullMaxThresholdInSamples = bufferFullMaxThresholdInSamples.asInstanceOf[js.Any], bufferFullMinThresholdInSamples = bufferFullMinThresholdInSamples.asInstanceOf[js.Any], canSeek = canSeek.asInstanceOf[js.Any], close = close.toJsFn, notifier = notifier.asInstanceOf[js.Any], open = js.Any.fromFunction2((t0: Uri, t1: js.Array[Double]) => (open(t0, t1)).runNow()), pause = pause.toJsFn, resume = resume.toJsFn, seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()))
    __obj.asInstanceOf[INDDownloadEngine]
  }
  
  extension [Self <: INDDownloadEngine](x: Self) {
    
    inline def setBufferFullMaxThresholdInSamples(value: Double): Self = StObject.set(x, "bufferFullMaxThresholdInSamples", value.asInstanceOf[js.Any])
    
    inline def setBufferFullMinThresholdInSamples(value: Double): Self = StObject.set(x, "bufferFullMinThresholdInSamples", value.asInstanceOf[js.Any])
    
    inline def setCanSeek(value: Boolean): Self = StObject.set(x, "canSeek", value.asInstanceOf[js.Any])
    
    inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
    
    inline def setNotifier(value: NDDownloadEngineNotifier): Self = StObject.set(x, "notifier", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: (Uri, js.Array[Double]) => Callback): Self = StObject.set(x, "open", js.Any.fromFunction2((t0: Uri, t1: js.Array[Double]) => (value(t0, t1)).runNow()))
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setResume(value: Callback): Self = StObject.set(x, "resume", value.toJsFn)
    
    inline def setSeek(value: Double => Callback): Self = StObject.set(x, "seek", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
