package typingsJapgolly.knockout.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.knockout.mod.MaybeSubscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Update extends StObject {
  
  def update(element: HTMLElement, valueAccessor: js.Function0[MaybeSubscribable[Any]]): Unit
}
object Update {
  
  inline def apply(update: (HTMLElement, js.Function0[MaybeSubscribable[Any]]) => Callback): Update = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction2((t0: HTMLElement, t1: js.Function0[MaybeSubscribable[Any]]) => (update(t0, t1)).runNow()))
    __obj.asInstanceOf[Update]
  }
  
  extension [Self <: Update](x: Self) {
    
    inline def setUpdate(value: (HTMLElement, js.Function0[MaybeSubscribable[Any]]) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction2((t0: HTMLElement, t1: js.Function0[MaybeSubscribable[Any]]) => (value(t0, t1)).runNow()))
  }
}
