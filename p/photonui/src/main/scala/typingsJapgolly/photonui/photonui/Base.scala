package typingsJapgolly.photonui.photonui

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base extends StObject {
  
  def destroy(): Unit
  
  def registerCallback(id: String, wEvent: String, callback: js.Function, thisArg: Any): Unit
  
  def removeCallback(id: String): Unit
}
object Base {
  
  inline def apply(
    destroy: Callback,
    registerCallback: (String, String, js.Function, Any) => Callback,
    removeCallback: String => Callback
  ): Base = {
    val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, registerCallback = js.Any.fromFunction4((t0: String, t1: String, t2: js.Function, t3: Any) => (registerCallback(t0, t1, t2, t3)).runNow()), removeCallback = js.Any.fromFunction1((t0: String) => removeCallback(t0).runNow()))
    __obj.asInstanceOf[Base]
  }
  
  extension [Self <: Base](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setRegisterCallback(value: (String, String, js.Function, Any) => Callback): Self = StObject.set(x, "registerCallback", js.Any.fromFunction4((t0: String, t1: String, t2: js.Function, t3: Any) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def setRemoveCallback(value: String => Callback): Self = StObject.set(x, "removeCallback", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
