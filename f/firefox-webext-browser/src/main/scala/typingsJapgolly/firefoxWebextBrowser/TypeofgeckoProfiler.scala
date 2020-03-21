package typingsJapgolly.firefoxWebextBrowser

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofgeckoProfiler extends js.Object {
  /* geckoProfiler events */
  /**
    * Fires when the profiler starts/stops running.
    * @param isRunning Whether the profiler is running or not. Pausing the profiler will not affect this value.
    */
  val onRunning: WebExtEvent[js.Function1[/* isRunning */ Boolean, Unit]]
  /**
    * Gathers the profile data from the current profiling session, and writes it to disk. The returned promise
    * resolves to a path that locates the created file.
    * @param fileName The name of the file inside the profile/profiler directory
    */
  def dumpProfileToFile(fileName: String): js.Promise[_]
  /** Gathers the profile data from the current profiling session. */
  def getProfile(): js.Promise[_]
  /**
    * Gathers the profile data from the current profiling session. The returned promise resolves to an array buffer
    * that contains a JSON string.
    */
  def getProfileAsArrayBuffer(): js.Promise[_]
  /**
    * Gathers the profile data from the current profiling session. The returned promise resolves to an array buffer
    * that contains a gzipped JSON string.
    */
  def getProfileAsGzippedArrayBuffer(): js.Promise[_]
  /**
    * Gets the debug symbols for a particular library.
    * @param debugName The name of the library's debug file. For example, 'xul.pdb
    * @param breakpadId The Breakpad ID of the library
    */
  def getSymbols(debugName: String, breakpadId: String): js.Promise[_]
  /** Pauses the profiler, keeping any profile data that is already written. */
  def pause(): js.Promise[_]
  /** Resumes the profiler with the settings that were initially used to start it. */
  def resume(): js.Promise[_]
  /* geckoProfiler functions */
  /** Starts the profiler with the specified settings. */
  def start(settings: AnonBufferSize): js.Promise[_]
  /** Stops the profiler and discards any captured profile data. */
  def stop(): js.Promise[_]
}

object TypeofgeckoProfiler {
  @scala.inline
  def apply(
    dumpProfileToFile: String => CallbackTo[js.Promise[js.Any]],
    getProfile: CallbackTo[js.Promise[js.Any]],
    getProfileAsArrayBuffer: CallbackTo[js.Promise[js.Any]],
    getProfileAsGzippedArrayBuffer: CallbackTo[js.Promise[js.Any]],
    getSymbols: (String, String) => CallbackTo[js.Promise[js.Any]],
    onRunning: WebExtEvent[js.Function1[/* isRunning */ Boolean, Unit]],
    pause: CallbackTo[js.Promise[js.Any]],
    resume: CallbackTo[js.Promise[js.Any]],
    start: AnonBufferSize => CallbackTo[js.Promise[js.Any]],
    stop: CallbackTo[js.Promise[js.Any]]
  ): TypeofgeckoProfiler = {
    val __obj = js.Dynamic.literal(onRunning = onRunning.asInstanceOf[js.Any])
    __obj.updateDynamic("dumpProfileToFile")(js.Any.fromFunction1((t0: java.lang.String) => dumpProfileToFile(t0).runNow()))
    __obj.updateDynamic("getProfile")(getProfile.toJsFn)
    __obj.updateDynamic("getProfileAsArrayBuffer")(getProfileAsArrayBuffer.toJsFn)
    __obj.updateDynamic("getProfileAsGzippedArrayBuffer")(getProfileAsGzippedArrayBuffer.toJsFn)
    __obj.updateDynamic("getSymbols")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => getSymbols(t0, t1).runNow()))
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("resume")(resume.toJsFn)
    __obj.updateDynamic("start")(js.Any.fromFunction1((t0: typingsJapgolly.firefoxWebextBrowser.AnonBufferSize) => start(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[TypeofgeckoProfiler]
  }
}

