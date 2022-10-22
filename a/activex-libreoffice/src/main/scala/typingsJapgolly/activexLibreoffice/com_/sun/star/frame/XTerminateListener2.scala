package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** extend interface {@link XTerminateListener} so a listener will be informed in case termination process was canceled by other reasons. */
trait XTerminateListener2
  extends StObject
     with XTerminateListener {
  
  /**
    * is called when the master environment (e.g., desktop) was canceled in it's terminate request.
    *
    * Termination can be intercepted by throwing {@link TerminationVetoException} . But if a listener was queried for termination .. doesn't throw a veto
    * exception ... it doesn't know if termination will be real next time. Because any other listener can throw those exception too ... and so it can happen
    * that after {@link queryTermination()} no {@link notifyTermination()} will occur. But these listener don't know if its allowed to start new processes
    * then. Using this optional(!) interface will make it possible to be informed about canceled termination requests also.
    * @param Event describe the source of the event (e.g., the desktop)
    */
  def cancelTermination(Event: EventObject): Unit
}
object XTerminateListener2 {
  
  inline def apply(
    acquire: Callback,
    cancelTermination: EventObject => Callback,
    disposing: EventObject => Callback,
    notifyTermination: EventObject => Callback,
    queryInterface: `type` => Any,
    queryTermination: EventObject => Callback,
    release: Callback
  ): XTerminateListener2 = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, cancelTermination = js.Any.fromFunction1((t0: EventObject) => cancelTermination(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), notifyTermination = js.Any.fromFunction1((t0: EventObject) => notifyTermination(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), queryTermination = js.Any.fromFunction1((t0: EventObject) => queryTermination(t0).runNow()), release = release.toJsFn)
    __obj.asInstanceOf[XTerminateListener2]
  }
  
  extension [Self <: XTerminateListener2](x: Self) {
    
    inline def setCancelTermination(value: EventObject => Callback): Self = StObject.set(x, "cancelTermination", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
  }
}
