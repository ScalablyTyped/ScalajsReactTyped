package typingsJapgolly.knockout.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Node
import typingsJapgolly.knockout.mod.AllBindings
import typingsJapgolly.knockout.mod.BindingContext
import typingsJapgolly.knockout.mod.BindingHandlerControlsDescendant
import typingsJapgolly.knockout.mod.BindingTemplateOptions
import typingsJapgolly.knockout.mod.MaybeSubscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `11` extends StObject {
  
  def init(element: Node, valueAccessor: js.Function0[MaybeSubscribable[String | BindingTemplateOptions]]): BindingHandlerControlsDescendant
  
  def update(
    element: Node,
    valueAccessor: js.Function0[MaybeSubscribable[String | BindingTemplateOptions]],
    allBindings: AllBindings,
    viewModel: Any,
    bindingContext: BindingContext[Any]
  ): Unit
}
object `11` {
  
  inline def apply(
    init: (Node, js.Function0[MaybeSubscribable[String | BindingTemplateOptions]]) => BindingHandlerControlsDescendant,
    update: (Node, js.Function0[MaybeSubscribable[String | BindingTemplateOptions]], AllBindings, Any, BindingContext[Any]) => Callback
  ): `11` = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction2(init), update = js.Any.fromFunction5((t0: Node, t1: js.Function0[MaybeSubscribable[String | BindingTemplateOptions]], t2: AllBindings, t3: Any, t4: BindingContext[Any]) => (update(t0, t1, t2, t3, t4)).runNow()))
    __obj.asInstanceOf[`11`]
  }
  
  extension [Self <: `11`](x: Self) {
    
    inline def setInit(
      value: (Node, js.Function0[MaybeSubscribable[String | BindingTemplateOptions]]) => BindingHandlerControlsDescendant
    ): Self = StObject.set(x, "init", js.Any.fromFunction2(value))
    
    inline def setUpdate(
      value: (Node, js.Function0[MaybeSubscribable[String | BindingTemplateOptions]], AllBindings, Any, BindingContext[Any]) => Callback
    ): Self = StObject.set(x, "update", js.Any.fromFunction5((t0: Node, t1: js.Function0[MaybeSubscribable[String | BindingTemplateOptions]], t2: AllBindings, t3: Any, t4: BindingContext[Any]) => (value(t0, t1, t2, t3, t4)).runNow()))
  }
}
