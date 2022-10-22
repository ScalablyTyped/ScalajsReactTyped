package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XCell
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XCellRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides advanced methods to control the position of a cursor in a spreadsheet.
  * @see com.sun.star.sheet.SheetCellCursor
  */
trait XSheetCellCursor
  extends StObject
     with XSheetCellRange {
  
  /**
    * collapses the cursor into the range of the array formula to which it is currently pointing.
    *
    * To get the correct result, the top left cell of the original cursor must point to any cell containing an array formula. If not, the cursor is left
    * unchanged.
    */
  def collapseToCurrentArray(): Unit
  
  /**
    * expands the cursor into the region containing the cells to which it currently points.
    *
    * A region is a cell range bounded by empty cells.
    */
  def collapseToCurrentRegion(): Unit
  
  /**
    * expands the cursor to merged cell ranges.
    *
    * Expands the current cursor range in a way so that all merged cell ranges intersecting the current range will fit completely. If the cursor does not
    * point to any range with merged cells, it is left unchanged.
    */
  def collapseToMergedArea(): Unit
  
  /**
    * changes the size of a cursor range.
    *
    * The top left cell of the cursor keeps unmodified.
    * @param nColumns the number of columns of the new cursor range.
    * @param nRows the number of rows of the new cursor range.
    */
  def collapseToSize(nColumns: Double, nRows: Double): Unit
  
  /** expands the cursor to include the entire columns of the cells to which it is currently pointing. */
  def expandToEntireColumns(): Unit
  
  /** expands the cursor to include the entire rows of the cells to which it is currently pointing. */
  def expandToEntireRows(): Unit
}
object XSheetCellCursor {
  
  inline def apply(
    Spreadsheet: XSpreadsheet,
    acquire: Callback,
    collapseToCurrentArray: Callback,
    collapseToCurrentRegion: Callback,
    collapseToMergedArea: Callback,
    collapseToSize: (Double, Double) => Callback,
    expandToEntireColumns: Callback,
    expandToEntireRows: Callback,
    getCellByPosition: (Double, Double) => XCell,
    getCellRangeByName: String => XCellRange,
    getCellRangeByPosition: (Double, Double, Double, Double) => XCellRange,
    getSpreadsheet: CallbackTo[XSpreadsheet],
    queryInterface: `type` => Any,
    release: Callback
  ): XSheetCellCursor = {
    val __obj = js.Dynamic.literal(Spreadsheet = Spreadsheet.asInstanceOf[js.Any], acquire = acquire.toJsFn, collapseToCurrentArray = collapseToCurrentArray.toJsFn, collapseToCurrentRegion = collapseToCurrentRegion.toJsFn, collapseToMergedArea = collapseToMergedArea.toJsFn, collapseToSize = js.Any.fromFunction2((t0: Double, t1: Double) => (collapseToSize(t0, t1)).runNow()), expandToEntireColumns = expandToEntireColumns.toJsFn, expandToEntireRows = expandToEntireRows.toJsFn, getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), getSpreadsheet = getSpreadsheet.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSheetCellCursor]
  }
  
  extension [Self <: XSheetCellCursor](x: Self) {
    
    inline def setCollapseToCurrentArray(value: Callback): Self = StObject.set(x, "collapseToCurrentArray", value.toJsFn)
    
    inline def setCollapseToCurrentRegion(value: Callback): Self = StObject.set(x, "collapseToCurrentRegion", value.toJsFn)
    
    inline def setCollapseToMergedArea(value: Callback): Self = StObject.set(x, "collapseToMergedArea", value.toJsFn)
    
    inline def setCollapseToSize(value: (Double, Double) => Callback): Self = StObject.set(x, "collapseToSize", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setExpandToEntireColumns(value: Callback): Self = StObject.set(x, "expandToEntireColumns", value.toJsFn)
    
    inline def setExpandToEntireRows(value: Callback): Self = StObject.set(x, "expandToEntireRows", value.toJsFn)
  }
}
