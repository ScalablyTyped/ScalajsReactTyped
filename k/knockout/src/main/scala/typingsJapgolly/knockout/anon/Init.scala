package typingsJapgolly.knockout.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Node
import typingsJapgolly.knockout.mod.BindingHandlerControlsDescendant
import typingsJapgolly.knockout.mod.MaybeSubscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Init extends StObject {
  
  def init(): BindingHandlerControlsDescendant
  
  def update(element: Node, valueAccessor: js.Function0[MaybeSubscribable[String]]): Unit
}
object Init {
  
  inline def apply(
    init: CallbackTo[BindingHandlerControlsDescendant],
    update: (Node, js.Function0[MaybeSubscribable[String]]) => Callback
  ): Init = {
    val __obj = js.Dynamic.literal(init = init.toJsFn, update = js.Any.fromFunction2((t0: Node, t1: js.Function0[MaybeSubscribable[String]]) => (update(t0, t1)).runNow()))
    __obj.asInstanceOf[Init]
  }
  
  extension [Self <: Init](x: Self) {
    
    inline def setInit(value: CallbackTo[BindingHandlerControlsDescendant]): Self = StObject.set(x, "init", value.toJsFn)
    
    inline def setUpdate(value: (Node, js.Function0[MaybeSubscribable[String]]) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction2((t0: Node, t1: js.Function0[MaybeSubscribable[String]]) => (value(t0, t1)).runNow()))
  }
}
