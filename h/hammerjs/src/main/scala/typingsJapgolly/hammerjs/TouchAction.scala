package typingsJapgolly.hammerjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchAction extends StObject {
  
  def compute(): String
  
  def preventDefaults(input: HammerInput): Unit
  
  def preventSrc(srcEvent: Any): Unit
  
  def set(value: String): Unit
  
  def update(): Unit
}
object TouchAction {
  
  inline def apply(
    compute: CallbackTo[String],
    preventDefaults: HammerInput => Callback,
    preventSrc: Any => Callback,
    set: String => Callback,
    update: Callback
  ): TouchAction = {
    val __obj = js.Dynamic.literal(compute = compute.toJsFn, preventDefaults = js.Any.fromFunction1((t0: HammerInput) => preventDefaults(t0).runNow()), preventSrc = js.Any.fromFunction1((t0: Any) => preventSrc(t0).runNow()), set = js.Any.fromFunction1((t0: String) => set(t0).runNow()), update = update.toJsFn)
    __obj.asInstanceOf[TouchAction]
  }
  
  extension [Self <: TouchAction](x: Self) {
    
    inline def setCompute(value: CallbackTo[String]): Self = StObject.set(x, "compute", value.toJsFn)
    
    inline def setPreventDefaults(value: HammerInput => Callback): Self = StObject.set(x, "preventDefaults", js.Any.fromFunction1((t0: HammerInput) => value(t0).runNow()))
    
    inline def setPreventSrc(value: Any => Callback): Self = StObject.set(x, "preventSrc", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSet(value: String => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
  }
}
