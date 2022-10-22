package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a collection of label ranges in a spreadsheet document.
  * @see com.sun.star.sheet.LabelRange
  * @see com.sun.star.sheet.SpreadsheetDocument
  */
trait LabelRanges
  extends StObject
     with XLabelRanges
     with XEnumerationAccess
object LabelRanges {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    acquire: Callback,
    addNew: (CellRangeAddress, CellRangeAddress) => Callback,
    createEnumeration: CallbackTo[XEnumeration],
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeByIndex: Double => Callback
  ): LabelRanges = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, addNew = js.Any.fromFunction2((t0: CellRangeAddress, t1: CellRangeAddress) => (addNew(t0, t1)).runNow()), createEnumeration = createEnumeration.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByIndex = js.Any.fromFunction1((t0: Double) => removeByIndex(t0).runNow()))
    __obj.asInstanceOf[LabelRanges]
  }
}
