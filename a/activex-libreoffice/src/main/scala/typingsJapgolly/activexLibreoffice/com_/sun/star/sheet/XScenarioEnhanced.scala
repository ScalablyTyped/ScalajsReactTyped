package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides enhanced access to the settings of a scenario sheet.
  * @see com.sun.star.sheet.Spreadsheet
  * @see com.sun.star.sheet.Scenario
  * @see com.sun.star.sheet.XScenario
  * @since OOo 2.0
  */
trait XScenarioEnhanced
  extends StObject
     with XInterface {
  
  /** gets the ranges to the scenario. */
  val Ranges: SafeArray[CellRangeAddress]
  
  /** gets the ranges to the scenario. */
  def getRanges(): SafeArray[CellRangeAddress]
}
object XScenarioEnhanced {
  
  inline def apply(
    Ranges: SafeArray[CellRangeAddress],
    acquire: Callback,
    getRanges: CallbackTo[SafeArray[CellRangeAddress]],
    queryInterface: `type` => Any,
    release: Callback
  ): XScenarioEnhanced = {
    val __obj = js.Dynamic.literal(Ranges = Ranges.asInstanceOf[js.Any], acquire = acquire.toJsFn, getRanges = getRanges.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XScenarioEnhanced]
  }
  
  extension [Self <: XScenarioEnhanced](x: Self) {
    
    inline def setGetRanges(value: CallbackTo[SafeArray[CellRangeAddress]]): Self = StObject.set(x, "getRanges", value.toJsFn)
    
    inline def setRanges(value: SafeArray[CellRangeAddress]): Self = StObject.set(x, "Ranges", value.asInstanceOf[js.Any])
  }
}
