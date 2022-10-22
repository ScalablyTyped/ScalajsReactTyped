package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigFileDiagnosticsReporter extends StObject {
  
  /**
    * Reports unrecoverable error when parsing config file
    */
  def onUnRecoverableConfigFileDiagnostic(diagnostic: Diagnostic): Unit
  /**
    * Reports unrecoverable error when parsing config file
    */
  @JSName("onUnRecoverableConfigFileDiagnostic")
  var onUnRecoverableConfigFileDiagnostic_Original: DiagnosticReporter
}
object ConfigFileDiagnosticsReporter {
  
  inline def apply(onUnRecoverableConfigFileDiagnostic: /* diagnostic */ Diagnostic => Callback): ConfigFileDiagnosticsReporter = {
    val __obj = js.Dynamic.literal(onUnRecoverableConfigFileDiagnostic = js.Any.fromFunction1((t0: /* diagnostic */ Diagnostic) => onUnRecoverableConfigFileDiagnostic(t0).runNow()))
    __obj.asInstanceOf[ConfigFileDiagnosticsReporter]
  }
  
  extension [Self <: ConfigFileDiagnosticsReporter](x: Self) {
    
    inline def setOnUnRecoverableConfigFileDiagnostic(value: /* diagnostic */ Diagnostic => Callback): Self = StObject.set(x, "onUnRecoverableConfigFileDiagnostic", js.Any.fromFunction1((t0: /* diagnostic */ Diagnostic) => value(t0).runNow()))
  }
}
