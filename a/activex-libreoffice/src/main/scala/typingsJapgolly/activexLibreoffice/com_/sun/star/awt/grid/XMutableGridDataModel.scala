package typingsJapgolly.activexLibreoffice.com_.sun.star.awt.grid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloneable
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to modify the data represented by a {@link XGridDataModel} */
trait XMutableGridDataModel
  extends StObject
     with XGridDataModel {
  
  /**
    * registers listener to be notified of data changes in the model
    * @param Listener specifies the listener to register
    */
  def addGridDataListener(Listener: XGridDataListener): Unit
  
  /**
    * appends a row to the model.
    * @param Heading denotes the heading of the row.
    * @param Data specifies the content of the row.
    */
  def addRow(Heading: Any, Data: SeqEquiv[Any]): Unit
  
  /**
    * appends multiple rows of data to the model.
    * @param Headings denotes the headings of the to-be-added rows.
    * @param Data specifies the data of the rows to be added.
    * @throws com::sun::star::lang::IllegalArgumentException if `Titles` and `Data` are of different length.
    */
  def addRows(Headings: SeqEquiv[Any], Data: SeqEquiv[SeqEquiv[Any]]): Unit
  
  /**
    * inserts a row into the set of data rows
    * @param Index denotes the position at which the row is to be inserted
    * @param Heading denotes the heading of the row.
    * @param Data specifies the content of the row.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Index` is smaller than `0` or greater than the number of rows in the model.
    */
  def insertRow(Index: Double, Heading: Any, Data: SeqEquiv[Any]): Unit
  
  /**
    * inserts multiple rows of data into the model.
    * @param Index denotes the position at which the rows are to be inserted
    * @param Headings denotes the headings of the to-be-added rows.
    * @param Data specifies the data of the rows to be added.
    * @throws com::sun::star::lang::IllegalArgumentException if `Titles` and `Data` are of different length.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `Index` is smaller than `0` or greater than the number of rows in the model.
    */
  def insertRows(Index: Double, Headings: SeqEquiv[Any], Data: SeqEquiv[SeqEquiv[Any]]): Unit
  
  /** Removes all rows from the model. */
  def removeAllRows(): Unit
  
  /**
    * revokes a listener which was previously registered via {@link addGridDataListener()}
    * @param Listener specifies the listener to revoke.
    */
  def removeGridDataListener(Listener: XGridDataListener): Unit
  
  /**
    * removes a row of data from the model
    * @param RowIndex the index of the row that should be removed.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given index is invalid
    */
  def removeRow(RowIndex: Double): Unit
  
  /**
    * updates the content of the given cell
    * @param ColumnIndex the column index of the to-be-updated cell
    * @param RowIndex the row index of the to-be-updated cell
    * @param Value the new value of the cell.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the row or column index is invalid
    */
  def updateCellData(ColumnIndex: Double, RowIndex: Double, Value: Any): Unit
  
  /**
    * updates the tooltip to be displayed for a given cell
    * @see XGridDataModel.getCellToolTip
    */
  def updateCellToolTip(ColumnIndex: Double, RowIndex: Double, Value: Any): Unit
  
  /**
    * updates the content of a given row.
    *
    * The change in the data model will be notified to registered listeners via {@link XGridDataListener.dataChanged()} . The {@link
    * GridDataEvent.FirstColumn} and {@link GridDataEvent.LastColumn} will denote the smallest respectively largest column index from ColumnIndexes.
    * @param ColumnIndexes contains the column indexes of the cells, which should be updated
    * @param RowIndex contains the index of the row whose data is to be updated
    * @param Values specifies the new values of the cells.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if one of the row indexes or the column index is invalid
    * @throws com::sun::star::lang::IllegalArgumentException if the lengths of the `ColumnIndexes` and `Values` sequences are not equal.
    */
  def updateRowData(ColumnIndexes: SeqEquiv[Double], RowIndex: Double, Values: SeqEquiv[Any]): Unit
  
  /**
    * sets a new title for a given row.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if the given index does not denote a valid row.
    */
  def updateRowHeading(RowIndex: Double, Heading: Any): Unit
  
  /**
    * updates the tooltip for all cells of a given row
    *
    * Effectively this method is a shortcut for calling {@link updateCellToolTip()} multiple times in a row, for all cells of a given row.
    * @see XGridDataModel.getCellToolTip
    * @see updateCellToolTip
    */
  def updateRowToolTip(RowIndex: Double, Value: Any): Unit
}
object XMutableGridDataModel {
  
