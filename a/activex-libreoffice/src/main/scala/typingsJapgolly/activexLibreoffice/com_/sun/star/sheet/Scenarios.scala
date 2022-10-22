package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a collection of scenarios. */
trait Scenarios
  extends StObject
     with XScenarios
     with XEnumerationAccess
     with XIndexAccess
object Scenarios {
  
  inline def apply(
    Count: Double,
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: Callback,
    addNewByName: (String, SeqEquiv[CellRangeAddress], String) => Callback,
    createEnumeration: CallbackTo[XEnumeration],
    getByIndex: Double => Any,
    getByName: String => Any,
    getCount: CallbackTo[Double],
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeByName: String => Callback
  ): Scenarios = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, addNewByName = js.Any.fromFunction3((t0: String, t1: SeqEquiv[CellRangeAddress], t2: String) => (addNewByName(t0, t1, t2)).runNow()), createEnumeration = createEnumeration.toJsFn, getByIndex = js.Any.fromFunction1(getByIndex), getByName = js.Any.fromFunction1(getByName), getCount = getCount.toJsFn, getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByName = js.Any.fromFunction1((t0: String) => removeByName(t0).runNow()))
    __obj.asInstanceOf[Scenarios]
  }
}
