package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CellValue extends BaseCell {
  var error: String | Unit
  var precedents: js.Array[_]
  var state: String
  var value: js.Any
  def addPrecedent(cellReference: CellReference): Unit
  def clearPrecedents(): Unit
  def getError(): String | Unit
  def getPrecedents(): js.Array[_]
  def getValue(): js.Any
  def hasError(): Boolean
  def hasPrecedent(cellReference: CellReference): Boolean
  def hasPrecedents(): Boolean
  def isState(state: Double): Boolean
  def removePrecedent(cellReference: CellReference): Unit
  def setError(error: String): Unit
  def setState(state: Double): Unit
  def setValue(value: js.Any): Unit
}

object CellValue {
  @scala.inline
  def apply(
    addPrecedent: CellReference => Callback,
    clearPrecedents: Callback,
    columnAbsolute: Boolean,
    columnOffset: Double,
    error: String | Unit,
    getError: CallbackTo[String | Unit],
    getPrecedents: CallbackTo[js.Array[js.Any]],
    getValue: CallbackTo[js.Any],
    hasError: CallbackTo[Boolean],
    hasPrecedent: CellReference => CallbackTo[Boolean],
    hasPrecedents: CallbackTo[Boolean],
    isEqual: BaseCell => CallbackTo[Boolean],
    isState: Double => CallbackTo[Boolean],
    precedents: js.Array[_],
    removePrecedent: CellReference => Callback,
    rowAbsolute: Boolean,
    rowOffset: Double,
    setError: String => Callback,
    setState: Double => Callback,
    setValue: js.Any => Callback,
    state: String,
    translateTo: (Double, Double) => Callback,
    value: js.Any
  ): CellValue = {
    val __obj = js.Dynamic.literal(columnAbsolute = columnAbsolute.asInstanceOf[js.Any], columnOffset = columnOffset.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], precedents = precedents.asInstanceOf[js.Any], rowAbsolute = rowAbsolute.asInstanceOf[js.Any], rowOffset = rowOffset.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("addPrecedent")(js.Any.fromFunction1((t0: typingsJapgolly.handsontable.mod.Handsontable.plugins.CellReference) => addPrecedent(t0).runNow()))
    __obj.updateDynamic("clearPrecedents")(clearPrecedents.toJsFn)
    __obj.updateDynamic("getError")(getError.toJsFn)
    __obj.updateDynamic("getPrecedents")(getPrecedents.toJsFn)
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.updateDynamic("hasError")(hasError.toJsFn)
    __obj.updateDynamic("hasPrecedent")(js.Any.fromFunction1((t0: typingsJapgolly.handsontable.mod.Handsontable.plugins.CellReference) => hasPrecedent(t0).runNow()))
    __obj.updateDynamic("hasPrecedents")(hasPrecedents.toJsFn)
    __obj.updateDynamic("isEqual")(js.Any.fromFunction1((t0: typingsJapgolly.handsontable.mod.Handsontable.plugins.BaseCell) => isEqual(t0).runNow()))
    __obj.updateDynamic("isState")(js.Any.fromFunction1((t0: scala.Double) => isState(t0).runNow()))
    __obj.updateDynamic("removePrecedent")(js.Any.fromFunction1((t0: typingsJapgolly.handsontable.mod.Handsontable.plugins.CellReference) => removePrecedent(t0).runNow()))
    __obj.updateDynamic("setError")(js.Any.fromFunction1((t0: java.lang.String) => setError(t0).runNow()))
    __obj.updateDynamic("setState")(js.Any.fromFunction1((t0: scala.Double) => setState(t0).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: js.Any) => setValue(t0).runNow()))
    __obj.updateDynamic("translateTo")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => translateTo(t0, t1).runNow()))
    __obj.asInstanceOf[CellValue]
  }
}

