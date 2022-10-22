package typingsJapgolly.activexLibreoffice.com_.sun.star.awt.grid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.Pair
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to sort the data represented by a {@link XGridDataModel} */
trait XSortableGridData extends StObject {
  
  /**
    * returns the current sort order.
    * @returns a structure describing the current sort order. com::sun::star::beans::Pair::First denotes the column by which the data is sorted, or -1 if the da
    */
  val CurrentSortOrder: Pair[Double, Boolean]
  
  /**
    * returns the current sort order.
    * @returns a structure describing the current sort order. com::sun::star::beans::Pair::First denotes the column by which the data is sorted, or -1 if the da
    */
  def getCurrentSortOrder(): Pair[Double, Boolean]
  
  /** removes any possibly present sorting of the grid data */
  def removeColumnSort(): Unit
  
  /**
    * sorts the rows represented by the model by a given column's data.
    * @param ColumnIndex the index of the column whose data should be used as sort key
    * @param SortAscending is `TRUE` if the data should be sorted ascending, `FALSE` otherwise.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `ColumnIndex` does not denote a valid column.
    */
  def sortByColumn(ColumnIndex: Double, SortAscending: Boolean): Unit
}
object XSortableGridData {
  
  inline def apply(
    CurrentSortOrder: Pair[Double, Boolean],
    getCurrentSortOrder: CallbackTo[Pair[Double, Boolean]],
    removeColumnSort: Callback,
    sortByColumn: (Double, Boolean) => Callback
  ): XSortableGridData = {
    val __obj = js.Dynamic.literal(CurrentSortOrder = CurrentSortOrder.asInstanceOf[js.Any], getCurrentSortOrder = getCurrentSortOrder.toJsFn, removeColumnSort = removeColumnSort.toJsFn, sortByColumn = js.Any.fromFunction2((t0: Double, t1: Boolean) => (sortByColumn(t0, t1)).runNow()))
    __obj.asInstanceOf[XSortableGridData]
  }
  
  extension [Self <: XSortableGridData](x: Self) {
    
    inline def setCurrentSortOrder(value: Pair[Double, Boolean]): Self = StObject.set(x, "CurrentSortOrder", value.asInstanceOf[js.Any])
    
    inline def setGetCurrentSortOrder(value: CallbackTo[Pair[Double, Boolean]]): Self = StObject.set(x, "getCurrentSortOrder", value.toJsFn)
    
    inline def setRemoveColumnSort(value: Callback): Self = StObject.set(x, "removeColumnSort", value.toJsFn)
    
    inline def setSortByColumn(value: (Double, Boolean) => Callback): Self = StObject.set(x, "sortByColumn", js.Any.fromFunction2((t0: Double, t1: Boolean) => (value(t0, t1)).runNow()))
  }
}
