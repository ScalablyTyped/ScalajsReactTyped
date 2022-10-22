package typingsJapgolly.electron.Electron

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CrashReporter extends StObject {
  
  // Docs: https://electronjs.org/docs/api/crash-reporter
  /**
    * Set an extra parameter to be sent with the crash report. The values specified
    * here will be sent in addition to any values set via the `extra` option when
    * `start` was called.
    *
    * Parameters added in this fashion (or via the `extra` parameter to
    * `crashReporter.start`) are specific to the calling process. Adding extra
    * parameters in the main process will not cause those parameters to be sent along
    * with crashes from renderer or other child processes. Similarly, adding extra
    * parameters in a renderer process will not result in those parameters being sent
    * with crashes that occur in other renderer processes or in the main process.
    *
    * **Note:** Parameters have limits on the length of the keys and values. Key names
    * must be no longer than 39 bytes, and values must be no longer than 20320 bytes.
    * Keys with names longer than the maximum will be silently ignored. Key values
    * longer than the maximum length will be truncated.
    */
  def addExtraParameter(key: String, value: String): Unit
  
  /**
    * The date and ID of the last crash report. Only crash reports that have been
    * uploaded will be returned; even if a crash report is present on disk it will not
    * be returned until it is uploaded. In the case that there are no uploaded
    * reports, `null` is returned.
    *
    * **Note:** This method is only available in the main process.
    */
  def getLastCrashReport(): CrashReport
  
  /**
    * The current 'extra' parameters of the crash reporter.
    */
  def getParameters(): Record[String, String]
  
  /**
    * Whether reports should be submitted to the server. Set through the `start`
    * method or `setUploadToServer`.
    *
    * **Note:** This method is only available in the main process.
    */
  def getUploadToServer(): Boolean
  
  /**
    * Returns all uploaded crash reports. Each report contains the date and uploaded
    * ID.
    *
    * **Note:** This method is only available in the main process.
    */
  def getUploadedReports(): js.Array[CrashReport]
  
  /**
    * Remove an extra parameter from the current set of parameters. Future crashes
    * will not include this parameter.
    */
  def removeExtraParameter(key: String): Unit
  
  /**
    * This would normally be controlled by user preferences. This has no effect if
    * called before `start` is called.
    *
    * **Note:** This method is only available in the main process.
    */
  def setUploadToServer(uploadToServer: Boolean): Unit
  
  /**
    * This method must be called before using any other `crashReporter` APIs. Once
    * initialized this way, the crashpad handler collects crashes from all
    * subsequently created processes. The crash reporter cannot be disabled once
    * started.
    *
    * This method should be called as early as possible in app startup, preferably
    * before `app.on('ready')`. If the crash reporter is not initialized at the time a
    * renderer process is created, then that renderer process will not be monitored by
    * the crash reporter.
    *
    * **Note:** You can test out the crash reporter by generating a crash using
    * `process.crash()`.
    *
    * **Note:** If you need to send additional/updated `extra` parameters after your
    * first call `start` you can call `addExtraParameter`.
    *
    * **Note:** Parameters passed in `extra`, `globalExtra` or set with
    * `addExtraParameter` have limits on the length of the keys and values. Key names
    * must be at most 39 bytes long, and values must be no longer than 127 bytes. Keys
    * with names longer than the maximum will be silently ignored. Key values longer
    * than the maximum length will be truncated.
    *
    * **Note:** This method is only available in the main process.
    */
  def start(options: CrashReporterStartOptions): Unit
}
object CrashReporter {
  
  inline def apply(
    addExtraParameter: (String, String) => Callback,
    getLastCrashReport: CallbackTo[CrashReport],
    getParameters: CallbackTo[Record[String, String]],
    getUploadToServer: CallbackTo[Boolean],
    getUploadedReports: CallbackTo[js.Array[CrashReport]],
    removeExtraParameter: String => Callback,
    setUploadToServer: Boolean => Callback,
    start: CrashReporterStartOptions => Callback
  ): CrashReporter = {
    val __obj = js.Dynamic.literal(addExtraParameter = js.Any.fromFunction2((t0: String, t1: String) => (addExtraParameter(t0, t1)).runNow()), getLastCrashReport = getLastCrashReport.toJsFn, getParameters = getParameters.toJsFn, getUploadToServer = getUploadToServer.toJsFn, getUploadedReports = getUploadedReports.toJsFn, removeExtraParameter = js.Any.fromFunction1((t0: String) => removeExtraParameter(t0).runNow()), setUploadToServer = js.Any.fromFunction1((t0: Boolean) => setUploadToServer(t0).runNow()), start = js.Any.fromFunction1((t0: CrashReporterStartOptions) => start(t0).runNow()))
    __obj.asInstanceOf[CrashReporter]
  }
  
  extension [Self <: CrashReporter](x: Self) {
    
    inline def setAddExtraParameter(value: (String, String) => Callback): Self = StObject.set(x, "addExtraParameter", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
    
    inline def setGetLastCrashReport(value: CallbackTo[CrashReport]): Self = StObject.set(x, "getLastCrashReport", value.toJsFn)
    
    inline def setGetParameters(value: CallbackTo[Record[String, String]]): Self = StObject.set(x, "getParameters", value.toJsFn)
    
    inline def setGetUploadToServer(value: CallbackTo[Boolean]): Self = StObject.set(x, "getUploadToServer", value.toJsFn)
    
    inline def setGetUploadedReports(value: CallbackTo[js.Array[CrashReport]]): Self = StObject.set(x, "getUploadedReports", value.toJsFn)
    
    inline def setRemoveExtraParameter(value: String => Callback): Self = StObject.set(x, "removeExtraParameter", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetUploadToServer(value: Boolean => Callback): Self = StObject.set(x, "setUploadToServer", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setStart(value: CrashReporterStartOptions => Callback): Self = StObject.set(x, "start", js.Any.fromFunction1((t0: CrashReporterStartOptions) => value(t0).runNow()))
  }
}
