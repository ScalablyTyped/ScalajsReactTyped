package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive menu events on a window. */
trait XMenuListener
  extends StObject
     with XEventListener {
  
  /** is invoked when a menu is activated. */
  def itemActivated(aEvent: MenuEvent): Unit
  
  /** is invoked when a menu is deactivated. */
  def itemDeactivated(aEvent: MenuEvent): Unit
  
  /** is invoked when a menu item is highlighted. */
  def itemHighlighted(aEvent: MenuEvent): Unit
  
  /** is invoked when a menu item is selected. */
  def itemSelected(aEvent: MenuEvent): Unit
}
object XMenuListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    itemActivated: MenuEvent => Callback,
    itemDeactivated: MenuEvent => Callback,
    itemHighlighted: MenuEvent => Callback,
    itemSelected: MenuEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XMenuListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), itemActivated = js.Any.fromFunction1((t0: MenuEvent) => itemActivated(t0).runNow()), itemDeactivated = js.Any.fromFunction1((t0: MenuEvent) => itemDeactivated(t0).runNow()), itemHighlighted = js.Any.fromFunction1((t0: MenuEvent) => itemHighlighted(t0).runNow()), itemSelected = js.Any.fromFunction1((t0: MenuEvent) => itemSelected(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XMenuListener]
  }
  
  extension [Self <: XMenuListener](x: Self) {
    
    inline def setItemActivated(value: MenuEvent => Callback): Self = StObject.set(x, "itemActivated", js.Any.fromFunction1((t0: MenuEvent) => value(t0).runNow()))
    
    inline def setItemDeactivated(value: MenuEvent => Callback): Self = StObject.set(x, "itemDeactivated", js.Any.fromFunction1((t0: MenuEvent) => value(t0).runNow()))
    
    inline def setItemHighlighted(value: MenuEvent => Callback): Self = StObject.set(x, "itemHighlighted", js.Any.fromFunction1((t0: MenuEvent) => value(t0).runNow()))
    
    inline def setItemSelected(value: MenuEvent => Callback): Self = StObject.set(x, "itemSelected", js.Any.fromFunction1((t0: MenuEvent) => value(t0).runNow()))
  }
}
