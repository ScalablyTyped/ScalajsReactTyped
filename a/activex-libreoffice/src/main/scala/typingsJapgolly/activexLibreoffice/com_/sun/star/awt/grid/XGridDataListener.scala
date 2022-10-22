package typingsJapgolly.activexLibreoffice.com_.sun.star.awt.grid

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An instance of this interface is used by the {@link XGridDataModel} to get notifications about data model changes.
  *
  * Usually you must not implement this interface yourself, but you must notify it correctly if you implement the {@link XGridDataModel} yourself
  *
  * .
  * @since OOo 3.3
  */
trait XGridDataListener
  extends StObject
     with XEventListener {
  
  /** is called when existing data in a grid control's data model has been modified. */
  def dataChanged(Event: GridDataEvent): Unit
  
  /** is called when the title of one or more rows changed. */
  def rowHeadingChanged(Event: GridDataEvent): Unit
  
  /** is called when one or more rows of data have been inserted into a grid control's data model. */
  def rowsInserted(Event: GridDataEvent): Unit
  
  /** is called when one or more rows of data have been removed from a grid control's data model. */
  def rowsRemoved(Event: GridDataEvent): Unit
}
object XGridDataListener {
  
  inline def apply(
    acquire: Callback,
    dataChanged: GridDataEvent => Callback,
    disposing: EventObject => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    rowHeadingChanged: GridDataEvent => Callback,
    rowsInserted: GridDataEvent => Callback,
    rowsRemoved: GridDataEvent => Callback
  ): XGridDataListener = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, dataChanged = js.Any.fromFunction1((t0: GridDataEvent) => dataChanged(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, rowHeadingChanged = js.Any.fromFunction1((t0: GridDataEvent) => rowHeadingChanged(t0).runNow()), rowsInserted = js.Any.fromFunction1((t0: GridDataEvent) => rowsInserted(t0).runNow()), rowsRemoved = js.Any.fromFunction1((t0: GridDataEvent) => rowsRemoved(t0).runNow()))
    __obj.asInstanceOf[XGridDataListener]
  }
  
  extension [Self <: XGridDataListener](x: Self) {
    
    inline def setDataChanged(value: GridDataEvent => Callback): Self = StObject.set(x, "dataChanged", js.Any.fromFunction1((t0: GridDataEvent) => value(t0).runNow()))
    
    inline def setRowHeadingChanged(value: GridDataEvent => Callback): Self = StObject.set(x, "rowHeadingChanged", js.Any.fromFunction1((t0: GridDataEvent) => value(t0).runNow()))
    
    inline def setRowsInserted(value: GridDataEvent => Callback): Self = StObject.set(x, "rowsInserted", js.Any.fromFunction1((t0: GridDataEvent) => value(t0).runNow()))
    
    inline def setRowsRemoved(value: GridDataEvent => Callback): Self = StObject.set(x, "rowsRemoved", js.Any.fromFunction1((t0: GridDataEvent) => value(t0).runNow()))
  }
}
