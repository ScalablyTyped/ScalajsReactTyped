package typingsJapgolly.activexLibreoffice.com_.sun.star.awt.grid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interfaces provides access to the selection of row for {@link UnoControlGrid} .
  * @since LibreOffice 3.4
  */
trait XGridRowSelection extends StObject {
  
  /**
    * Returns the indices of all selected rows.
    * @returns a sequence of indices.
    */
  val SelectedRows: SafeArray[Double]
  
  /**
    * Adds a listener for the {@link GridSelectionEvent} posted after the grid changes.
    * @param listener the listener to add.
    */
  def addSelectionListener(listener: XGridSelectionListener): Unit
  
  /** Deselects all selected rows. */
  def deselectAllRows(): Unit
  
  /**
    * removes the selection for a given row
    * @param RowIndex denotes the index of the row to deselect
    */
  def deselectRow(RowIndex: Double): Unit
  
  /**
    * Returns the indices of all selected rows.
    * @returns a sequence of indices.
    */
  def getSelectedRows(): SafeArray[Double]
  
  /**
    * Returns whether rows are selected.
    * @returns `TRUE` if and only if at least one row is selected.
    */
  def hasSelectedRows(): Boolean
  
  /**
    * Returns whether a specific row is selected.
    * @param RowIndex the index of a row. If the value does not denote a valid row index, i.e. is smaller than `0` or greater than the number of rows, this is
    * @returns `TRUE` if and only if there is a row with the given index, and it is selected currently.
    */
  def isRowSelected(RowIndex: Double): Boolean
  
  /**
    * Removes a listener previously added with {@link addSelectionListener()} .
    * @param listener the listener to remove.
    */
  def removeSelectionListener(listener: XGridSelectionListener): Unit
  
  /** Selects all rows. */
  def selectAllRows(): Unit
  
  /**
    * selects a given row
    * @param RowIndex denotes the index of the row to select
    * @throws com::sun::star::lang::IndexOutOfBoundsException if `RowIndex` does not denote a valid row index
    */
  def selectRow(RowIndex: Double): Unit
}
object XGridRowSelection {
  
  inline def apply(
    SelectedRows: SafeArray[Double],
    addSelectionListener: XGridSelectionListener => Callback,
    deselectAllRows: Callback,
    deselectRow: Double => Callback,
    getSelectedRows: CallbackTo[SafeArray[Double]],
    hasSelectedRows: CallbackTo[Boolean],
    isRowSelected: Double => Boolean,
    removeSelectionListener: XGridSelectionListener => Callback,
    selectAllRows: Callback,
    selectRow: Double => Callback
  ): XGridRowSelection = {
    val __obj = js.Dynamic.literal(SelectedRows = SelectedRows.asInstanceOf[js.Any], addSelectionListener = js.Any.fromFunction1((t0: XGridSelectionListener) => addSelectionListener(t0).runNow()), deselectAllRows = deselectAllRows.toJsFn, deselectRow = js.Any.fromFunction1((t0: Double) => deselectRow(t0).runNow()), getSelectedRows = getSelectedRows.toJsFn, hasSelectedRows = hasSelectedRows.toJsFn, isRowSelected = js.Any.fromFunction1(isRowSelected), removeSelectionListener = js.Any.fromFunction1((t0: XGridSelectionListener) => removeSelectionListener(t0).runNow()), selectAllRows = selectAllRows.toJsFn, selectRow = js.Any.fromFunction1((t0: Double) => selectRow(t0).runNow()))
    __obj.asInstanceOf[XGridRowSelection]
  }
  
  extension [Self <: XGridRowSelection](x: Self) {
    
    inline def setAddSelectionListener(value: XGridSelectionListener => Callback): Self = StObject.set(x, "addSelectionListener", js.Any.fromFunction1((t0: XGridSelectionListener) => value(t0).runNow()))
    
    inline def setDeselectAllRows(value: Callback): Self = StObject.set(x, "deselectAllRows", value.toJsFn)
    
    inline def setDeselectRow(value: Double => Callback): Self = StObject.set(x, "deselectRow", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setGetSelectedRows(value: CallbackTo[SafeArray[Double]]): Self = StObject.set(x, "getSelectedRows", value.toJsFn)
    
    inline def setHasSelectedRows(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasSelectedRows", value.toJsFn)
    
    inline def setIsRowSelected(value: Double => Boolean): Self = StObject.set(x, "isRowSelected", js.Any.fromFunction1(value))
    
    inline def setRemoveSelectionListener(value: XGridSelectionListener => Callback): Self = StObject.set(x, "removeSelectionListener", js.Any.fromFunction1((t0: XGridSelectionListener) => value(t0).runNow()))
    
    inline def setSelectAllRows(value: Callback): Self = StObject.set(x, "selectAllRows", value.toJsFn)
    
    inline def setSelectRow(value: Double => Callback): Self = StObject.set(x, "selectRow", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSelectedRows(value: SafeArray[Double]): Self = StObject.set(x, "SelectedRows", value.asInstanceOf[js.Any])
  }
}
