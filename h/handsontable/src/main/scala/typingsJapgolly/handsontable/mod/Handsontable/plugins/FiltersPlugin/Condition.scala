package typingsJapgolly.handsontable.mod.Handsontable.plugins.FiltersPlugin

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.handsontable.mod.Handsontable.plugins.CellValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  var args: js.Array[_]
  var name: ConditionName
  def func(dataRow: CellValue, values: js.Array[_]): Boolean
}

object Condition {
  @scala.inline
  def apply(args: js.Array[_], func: (CellValue, js.Array[js.Any]) => CallbackTo[Boolean], name: ConditionName): Condition = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("func")(js.Any.fromFunction2((t0: typingsJapgolly.handsontable.mod.Handsontable.plugins.CellValue, t1: js.Array[js.Any]) => func(t0, t1).runNow()))
    __obj.asInstanceOf[Condition]
  }
}

