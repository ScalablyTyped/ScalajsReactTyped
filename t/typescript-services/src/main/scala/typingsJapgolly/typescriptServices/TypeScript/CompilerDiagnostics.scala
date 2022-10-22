package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CompilerDiagnostics {
  
  trait IDiagnosticWriter extends StObject {
    
    def Alert(output: String): Unit
  }
  object IDiagnosticWriter {
    
    inline def apply(Alert: String => Callback): IDiagnosticWriter = {
      val __obj = js.Dynamic.literal(Alert = js.Any.fromFunction1((t0: String) => Alert(t0).runNow()))
      __obj.asInstanceOf[IDiagnosticWriter]
    }
    
    extension [Self <: IDiagnosticWriter](x: Self) {
      
      inline def setAlert(value: String => Callback): Self = StObject.set(x, "Alert", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
