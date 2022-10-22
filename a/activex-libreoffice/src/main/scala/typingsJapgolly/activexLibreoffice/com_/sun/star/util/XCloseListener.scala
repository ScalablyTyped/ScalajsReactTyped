package typingsJapgolly.activexLibreoffice.com_.sun.star.util

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * makes it possible to receive events when an object is called for closing
  *
  * Such close events are broadcasted by a {@link XCloseBroadcaster} if somewhere tries to close it by calling {@link XCloseable.close()} . Listener can:
  * break that by throwing {@link CloseVetoException}or accept that by deregistering itself at this broadcaster.
  *
  * If an event {@link com.sun.star.lang.XEventListener.disposing()} occurred, nobody called {@link XCloseable.close()} on listened object before. Then
  * it's not allowed to break this request - it must be accepted!
  * @see XCloseable
  * @see XCloseBroadcaster
  */
trait XCloseListener
  extends StObject
     with XEventListener {
  
  /**
    * is called when the listened object is closed really
    *
    * Now the listened object is closed really. Listener has to accept that; should deregister itself and release all references to it. It's not allowed
    * nor possible to disagree with that by throwing any exception.
    *
    * If the event {@link com.sun.star.lang.XEventListener.disposing()} occurred before it must be accepted too. There exist no chance for a disagreement
    * any more.
    * @param Source describes the source of the event (must be the listened object)
    */
  def notifyClosing(Source: EventObject): Unit
  
  /**
    * is called when somewhere tries to close listened object
    *
    * Is called before {@link XCloseListener.notifyClosing()} . Listener has the chance to break that by throwing a {@link CloseVetoException} . This
    * exception must be passed to the original caller of {@link XCloseable.close()} without any interaction.
    *
    * The parameter **GetsOwnership** regulate who has to try to close the listened object again, if this listener disagree with the request by throwing the
    * exception. If it's set to `FALSE` the original caller of {@link XCloseable.close()} will be the owner in every case. It's not allowed to call close()
    * from this listener then. If it's set to `TRUE` this listener will be the new owner if it throw the exception, otherwise not! If it has still running
    * processes will be finished it must call close() on listened object again then.
    *
    * If this listener doesn't disagree with the close request it depends on its internal implementation if it deregisters itself from the listened object.
    * But normally this must be done in {@link XCloseListener.notifyClosing()} .
    * @param Source describes the source of the event (must be the listened object)
    * @param GetsOwnership `TRUE` pass the ownership to this listener, if it throw the veto exception (otherwise this parameter must be ignored!) ; `FALSE` fo
    * @throws CloseVetoException if listener disagree with the close request on listened object it must throw this exception
    */
  def queryClosing(Source: EventObject, GetsOwnership: Boolean): Unit
}
object XCloseListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    notifyClosing: EventObject => Callback,
    queryClosing: (EventObject, Boolean) => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XCloseListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), notifyClosing = js.Any.fromFunction1((t0: EventObject) => notifyClosing(t0).runNow()), queryClosing = js.Any.fromFunction2((t0: EventObject, t1: Boolean) => (queryClosing(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCloseListener]
  }
  
  extension [Self <: XCloseListener](x: Self) {
    
    inline def setNotifyClosing(value: EventObject => Callback): Self = StObject.set(x, "notifyClosing", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setQueryClosing(value: (EventObject, Boolean) => Callback): Self = StObject.set(x, "queryClosing", js.Any.fromFunction2((t0: EventObject, t1: Boolean) => (value(t0, t1)).runNow()))
  }
}
