package typingsJapgolly.knockout.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.knockout.mod.AllBindings
import typingsJapgolly.knockout.mod.MaybeSubscribable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  def init(
    element: HTMLElement,
    valueAccessor: js.Function0[MaybeSubscribable[String]],
    allBindings: AllBindings
  ): Unit
}
object `8` {
  
  inline def apply(init: (HTMLElement, js.Function0[MaybeSubscribable[String]], AllBindings) => Callback): `8` = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction3((t0: HTMLElement, t1: js.Function0[MaybeSubscribable[String]], t2: AllBindings) => (init(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[`8`]
  }
  
  extension [Self <: `8`](x: Self) {
    
    inline def setInit(value: (HTMLElement, js.Function0[MaybeSubscribable[String]], AllBindings) => Callback): Self = StObject.set(x, "init", js.Any.fromFunction3((t0: HTMLElement, t1: js.Function0[MaybeSubscribable[String]], t2: AllBindings) => (value(t0, t1, t2)).runNow()))
  }
}
