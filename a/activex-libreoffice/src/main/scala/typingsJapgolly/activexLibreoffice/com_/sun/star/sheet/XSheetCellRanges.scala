package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access cell ranges in a collection via index and other helper methods.
  * @see com.sun.star.sheet.SheetCellRanges
  */
trait XSheetCellRanges
  extends StObject
     with XIndexAccess {
  
  /**
    * returns the collection of all used cells.
    * @see com.sun.star.sheet.Cells
    */
  val Cells: XEnumerationAccess
  
  /**
    * creates a sequence with addresses of all contained cell ranges.
    * @returns a sequence with the addresses of all cell ranges.
    */
  val RangeAddresses: SafeArray[CellRangeAddress]
  
  /**
    * creates a string with addresses of all contained cell ranges.
    *
    * The range addresses are separated with semicolons. For instance the string could have the form "Sheet1.A1:C3;Sheet2.D5:F8".
    * @returns a string containing the addresses of all cell ranges.
    */
  val RangeAddressesAsString: String
  
  /**
    * returns the collection of all used cells.
    * @see com.sun.star.sheet.Cells
    */
  def getCells(): XEnumerationAccess
  
  /**
    * creates a sequence with addresses of all contained cell ranges.
    * @returns a sequence with the addresses of all cell ranges.
    */
  def getRangeAddresses(): SafeArray[CellRangeAddress]
  
  /**
    * creates a string with addresses of all contained cell ranges.
    *
    * The range addresses are separated with semicolons. For instance the string could have the form "Sheet1.A1:C3;Sheet2.D5:F8".
    * @returns a string containing the addresses of all cell ranges.
    */
  def getRangeAddressesAsString(): String
}
object XSheetCellRanges {
  
  inline def apply(
    Cells: XEnumerationAccess,
    Count: Double,
    ElementType: `type`,
    RangeAddresses: SafeArray[CellRangeAddress],
    RangeAddressesAsString: String,
    acquire: Callback,
    getByIndex: Double => Any,
    getCells: CallbackTo[XEnumerationAccess],
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    getRangeAddresses: CallbackTo[SafeArray[CellRangeAddress]],
    getRangeAddressesAsString: CallbackTo[String],
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XSheetCellRanges = {
    val __obj = js.Dynamic.literal(Cells = Cells.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], RangeAddresses = RangeAddresses.asInstanceOf[js.Any], RangeAddressesAsString = RangeAddressesAsString.asInstanceOf[js.Any], acquire = acquire.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getCells = getCells.toJsFn, getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, getRangeAddresses = getRangeAddresses.toJsFn, getRangeAddressesAsString = getRangeAddressesAsString.toJsFn, hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSheetCellRanges]
  }
  
  extension [Self <: XSheetCellRanges](x: Self) {
    
    inline def setCells(value: XEnumerationAccess): Self = StObject.set(x, "Cells", value.asInstanceOf[js.Any])
    
    inline def setGetCells(value: CallbackTo[XEnumerationAccess]): Self = StObject.set(x, "getCells", value.toJsFn)
    
    inline def setGetRangeAddresses(value: CallbackTo[SafeArray[CellRangeAddress]]): Self = StObject.set(x, "getRangeAddresses", value.toJsFn)
    
    inline def setGetRangeAddressesAsString(value: CallbackTo[String]): Self = StObject.set(x, "getRangeAddressesAsString", value.toJsFn)
    
    inline def setRangeAddresses(value: SafeArray[CellRangeAddress]): Self = StObject.set(x, "RangeAddresses", value.asInstanceOf[js.Any])
    
    inline def setRangeAddressesAsString(value: String): Self = StObject.set(x, "RangeAddressesAsString", value.asInstanceOf[js.Any])
  }
}
