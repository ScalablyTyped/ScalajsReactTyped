package typingsJapgolly.reactEasyChart.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.reactEasyChart.AnonBottom
import typingsJapgolly.reactEasyChart.AnonX
import typingsJapgolly.reactEasyChart.mod.BarChartProps
import typingsJapgolly.reactEasyChart.mod.BarData
import typingsJapgolly.reactEasyChart.mod.LineData
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.linear
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.text
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BarChart {
  def apply(
    data: js.Array[BarData],
    axes: js.UndefOr[Boolean] = js.undefined,
    axisLabels: AnonX = null,
    barWidth: Int | Double = null,
    clickHandler: (/* data */ BarData, /* mouseEvent */ MouseEvent) => CallbackTo[js.Any] = null,
    colorBars: js.UndefOr[Boolean] = js.undefined,
    datePattern: String = null,
    grid: js.UndefOr[Boolean] = js.undefined,
    height: Int | Double = null,
    interpolate: String = null,
    lineData: js.Array[LineData] = null,
    margin: AnonBottom = null,
    mouseMoveHandler: (/* data */ BarData, /* mouseEvent */ MouseEvent) => CallbackTo[js.Any] = null,
    mouseOutHandler: (/* data */ BarData, /* mouseEvent */ MouseEvent) => CallbackTo[js.Any] = null,
    mouseOverHandler: (/* data */ BarData, /* mouseEvent */ MouseEvent) => CallbackTo[js.Any] = null,
    tickTimeDisplayFormat: String = null,
    width: Int | Double = null,
    xDomainRange: js.Array[js.Date | Double | String] = null,
    xTickNumber: Int | Double = null,
    xType: time | text | linear = null,
    y2Type: time | text | linear = null,
    yAxisOrientRight: js.UndefOr[Boolean] = js.undefined,
    yDomainRange: js.Array[Double] = null,
    yTickNumber: Int | Double = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[BarChartProps, typingsJapgolly.reactEasyChart.mod.BarChart, Unit, BarChartProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
      if (!js.isUndefined(axes)) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (axisLabels != null) __obj.updateDynamic("axisLabels")(axisLabels.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (clickHandler != null) __obj.updateDynamic("clickHandler")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.reactEasyChart.mod.BarData, t1: /* mouseEvent */ org.scalajs.dom.raw.MouseEvent) => clickHandler(t0, t1).runNow()))
    if (!js.isUndefined(colorBars)) __obj.updateDynamic("colorBars")(colorBars.asInstanceOf[js.Any])
    if (datePattern != null) __obj.updateDynamic("datePattern")(datePattern.asInstanceOf[js.Any])
    if (!js.isUndefined(grid)) __obj.updateDynamic("grid")(grid.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (interpolate != null) __obj.updateDynamic("interpolate")(interpolate.asInstanceOf[js.Any])
    if (lineData != null) __obj.updateDynamic("lineData")(lineData.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (mouseMoveHandler != null) __obj.updateDynamic("mouseMoveHandler")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.reactEasyChart.mod.BarData, t1: /* mouseEvent */ org.scalajs.dom.raw.MouseEvent) => mouseMoveHandler(t0, t1).runNow()))
    if (mouseOutHandler != null) __obj.updateDynamic("mouseOutHandler")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.reactEasyChart.mod.BarData, t1: /* mouseEvent */ org.scalajs.dom.raw.MouseEvent) => mouseOutHandler(t0, t1).runNow()))
    if (mouseOverHandler != null) __obj.updateDynamic("mouseOverHandler")(js.Any.fromFunction2((t0: /* data */ typingsJapgolly.reactEasyChart.mod.BarData, t1: /* mouseEvent */ org.scalajs.dom.raw.MouseEvent) => mouseOverHandler(t0, t1).runNow()))
    if (tickTimeDisplayFormat != null) __obj.updateDynamic("tickTimeDisplayFormat")(tickTimeDisplayFormat.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (xDomainRange != null) __obj.updateDynamic("xDomainRange")(xDomainRange.asInstanceOf[js.Any])
    if (xTickNumber != null) __obj.updateDynamic("xTickNumber")(xTickNumber.asInstanceOf[js.Any])
    if (xType != null) __obj.updateDynamic("xType")(xType.asInstanceOf[js.Any])
    if (y2Type != null) __obj.updateDynamic("y2Type")(y2Type.asInstanceOf[js.Any])
    if (!js.isUndefined(yAxisOrientRight)) __obj.updateDynamic("yAxisOrientRight")(yAxisOrientRight.asInstanceOf[js.Any])
    if (yDomainRange != null) __obj.updateDynamic("yDomainRange")(yDomainRange.asInstanceOf[js.Any])
    if (yTickNumber != null) __obj.updateDynamic("yTickNumber")(yTickNumber.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactEasyChart.mod.BarChartProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactEasyChart.mod.BarChart](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactEasyChart.mod.BarChartProps])(children: _*)
  }
  @JSImport("react-easy-chart", "BarChart")
  @js.native
  object componentImport extends js.Object
  
}

