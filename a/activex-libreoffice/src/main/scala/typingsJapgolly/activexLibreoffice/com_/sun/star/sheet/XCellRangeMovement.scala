package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides methods for moving ranges of cells in a sheet. */
trait XCellRangeMovement
  extends StObject
     with XInterface {
  
  /**
    * copies a cell range to another position in the document.
    *
    * The source cell range keeps unchanged.
    * @param aDestination the address of the top left cell of the destination range.
    * @param aSource the cell range which will be copied.
    */
  def copyRange(aDestination: CellAddress, aSource: CellRangeAddress): Unit
  
  /**
    * inserts cells, moving other cells down or right.
    *
    * Non-empty cells cannot be moved off the sheet.
    * @param aRange the cell range in which empty cells will be inserted.
    * @param nMode describes how to move existing cells.
    */
  def insertCells(aRange: CellRangeAddress, nMode: CellInsertMode): Unit
  
  /**
    * moves a cell range to another position in the document.
    *
    * After copying the contents of the cell range, all cells will be cleared.
    * @param aDestination the address of the top left cell of the destination range.
    * @param aSource the cell range which will be copied.
    */
  def moveRange(aDestination: CellAddress, aSource: CellRangeAddress): Unit
  
  /**
    * deletes cells, moving other cells up or left.
    * @param aRange the cell range to remove.
    * @param nMode describes how to move following cells.
    */
  def removeRange(aRange: CellRangeAddress, nMode: CellDeleteMode): Unit
}
object XCellRangeMovement {
  
  inline def apply(
    acquire: Callback,
    copyRange: (CellAddress, CellRangeAddress) => Callback,
    insertCells: (CellRangeAddress, CellInsertMode) => Callback,
    moveRange: (CellAddress, CellRangeAddress) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeRange: (CellRangeAddress, CellDeleteMode) => Callback
  ): XCellRangeMovement = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, copyRange = js.Any.fromFunction2((t0: CellAddress, t1: CellRangeAddress) => (copyRange(t0, t1)).runNow()), insertCells = js.Any.fromFunction2((t0: CellRangeAddress, t1: CellInsertMode) => (insertCells(t0, t1)).runNow()), moveRange = js.Any.fromFunction2((t0: CellAddress, t1: CellRangeAddress) => (moveRange(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeRange = js.Any.fromFunction2((t0: CellRangeAddress, t1: CellDeleteMode) => (removeRange(t0, t1)).runNow()))
    __obj.asInstanceOf[XCellRangeMovement]
  }
  
  extension [Self <: XCellRangeMovement](x: Self) {
    
    inline def setCopyRange(value: (CellAddress, CellRangeAddress) => Callback): Self = StObject.set(x, "copyRange", js.Any.fromFunction2((t0: CellAddress, t1: CellRangeAddress) => (value(t0, t1)).runNow()))
    
    inline def setInsertCells(value: (CellRangeAddress, CellInsertMode) => Callback): Self = StObject.set(x, "insertCells", js.Any.fromFunction2((t0: CellRangeAddress, t1: CellInsertMode) => (value(t0, t1)).runNow()))
    
    inline def setMoveRange(value: (CellAddress, CellRangeAddress) => Callback): Self = StObject.set(x, "moveRange", js.Any.fromFunction2((t0: CellAddress, t1: CellRangeAddress) => (value(t0, t1)).runNow()))
    
    inline def setRemoveRange(value: (CellRangeAddress, CellDeleteMode) => Callback): Self = StObject.set(x, "removeRange", js.Any.fromFunction2((t0: CellRangeAddress, t1: CellDeleteMode) => (value(t0, t1)).runNow()))
  }
}
