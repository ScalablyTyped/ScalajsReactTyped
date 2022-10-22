package typingsJapgolly.typescriptServices.TypeScript.Services

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILanguageServicesDiagnostics extends StObject {
  
  def log(content: String): Unit
}
object ILanguageServicesDiagnostics {
  
  inline def apply(log: String => Callback): ILanguageServicesDiagnostics = {
    val __obj = js.Dynamic.literal(log = js.Any.fromFunction1((t0: String) => log(t0).runNow()))
    __obj.asInstanceOf[ILanguageServicesDiagnostics]
  }
  
  extension [Self <: ILanguageServicesDiagnostics](x: Self) {
    
    inline def setLog(value: String => Callback): Self = StObject.set(x, "log", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
