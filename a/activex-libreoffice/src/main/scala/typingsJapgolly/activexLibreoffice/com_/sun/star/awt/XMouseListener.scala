package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive events from the mouse in a certain window. */
trait XMouseListener
  extends StObject
     with XEventListener {
  
  /** is invoked when the mouse enters a window. */
  def mouseEntered(e: MouseEvent): Unit
  
  /** is invoked when the mouse exits a window. */
  def mouseExited(e: MouseEvent): Unit
  
  /**
    * is invoked when a mouse button has been pressed on a window.
    *
    * Since mouse presses are usually also used to indicate requests for pop-up menus (also known as context menus) on objects, you might receive two events
    * for a single mouse press: For example, if, on your operating system, pressing the right mouse button indicates the request for a context menu, then
    * you will receive one call to {@link mousePressed()} indicating the mouse click, and another one indicating the context menu request. For the latter,
    * the {@link MouseEvent.PopupTrigger} member of the event will be set to `TRUE` .
    */
  def mousePressed(e: MouseEvent): Unit
  
  /** is invoked when a mouse button has been released on a window. */
  def mouseReleased(e: MouseEvent): Unit
}
object XMouseListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    mouseEntered: MouseEvent => Callback,
    mouseExited: MouseEvent => Callback,
    mousePressed: MouseEvent => Callback,
    mouseReleased: MouseEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XMouseListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), mouseEntered = js.Any.fromFunction1((t0: MouseEvent) => mouseEntered(t0).runNow()), mouseExited = js.Any.fromFunction1((t0: MouseEvent) => mouseExited(t0).runNow()), mousePressed = js.Any.fromFunction1((t0: MouseEvent) => mousePressed(t0).runNow()), mouseReleased = js.Any.fromFunction1((t0: MouseEvent) => mouseReleased(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XMouseListener]
  }
  
  extension [Self <: XMouseListener](x: Self) {
    
    inline def setMouseEntered(value: MouseEvent => Callback): Self = StObject.set(x, "mouseEntered", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
    
    inline def setMouseExited(value: MouseEvent => Callback): Self = StObject.set(x, "mouseExited", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
    
    inline def setMousePressed(value: MouseEvent => Callback): Self = StObject.set(x, "mousePressed", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
    
    inline def setMouseReleased(value: MouseEvent => Callback): Self = StObject.set(x, "mouseReleased", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
  }
}
