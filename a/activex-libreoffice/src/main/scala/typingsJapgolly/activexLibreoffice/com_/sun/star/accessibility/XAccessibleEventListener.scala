package typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to register a component as a listener, which is called whenever an accessibility event occurs.
  * @see XAccessibleEventBroadcaster
  * @since OOo 1.1.2
  */
trait XAccessibleEventListener
  extends StObject
     with XEventListener {
  
  /** is called whenever a accessible event (see {@link AccessibleEventObject} ) occurs. */
  def notifyEvent(aEvent: AccessibleEventObject): Unit
}
object XAccessibleEventListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    notifyEvent: AccessibleEventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XAccessibleEventListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), notifyEvent = js.Any.fromFunction1((t0: AccessibleEventObject) => notifyEvent(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAccessibleEventListener]
  }
  
  extension [Self <: XAccessibleEventListener](x: Self) {
    
    inline def setNotifyEvent(value: AccessibleEventObject => Callback): Self = StObject.set(x, "notifyEvent", js.Any.fromFunction1((t0: AccessibleEventObject) => value(t0).runNow()))
  }
}
