package typingsJapgolly.activexLibreoffice.com_.sun.star.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provide a central access point for a group of events.
  *
  * Listeners can be added with a simple restriction on the event source. They are only called for events that originate at the specified source.
  *
  * Event providers can broadcast an event to all interested listeners.
  *
  * The XEventMultiplexer interface is typically implemented as a singleton
  */
trait XContextChangeEventMultiplexer
  extends StObject
     with XInterface {
  
  /**
    * Add an event listener that is called only when events are broadcast for the specified event focus.
    * @param xListener An empty reference results in an InvalidArgumentException. One listener may be added more than once for different event foci. Adding a
    * @param xEventFocus An empty reference is a valid value. In this case the registered listener will be called for every event broadcast, regardless of its
    * @throws com::sun::star::lang::IllegalArgumentException
    */
  def addContextChangeEventListener(xListener: XContextChangeEventListener, xEventFocus: XInterface): Unit
  
  /** Call all event listeners that where added for the specified event focus. */
  def broadcastContextChangeEvent(aEvent: ContextChangeEventObject, xEventFocus: XInterface): Unit
  
  /**
    * Remove an event listener for all event foci.
    * @param xListener An empty reference results in an InvalidArgumentException. It is not an error when the listener is not registered for any event focus.
    * @throws com::sun::star::lang::IllegalArgumentException
    */
  def removeAllContextChangeEventListeners(xListener: XContextChangeEventListener): Unit
  
  /**
    * Remove an event listener for the specified event focus.
    *
    * When the same listener was added for other event foci then these associations remain unmodified.
    * @param xListener An empty reference results in an InvalidArgumentException. When the listener is not registered for the given event focus then an Invali
    * @param xEventFocus The listener is only removed for this event focus. An empty reference is a valid value.
    * @throws com::sun::star::lang::IllegalArgumentException
    */
  def removeContextChangeEventListener(xListener: XContextChangeEventListener, xEventFocus: XInterface): Unit
}
object XContextChangeEventMultiplexer {
  
  inline def apply(
    acquire: Callback,
    addContextChangeEventListener: (XContextChangeEventListener, XInterface) => Callback,
    broadcastContextChangeEvent: (ContextChangeEventObject, XInterface) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeAllContextChangeEventListeners: XContextChangeEventListener => Callback,
    removeContextChangeEventListener: (XContextChangeEventListener, XInterface) => Callback
  ): XContextChangeEventMultiplexer = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addContextChangeEventListener = js.Any.fromFunction2((t0: XContextChangeEventListener, t1: XInterface) => (addContextChangeEventListener(t0, t1)).runNow()), broadcastContextChangeEvent = js.Any.fromFunction2((t0: ContextChangeEventObject, t1: XInterface) => (broadcastContextChangeEvent(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeAllContextChangeEventListeners = js.Any.fromFunction1((t0: XContextChangeEventListener) => removeAllContextChangeEventListeners(t0).runNow()), removeContextChangeEventListener = js.Any.fromFunction2((t0: XContextChangeEventListener, t1: XInterface) => (removeContextChangeEventListener(t0, t1)).runNow()))
    __obj.asInstanceOf[XContextChangeEventMultiplexer]
  }
  
  extension [Self <: XContextChangeEventMultiplexer](x: Self) {
    
    inline def setAddContextChangeEventListener(value: (XContextChangeEventListener, XInterface) => Callback): Self = StObject.set(x, "addContextChangeEventListener", js.Any.fromFunction2((t0: XContextChangeEventListener, t1: XInterface) => (value(t0, t1)).runNow()))
    
    inline def setBroadcastContextChangeEvent(value: (ContextChangeEventObject, XInterface) => Callback): Self = StObject.set(x, "broadcastContextChangeEvent", js.Any.fromFunction2((t0: ContextChangeEventObject, t1: XInterface) => (value(t0, t1)).runNow()))
    
    inline def setRemoveAllContextChangeEventListeners(value: XContextChangeEventListener => Callback): Self = StObject.set(x, "removeAllContextChangeEventListeners", js.Any.fromFunction1((t0: XContextChangeEventListener) => value(t0).runNow()))
    
    inline def setRemoveContextChangeEventListener(value: (XContextChangeEventListener, XInterface) => Callback): Self = StObject.set(x, "removeContextChangeEventListener", js.Any.fromFunction2((t0: XContextChangeEventListener, t1: XInterface) => (value(t0, t1)).runNow()))
  }
}
