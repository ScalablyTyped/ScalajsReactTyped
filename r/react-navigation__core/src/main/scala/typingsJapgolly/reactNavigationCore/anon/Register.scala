package typingsJapgolly.reactNavigationCore.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Register extends StObject {
  
  def register(key: String): Unit
  
  def unregister(key: String): Unit
}
object Register {
  
  inline def apply(register: String => Callback, unregister: String => Callback): Register = {
    val __obj = js.Dynamic.literal(register = js.Any.fromFunction1((t0: String) => register(t0).runNow()), unregister = js.Any.fromFunction1((t0: String) => unregister(t0).runNow()))
    __obj.asInstanceOf[Register]
  }
  
  extension [Self <: Register](x: Self) {
    
    inline def setRegister(value: String => Callback): Self = StObject.set(x, "register", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setUnregister(value: String => Callback): Self = StObject.set(x, "unregister", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
