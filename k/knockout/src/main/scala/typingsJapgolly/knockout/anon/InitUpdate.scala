package typingsJapgolly.knockout.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.knockout.mod.AllBindings
import typingsJapgolly.knockout.mod.MaybeSubscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitUpdate extends StObject {
  
  def init(
    element: HTMLElement,
    valueAccessor: js.Function0[MaybeSubscribable[Any]],
    allBindings: AllBindings
  ): Unit
  
  def update(element: HTMLElement, valueAccessor: js.Function0[MaybeSubscribable[Any]]): Unit
}
object InitUpdate {
  
  inline def apply(
    init: (HTMLElement, js.Function0[MaybeSubscribable[Any]], AllBindings) => Callback,
    update: (HTMLElement, js.Function0[MaybeSubscribable[Any]]) => Callback
  ): InitUpdate = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction3((t0: HTMLElement, t1: js.Function0[MaybeSubscribable[Any]], t2: AllBindings) => (init(t0, t1, t2)).runNow()), update = js.Any.fromFunction2((t0: HTMLElement, t1: js.Function0[MaybeSubscribable[Any]]) => (update(t0, t1)).runNow()))
    __obj.asInstanceOf[InitUpdate]
  }
  
  extension [Self <: InitUpdate](x: Self) {
    
    inline def setInit(value: (HTMLElement, js.Function0[MaybeSubscribable[Any]], AllBindings) => Callback): Self = StObject.set(x, "init", js.Any.fromFunction3((t0: HTMLElement, t1: js.Function0[MaybeSubscribable[Any]], t2: AllBindings) => (value(t0, t1, t2)).runNow()))
    
    inline def setUpdate(value: (HTMLElement, js.Function0[MaybeSubscribable[Any]]) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction2((t0: HTMLElement, t1: js.Function0[MaybeSubscribable[Any]]) => (value(t0, t1)).runNow()))
  }
}
