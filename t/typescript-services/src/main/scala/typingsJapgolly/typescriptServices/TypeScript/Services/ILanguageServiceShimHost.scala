package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptServices.TypeScript.ILogger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanguageServiceShimHost extends ILogger {
  def directoryExists(path: String): Boolean
  def fileExists(path: String): Boolean
  def getCompilationSettings(): String
  def getDiagnosticsObject(): ILanguageServicesDiagnostics
  def getLocalizedDiagnosticMessages(): String
  def getParentDirectory(path: String): String
  def getScriptByteOrderMark(fileName: String): Double
  def getScriptFileNames(): String
  def getScriptIsOpen(fileName: String): Boolean
  def getScriptSnapshot(fileName: String): IScriptSnapshotShim
  def getScriptVersion(fileName: String): Double
  def resolveRelativePath(path: String, directory: String): String
}

object ILanguageServiceShimHost {
  @scala.inline
  def apply(
    debug: CallbackTo[Boolean],
    directoryExists: String => CallbackTo[Boolean],
    error: CallbackTo[Boolean],
    fatal: CallbackTo[Boolean],
    fileExists: String => CallbackTo[Boolean],
    getCompilationSettings: CallbackTo[String],
    getDiagnosticsObject: CallbackTo[ILanguageServicesDiagnostics],
    getLocalizedDiagnosticMessages: CallbackTo[String],
    getParentDirectory: String => CallbackTo[String],
    getScriptByteOrderMark: String => CallbackTo[Double],
    getScriptFileNames: CallbackTo[String],
    getScriptIsOpen: String => CallbackTo[Boolean],
    getScriptSnapshot: String => CallbackTo[IScriptSnapshotShim],
    getScriptVersion: String => CallbackTo[Double],
    information: CallbackTo[Boolean],
    log: String => Callback,
    resolveRelativePath: (String, String) => CallbackTo[String],
    warning: CallbackTo[Boolean]
  ): ILanguageServiceShimHost = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(debug.toJsFn)
    __obj.updateDynamic("directoryExists")(js.Any.fromFunction1((t0: java.lang.String) => directoryExists(t0).runNow()))
    __obj.updateDynamic("error")(error.toJsFn)
    __obj.updateDynamic("fatal")(fatal.toJsFn)
    __obj.updateDynamic("fileExists")(js.Any.fromFunction1((t0: java.lang.String) => fileExists(t0).runNow()))
    __obj.updateDynamic("getCompilationSettings")(getCompilationSettings.toJsFn)
    __obj.updateDynamic("getDiagnosticsObject")(getDiagnosticsObject.toJsFn)
    __obj.updateDynamic("getLocalizedDiagnosticMessages")(getLocalizedDiagnosticMessages.toJsFn)
    __obj.updateDynamic("getParentDirectory")(js.Any.fromFunction1((t0: java.lang.String) => getParentDirectory(t0).runNow()))
    __obj.updateDynamic("getScriptByteOrderMark")(js.Any.fromFunction1((t0: java.lang.String) => getScriptByteOrderMark(t0).runNow()))
    __obj.updateDynamic("getScriptFileNames")(getScriptFileNames.toJsFn)
    __obj.updateDynamic("getScriptIsOpen")(js.Any.fromFunction1((t0: java.lang.String) => getScriptIsOpen(t0).runNow()))
    __obj.updateDynamic("getScriptSnapshot")(js.Any.fromFunction1((t0: java.lang.String) => getScriptSnapshot(t0).runNow()))
    __obj.updateDynamic("getScriptVersion")(js.Any.fromFunction1((t0: java.lang.String) => getScriptVersion(t0).runNow()))
    __obj.updateDynamic("information")(information.toJsFn)
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: java.lang.String) => log(t0).runNow()))
    __obj.updateDynamic("resolveRelativePath")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => resolveRelativePath(t0, t1).runNow()))
    __obj.updateDynamic("warning")(warning.toJsFn)
    __obj.asInstanceOf[ILanguageServiceShimHost]
  }
}

