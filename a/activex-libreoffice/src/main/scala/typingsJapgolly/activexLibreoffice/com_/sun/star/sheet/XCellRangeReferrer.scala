package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XCellRange
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows direct access to the cells in a named range or to the cells which are visible in a view, without the need to get the document object first.
  * @see com.sun.star.sheet.NamedRange
  * @see com.sun.star.sheet.DatabaseRange
  * @see com.sun.star.sheet.SpreadsheetViewPane
  */
trait XCellRangeReferrer
  extends StObject
     with XInterface {
  
  /** returns the cell range object that is represented. */
  val ReferredCells: XCellRange
  
  /** returns the cell range object that is represented. */
  def getReferredCells(): XCellRange
}
object XCellRangeReferrer {
  
  inline def apply(
    ReferredCells: XCellRange,
    acquire: Callback,
    getReferredCells: CallbackTo[XCellRange],
    queryInterface: `type` => Any,
    release: Callback
  ): XCellRangeReferrer = {
    val __obj = js.Dynamic.literal(ReferredCells = ReferredCells.asInstanceOf[js.Any], acquire = acquire.toJsFn, getReferredCells = getReferredCells.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCellRangeReferrer]
  }
  
  extension [Self <: XCellRangeReferrer](x: Self) {
    
    inline def setGetReferredCells(value: CallbackTo[XCellRange]): Self = StObject.set(x, "getReferredCells", value.toJsFn)
    
    inline def setReferredCells(value: XCellRange): Self = StObject.set(x, "ReferredCells", value.asInstanceOf[js.Any])
  }
}
