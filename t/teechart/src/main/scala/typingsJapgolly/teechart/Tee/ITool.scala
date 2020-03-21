package typingsJapgolly.teechart.Tee

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITool extends js.Object {
  var active: Boolean
  var chart: IChart
  def clicked(p: IPoint): Boolean
  def draw(): Unit
  def mousedown(event: js.Any): Boolean
  def mousemove(event: js.Any): Boolean
}

object ITool {
  @scala.inline
  def apply(
    active: Boolean,
    chart: IChart,
    clicked: IPoint => CallbackTo[Boolean],
    draw: Callback,
    mousedown: js.Any => CallbackTo[Boolean],
    mousemove: js.Any => CallbackTo[Boolean]
  ): ITool = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any])
    __obj.updateDynamic("clicked")(js.Any.fromFunction1((t0: typingsJapgolly.teechart.Tee.IPoint) => clicked(t0).runNow()))
    __obj.updateDynamic("draw")(draw.toJsFn)
    __obj.updateDynamic("mousedown")(js.Any.fromFunction1((t0: js.Any) => mousedown(t0).runNow()))
    __obj.updateDynamic("mousemove")(js.Any.fromFunction1((t0: js.Any) => mousemove(t0).runNow()))
    __obj.asInstanceOf[ITool]
  }
}

