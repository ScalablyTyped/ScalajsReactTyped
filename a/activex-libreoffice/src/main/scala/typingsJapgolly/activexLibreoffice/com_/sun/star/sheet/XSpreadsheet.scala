package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XCell
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XCellRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** provides methods to create a cell range cursor. */
trait XSpreadsheet
  extends StObject
     with XSheetCellRange {
  
  /**
    * creates a cell cursor including the whole spreadsheet.
    * @see com.sun.star.sheet.SheetCellCursor
    */
  def createCursor(): XSheetCellCursor
  
  /**
    * creates a cell cursor to travel in the given range context.
    * @param aRange the cell range for the cursor.
    * @see com.sun.star.sheet.SheetCellCursor
    */
  def createCursorByRange(aRange: XSheetCellRange): XSheetCellCursor
}
object XSpreadsheet {
  
  inline def apply(
    Spreadsheet: XSpreadsheet,
    acquire: Callback,
    createCursor: CallbackTo[XSheetCellCursor],
    createCursorByRange: XSheetCellRange => XSheetCellCursor,
    getCellByPosition: (Double, Double) => XCell,
    getCellRangeByName: String => XCellRange,
    getCellRangeByPosition: (Double, Double, Double, Double) => XCellRange,
    getSpreadsheet: CallbackTo[XSpreadsheet],
    queryInterface: `type` => Any,
    release: Callback
  ): XSpreadsheet = {
    val __obj = js.Dynamic.literal(Spreadsheet = Spreadsheet.asInstanceOf[js.Any], acquire = acquire.toJsFn, createCursor = createCursor.toJsFn, createCursorByRange = js.Any.fromFunction1(createCursorByRange), getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), getSpreadsheet = getSpreadsheet.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSpreadsheet]
  }
  
  extension [Self <: XSpreadsheet](x: Self) {
    
    inline def setCreateCursor(value: CallbackTo[XSheetCellCursor]): Self = StObject.set(x, "createCursor", value.toJsFn)
    
    inline def setCreateCursorByRange(value: XSheetCellRange => XSheetCellCursor): Self = StObject.set(x, "createCursorByRange", js.Any.fromFunction1(value))
  }
}
