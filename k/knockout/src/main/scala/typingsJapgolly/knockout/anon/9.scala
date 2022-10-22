package typingsJapgolly.knockout.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.knockout.mod.AllBindings
import typingsJapgolly.knockout.mod.BindingHandlerControlsDescendant
import typingsJapgolly.knockout.mod.MaybeSubscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9` extends StObject {
  
  def init(element: HTMLElement): BindingHandlerControlsDescendant
  
  def update(
    element: HTMLElement,
    valueAccessor: js.Function0[MaybeSubscribable[Any]],
    allBindings: AllBindings
  ): Unit
}
object `9` {
  
  inline def apply(
    init: HTMLElement => BindingHandlerControlsDescendant,
    update: (HTMLElement, js.Function0[MaybeSubscribable[Any]], AllBindings) => Callback
  ): `9` = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), update = js.Any.fromFunction3((t0: HTMLElement, t1: js.Function0[MaybeSubscribable[Any]], t2: AllBindings) => (update(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[`9`]
  }
  
  extension [Self <: `9`](x: Self) {
    
    inline def setInit(value: HTMLElement => BindingHandlerControlsDescendant): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    
    inline def setUpdate(value: (HTMLElement, js.Function0[MaybeSubscribable[Any]], AllBindings) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction3((t0: HTMLElement, t1: js.Function0[MaybeSubscribable[Any]], t2: AllBindings) => (value(t0, t1, t2)).runNow()))
  }
}
