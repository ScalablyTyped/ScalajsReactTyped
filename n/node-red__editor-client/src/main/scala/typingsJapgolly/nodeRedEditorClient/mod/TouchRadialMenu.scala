package typingsJapgolly.nodeRedEditorClient.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TouchRadialMenu extends StObject {
  
  def active(): Boolean
  
  def show(obj: HTMLElement, pos: js.Array[Double], options: js.Object): Unit
}
object TouchRadialMenu {
  
  inline def apply(active: CallbackTo[Boolean], show: (HTMLElement, js.Array[Double], js.Object) => Callback): TouchRadialMenu = {
    val __obj = js.Dynamic.literal(active = active.toJsFn, show = js.Any.fromFunction3((t0: HTMLElement, t1: js.Array[Double], t2: js.Object) => (show(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[TouchRadialMenu]
  }
  
  extension [Self <: TouchRadialMenu](x: Self) {
    
    inline def setActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "active", value.toJsFn)
    
    inline def setShow(value: (HTMLElement, js.Array[Double], js.Object) => Callback): Self = StObject.set(x, "show", js.Any.fromFunction3((t0: HTMLElement, t1: js.Array[Double], t2: js.Object) => (value(t0, t1, t2)).runNow()))
  }
}
