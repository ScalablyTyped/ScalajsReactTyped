package typingsJapgolly.teechart.Tee

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITools extends js.Object {
  var chart: IChart
  var items: js.Array[ITool]
  def add(tool: ITool): ITool
}

object ITools {
  @scala.inline
  def apply(add: ITool => CallbackTo[ITool], chart: IChart, items: js.Array[ITool]): ITools = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.teechart.Tee.ITool) => add(t0).runNow()))
    __obj.asInstanceOf[ITools]
  }
}

