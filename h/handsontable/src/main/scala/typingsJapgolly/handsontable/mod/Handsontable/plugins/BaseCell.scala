package typingsJapgolly.handsontable.mod.Handsontable.plugins

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseCell extends js.Object {
  var columnAbsolute: Boolean
  var columnOffset: Double
  var rowAbsolute: Boolean
  var rowOffset: Double
  def isEqual(cell: BaseCell): Boolean
  def translateTo(rowOffset: Double, columnOffset: Double): Unit
}

object BaseCell {
  @scala.inline
  def apply(
    columnAbsolute: Boolean,
    columnOffset: Double,
    isEqual: BaseCell => CallbackTo[Boolean],
    rowAbsolute: Boolean,
    rowOffset: Double,
    translateTo: (Double, Double) => Callback
  ): BaseCell = {
    val __obj = js.Dynamic.literal(columnAbsolute = columnAbsolute.asInstanceOf[js.Any], columnOffset = columnOffset.asInstanceOf[js.Any], rowAbsolute = rowAbsolute.asInstanceOf[js.Any], rowOffset = rowOffset.asInstanceOf[js.Any])
    __obj.updateDynamic("isEqual")(js.Any.fromFunction1((t0: typingsJapgolly.handsontable.mod.Handsontable.plugins.BaseCell) => isEqual(t0).runNow()))
    __obj.updateDynamic("translateTo")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => translateTo(t0, t1).runNow()))
    __obj.asInstanceOf[BaseCell]
  }
}

