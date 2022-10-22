package typingsJapgolly.knockout.anon

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `10` extends StObject {
  
  def init(element: HTMLElement, valueAccessor: js.Function0[Boolean]): Unit
}
object `10` {
  
  inline def apply(init: (HTMLElement, js.Function0[Boolean]) => Callback): `10` = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction2((t0: HTMLElement, t1: js.Function0[Boolean]) => (init(t0, t1)).runNow()))
    __obj.asInstanceOf[`10`]
  }
  
  extension [Self <: `10`](x: Self) {
    
    inline def setInit(value: (HTMLElement, js.Function0[Boolean]) => Callback): Self = StObject.set(x, "init", js.Any.fromFunction2((t0: HTMLElement, t1: js.Function0[Boolean]) => (value(t0, t1)).runNow()))
  }
}
