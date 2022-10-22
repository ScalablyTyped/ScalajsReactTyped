package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive events from an active data control. */
trait XStreamListener
  extends StObject
     with XEventListener {
  
  /**
    * gets called when data transfer terminates normally or when data transfer is terminated from outside.
    *
    * The termination could be done using the method {@link XActiveDataControl.terminate()} .
    */
  def closed(): Unit
  
  /**
    * gets called when an internal error in source or sink has occurred.
    *
    * After the method is called, the close is called on the connected streams.
    */
  def error(aException: Any): Unit
  
  /** gets called as soon as data transfer has started. */
  def started(): Unit
  
  /** gets called when {@link XActiveDataControl.terminate()} is called. */
  def terminated(): Unit
}
object XStreamListener {
  
  inline def apply(
    acquire: Callback,
    closed: Callback,
    disposing: EventObject => Callback,
    error: Any => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    started: Callback,
    terminated: Callback
  ): XStreamListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, closed = closed.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), error = js.Any.fromFunction1((t0: Any) => error(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, started = started.toJsFn, terminated = terminated.toJsFn)
    __obj.asInstanceOf[XStreamListener]
  }
  
  extension [Self <: XStreamListener](x: Self) {
    
    inline def setClosed(value: Callback): Self = StObject.set(x, "closed", value.toJsFn)
    
    inline def setError(value: Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setStarted(value: Callback): Self = StObject.set(x, "started", value.toJsFn)
    
    inline def setTerminated(value: Callback): Self = StObject.set(x, "terminated", value.toJsFn)
  }
}
