package typingsJapgolly.knockout.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.knockout.mod.AllBindings
import typingsJapgolly.knockout.mod.BindingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `7` extends StObject {
  
  def init(
    element: HTMLElement,
    valueAccessor: js.Function0[js.Function],
    allBindings: AllBindings,
    viewModel: Any,
    bindingContext: BindingContext[Any]
  ): Unit
}
object `7` {
  
  inline def apply(init: (HTMLElement, js.Function0[js.Function], AllBindings, Any, BindingContext[Any]) => Callback): `7` = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction5((t0: HTMLElement, t1: js.Function0[js.Function], t2: AllBindings, t3: Any, t4: BindingContext[Any]) => (init(t0, t1, t2, t3, t4)).runNow()))
    __obj.asInstanceOf[`7`]
  }
  
  extension [Self <: `7`](x: Self) {
    
    inline def setInit(value: (HTMLElement, js.Function0[js.Function], AllBindings, Any, BindingContext[Any]) => Callback): Self = StObject.set(x, "init", js.Any.fromFunction5((t0: HTMLElement, t1: js.Function0[js.Function], t2: AllBindings, t3: Any, t4: BindingContext[Any]) => (value(t0, t1, t2, t3, t4)).runNow()))
  }
}
