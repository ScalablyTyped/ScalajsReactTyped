package typingsJapgolly.activexLibreoffice.com_.sun.star.datatransfer.dnd

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface will be used by a {@link XDragGestureRecognizer} when it detects a drag initiating gesture.
  *
  * The implementor of this interface is responsible for starting the drag as a result of receiving such notification.
  */
trait XDragGestureListener
  extends StObject
     with XEventListener {
  
  /**
    * A {@link XDragGestureRecognizer} has detected a platform-dependent drag initiating gesture and is notifying this listener in order for it to initiate
    * the action for the user.
    * @param dge The {@link DragGestureEvent} describing the gesture that has just occurred.
    */
  def dragGestureRecognized(dge: DragGestureEvent): Unit
}
object XDragGestureListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    dragGestureRecognized: DragGestureEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XDragGestureListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), dragGestureRecognized = js.Any.fromFunction1((t0: DragGestureEvent) => dragGestureRecognized(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDragGestureListener]
  }
  
  extension [Self <: XDragGestureListener](x: Self) {
    
    inline def setDragGestureRecognized(value: DragGestureEvent => Callback): Self = StObject.set(x, "dragGestureRecognized", js.Any.fromFunction1((t0: DragGestureEvent) => value(t0).runNow()))
  }
}
