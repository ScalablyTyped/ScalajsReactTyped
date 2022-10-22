package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XCell
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.XCellRange
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents the collection of spreadsheets in a spreadsheet document.
  * @see com.sun.star.sheet.SpreadsheetDocument
  */
trait Spreadsheets
  extends StObject
     with XSpreadsheets
     with XIndexAccess
     with XEnumerationAccess
     with XCellRangesAccess
object Spreadsheets {
  
  inline def apply(
    Count: Double,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: Callback,
    copyByName: (String, String, Double) => Callback,
    createEnumeration: CallbackTo[XEnumeration],
    getByIndex: Double => Any,
    getByName: String => Any,
    getCellByPosition: (Double, Double, Double) => XCell,
    getCellRangeByPosition: (Double, Double, Double, Double, Double) => XCellRange,
    getCellRangesByName: String => SafeArray[XCellRange],
    getCount: CallbackTo[Double],
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    insertByName: (String, Any) => Callback,
    insertNewByName: (String, Double) => Callback,
    moveByName: (String, Double) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeByName: String => Callback,
    replaceByName: (String, Any) => Callback
  ): Spreadsheets = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, copyByName = js.Any.fromFunction3((t0: String, t1: String, t2: Double) => (copyByName(t0, t1, t2)).runNow()), createEnumeration = createEnumeration.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCellByPosition = js.Any.fromFunction3(getCellByPosition), getCellRangeByPosition = js.Any.fromFunction5(getCellRangeByPosition), getCellRangesByName = js.Any.fromFunction1(getCellRangesByName), getCount = getCount.toJsFn, getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, insertByName = js.Any.fromFunction2((t0: String, t1: Any) => (insertByName(t0, t1)).runNow()), insertNewByName = js.Any.fromFunction2((t0: String, t1: Double) => (insertNewByName(t0, t1)).runNow()), moveByName = js.Any.fromFunction2((t0: String, t1: Double) => (moveByName(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByName = js.Any.fromFunction1((t0: String) => removeByName(t0).runNow()), replaceByName = js.Any.fromFunction2((t0: String, t1: Any) => (replaceByName(t0, t1)).runNow()))
    __obj.asInstanceOf[Spreadsheets]
  }
}
