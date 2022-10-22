package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides functions to manage a collection of database ranges.
  * @see com.sun.star.sheet.DatabaseRanges
  */
trait XDatabaseRanges
  extends StObject
     with XNameAccess {
  
  /** adds a new database range to the collection. */
  def addNewByName(aName: String, aRange: CellRangeAddress): Unit
  
  /** removes a database range from the collection. */
  def removeByName(aName: String): Unit
}
object XDatabaseRanges {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: Callback,
    addNewByName: (String, CellRangeAddress) => Callback,
    getByName: String => Any,
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeByName: String => Callback
  ): XDatabaseRanges = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, addNewByName = js.Any.fromFunction2((t0: String, t1: CellRangeAddress) => (addNewByName(t0, t1)).runNow()), getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByName = js.Any.fromFunction1((t0: String) => removeByName(t0).runNow()))
    __obj.asInstanceOf[XDatabaseRanges]
  }
  
  extension [Self <: XDatabaseRanges](x: Self) {
    
    inline def setAddNewByName(value: (String, CellRangeAddress) => Callback): Self = StObject.set(x, "addNewByName", js.Any.fromFunction2((t0: String, t1: CellRangeAddress) => (value(t0, t1)).runNow()))
    
    inline def setRemoveByName(value: String => Callback): Self = StObject.set(x, "removeByName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
