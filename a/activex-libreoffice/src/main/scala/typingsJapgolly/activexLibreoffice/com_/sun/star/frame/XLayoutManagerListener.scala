package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive events from a layout manager.
  *
  * Events are provided **only** for notification purposes only. All operations are handled internally by the layout manager component, so that GUI layout
  * works properly regardless of whether a component registers such a listener or not.
  * @see com.sun.star.frame.LayoutManager
  * @see com.sun.star.frame.LayoutManagerEvents
  * @since OOo 2.0
  */
trait XLayoutManagerListener
  extends StObject
     with XEventListener {
  
  /**
    * is invoked when a layout manager has made a certain operation.
    * @param aSource reference to the layout manager which invoked the event.
    * @param eLayoutEvent identifies the layout event that has occurred.
    * @param aInfo provides additional information about the event. The type of info depends on the event.
    */
  def layoutEvent(aSource: EventObject, eLayoutEvent: Double, aInfo: Any): Unit
}
object XLayoutManagerListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    layoutEvent: (EventObject, Double, Any) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XLayoutManagerListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), layoutEvent = js.Any.fromFunction3((t0: EventObject, t1: Double, t2: Any) => (layoutEvent(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XLayoutManagerListener]
  }
  
  extension [Self <: XLayoutManagerListener](x: Self) {
    
    inline def setLayoutEvent(value: (EventObject, Double, Any) => Callback): Self = StObject.set(x, "layoutEvent", js.Any.fromFunction3((t0: EventObject, t1: Double, t2: Any) => (value(t0, t1, t2)).runNow()))
  }
}
