package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides a method to apply a Multiple Operations Table to the cell range. */
trait XMultipleOperation
  extends StObject
     with XInterface {
  
  /**
    * creates a table of formulas (a "Multiple Operations Table").
    *
    * The specified formulas are repeated, with references to the specified cells replaced by references to values in the first column and/or row of the
    * range.
    * @param aFormulaRange the range that contains formula cells (modes TableOperationMode::ROW or TableOperationMode::COLUMN) or a single formula cell (mode
    * @param nMode specifies the calculation mode to fill the cells.
    * @param aColumnCell contains the address of the cell that is referenced by formulas in a row (mode TableOperationMode::ROW) or by the formula cell used f
    * @param aRowCell contains the address of the cell that is referenced by formulas in a column (mode TableOperationMode::COLUMN) or by the formula cell use
    */
  def setTableOperation(
    aFormulaRange: CellRangeAddress,
    nMode: TableOperationMode,
    aColumnCell: CellAddress,
    aRowCell: CellAddress
  ): Unit
}
object XMultipleOperation {
  
  inline def apply(
    acquire: Callback,
    queryInterface: `type` => Any,
    release: Callback,
    setTableOperation: (CellRangeAddress, TableOperationMode, CellAddress, CellAddress) => Callback
  ): XMultipleOperation = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setTableOperation = js.Any.fromFunction4((t0: CellRangeAddress, t1: TableOperationMode, t2: CellAddress, t3: CellAddress) => (setTableOperation(t0, t1, t2, t3)).runNow()))
    __obj.asInstanceOf[XMultipleOperation]
  }
  
  extension [Self <: XMultipleOperation](x: Self) {
    
    inline def setSetTableOperation(value: (CellRangeAddress, TableOperationMode, CellAddress, CellAddress) => Callback): Self = StObject.set(x, "setTableOperation", js.Any.fromFunction4((t0: CellRangeAddress, t1: TableOperationMode, t2: CellAddress, t3: CellAddress) => (value(t0, t1, t2, t3)).runNow()))
  }
}
