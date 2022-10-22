package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access cell ranges in a collection via index and to add and remove cell ranges.
  * @see com.sun.star.sheet.SheetCellRanges
  */
trait XSheetCellRangeContainer
  extends StObject
     with XSheetCellRanges {
  
  /**
    * adds the given range to the collection of cell ranges.
    * @param aCellRangeAddress contains the address of the new range.
    * @param bMergeRanges defines how the range should be added. To merge the ranges takes more time, but the memory usage is lower.
    */
  def addRangeAddress(aCellRangeAddress: CellRangeAddress, bMergeRanges: Boolean): Unit
  
  /**
    * adds the given ranges to the collection of cell ranges.
    * @param aCellRangeAddresses contains a sequence of addresses of all new ranges.
    * @param bMergeRanges defines how the ranges should be added. To merge the ranges takes more time, but the memory usage is lower.
    */
  def addRangeAddresses(aCellRangeAddresses: SeqEquiv[CellRangeAddress], bMergeRanges: Boolean): Unit
  
  /**
    * removes the given range from the collection of cell ranges.
    * @param aCellRangeAddress contains the address of the range to be removed.  The specified range must fit exactly to an element of the collection. The met
    * @throws com::sun::star::container::NoSuchElementException if the collection does not contain the specified range.
    */
  def removeRangeAddress(aCellRangeAddress: CellRangeAddress): Unit
  
  /**
    * removes the given ranges from the collection of cell ranges.
    * @param aCellRangeAddresses contains a sequence of addresses of all ranges to be removed.  All specified ranges must fit exactly to elements of the colle
    * @throws com::sun::star::container::NoSuchElementException if the collection does not contain any of the specified ranges.
    */
  def removeRangeAddresses(aCellRangeAddresses: SeqEquiv[CellRangeAddress]): Unit
}
object XSheetCellRangeContainer {
  
  inline def apply(
    Cells: XEnumerationAccess,
    Count: Double,
    ElementType: `type`,
    RangeAddresses: SafeArray[CellRangeAddress],
    RangeAddressesAsString: String,
    acquire: Callback,
    addRangeAddress: (CellRangeAddress, Boolean) => Callback,
    addRangeAddresses: (SeqEquiv[CellRangeAddress], Boolean) => Callback,
    getByIndex: Double => Any,
    getCells: CallbackTo[XEnumerationAccess],
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    getRangeAddresses: CallbackTo[SafeArray[CellRangeAddress]],
    getRangeAddressesAsString: CallbackTo[String],
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeRangeAddress: CellRangeAddress => Callback,
    removeRangeAddresses: SeqEquiv[CellRangeAddress] => Callback
  ): XSheetCellRangeContainer = {
    val __obj = js.Dynamic.literal(Cells = Cells.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], RangeAddresses = RangeAddresses.asInstanceOf[js.Any], RangeAddressesAsString = RangeAddressesAsString.asInstanceOf[js.Any], acquire = acquire.toJsFn, addRangeAddress = js.Any.fromFunction2((t0: CellRangeAddress, t1: Boolean) => (addRangeAddress(t0, t1)).runNow()), addRangeAddresses = js.Any.fromFunction2((t0: SeqEquiv[CellRangeAddress], t1: Boolean) => (addRangeAddresses(t0, t1)).runNow()), getByIndex = js.Any.fromFunction1(getByIndex), getCells = getCells.toJsFn, getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, getRangeAddresses = getRangeAddresses.toJsFn, getRangeAddressesAsString = getRangeAddressesAsString.toJsFn, hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeRangeAddress = js.Any.fromFunction1((t0: CellRangeAddress) => removeRangeAddress(t0).runNow()), removeRangeAddresses = js.Any.fromFunction1((t0: SeqEquiv[CellRangeAddress]) => removeRangeAddresses(t0).runNow()))
    __obj.asInstanceOf[XSheetCellRangeContainer]
  }
  
  extension [Self <: XSheetCellRangeContainer](x: Self) {
    
    inline def setAddRangeAddress(value: (CellRangeAddress, Boolean) => Callback): Self = StObject.set(x, "addRangeAddress", js.Any.fromFunction2((t0: CellRangeAddress, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setAddRangeAddresses(value: (SeqEquiv[CellRangeAddress], Boolean) => Callback): Self = StObject.set(x, "addRangeAddresses", js.Any.fromFunction2((t0: SeqEquiv[CellRangeAddress], t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setRemoveRangeAddress(value: CellRangeAddress => Callback): Self = StObject.set(x, "removeRangeAddress", js.Any.fromFunction1((t0: CellRangeAddress) => value(t0).runNow()))
    
    inline def setRemoveRangeAddresses(value: SeqEquiv[CellRangeAddress] => Callback): Self = StObject.set(x, "removeRangeAddresses", js.Any.fromFunction1((t0: SeqEquiv[CellRangeAddress]) => value(t0).runNow()))
  }
}
