package typingsJapgolly.activexLibreoffice.com_.sun.star.io

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used to receive callbacks from an importer or exporter. */
trait XDataTransferEventListener
  extends StObject
     with XEventListener {
  
  /** is called when an import or export process has been cancelled. */
  def cancelled(aEvent: DataTransferEvent): Unit
  
  /** is called when an import or export process has finished. */
  def finished(aEvent: DataTransferEvent): Unit
}
object XDataTransferEventListener {
  
  inline def apply(
    acquire: Callback,
    cancelled: DataTransferEvent => Callback,
    disposing: EventObject => Callback,
    finished: DataTransferEvent => Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XDataTransferEventListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, cancelled = js.Any.fromFunction1((t0: DataTransferEvent) => cancelled(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), finished = js.Any.fromFunction1((t0: DataTransferEvent) => finished(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XDataTransferEventListener]
  }
  
  extension [Self <: XDataTransferEventListener](x: Self) {
    
    inline def setCancelled(value: DataTransferEvent => Callback): Self = StObject.set(x, "cancelled", js.Any.fromFunction1((t0: DataTransferEvent) => value(t0).runNow()))
    
    inline def setFinished(value: DataTransferEvent => Callback): Self = StObject.set(x, "finished", js.Any.fromFunction1((t0: DataTransferEvent) => value(t0).runNow()))
  }
}
