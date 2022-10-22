package typingsJapgolly.activexLibreoffice.com_.sun.star.linguistic2

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is used to inform listeners about LinguServiceEvents.
  *
  * The function of this interface is used by the {@link com.sun.star.linguistic2.XLinguServiceEventBroadcaster} to inform its listeners about the
  * com::sun::star::linguistic2::LinguServiceEvents.
  * @see com.sun.star.linguistic2.XLinguServiceManager
  */
trait XLinguServiceEventListener
  extends StObject
     with XEventListener {
  
  /** @param aLngSvcEvent the event the listener will be informed about. */
  def processLinguServiceEvent(aLngSvcEvent: LinguServiceEvent): Unit
}
object XLinguServiceEventListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    processLinguServiceEvent: LinguServiceEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XLinguServiceEventListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), processLinguServiceEvent = js.Any.fromFunction1((t0: LinguServiceEvent) => processLinguServiceEvent(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XLinguServiceEventListener]
  }
  
  extension [Self <: XLinguServiceEventListener](x: Self) {
    
    inline def setProcessLinguServiceEvent(value: LinguServiceEvent => Callback): Self = StObject.set(x, "processLinguServiceEvent", js.Any.fromFunction1((t0: LinguServiceEvent) => value(t0).runNow()))
  }
}
