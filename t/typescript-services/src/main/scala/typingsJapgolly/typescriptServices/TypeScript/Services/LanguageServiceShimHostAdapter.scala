package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptServices.TypeScript.ByteOrderMark
import typingsJapgolly.typescriptServices.TypeScript.CompilationSettings
import typingsJapgolly.typescriptServices.TypeScript.IScriptSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LanguageServiceShimHostAdapter
  extends StObject
     with ILanguageServiceHost {
  
  /* private */ var shimHost: Any
}
object LanguageServiceShimHostAdapter {
  
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
    shimHost: Any,
    warning: CallbackTo[Boolean]
  ): LanguageServiceShimHostAdapter = {
    val __obj = js.Dynamic.literal(debug = debug.toJsFn, directoryExists = js.Any.fromFunction1(directoryExists), error = error.toJsFn, fatal = fatal.toJsFn, fileExists = js.Any.fromFunction1(fileExists), getCompilationSettings = getCompilationSettings.toJsFn, getDiagnosticsObject = getDiagnosticsObject.toJsFn, getLocalizedDiagnosticMessages = getLocalizedDiagnosticMessages.toJsFn, getParentDirectory = js.Any.fromFunction1(getParentDirectory), getScriptByteOrderMark = js.Any.fromFunction1(getScriptByteOrderMark), getScriptFileNames = getScriptFileNames.toJsFn, getScriptIsOpen = js.Any.fromFunction1(getScriptIsOpen), getScriptSnapshot = js.Any.fromFunction1(getScriptSnapshot), getScriptVersion = js.Any.fromFunction1(getScriptVersion), information = information.toJsFn, log = js.Any.fromFunction1((t0: String) => log(t0).runNow()), resolveRelativePath = js.Any.fromFunction2(resolveRelativePath), shimHost = shimHost.asInstanceOf[js.Any], warning = warning.toJsFn)
    __obj.asInstanceOf[LanguageServiceShimHostAdapter]
  }
  
  extension [Self <: LanguageServiceShimHostAdapter](x: Self) {
    
    inline def setShimHost(value: Any): Self = StObject.set(x, "shimHost", value.asInstanceOf[js.Any])
  }
}