  inline def apply(
    ColumnCount: Double,
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
    getRowData: Double => SafeArray[Any],
    getRowHeading: Double => Any,
    insertRow: (Double, Any, SeqEquiv[Any]) => Callback,
    insertRows: (Double, SeqEquiv[Any], SeqEquiv[SeqEquiv[Any]]) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeAllRows: Callback,
    removeEventListener: XEventListener => Callback,
    removeGridDataListener: XGridDataListener => Callback,
    removeRow: Double => Callback,
    updateCellData: (Double, Double, Any) => Callback,
    updateCellToolTip: (Double, Double, Any) => Callback,
    updateRowData: (SeqEquiv[Double], Double, SeqEquiv[Any]) => Callback,
    updateRowHeading: (Double, Any) => Callback,
    updateRowToolTip: (Double, Any) => Callback
  ): XMutableGridDataModel = {
    val __obj = js.Dynamic.literal(ColumnCount = ColumnCount.asInstanceOf[js.Any], RowCount = RowCount.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addGridDataListener = js.Any.fromFunction1((t0: XGridDataListener) => addGridDataListener(t0).runNow()), addRow = js.Any.fromFunction2((t0: Any, t1: SeqEquiv[Any]) => (addRow(t0, t1)).runNow()), addRows = js.Any.fromFunction2((t0: SeqEquiv[Any], t1: SeqEquiv[SeqEquiv[Any]]) => (addRows(t0, t1)).runNow()), createClone = createClone.toJsFn, dispose = dispose.toJsFn, getCellData = js.Any.fromFunction2(getCellData), getCellToolTip = js.Any.fromFunction2(getCellToolTip), getRowData = js.Any.fromFunction1(getRowData), getRowHeading = js.Any.fromFunction1(getRowHeading), insertRow = js.Any.fromFunction3((t0: Double, t1: Any, t2: SeqEquiv[Any]) => (insertRow(t0, t1, t2)).runNow()), insertRows = js.Any.fromFunction3((t0: Double, t1: SeqEquiv[Any], t2: SeqEquiv[SeqEquiv[Any]]) => (insertRows(t0, t1, t2)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeAllRows = removeAllRows.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeGridDataListener = js.Any.fromFunction1((t0: XGridDataListener) => removeGridDataListener(t0).runNow()), removeRow = js.Any.fromFunction1((t0: Double) => removeRow(t0).runNow()), updateCellData = js.Any.fromFunction3((t0: Double, t1: Double, t2: Any) => (updateCellData(t0, t1, t2)).runNow()), updateCellToolTip = js.Any.fromFunction3((t0: Double, t1: Double, t2: Any) => (updateCellToolTip(t0, t1, t2)).runNow()), updateRowData = js.Any.fromFunction3((t0: SeqEquiv[Double], t1: Double, t2: SeqEquiv[Any]) => (updateRowData(t0, t1, t2)).runNow()), updateRowHeading = js.Any.fromFunction2((t0: Double, t1: Any) => (updateRowHeading(t0, t1)).runNow()), updateRowToolTip = js.Any.fromFunction2((t0: Double, t1: Any) => (updateRowToolTip(t0, t1)).runNow()))
    __obj.asInstanceOf[XMutableGridDataModel]
  }
  
  extension [Self <: XMutableGridDataModel](x: Self) {
    
    inline def setAddGridDataListener(value: XGridDataListener => Callback): Self = StObject.set(x, "addGridDataListener", js.Any.fromFunction1((t0: XGridDataListener) => value(t0).runNow()))
    
    inline def setAddRow(value: (Any, SeqEquiv[Any]) => Callback): Self = StObject.set(x, "addRow", js.Any.fromFunction2((t0: Any, t1: SeqEquiv[Any]) => (value(t0, t1)).runNow()))
    
    inline def setAddRows(value: (SeqEquiv[Any], SeqEquiv[SeqEquiv[Any]]) => Callback): Self = StObject.set(x, "addRows", js.Any.fromFunction2((t0: SeqEquiv[Any], t1: SeqEquiv[SeqEquiv[Any]]) => (value(t0, t1)).runNow()))
    
    inline def setInsertRow(value: (Double, Any, SeqEquiv[Any]) => Callback): Self = StObject.set(x, "insertRow", js.Any.fromFunction3((t0: Double, t1: Any, t2: SeqEquiv[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setInsertRows(value: (Double, SeqEquiv[Any], SeqEquiv[SeqEquiv[Any]]) => Callback): Self = StObject.set(x, "insertRows", js.Any.fromFunction3((t0: Double, t1: SeqEquiv[Any], t2: SeqEquiv[SeqEquiv[Any]]) => (value(t0, t1, t2)).runNow()))
    
    inline def setRemoveAllRows(value: Callback): Self = StObject.set(x, "removeAllRows", value.toJsFn)
    
    inline def setRemoveGridDataListener(value: XGridDataListener => Callback): Self = StObject.set(x, "removeGridDataListener", js.Any.fromFunction1((t0: XGridDataListener) => value(t0).runNow()))
    
    inline def setRemoveRow(value: Double => Callback): Self = StObject.set(x, "removeRow", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setUpdateCellData(value: (Double, Double, Any) => Callback): Self = StObject.set(x, "updateCellData", js.Any.fromFunction3((t0: Double, t1: Double, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setUpdateCellToolTip(value: (Double, Double, Any) => Callback): Self = StObject.set(x, "updateCellToolTip", js.Any.fromFunction3((t0: Double, t1: Double, t2: Any) => (value(t0, t1, t2)).runNow()))
    
    inline def setUpdateRowData(value: (SeqEquiv[Double], Double, SeqEquiv[Any]) => Callback): Self = StObject.set(x, "updateRowData", js.Any.fromFunction3((t0: SeqEquiv[Double], t1: Double, t2: SeqEquiv[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setUpdateRowHeading(value: (Double, Any) => Callback): Self = StObject.set(x, "updateRowHeading", js.Any.fromFunction2((t0: Double, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setUpdateRowToolTip(value: (Double, Any) => Callback): Self = StObject.set(x, "updateRowToolTip", js.Any.fromFunction2((t0: Double, t1: Any) => (value(t0, t1)).runNow()))
  }
}
