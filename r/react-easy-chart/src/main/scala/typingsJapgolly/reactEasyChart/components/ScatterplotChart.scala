package typingsJapgolly.reactEasyChart.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.reactEasyChart.AnonBottom
import typingsJapgolly.reactEasyChart.AnonStroke
import typingsJapgolly.reactEasyChart.AnonY
import typingsJapgolly.reactEasyChart.mod.ScatterplotChartProps
import typingsJapgolly.reactEasyChart.mod.ScatterplotData
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.linear
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.text
import typingsJapgolly.reactEasyChart.reactEasyChartStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScatterplotChart {
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
    yType: time | text | linear = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ScatterplotChartProps, 
    typingsJapgolly.reactEasyChart.mod.ScatterplotChart, 
    Unit, 
    ScatterplotChartProps
  ] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactEasyChart.mod.ScatterplotChartProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactEasyChart.mod.ScatterplotChart](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactEasyChart.mod.ScatterplotChartProps])(children: _*)
  }
  @JSImport("react-easy-chart", "ScatterplotChart")
  @js.native
  object componentImport extends js.Object
  
}

