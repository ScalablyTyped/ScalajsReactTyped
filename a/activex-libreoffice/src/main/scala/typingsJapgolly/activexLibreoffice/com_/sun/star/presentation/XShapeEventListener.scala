package typingsJapgolly.activexLibreoffice.com_.sun.star.presentation

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.MouseEvent
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShape
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Listener interface to receive shape-specific events.
  * @since OOo 2.4
  */
trait XShapeEventListener
  extends StObject
     with XEventListener {
  
  /**
    * Notify a clicked shape.
    *
    * This method notifies the listener that a shape was clicked.
    * @param xShape The shape that was clicked upon.
    * @param aOriginalEvent The original mouse click event that generated this notification.
    */
  def click(xShape: XShape, aOriginalEvent: MouseEvent): Unit
}
object XShapeEventListener {
  
  inline def apply(
    acquire: Callback,
    click: (XShape, MouseEvent) => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XShapeEventListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, click = js.Any.fromFunction2((t0: XShape, t1: MouseEvent) => (click(t0, t1)).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XShapeEventListener]
  }
  
  extension [Self <: XShapeEventListener](x: Self) {
    
    inline def setClick(value: (XShape, MouseEvent) => Callback): Self = StObject.set(x, "click", js.Any.fromFunction2((t0: XShape, t1: MouseEvent) => (value(t0, t1)).runNow()))
  }
}
