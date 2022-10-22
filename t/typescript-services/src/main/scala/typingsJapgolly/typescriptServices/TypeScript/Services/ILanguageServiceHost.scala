package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptServices.TypeScript.ByteOrderMark
import typingsJapgolly.typescriptServices.TypeScript.CompilationSettings
import typingsJapgolly.typescriptServices.TypeScript.ILogger
import typingsJapgolly.typescriptServices.TypeScript.IReferenceResolverHost
import typingsJapgolly.typescriptServices.TypeScript.IScriptSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILanguageServiceHost
  extends StObject
     with ILogger
     with IReferenceResolverHost {
  
  def getCompilationSettings(): CompilationSettings
  
  def getDiagnosticsObject(): ILanguageServicesDiagnostics
  
  def getLocalizedDiagnosticMessages(): Any
  
  def getScriptByteOrderMark(fileName: String): ByteOrderMark
  
  def getScriptFileNames(): js.Array[String]
  
  def getScriptIsOpen(fileName: String): Boolean
  
  def getScriptVersion(fileName: String): Double
}
object ILanguageServiceHost {
  
  inline def apply(
    debug: CallbackTo[Boolean],
    directoryExists: String => Boolean,
    error: CallbackTo[Boolean],
    fatal: CallbackTo[Boolean],
    fileExists: String => Boolean,
    getCompilationSettings: CallbackTo[CompilationSettings],
    getDiagnosticsObject: CallbackTo[ILanguageServicesDiagnostics],
    getLocalizedDiagnosticMessages: CallbackTo[Any],
    getParentDirectory: String => String,
    getScriptByteOrderMark: String => ByteOrderMark,
    getScriptFileNames: CallbackTo[js.Array[String]],
    getScriptIsOpen: String => Boolean,
    getScriptSnapshot: String => IScriptSnapshot,
    getScriptVersion: String => Double,
    information: CallbackTo[Boolean],
    log: String => Callback,
    resolveRelativePath: (String, String) => String,
    warning: CallbackTo[Boolean]
  ): ILanguageServiceHost = {
    val __obj = js.Dynamic.literal(debug = debug.toJsFn, directoryExists = js.Any.fromFunction1(directoryExists), error = error.toJsFn, fatal = fatal.toJsFn, fileExists = js.Any.fromFunction1(fileExists), getCompilationSettings = getCompilationSettings.toJsFn, getDiagnosticsObject = getDiagnosticsObject.toJsFn, getLocalizedDiagnosticMessages = getLocalizedDiagnosticMessages.toJsFn, getParentDirectory = js.Any.fromFunction1(getParentDirectory), getScriptByteOrderMark = js.Any.fromFunction1(getScriptByteOrderMark), getScriptFileNames = getScriptFileNames.toJsFn, getScriptIsOpen = js.Any.fromFunction1(getScriptIsOpen), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), getScriptVersion = js.Any.fromFunction1(getScriptVersion), information = information.toJsFn, log = js.Any.fromFunction1((t0: String) => log(t0).runNow()), resolveRelativePath = js.Any.fromFunction2(resolveRelativePath), warning = warning.toJsFn)
    __obj.asInstanceOf[ILanguageServiceHost]
  }
  
  extension [Self <: ILanguageServiceHost](x: Self) {
    
    inline def setGetCompilationSettings(value: CallbackTo[CompilationSettings]): Self = StObject.set(x, "getCompilationSettings", value.toJsFn)
    
    inline def setGetDiagnosticsObject(value: CallbackTo[ILanguageServicesDiagnostics]): Self = StObject.set(x, "getDiagnosticsObject", value.toJsFn)
    
    inline def setGetLocalizedDiagnosticMessages(value: CallbackTo[Any]): Self = StObject.set(x, "getLocalizedDiagnosticMessages", value.toJsFn)
    
    inline def setGetScriptByteOrderMark(value: String => ByteOrderMark): Self = StObject.set(x, "getScriptByteOrderMark", js.Any.fromFunction1(value))
    
    inline def setGetScriptFileNames(value: CallbackTo[js.Array[String]]): Self = StObject.set(x, "getScriptFileNames", value.toJsFn)
    
    inline def setGetScriptIsOpen(value: String => Boolean): Self = StObject.set(x, "getScriptIsOpen", js.Any.fromFunction1(value))
    
    inline def setGetScriptVersion(value: String => Double): Self = StObject.set(x, "getScriptVersion", js.Any.fromFunction1(value))
  }
}
