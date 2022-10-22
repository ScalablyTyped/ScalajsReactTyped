package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access the members of a label range collection and to insert and remove them.
  * @see com.sun.star.sheet.LabelRanges
  * @see com.sun.star.sheet.LabelRange
  */
trait XLabelRanges
  extends StObject
     with XIndexAccess {
  
  /**
    * adds a new label range to the collection.
    * @param aLabelArea the cell range containing the titles of the label range.
    * @param aDataArea the cell range containing the values of the label range.
    */
  def addNew(aLabelArea: CellRangeAddress, aDataArea: CellRangeAddress): Unit
  
  /** removes a label range from the collection. */
  def removeByIndex(nIndex: Double): Unit
}
object XLabelRanges {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    acquire: Callback,
    addNew: (CellRangeAddress, CellRangeAddress) => Callback,
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeByIndex: Double => Callback
  ): XLabelRanges = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, addNew = js.Any.fromFunction2((t0: CellRangeAddress, t1: CellRangeAddress) => (addNew(t0, t1)).runNow()), getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByIndex = js.Any.fromFunction1((t0: Double) => removeByIndex(t0).runNow()))
    __obj.asInstanceOf[XLabelRanges]
  }
  
  extension [Self <: XLabelRanges](x: Self) {
    
    inline def setAddNew(value: (CellRangeAddress, CellRangeAddress) => Callback): Self = StObject.set(x, "addNew", js.Any.fromFunction2((t0: CellRangeAddress, t1: CellRangeAddress) => (value(t0, t1)).runNow()))
    
    inline def setRemoveByIndex(value: Double => Callback): Self = StObject.set(x, "removeByIndex", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
