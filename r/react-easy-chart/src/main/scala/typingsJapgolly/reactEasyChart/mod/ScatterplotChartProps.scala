package typingsJapgolly.reactEasyChart.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.reactEasyChart.AnonBottom
import typingsJapgolly.reactEasyChart.AnonStroke
import typingsJapgolly.reactEasyChart.AnonY
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.linear
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.text
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterplotChartProps extends js.Object {
  /** Whether to show axis labels */
  var axes: js.UndefOr[Boolean] = js.undefined
  /** Labels for each of the axis */
  var axisLabels: js.UndefOr[AnonY] = js.undefined
  var clickHandler: js.UndefOr[js.Function2[/* data */ ScatterplotData, /* mouseEvent */ MouseEvent, _]] = js.undefined
  /** Allows styling of individual types of points */
  var config: js.UndefOr[js.Array[AnonStroke]] = js.undefined
  var data: js.Array[ScatterplotData]
  /** Radius of the dots on the chart */
  var dotRadius: js.UndefOr[Double] = js.undefined
  /** Whether to show horizontal grid lines on the chart */
  var grid: js.UndefOr[Boolean] = js.undefined
  /** Height of the chart in pixels */
  var height: js.UndefOr[Double] = js.undefined
  /** css margins */
  var margin: js.UndefOr[AnonBottom] = js.undefined
  var mouseMoveHandler: js.UndefOr[js.Function2[/* data */ ScatterplotData, /* mouseEvent */ MouseEvent, _]] = js.undefined
  var mouseOutHandler: js.UndefOr[js.Function2[/* data */ ScatterplotData, /* mouseEvent */ MouseEvent, _]] = js.undefined
  var mouseOverHandler: js.UndefOr[js.Function2[/* data */ ScatterplotData, /* mouseEvent */ MouseEvent, _]] = js.undefined
  /** Whether to show vertical grid lines on the chart */
  var verticalGrid: js.UndefOr[Boolean] = js.undefined
  /** Width of the chart in pixels */
  var width: js.UndefOr[Double] = js.undefined
  /** The range that the x axis should show (otherwise automatically calculated) */
  var xDomainRange: js.UndefOr[js.Array[js.Date | Double | String]] = js.undefined
  /** What data type the x axis is */
  var xType: js.UndefOr[time | text | linear] = js.undefined
  /** Whether to show the axis on the right (default false: left) */
  var yAxisOrientRight: js.UndefOr[Boolean] = js.undefined
  /** The range that the y axis should show (otherwise automatically calculated) */
  var yDomainRange: js.UndefOr[js.Array[js.Date | Double | String]] = js.undefined
  /** What data type the x axis is */
  var yType: js.UndefOr[time | text | linear] = js.undefined
}

object ScatterplotChartProps {
  @scala.inline
  def apply(
    data: js.Array[ScatterplotData],
    axes: js.UndefOr[Boolean] = js.undefined,
    axisLabels: AnonY = null,
    clickHandler: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => CallbackTo[js.Any] = null,
    config: js.Array[AnonStroke] = null,
    dotRadius: Int | Double = null,
    grid: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    margin: AnonBottom = null,
    mouseMoveHandler: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => CallbackTo[js.Any] = null,
    mouseOutHandler: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => CallbackTo[js.Any] = null,
    mouseOverHandler: (/* data */ ScatterplotData, /* mouseEvent */ MouseEvent) => CallbackTo[js.Any] = null,
    verticalGrid: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    xDomainRange: js.Array[js.Date | Double | String] = null,
    xType: time | text | linear = null,
    yAxisOrientRight: js.UndefOr[Boolean] = js.undefined,
    yDomainRange: js.Array[js.Date | Double | String] = null,
    yType: time | text | linear = null
  ): ScatterplotChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(axes)) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (axisLabels != null) __obj.updateDynamic("axisLabels")(axisLabels.asInstanceOf[js.Any])
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.reactEasyChart.mod.ScatterplotData, t1: /* mouseEvent */ org.scalajs.dom.raw.MouseEvent) => clickHandler(t0, t1).runNow()))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (dotRadius != null) __obj.updateDynamic("dotRadius")(dotRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (mouseMoveHandler != null) __obj.updateDynamic("mouseMoveHandler")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.reactEasyChart.mod.ScatterplotData, t1: /* mouseEvent */ org.scalajs.dom.raw.MouseEvent) => mouseMoveHandler(t0, t1).runNow()))
    if (mouseOutHandler != null) __obj.updateDynamic("mouseOutHandler")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.reactEasyChart.mod.ScatterplotData, t1: /* mouseEvent */ org.scalajs.dom.raw.MouseEvent) => mouseOutHandler(t0, t1).runNow()))
    if (mouseOverHandler != null) __obj.updateDynamic("mouseOverHandler")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.reactEasyChart.mod.ScatterplotData, t1: /* mouseEvent */ org.scalajs.dom.raw.MouseEvent) => mouseOverHandler(t0, t1).runNow()))
    if (!js.isUndefined(verticalGrid)) __obj.updateDynamic("verticalGrid")(verticalGrid.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xDomainRange != null) __obj.updateDynamic("xDomainRange")(xDomainRange.asInstanceOf[js.Any])
    if (xType != null) __obj.updateDynamic("xType")(xType.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisOrientRight)) __obj.updateDynamic("yAxisOrientRight")(yAxisOrientRight.asInstanceOf[js.Any])
    if (yDomainRange != null) __obj.updateDynamic("yDomainRange")(yDomainRange.asInstanceOf[js.Any])
    if (yType != null) __obj.updateDynamic("yType")(yType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterplotChartProps]
  }
}

