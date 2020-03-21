package typingsJapgolly.teechart.Tee

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICursorTool extends ITool {
  var direction: String
  var dragging: Double
  var followMouse: Boolean
  var format: IFormat
  var horizAxis: IAxis
  var render: String
  var size: IPoint
  var vertAxis: IAxis
  def over(point: IPoint): Boolean
  def setRender(render: String): Unit
}

object ICursorTool {
  @scala.inline
  def apply(
    active: Boolean,
    chart: IChart,
    clicked: IPoint => CallbackTo[Boolean],
    direction: String,
    dragging: Double,
    draw: Callback,
    followMouse: Boolean,
    format: IFormat,
    horizAxis: IAxis,
    mousedown: js.Any => CallbackTo[Boolean],
    mousemove: js.Any => CallbackTo[Boolean],
    over: IPoint => CallbackTo[Boolean],
    render: String,
    setRender: String => Callback,
    size: IPoint,
    vertAxis: IAxis
  ): ICursorTool = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], followMouse = followMouse.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], horizAxis = horizAxis.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], vertAxis = vertAxis.asInstanceOf[js.Any])
    __obj.updateDynamic("clicked")(js.Any.fromFunction1((t0: typingsJapgolly.teechart.Tee.IPoint) => clicked(t0).runNow()))
    __obj.updateDynamic("draw")(draw.toJsFn)
    __obj.updateDynamic("mousedown")(js.Any.fromFunction1((t0: js.Any) => mousedown(t0).runNow()))
    __obj.updateDynamic("mousemove")(js.Any.fromFunction1((t0: js.Any) => mousemove(t0).runNow()))
    __obj.updateDynamic("over")(js.Any.fromFunction1((t0: typingsJapgolly.teechart.Tee.IPoint) => over(t0).runNow()))
    __obj.updateDynamic("setRender")(js.Any.fromFunction1((t0: java.lang.String) => setRender(t0).runNow()))
    __obj.asInstanceOf[ICursorTool]
  }
}

