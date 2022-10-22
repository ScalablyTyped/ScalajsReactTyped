package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used for receiving "rowsChanged" events posted by, for example, a row set. */
trait XRowsChangeListener
  extends StObject
     with XEventListener {
  
  /**
    * is called when rows are inserted, updated, or deleted.
    * @param event contains information about the event
    */
  def rowsChanged(event: RowsChangeEvent): Unit
}
object XRowsChangeListener {
  
  inline def apply(
    acquire: Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    rowsChanged: RowsChangeEvent => Callback
  ): XRowsChangeListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, rowsChanged = js.Any.fromFunction1((t0: RowsChangeEvent) => rowsChanged(t0).runNow()))
    __obj.asInstanceOf[XRowsChangeListener]
  }
  
  extension [Self <: XRowsChangeListener](x: Self) {
    
    inline def setRowsChanged(value: RowsChangeEvent => Callback): Self = StObject.set(x, "rowsChanged", js.Any.fromFunction1((t0: RowsChangeEvent) => value(t0).runNow()))
  }
}
