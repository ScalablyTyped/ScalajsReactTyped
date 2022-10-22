package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents something that can recalculate. */
trait XCalculatable
  extends StObject
     with XInterface {
  
  /**
    * recalculates all dirty cells.
    *
    * This calculates all formula cells which have not yet been calculated after their precedents have changed.
    */
  def calculate(): Unit
  
  /** recalculates all cells. */
  def calculateAll(): Unit
  
  /**
    * enables automatic calculation.
    *
    * With automatic calculation, each formula cell is recalculated whenever its value is needed after its precedents have changed. The value is needed if
    * the cell is displayed or used in another calculation.
    * @param bEnabled `TRUE` to enable automatic calculation, `FALSE` to disable.
    */
  def enableAutomaticCalculation(bEnabled: Boolean): Unit
  
  /**
    * returns whether automatic calculation is enabled.
    *
    * With automatic calculation, each formula cell is recalculated whenever its value is needed after its precedents have changed. The value is needed if
    * the cell is displayed or used in another calculation.
    * @returns `TRUE` , if automatic calculation is enabled.
    */
  def isAutomaticCalculationEnabled(): Boolean
}
object XCalculatable {
  
  inline def apply(
    acquire: Callback,
    calculate: Callback,
    calculateAll: Callback,
    enableAutomaticCalculation: Boolean => Callback,
    isAutomaticCalculationEnabled: CallbackTo[Boolean],
    queryInterface: `type` => Any,
    release: Callback
  ): XCalculatable = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, calculate = calculate.toJsFn, calculateAll = calculateAll.toJsFn, enableAutomaticCalculation = js.Any.fromFunction1((t0: Boolean) => enableAutomaticCalculation(t0).runNow()), isAutomaticCalculationEnabled = isAutomaticCalculationEnabled.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XCalculatable]
  }
  
  extension [Self <: XCalculatable](x: Self) {
    
    inline def setCalculate(value: Callback): Self = StObject.set(x, "calculate", value.toJsFn)
    
    inline def setCalculateAll(value: Callback): Self = StObject.set(x, "calculateAll", value.toJsFn)
    
    inline def setEnableAutomaticCalculation(value: Boolean => Callback): Self = StObject.set(x, "enableAutomaticCalculation", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    
    inline def setIsAutomaticCalculationEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAutomaticCalculationEnabled", value.toJsFn)
  }
}
