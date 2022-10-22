package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a single condition in a conditional format.
  * @see com.sun.star.sheet.TableConditionalFormat
  */
trait TableConditionalEntry
  extends StObject
     with XSheetCondition
     with XSheetConditionalEntry
object TableConditionalEntry {
  
  inline def apply(
    Formula1: String,
    Formula2: String,
    Operator: ConditionOperator,
    SourcePosition: CellAddress,
    StyleName: String,
    acquire: Callback,
    getFormula1: CallbackTo[String],
    getFormula2: CallbackTo[String],
    getOperator: CallbackTo[ConditionOperator],
    getSourcePosition: CallbackTo[CellAddress],
    getStyleName: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    setFormula1: String => Callback,
    setFormula2: String => Callback,
    setOperator: ConditionOperator => Callback,
    setSourcePosition: CellAddress => Callback,
    setStyleName: String => Callback
  ): TableConditionalEntry = {
    val __obj = js.Dynamic.literal(Formula1 = Formula1.asInstanceOf[js.Any], Formula2 = Formula2.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], SourcePosition = SourcePosition.asInstanceOf[js.Any], StyleName = StyleName.asInstanceOf[js.Any], acquire = acquire.toJsFn, getFormula1 = getFormula1.toJsFn, getFormula2 = getFormula2.toJsFn, getOperator = getOperator.toJsFn, getSourcePosition = getSourcePosition.toJsFn, getStyleName = getStyleName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setFormula1 = js.Any.fromFunction1((t0: String) => setFormula1(t0).runNow()), setFormula2 = js.Any.fromFunction1((t0: String) => setFormula2(t0).runNow()), setOperator = js.Any.fromFunction1((t0: ConditionOperator) => setOperator(t0).runNow()), setSourcePosition = js.Any.fromFunction1((t0: CellAddress) => setSourcePosition(t0).runNow()), setStyleName = js.Any.fromFunction1((t0: String) => setStyleName(t0).runNow()))
    __obj.asInstanceOf[TableConditionalEntry]
  }
}
