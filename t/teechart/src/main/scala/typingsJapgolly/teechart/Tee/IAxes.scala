package typingsJapgolly.teechart.Tee

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAxes extends js.Object {
  var bottom: IAxis
  var chart: IChart
  var items: js.Array[IAxis]
  var left: IAxis
  var right: IAxis
  var top: IAxis
  var visible: Boolean
  def add(horizontal: Boolean, otherSide: Boolean): IAxis
}

object IAxes {
  @scala.inline
  def apply(
    add: (Boolean, Boolean) => CallbackTo[IAxis],
    bottom: IAxis,
    chart: IChart,
    items: js.Array[IAxis],
    left: IAxis,
    right: IAxis,
    top: IAxis,
    visible: Boolean
  ): IAxes = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: scala.Boolean, t1: scala.Boolean) => add(t0, t1).runNow()))
    __obj.asInstanceOf[IAxes]
  }
}

