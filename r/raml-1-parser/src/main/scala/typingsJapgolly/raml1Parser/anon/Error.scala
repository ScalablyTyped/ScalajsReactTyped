package typingsJapgolly.raml1Parser.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  def error(x: Any): Unit
  
  def fatalError(x: Any): Unit
  
  def warning(x: Any): Unit
}
object Error {
  
  inline def apply(error: Any => Callback, fatalError: Any => Callback, warning: Any => Callback): Error = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: Any) => error(t0).runNow()), fatalError = js.Any.fromFunction1((t0: Any) => fatalError(t0).runNow()), warning = js.Any.fromFunction1((t0: Any) => warning(t0).runNow()))
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setFatalError(value: Any => Callback): Self = StObject.set(x, "fatalError", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setWarning(value: Any => Callback): Self = StObject.set(x, "warning", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
  }
}
