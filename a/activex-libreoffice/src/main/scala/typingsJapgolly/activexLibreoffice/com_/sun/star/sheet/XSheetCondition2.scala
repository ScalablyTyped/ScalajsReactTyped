package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access the settings of a condition in a conditional format or data validation.
  * @see com.sun.star.sheet.TableConditionalEntry
  * @see com.sun.star.sheet.TableValidation
  * @see com.sun.star.sheet.XSheetCondition
  */
trait XSheetCondition2
  extends StObject
     with XSheetCondition {
  
  /** returns the operator in the condition (new interface). */
  var ConditionOperator: Double
  
  /** returns the operator in the condition (new interface). */
  def getConditionOperator(): Double
  
  /** sets the operator in the condition (new interface). */
  def setConditionOperator(nOperator: Double): Unit
}
object XSheetCondition2 {
  
  inline def apply(
    ConditionOperator: Double,
    Formula1: String,
    Formula2: String,
    Operator: ConditionOperator,
    SourcePosition: CellAddress,
    acquire: Callback,
    getConditionOperator: CallbackTo[Double],
    getFormula1: CallbackTo[String],
    getFormula2: CallbackTo[String],
    getOperator: CallbackTo[ConditionOperator],
    getSourcePosition: CallbackTo[CellAddress],
    queryInterface: `type` => Any,
    release: Callback,
    setConditionOperator: Double => Callback,
    setFormula1: String => Callback,
    setFormula2: String => Callback,
    setOperator: ConditionOperator => Callback,
    setSourcePosition: CellAddress => Callback
  ): XSheetCondition2 = {
    val __obj = js.Dynamic.literal(ConditionOperator = ConditionOperator.asInstanceOf[js.Any], Formula1 = Formula1.asInstanceOf[js.Any], Formula2 = Formula2.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], SourcePosition = SourcePosition.asInstanceOf[js.Any], acquire = acquire.toJsFn, getConditionOperator = getConditionOperator.toJsFn, getFormula1 = getFormula1.toJsFn, getFormula2 = getFormula2.toJsFn, getOperator = getOperator.toJsFn, getSourcePosition = getSourcePosition.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setConditionOperator = js.Any.fromFunction1((t0: Double) => setConditionOperator(t0).runNow()), setFormula1 = js.Any.fromFunction1((t0: String) => setFormula1(t0).runNow()), setFormula2 = js.Any.fromFunction1((t0: String) => setFormula2(t0).runNow()), setOperator = js.Any.fromFunction1((t0: ConditionOperator) => setOperator(t0).runNow()), setSourcePosition = js.Any.fromFunction1((t0: CellAddress) => setSourcePosition(t0).runNow()))
    __obj.asInstanceOf[XSheetCondition2]
  }
  
  extension [Self <: XSheetCondition2](x: Self) {
    
    inline def setConditionOperator(value: Double): Self = StObject.set(x, "ConditionOperator", value.asInstanceOf[js.Any])
    
    inline def setGetConditionOperator(value: CallbackTo[Double]): Self = StObject.set(x, "getConditionOperator", value.toJsFn)
    
    inline def setSetConditionOperator(value: Double => Callback): Self = StObject.set(x, "setConditionOperator", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
  }
}
