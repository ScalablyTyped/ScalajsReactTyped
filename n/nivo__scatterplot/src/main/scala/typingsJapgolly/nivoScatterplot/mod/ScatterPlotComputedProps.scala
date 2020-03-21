package typingsJapgolly.nivoScatterplot.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterPlotComputedProps extends js.Object {
  var innerHeight: Double
  var innerWidth: Double
  var nodes: js.Array[Node]
  var outerHeight: Double
  var outerWidth: Double
  var xScale: Scale
  var yScale: Scale
}

object ScatterPlotComputedProps {
  @scala.inline
  def apply(
    innerHeight: Double,
    innerWidth: Double,
    nodes: js.Array[Node],
    outerHeight: Double,
    outerWidth: Double,
    xScale: /* value */ Value => CallbackTo[Double],
    yScale: /* value */ Value => CallbackTo[Double]
  ): ScatterPlotComputedProps = {
    val __obj = js.Dynamic.literal(innerHeight = innerHeight.asInstanceOf[js.Any], innerWidth = innerWidth.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], outerHeight = outerHeight.asInstanceOf[js.Any], outerWidth = outerWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("xScale")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.nivoScatterplot.mod.Value) => xScale(t0).runNow()))
    __obj.updateDynamic("yScale")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.nivoScatterplot.mod.Value) => yScale(t0).runNow()))
    __obj.asInstanceOf[ScatterPlotComputedProps]
  }
}

