package typingsJapgolly.reactEasyChart.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.reactEasyChart.AnonBottom
import typingsJapgolly.reactEasyChart.AnonY
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.`basis-closed`
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.`basis-open`
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.`cardinal-closed`
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.`cardinal-open`
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.`linear-closed`
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.`step-after`
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.`step-before`
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.basis
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.bundle
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.cardinal
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.linear
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.monotone
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.step
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.text
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaChartProps extends LineChartProps {
  /** Make the gradient area a solid fill rather than a gradient */
  var noAreaGradient: js.UndefOr[Boolean] = js.undefined
}

object AreaChartProps {
  @scala.inline
  def apply(
    data: js.Array[js.Array[LineData]],
    axes: js.UndefOr[Boolean] = js.undefined,
    axisLabels: AnonY = null,
    clickHandler: (/* data */ LineData, /* mouseEvent */ MouseEvent) => CallbackTo[js.Any] = null,
    dataPoints: js.UndefOr[Boolean] = js.undefined,
    grid: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    interpolate: linear | `linear-closed` | step | `step-before` | `step-after` | basis | `basis-open` | `basis-closed` | bundle | cardinal | `cardinal-open` | `cardinal-closed` | monotone = null,
    lineColors: js.Array[String] = null,
    margin: AnonBottom = null,
    mouseMoveHandler: (/* data */ LineData, /* mouseEvent */ MouseEvent) => CallbackTo[js.Any] = null,
    mouseOutHandler: (/* data */ LineData, /* mouseEvent */ MouseEvent) => CallbackTo[js.Any] = null,
    mouseOverHandler: (/* data */ LineData, /* mouseEvent */ MouseEvent) => CallbackTo[js.Any] = null,
    noAreaGradient: js.UndefOr[Boolean] = js.undefined,
    tickTimeDisplayFormat: String = null,
    verticalGrid: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null,
    xDomainRange: js.Array[js.Date | Double | String] = null,
    xTicks: Int | Double = null,
    xType: time | text | linear = null,
    yAxisOrientRight: js.UndefOr[Boolean] = js.undefined,
    yDomainRange: js.Array[Double | String] = null,
    yTicks: Int | Double = null,
    yType: time | text | linear = null
  ): AreaChartProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (!js.isUndefined(axes)) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (axisLabels != null) __obj.updateDynamic("axisLabels")(axisLabels.asInstanceOf[js.Any])
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.reactEasyChart.mod.LineData, t1: /* mouseEvent */ org.scalajs.dom.raw.MouseEvent) => clickHandler(t0, t1).runNow()))
    if (!js.isUndefined(dataPoints)) __obj.updateDynamic("dataPoints")(dataPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (lineColors != null) __obj.updateDynamic("lineColors")(lineColors.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (mouseMoveHandler != null) __obj.updateDynamic("mouseMoveHandler")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.reactEasyChart.mod.LineData, t1: /* mouseEvent */ org.scalajs.dom.raw.MouseEvent) => mouseMoveHandler(t0, t1).runNow()))
    if (mouseOutHandler != null) __obj.updateDynamic("mouseOutHandler")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.reactEasyChart.mod.LineData, t1: /* mouseEvent */ org.scalajs.dom.raw.MouseEvent) => mouseOutHandler(t0, t1).runNow()))
    if (mouseOverHandler != null) __obj.updateDynamic("mouseOverHandler")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.reactEasyChart.mod.LineData, t1: /* mouseEvent */ org.scalajs.dom.raw.MouseEvent) => mouseOverHandler(t0, t1).runNow()))
    if (!js.isUndefined(noAreaGradient)) __obj.updateDynamic("noAreaGradient")(noAreaGradient.asInstanceOf[js.Any])
    if (tickTimeDisplayFormat != null) __obj.updateDynamic("tickTimeDisplayFormat")(tickTimeDisplayFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalGrid)) __obj.updateDynamic("verticalGrid")(verticalGrid.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xDomainRange != null) __obj.updateDynamic("xDomainRange")(xDomainRange.asInstanceOf[js.Any])
    if (xTicks != null) __obj.updateDynamic("xTicks")(xTicks.asInstanceOf[js.Any])
    if (xType != null) __obj.updateDynamic("xType")(xType.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisOrientRight)) __obj.updateDynamic("yAxisOrientRight")(yAxisOrientRight.asInstanceOf[js.Any])
    if (yDomainRange != null) __obj.updateDynamic("yDomainRange")(yDomainRange.asInstanceOf[js.Any])
    if (yTicks != null) __obj.updateDynamic("yTicks")(yTicks.asInstanceOf[js.Any])
    if (yType != null) __obj.updateDynamic("yType")(yType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaChartProps]
  }
}

