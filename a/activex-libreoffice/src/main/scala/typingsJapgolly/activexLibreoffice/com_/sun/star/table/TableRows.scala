package typingsJapgolly.activexLibreoffice.com_.sun.star.table

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a collection of all rows of a table or spreadsheet.
  * @see com.sun.star.table.TableRow
  */
trait TableRows
  extends StObject
     with XTableRows
     with XEnumerationAccess
object TableRows {
  
  inline def apply(
    Count: Double,
    ElementType: `type`,
    acquire: Callback,
    createEnumeration: CallbackTo[XEnumeration],
    getByIndex: Double => Any,
    getCount: CallbackTo[Double],
    getElementType: CallbackTo[`type`],
    hasElements: CallbackTo[Boolean],
    insertByIndex: (Double, Double) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeByIndex: (Double, Double) => Callback
  ): TableRows = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, createEnumeration = createEnumeration.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getCount = getCount.toJsFn, getElementType = getElementType.toJsFn, hasElements = hasElements.toJsFn, insertByIndex = js.Any.fromFunction2((t0: Double, t1: Double) => (insertByIndex(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByIndex = js.Any.fromFunction2((t0: Double, t1: Double) => (removeByIndex(t0, t1)).runNow()))
    __obj.asInstanceOf[TableRows]
  }
}
