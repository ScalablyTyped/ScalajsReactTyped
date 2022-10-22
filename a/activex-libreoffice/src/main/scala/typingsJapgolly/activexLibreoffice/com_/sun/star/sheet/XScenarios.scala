package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access via name to the scenarios in a collection and inserting and removing scenarios.
  * @see com.sun.star.sheet.Scenarios
  * @see com.sun.star.sheet.Spreadsheet
  */
trait XScenarios
  extends StObject
     with XNameAccess {
  
  /**
    * creates a new scenario and adds it to the collection.
    * @param aName the name of the scenario (used i.e. for collection access).
    * @param aRanges the cell ranges contained in the scenario.
    * @param aComment the user defined comment for the scenario.
    */
  def addNewByName(aName: String, aRanges: SeqEquiv[CellRangeAddress], aComment: String): Unit
  
  /** removes a scenario from the collection. */
  def removeByName(aName: String): Unit
}
object XScenarios {
  
  inline def apply(
    ElementNames: SafeArray[String],
    ElementType: `type`,
    acquire: Callback,
    addNewByName: (String, SeqEquiv[CellRangeAddress], String) => Callback,
    getByName: String => Any,
    getElementNames: CallbackTo[SafeArray[String]],
    getElementType: CallbackTo[`type`],
    hasByName: String => Boolean,
    hasElements: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback,
    removeByName: String => Callback
  ): XScenarios = {
    val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, addNewByName = js.Any.fromFunction3((t0: String, t1: SeqEquiv[CellRangeAddress], t2: String) => (addNewByName(t0, t1, t2)).runNow()), getByName = js.Any.fromFunction1(getByName), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeByName = js.Any.fromFunction1((t0: String) => removeByName(t0).runNow()))
    __obj.asInstanceOf[XScenarios]
  }
  
  extension [Self <: XScenarios](x: Self) {
    
    inline def setAddNewByName(value: (String, SeqEquiv[CellRangeAddress], String) => Callback): Self = StObject.set(x, "addNewByName", js.Any.fromFunction3((t0: String, t1: SeqEquiv[CellRangeAddress], t2: String) => (value(t0, t1, t2)).runNow()))
    
    inline def setRemoveByName(value: String => Callback): Self = StObject.set(x, "removeByName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
