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
  * {@link XPrintJobListener} can be registered to {@link XPrintJobBroadcaster} . Then, the client object will be notified when a new print job starts or
  * its state changes.
  * @see XPrintJobBroadcaster
  * @see XPrintJob
  * @since OOo 1.1.2
  */
trait XPrintJobListener
  extends StObject
     with XEventListener {
  
  /**
    * informs the user about the creation or the progress of a PrintJob
    * @param Event contains the {@link XPrintJob} having changed state and the new state.
    */
  def printJobEvent(Event: PrintJobEvent): Unit
}
object XPrintJobListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    printJobEvent: PrintJobEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XPrintJobListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), printJobEvent = js.Any.fromFunction1((t0: PrintJobEvent) => printJobEvent(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XPrintJobListener]
  }
  
  extension [Self <: XPrintJobListener](x: Self) {
    
    inline def setPrintJobEvent(value: PrintJobEvent => Callback): Self = StObject.set(x, "printJobEvent", js.Any.fromFunction1((t0: PrintJobEvent) => value(t0).runNow()))
  }
}
