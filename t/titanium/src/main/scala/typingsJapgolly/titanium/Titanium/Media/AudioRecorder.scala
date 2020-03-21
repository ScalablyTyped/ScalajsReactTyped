package typingsJapgolly.titanium.Titanium.Media

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.titanium.Titanium.Filesystem.File
import typingsJapgolly.titanium.Titanium.Proxy
import typingsJapgolly.titanium.Titanium.UI.TabGroup
import typingsJapgolly.titanium.Titanium.UI.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An audio recorder object used for recording audio from the device microphone.
		 */
trait AudioRecorder extends Proxy {
  /**
  			 * Audio compression to be used for the recording.
  			 */
  var compression: Double
  /**
  			 * Audio format to be used for the recording.
  			 */
  var format: Double
  /**
  			 * Indicates if the audio recorder is paused.
  			 */
  val paused: Boolean
  /**
  			 * Indicates if the audio recorder is recording.
  			 */
  val recording: Boolean
  /**
  			 * Indicates if the audio recorder is stopped.
  			 */
  val stopped: Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioRecorder.compression> property.
  			 */
  def getCompression(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioRecorder.format> property.
  			 */
  def getFormat(): Double
  /**
  			 * Gets the value of the <Titanium.Media.AudioRecorder.paused> property.
  			 */
  def getPaused(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioRecorder.recording> property.
  			 */
  def getRecording(): Boolean
  /**
  			 * Gets the value of the <Titanium.Media.AudioRecorder.stopped> property.
  			 */
  def getStopped(): Boolean
  /**
  			 * Pauses the current audio recording.
  			 */
  def pause(): Unit
  /**
  			 * Resumes a paused recording.
  			 */
  def resume(): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioRecorder.compression> property.
  			 */
  def setCompression(compression: Double): Unit
  /**
  			 * Sets the value of the <Titanium.Media.AudioRecorder.format> property.
  			 */
  def setFormat(format: Double): Unit
  /**
  			 * Starts an audio recording.
  			 */
  def start(): Unit
  /**
  			 * Stops the current audio recording and returns the recorded audio file.
  			 */
  def stop(): File
}

object AudioRecorder {
  @scala.inline
  def apply(
    addEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    apiName: String,
    applyProperties: js.Any => Callback,
    bubbleParent: Boolean,
    compression: Double,
    fireEvent: (String, js.Any) => Callback,
    format: Double,
    getApiName: CallbackTo[String],
    getBubbleParent: CallbackTo[Boolean],
    getCompression: CallbackTo[Double],
    getFormat: CallbackTo[Double],
    getPaused: CallbackTo[Boolean],
    getRecording: CallbackTo[Boolean],
    getStopped: CallbackTo[Boolean],
    pause: Callback,
    paused: Boolean,
    recording: Boolean,
    removeEventListener: (String, js.Function1[/* param0 */ js.Any, js.Any]) => Callback,
    resume: Callback,
    setBubbleParent: Boolean => Callback,
    setCompression: Double => Callback,
    setFormat: Double => Callback,
    start: Callback,
    stop: CallbackTo[File],
    stopped: Boolean,
    getLifecycleContainer: js.UndefOr[CallbackTo[Window | TabGroup]] = js.undefined,
    lifecycleContainer: Window | TabGroup = null,
    setLifecycleContainer: (js.Function1[/* lifecycleContainer */ Window, Unit]) with (js.Function1[/* lifecycleContainer */ TabGroup, Unit]) = null
  ): AudioRecorder = {
    val __obj = js.Dynamic.literal(apiName = apiName.asInstanceOf[js.Any], bubbleParent = bubbleParent.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], recording = recording.asInstanceOf[js.Any], stopped = stopped.asInstanceOf[js.Any])
    __obj.updateDynamic("addEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => addEventListener(t0, t1).runNow()))
    __obj.updateDynamic("applyProperties")(js.Any.fromFunction1((t0: js.Any) => applyProperties(t0).runNow()))
    __obj.updateDynamic("fireEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => fireEvent(t0, t1).runNow()))
    __obj.updateDynamic("getApiName")(getApiName.toJsFn)
    __obj.updateDynamic("getBubbleParent")(getBubbleParent.toJsFn)
    __obj.updateDynamic("getCompression")(getCompression.toJsFn)
    __obj.updateDynamic("getFormat")(getFormat.toJsFn)
    __obj.updateDynamic("getPaused")(getPaused.toJsFn)
    __obj.updateDynamic("getRecording")(getRecording.toJsFn)
    __obj.updateDynamic("getStopped")(getStopped.toJsFn)
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("removeEventListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* param0 */ js.Any, js.Any]) => removeEventListener(t0, t1).runNow()))
    __obj.updateDynamic("resume")(resume.toJsFn)
    __obj.updateDynamic("setBubbleParent")(js.Any.fromFunction1((t0: scala.Boolean) => setBubbleParent(t0).runNow()))
    __obj.updateDynamic("setCompression")(js.Any.fromFunction1((t0: scala.Double) => setCompression(t0).runNow()))
    __obj.updateDynamic("setFormat")(js.Any.fromFunction1((t0: scala.Double) => setFormat(t0).runNow()))
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    getLifecycleContainer.foreach(p => __obj.updateDynamic("getLifecycleContainer")(p.toJsFn))
    if (lifecycleContainer != null) __obj.updateDynamic("lifecycleContainer")(lifecycleContainer.asInstanceOf[js.Any])
    if (setLifecycleContainer != null) __obj.updateDynamic("setLifecycleContainer")(setLifecycleContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioRecorder]
  }
}

