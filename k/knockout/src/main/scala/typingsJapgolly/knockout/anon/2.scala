package typingsJapgolly.knockout.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.knockout.mod.MaybeSubscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  def update(element: HTMLElement, valueAccessor: js.Function0[MaybeSubscribable[js.Object]]): Unit
}
object `2` {
  
  inline def apply(update: (HTMLElement, js.Function0[MaybeSubscribable[js.Object]]) => Callback): `2` = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction2((t0: HTMLElement, t1: js.Function0[MaybeSubscribable[js.Object]]) => (update(t0, t1)).runNow()))
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setUpdate(value: (HTMLElement, js.Function0[MaybeSubscribable[js.Object]]) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction2((t0: HTMLElement, t1: js.Function0[MaybeSubscribable[js.Object]]) => (value(t0, t1)).runNow()))
  }
}
