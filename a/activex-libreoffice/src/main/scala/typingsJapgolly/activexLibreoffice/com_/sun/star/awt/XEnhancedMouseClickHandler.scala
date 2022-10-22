package typingsJapgolly.activexLibreoffice.com_.sun.star.awt

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive enhanced events from the mouse.
  * @since OOo 2.0
  */
trait XEnhancedMouseClickHandler
  extends StObject
     with XEventListener {
  
  /** is invoked when a mouse button has been pressed on a window. */
  def mousePressed(e: EnhancedMouseEvent): Boolean
  
  /** is invoked when a mouse button has been released on a window. */
  def mouseReleased(e: EnhancedMouseEvent): Boolean
}
object XEnhancedMouseClickHandler {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    mousePressed: EnhancedMouseEvent => Boolean,
    mouseReleased: EnhancedMouseEvent => Boolean,
    queryInterface: `type` => Any,
    release: Callback
  ): XEnhancedMouseClickHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), mousePressed = js.Any.fromFunction1(mousePressed), mouseReleased = js.Any.fromFunction1(mouseReleased), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XEnhancedMouseClickHandler]
  }
  
  extension [Self <: XEnhancedMouseClickHandler](x: Self) {
    
    inline def setMousePressed(value: EnhancedMouseEvent => Boolean): Self = StObject.set(x, "mousePressed", js.Any.fromFunction1(value))
    
    inline def setMouseReleased(value: EnhancedMouseEvent => Boolean): Self = StObject.set(x, "mouseReleased", js.Any.fromFunction1(value))
  }
}
