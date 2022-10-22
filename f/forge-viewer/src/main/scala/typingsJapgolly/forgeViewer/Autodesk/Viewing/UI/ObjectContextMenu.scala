package typingsJapgolly.forgeViewer.Autodesk.Viewing.UI

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectContextMenu extends StObject {
  
  def buildMenu(event: Event, status: js.Object): js.Array[MenuItem]
  
  def hide(): Boolean
  
  def show(event: Event): Unit
}
object ObjectContextMenu {
  
  inline def apply(
    buildMenu: (Event, js.Object) => js.Array[MenuItem],
    hide: CallbackTo[Boolean],
    show: Event => Callback
  ): ObjectContextMenu = {
    val __obj = js.Dynamic.literal(buildMenu = js.Any.fromFunction2(buildMenu), hide = hide.toJsFn, show = js.Any.fromFunction1((t0: Event) => show(t0).runNow()))
    __obj.asInstanceOf[ObjectContextMenu]
  }
  
  extension [Self <: ObjectContextMenu](x: Self) {
    
    inline def setBuildMenu(value: (Event, js.Object) => js.Array[MenuItem]): Self = StObject.set(x, "buildMenu", js.Any.fromFunction2(value))
    
    inline def setHide(value: CallbackTo[Boolean]): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setShow(value: Event => Callback): Self = StObject.set(x, "show", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
  }
}
