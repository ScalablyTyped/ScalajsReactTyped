package typingsJapgolly.activexLibreoffice.com_.sun.star.awt.grid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.Pair
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloneable
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes a grid control data model whose data can be modified and sorted. */
trait XSortableMutableGridDataModel
  extends StObject
     with XMutableGridDataModel
     with XSortableGridData
object XSortableMutableGridDataModel {
  
  inline def apply(
    ColumnCount: Double,
    CurrentSortOrder: Pair[Double, Boolean],
    RowCount: Double,
    acquire: Callback,
    addEventListener: XEventListener => Callback,
    addGridDataListener: XGridDataListener => Callback,
    addRow: (Any, SeqEquiv[Any]) => Callback,
    addRows: (SeqEquiv[Any], SeqEquiv[SeqEquiv[Any]]) => Callback,
    createClone: CallbackTo[XCloneable],
    dispose: Callback,
    getCellData: (Double, Double) => Any,
    getCellToolTip: (Double, Double) => Any,
    getCurrentSortOrder: CallbackTo[Pair[Double, Boolean]],
    getRowData: Double => SafeArray[Any],
    getRowHeading: Double => Any,
    insertRow: (Double, Any, SeqEquiv[Any]) => Callback,
    insertRows: (Double, SeqEquiv[Any], SeqEquiv[SeqEquiv[Any]]) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeAllRows: Callback,
    removeColumnSort: Callback,
    removeEventListener: XEventListener => Callback,
    removeGridDataListener: XGridDataListener => Callback,
    removeRow: Double => Callback,
    sortByColumn: (Double, Boolean) => Callback,
    updateCellData: (Double, Double, Any) => Callback,
    updateCellToolTip: (Double, Double, Any) => Callback,
    updateRowData: (SeqEquiv[Double], Double, SeqEquiv[Any]) => Callback,
    updateRowHeading: (Double, Any) => Callback,
    updateRowToolTip: (Double, Any) => Callback
  ): XSortableMutableGridDataModel = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount.asInstanceOf[js.Any], CurrentSortOrder = CurrentSortOrder.asInstanceOf[js.Any], RowCount = RowCount.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addGridDataListener = js.Any.fromFunction1((t0: XGridDataListener) => addGridDataListener(t0).runNow()), addRow = js.Any.fromFunction2((t0: Any, t1: SeqEquiv[Any]) => (addRow(t0, t1)).runNow()), addRows = js.Any.fromFunction2((t0: SeqEquiv[Any], t1: SeqEquiv[SeqEquiv[Any]]) => (addRows(t0, t1)).runNow()), createClone = createClone.toJsFn, dispose = dispose.toJsFn, getCellData = js.Any.fromFunction2(getCellData), getCellToolTip = js.Any.fromFunction2(getCellToolTip), getCurrentSortOrder = getCurrentSortOrder.toJsFn, getRowData = js.Any.fromFunction1(getRowData), getRowHeading = js.Any.fromFunction1(getRowHeading), insertRow = js.Any.fromFunction3((t0: Double, t1: Any, t2: SeqEquiv[Any]) => (insertRow(t0, t1, t2)).runNow()), insertRows = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[Any], t2: SeqEquiv[SeqEquiv[Any]]) => (insertRows(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeAllRows = removeAllRows.toJsFn, removeColumnSort = removeColumnSort.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeGridDataListener = js.Any.fromFunction1((t0: XGridDataListener) => removeGridDataListener(t0).runNow()), removeRow = js.Any.fromFunction1((t0: Double) => removeRow(t0).runNow()), sortByColumn = js.Any.fromFunction2((t0: Double, t1: Boolean) => (sortByColumn(t0, t1)).runNow()), updateCellData = js.Any.fromFunction3((t0: Double, t1: Double, t2: Any) => (updateCellData(t0, t1, t2)).runNow()), updateCellToolTip = js.Any.fromFunction3((t0: Double, t1: Double, t2: Any) => (updateCellToolTip(t0, t1, t2)).runNow()), updateRowData = js.Any.fromFunction3((t0: SeqEquiv[Double], t1: Double, t2: SeqEquiv[Any]) => (updateRowData(t0, t1, t2)).runNow()), updateRowHeading = js.Any.fromFunction2((t0: Double, t1: Any) => (updateRowHeading(t0, t1)).runNow()), updateRowToolTip = js.Any.fromFunction2((t0: Double, t1: Any) => (updateRowToolTip(t0, t1)).runNow()))
    __obj.asInstanceOf[XSortableMutableGridDataModel]
  }
}
