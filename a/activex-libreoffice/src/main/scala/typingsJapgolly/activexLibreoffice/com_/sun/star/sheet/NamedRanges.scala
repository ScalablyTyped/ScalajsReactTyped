package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.document.XActionLockable
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a collection of named ranges in a spreadsheet document.
  *
  * In fact a named range is a named formula expression. A cell range address is one possible content of a named range.
  * @see com.sun.star.sheet.SpreadsheetDocument
  */
trait NamedRanges
  extends StObject
     with XNamedRanges
     with XIndexAccess
     with XEnumerationAccess
     with XActionLockable
object NamedRanges {
  
  inline def apply(
    Count: Double,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: Callback,
    addActionLock: Callback,
    addNewByName: (String, String, CellAddress, Double) => Callback,
    addNewFromTitles: (CellRangeAddress, Border) => Callback,
    createEnumeration: CallbackTo[XEnumeration],
    getByIndex: Double => Any,
    getByName: String => Any,
    getCount: CallbackTo[Double],
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    isActionLocked: CallbackTo[Boolean],
    outputList: CellAddress => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeActionLock: Callback,
    removeByName: String => Callback,
    resetActionLocks: CallbackTo[Double],
    setActionLocks: Double => Callback
  ): NamedRanges = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, addActionLock = addActionLock.toJsFn, addNewByName = js.Any.fromFunction4((t0: String, t1: String, t2: CellAddress, t3: Double) => (addNewByName(t0, t1, t2, t3)).runNow()), addNewFromTitles = js.Any.fromFunction2((t0: CellRangeAddress, t1: Border) => (addNewFromTitles(t0, t1)).runNow()), createEnumeration = createEnumeration.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = getCount.toJsFn, getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, isActionLocked = isActionLocked.toJsFn, outputList = js.Any.fromFunction1((t0: CellAddress) => outputList(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeActionLock = removeActionLock.toJsFn, removeByName = js.Any.fromFunction1((t0: String) => removeByName(t0).runNow()), resetActionLocks = resetActionLocks.toJsFn, setActionLocks = js.Any.fromFunction1((t0: Double) => setActionLocks(t0).runNow()))
    __obj.asInstanceOf[NamedRanges]
  }
}
