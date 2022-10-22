package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XCell
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XCellCursor
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XCellRange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a cursor in a spreadsheet.
  *
  * A cursor is a cell range which provides additional methods to move through the table (i.e. to find specific cell ranges).
  */
trait SheetCellCursor
  extends StObject
     with XCellCursor
     with SheetCellRange
     with XSheetCellCursor
     with XUsedAreaCursor
object SheetCellCursor {
  
  inline def apply(
    SheetCellRange: SheetCellRange,
    XSheetCellCursor: XSheetCellCursor,
    XUsedAreaCursor: XUsedAreaCursor,
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
  ): SheetCellCursor = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getCellByPosition = js.Any.fromFunction2(getCellByPosition), getCellRangeByName = js.Any.fromFunction1(getCellRangeByName), getCellRangeByPosition = js.Any.fromFunction4(getCellRangeByPosition), gotoEnd = gotoEnd.toJsFn, gotoNext = gotoNext.toJsFn, gotoOffset = js.Any.fromFunction2((t0: Double, t1: Double) => (gotoOffset(t0, t1)).runNow()), gotoPrevious = gotoPrevious.toJsFn, gotoStart = gotoStart.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    js.Dynamic.global.Object.assign(__obj, SheetCellRange)
    js.Dynamic.global.Object.assign(__obj, XSheetCellCursor)
    js.Dynamic.global.Object.assign(__obj, XUsedAreaCursor)
    __obj.asInstanceOf[SheetCellCursor]
  }
}
