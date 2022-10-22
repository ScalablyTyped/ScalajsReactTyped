package typingsJapgolly.webix.webix

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait clipbuffer extends StObject {
  
  def destructor(): Unit
  
  def focus(): Unit
  
  def init(): Unit
  
  def set(text: String): Unit
}
object clipbuffer {
  
  inline def apply(destructor: Callback, focus: Callback, init: Callback, set: String => Callback): clipbuffer = {
    val __obj = js.Dynamic.literal(destructor = destructor.toJsFn, focus = focus.toJsFn, init = init.toJsFn, set = js.Any.fromFunction1((t0: String) => set(t0).runNow()))
    __obj.asInstanceOf[clipbuffer]
  }
  
  extension [Self <: clipbuffer](x: Self) {
    
    inline def setDestructor(value: Callback): Self = StObject.set(x, "destructor", value.toJsFn)
    
    inline def setFocus(value: Callback): Self = StObject.set(x, "focus", value.toJsFn)
    
    inline def setInit(value: Callback): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setSet(value: String => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
