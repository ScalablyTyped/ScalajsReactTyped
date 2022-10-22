package typingsJapgolly.activexLibreoffice.com_.sun.star.view

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives events about print job progress.
  *
  * {@link XPrintableListener} can be registered to {@link XPrintableBroadcaster} . Then, the client object will receive events about print progress.
  * @see XPrintableBroadcaster
  */
trait XPrintableListener
  extends StObject
     with XEventListener {
  
  /**
    * informs the user of the new state in print progress.
    * @param Event contains the {@link XPrintable} having changed state and the new state.
    */
  def stateChanged(Event: PrintableStateEvent): Unit
}
object XPrintableListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    stateChanged: PrintableStateEvent => Callback
  ): XPrintableListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, stateChanged = js.Any.fromFunction1((t0: PrintableStateEvent) => stateChanged(t0).runNow()))
    __obj.asInstanceOf[XPrintableListener]
  }
  
  extension [Self <: XPrintableListener](x: Self) {
    
    inline def setStateChanged(value: PrintableStateEvent => Callback): Self = StObject.set(x, "stateChanged", js.Any.fromFunction1((t0: PrintableStateEvent) => value(t0).runNow()))
  }
}
