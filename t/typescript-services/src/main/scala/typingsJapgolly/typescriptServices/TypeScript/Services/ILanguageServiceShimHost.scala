package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptServices.TypeScript.ILogger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILanguageServiceShimHost
  extends StObject
     with ILogger {
  
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
  
  inline def apply(
    debug: CallbackTo[Boolean],
    directoryExists: String => Boolean,
    error: CallbackTo[Boolean],
    fatal: CallbackTo[Boolean],
    fileExists: String => Boolean,
    getCompilationSettings: CallbackTo[String],
    getDiagnosticsObject: CallbackTo[ILanguageServicesDiagnostics],
    getLocalizedDiagnosticMessages: CallbackTo[String],
    getParentDirectory: String => String,
    getScriptByteOrderMark: String => Double,
    getScriptFileNames: CallbackTo[String],
    getScriptIsOpen: String => Boolean,
    getScriptSnapshot: String => IScriptSnapshotShim,
    getScriptVersion: String => Double,
    information: CallbackTo[Boolean],
    log: String => Callback,
    resolveRelativePath: (String, String) => String,
    warning: CallbackTo[Boolean]
  ): ILanguageServiceShimHost = {
    val __obj = js.Dynamic.literal(debug = debug.toJsFn, directoryExists = js.Any.fromFunction1(directoryExists), error = error.toJsFn, fatal = fatal.toJsFn, fileExists = js.Any.fromFunction1(fileExists), getCompilationSettings = getCompilationSettings.toJsFn, getDiagnosticsObject = getDiagnosticsObject.toJsFn, getLocalizedDiagnosticMessages = getLocalizedDiagnosticMessages.toJsFn, getParentDirectory = js.Any.fromFunction1(getParentDirectory), getScriptByteOrderMark = js.Any.fromFunction1(getScriptByteOrderMark), getScriptFileNames = getScriptFileNames.toJsFn, getScriptIsOpen = js.Any.fromFunction1(getScriptIsOpen), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), getScriptVersion = js.Any.fromFunction1(getScriptVersion), information = information.toJsFn, log = js.Any.fromFunction1((t0: String) => log(t0).runNow()), resolveRelativePath = js.Any.fromFunction2(resolveRelativePath), warning = warning.toJsFn)
    __obj.asInstanceOf[ILanguageServiceShimHost]
  }
  
  extension [Self <: ILanguageServiceShimHost](x: Self) {
    
    inline def setDirectoryExists(value: String => Boolean): Self = StObject.set(x, "directoryExists", js.Any.fromFunction1(value))
    
    inline def setFileExists(value: String => Boolean): Self = StObject.set(x, "fileExists", js.Any.fromFunction1(value))
    
    inline def setGetCompilationSettings(value: CallbackTo[String]): Self = StObject.set(x, "getCompilationSettings", value.toJsFn)
    
    inline def setGetDiagnosticsObject(value: CallbackTo[ILanguageServicesDiagnostics]): Self = StObject.set(x, "getDiagnosticsObject", value.toJsFn)
    
    inline def setGetLocalizedDiagnosticMessages(value: CallbackTo[String]): Self = StObject.set(x, "getLocalizedDiagnosticMessages", value.toJsFn)
    
    inline def setGetParentDirectory(value: String => String): Self = StObject.set(x, "getParentDirectory", js.Any.fromFunction1(value))
    
    inline def setGetScriptByteOrderMark(value: String => Double): Self = StObject.set(x, "getScriptByteOrderMark", js.Any.fromFunction1(value))
    
    inline def setGetScriptFileNames(value: CallbackTo[String]): Self = StObject.set(x, "getScriptFileNames", value.toJsFn)
    
    inline def setGetScriptIsOpen(value: String => Boolean): Self = StObject.set(x, "getScriptIsOpen", js.Any.fromFunction1(value))
    
    inline def setGetScriptSnapshot(value: String => IScriptSnapshotShim): Self = StObject.set(x, "getScriptSnapshot", js.Any.fromFunction1(value))
    
    inline def setGetScriptVersion(value: String => Double): Self = StObject.set(x, "getScriptVersion", js.Any.fromFunction1(value))
    
    inline def setResolveRelativePath(value: (String, String) => String): Self = StObject.set(x, "resolveRelativePath", js.Any.fromFunction2(value))
  }
}
