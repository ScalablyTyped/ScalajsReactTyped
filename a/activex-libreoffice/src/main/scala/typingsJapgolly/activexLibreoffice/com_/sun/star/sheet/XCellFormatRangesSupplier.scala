package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to a collection of equal-formatted cell ranges.
  * @see com.sun.star.sheet.SheetCellRange
  * @see com.sun.star.sheet.SheetCellRanges
  */
trait XCellFormatRangesSupplier
  extends StObject
     with XInterface {
  
  /**
    * returns a collection of equal-formatted cell ranges.
    *
    * Each cell of the original range is contained in one of the ranges (even unformatted cells). If there is a non-rectangular equal-formatted cell area,
    * it will be split into several rectangular ranges.
    * @returns the collection of equal-formatted cell ranges.
    * @see com.sun.star.sheet.CellFormatRanges
    */
  val CellFormatRanges: XIndexAccess
  
  /**
    * returns a collection of equal-formatted cell ranges.
    *
    * Each cell of the original range is contained in one of the ranges (even unformatted cells). If there is a non-rectangular equal-formatted cell area,
    * it will be split into several rectangular ranges.
    * @returns the collection of equal-formatted cell ranges.
    * @see com.sun.star.sheet.CellFormatRanges
    */
  def getCellFormatRanges(): XIndexAccess
}
object XCellFormatRangesSupplier {
  
  inline def apply(
    CellFormatRanges: XIndexAccess,
    acquire: Callback,
    getCellFormatRanges: CallbackTo[XIndexAccess],
    queryInterface: `type` => Any,
    release: Callback
  ): XCellFormatRangesSupplier = {
    val __obj = js.Dynamic.literal(CellFormatRanges = CellFormatRanges.asInstanceOf[js.Any], acquire = acquire.toJsFn, getCellFormatRanges = getCellFormatRanges.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCellFormatRangesSupplier]
  }
  
  extension [Self <: XCellFormatRangesSupplier](x: Self) {
    
    inline def setCellFormatRanges(value: XIndexAccess): Self = StObject.set(x, "CellFormatRanges", value.asInstanceOf[js.Any])
    
    inline def setGetCellFormatRanges(value: CallbackTo[XIndexAccess]): Self = StObject.set(x, "getCellFormatRanges", value.toJsFn)
  }
}
