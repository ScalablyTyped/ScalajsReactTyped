package typingsJapgolly.activexLibreoffice.com_.sun.star.table

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to control the position of a cell cursor.
  * @see com.sun.star.table.CellCursor
  */
trait XCellCursor
  extends StObject
     with XCellRange {
  
  /** points the cursor to a single cell which is the end of a contiguous series of (filled) cells. */
  def gotoEnd(): Unit
  
  /**
    * points the cursor to the next unprotected cell.
    *
    * If the sheet is not protected, this is the next cell to the right.
    */
  def gotoNext(): Unit
  
  /**
    * moves the origin of the cursor relative to the current position.
    * @param nColumnOffset is the count of columns to move. A negative value moves the cursor to the left.
    * @param nRowOffset is the count of rows to move. A negative value moves the cursor to the top.
    */
  def gotoOffset(nColumnOffset: Double, nRowOffset: Double): Unit
  
  /**
    * points the cursor to the previous unprotected cell.
    *
    * If the sheet is not protected, this is the next cell to the left.
    */
  def gotoPrevious(): Unit
  
  /** points the cursor to a single cell which is the beginning of a contiguous series of (filled) cells. */
  def gotoStart(): Unit
}
object XCellCursor {
  
  inline def apply(
    acquire: Callback,
    getCellByPosition: (Double, Double) => XCell,
    getCellRangeByName: String => XCellRange,
    getCellRangeByPosition: (Double, Double, Double, Double) => XCellRange,
    gotoEnd: Callback,
    gotoNext: Callback,
    gotoOffset: (Double, Double) => Callback,
    gotoPrevious: Callback,
    gotoStart: Callback,
    queryInterface: `type` => Any,
    release: Callback
  ): XCellCursor = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), gotoEnd = gotoEnd.toJsFn, gotoNext = gotoNext.toJsFn, gotoOffset = js.Any.fromFunction2((t0: Double, t1: Double) => (gotoOffset(t0, t1)).runNow()), gotoPrevious = gotoPrevious.toJsFn, gotoStart = gotoStart.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCellCursor]
  }
  
  extension [Self <: XCellCursor](x: Self) {
    
    inline def setGotoEnd(value: Callback): Self = StObject.set(x, "gotoEnd", value.toJsFn)
    
    inline def setGotoNext(value: Callback): Self = StObject.set(x, "gotoNext", value.toJsFn)
    
    inline def setGotoOffset(value: (Double, Double) => Callback): Self = StObject.set(x, "gotoOffset", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setGotoPrevious(value: Callback): Self = StObject.set(x, "gotoPrevious", value.toJsFn)
    
    inline def setGotoStart(value: Callback): Self = StObject.set(x, "gotoStart", value.toJsFn)
  }
}
