package typingsJapgolly.jaegerClient.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Logger extends StObject {
  
  def error(msg: String): Unit
  
  def info(msg: String): Unit
}
object Logger {
  
  inline def apply(error: String => Callback, info: String => Callback): Logger = {
    val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: String) => error(t0).runNow()), info = js.Any.fromFunction1((t0: String) => info(t0).runNow()))
    __obj.asInstanceOf[Logger]
  }
  
  extension [Self <: Logger](x: Self) {
    
    inline def setError(value: String => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setInfo(value: String => Callback): Self = StObject.set(x, "info", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
