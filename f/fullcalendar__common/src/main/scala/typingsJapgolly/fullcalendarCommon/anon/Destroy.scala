package typingsJapgolly.fullcalendarCommon.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destroy extends StObject {
  
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  
  def render(el: HTMLElement, contentVal: Any): scala.Unit
}
object Destroy {
  
  inline def apply(render: (HTMLElement, Any) => Callback): Destroy = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction2((t0: HTMLElement, t1: Any) => (render(t0, t1)).runNow()))
    __obj.asInstanceOf[Destroy]
  }
  
  extension [Self <: Destroy](x: Self) {
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    inline def setRender(value: (HTMLElement, Any) => Callback): Self = StObject.set(x, "render", js.Any.fromFunction2((t0: HTMLElement, t1: Any) => (value(t0, t1)).runNow()))
  }
}
