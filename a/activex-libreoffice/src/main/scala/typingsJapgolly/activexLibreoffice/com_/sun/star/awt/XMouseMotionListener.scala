package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive mouse motion events on a window. */
trait XMouseMotionListener
  extends StObject
     with XEventListener {
  
  /**
    * is invoked when a mouse button is pressed on a window and then dragged.
    *
    * Mouse drag events will continue to be delivered to the window where the first event originated until the mouse button is released (regardless of
    * whether the mouse position is within the bounds of the window).
    */
  def mouseDragged(e: MouseEvent): Unit
  
  /** is invoked when the mouse pointer has been moved on a window (with no buttons down). */
  def mouseMoved(e: MouseEvent): Unit
}
object XMouseMotionListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    mouseDragged: MouseEvent => Callback,
    mouseMoved: MouseEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XMouseMotionListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), mouseDragged = js.Any.fromFunction1((t0: MouseEvent) => mouseDragged(t0).runNow()), mouseMoved = js.Any.fromFunction1((t0: MouseEvent) => mouseMoved(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XMouseMotionListener]
  }
  
  extension [Self <: XMouseMotionListener](x: Self) {
    
    inline def setMouseDragged(value: MouseEvent => Callback): Self = StObject.set(x, "mouseDragged", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
    
    inline def setMouseMoved(value: MouseEvent => Callback): Self = StObject.set(x, "mouseMoved", js.Any.fromFunction1((t0: MouseEvent) => value(t0).runNow()))
  }
}
