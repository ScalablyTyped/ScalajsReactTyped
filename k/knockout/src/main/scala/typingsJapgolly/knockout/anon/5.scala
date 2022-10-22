package typingsJapgolly.knockout.anon

import org.scalajs.dom.Node
import typingsJapgolly.knockout.mod.AllBindings
import typingsJapgolly.knockout.mod.BindingContext
import typingsJapgolly.knockout.mod.BindingHandlerControlsDescendant
import typingsJapgolly.knockout.mod.MaybeSubscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5` extends StObject {
  
  def init(
    element: Node,
    valueAccessor: js.Function0[MaybeSubscribable[js.Object]],
    allBindings: AllBindings,
    viewModel: Any,
    bindingContext: BindingContext[Any]
  ): BindingHandlerControlsDescendant
}
object `5` {
  
  inline def apply(
    init: (Node, js.Function0[MaybeSubscribable[js.Object]], AllBindings, Any, BindingContext[Any]) => BindingHandlerControlsDescendant
  ): `5` = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction5(init))
    __obj.asInstanceOf[`5`]
  }
  
  extension [Self <: `5`](x: Self) {
    
    inline def setInit(
      value: (Node, js.Function0[MaybeSubscribable[js.Object]], AllBindings, Any, BindingContext[Any]) => BindingHandlerControlsDescendant
    ): Self = StObject.set(x, "init", js.Any.fromFunction5(value))
  }
}
