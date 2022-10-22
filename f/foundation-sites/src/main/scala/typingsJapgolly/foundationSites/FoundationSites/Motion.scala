package typingsJapgolly.foundationSites.FoundationSites

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Motion extends StObject {
  
  def animateIn(element: js.Object, animation: Any, cb: js.Function): Unit
  
  def animateOut(element: js.Object, animation: Any, cb: js.Function): Unit
}
object Motion {
  
  inline def apply(
    animateIn: (js.Object, Any, js.Function) => Callback,
    animateOut: (js.Object, Any, js.Function) => Callback
  ): Motion = {
    val __obj = js.Dynamic.literal(animateIn = js.Any.fromFunction3((t0: js.Object, t1: Any, t2: js.Function) => (animateIn(t0, t1, t2)).runNow()), animateOut = js.Any.fromFunction3((t0: js.Object, t1: Any, t2: js.Function) => (animateOut(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[Motion]
  }
  
  extension [Self <: Motion](x: Self) {
    
    inline def setAnimateIn(value: (js.Object, Any, js.Function) => Callback): Self = StObject.set(x, "animateIn", js.Any.fromFunction3((t0: js.Object, t1: Any, t2: js.Function) => (value(t0, t1, t2)).runNow()))
    
    inline def setAnimateOut(value: (js.Object, Any, js.Function) => Callback): Self = StObject.set(x, "animateOut", js.Any.fromFunction3((t0: js.Object, t1: Any, t2: js.Function) => (value(t0, t1, t2)).runNow()))
  }
}
