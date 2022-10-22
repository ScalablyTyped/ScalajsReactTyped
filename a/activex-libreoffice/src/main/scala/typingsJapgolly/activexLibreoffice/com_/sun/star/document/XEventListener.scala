package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to register listeners, which are called whenever a document or document content event occurs
  *
  * Such events will be broadcasted by a {@link XEventBroadcaster} .
  * @deprecated Deprecated
  * @see XDocumentEventListener
  */
trait XEventListener
  extends StObject
     with typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener {
  
  /**
    * is called whenever a document event (see {@link EventObject} ) occurs
    * @param Event specifies the event type
    */
  def notifyEvent(Event: EventObject): Unit
}
object XEventListener {
  
  inline def apply(
    acquire: Callback,
    disposing: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject => Callback,
    notifyEvent: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XEventListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject) => disposing(t0).runNow()), notifyEvent = js.Any.fromFunction1((t0: EventObject) => notifyEvent(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XEventListener]
  }
  
  extension [Self <: XEventListener](x: Self) {
    
    inline def setNotifyEvent(value: EventObject => Callback): Self = StObject.set(x, "notifyEvent", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
