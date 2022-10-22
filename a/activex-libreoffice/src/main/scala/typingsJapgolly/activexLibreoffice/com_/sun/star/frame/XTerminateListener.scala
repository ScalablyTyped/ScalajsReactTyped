package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * has to be provided if an object wants to receive an event when the master environment (e.g., desktop) is terminated.
  * @see XDesktop.terminate()
  * @see XDesktop.addTerminateListener()
  * @see XDesktop.removeTerminateListener()
  */
trait XTerminateListener
  extends StObject
     with XEventListener {
  
  /**
    * is called when the master environment is finally terminated. No veto will be accepted then.
    * @param Event describe the source of the event (e.g., the desktop)
    */
  def notifyTermination(Event: EventObject): Unit
  
  /**
    * is called when the master environment (e.g., desktop) is about to terminate.
    *
    * Termination can be intercepted by throwing {@link TerminationVetoException} . Interceptor will be the new owner of desktop and should call {@link
    * XDesktop.terminate()} after finishing its own operations.
    * @param Event describe the source of the event (e.g., the desktop)
    * @throws TerminationVetoException listener can disagree with this query by throwing this veto exception
    */
  def queryTermination(Event: EventObject): Unit
}
object XTerminateListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    notifyTermination: EventObject => Callback,
    queryInterface: `type` => Any,
    queryTermination: EventObject => Callback,
    release: Callback
  ): XTerminateListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), notifyTermination = js.Any.fromFunction1((t0: EventObject) => notifyTermination(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), queryTermination = js.Any.fromFunction1((t0: EventObject) => queryTermination(t0).runNow()), release = release.toJsFn)
    __obj.asInstanceOf[XTerminateListener]
  }
  
  extension [Self <: XTerminateListener](x: Self) {
    
    inline def setNotifyTermination(value: EventObject => Callback): Self = StObject.set(x, "notifyTermination", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    
    inline def setQueryTermination(value: EventObject => Callback): Self = StObject.set(x, "queryTermination", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
