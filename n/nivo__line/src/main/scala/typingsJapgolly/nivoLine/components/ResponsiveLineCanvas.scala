package typingsJapgolly.nivoLine.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nivoAxes.mod.AxisProps
import typingsJapgolly.nivoColors.mod.OrdinalColorsInstruction
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.CartesianMarkerProps
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoLegends.mod.LegendProps
import typingsJapgolly.nivoLine.mod.DataFormatter
import typingsJapgolly.nivoLine.mod.Layer
import typingsJapgolly.nivoLine.mod.LineCanvasProps
import typingsJapgolly.nivoLine.mod.LineSerieData
import typingsJapgolly.nivoLine.mod.LineSliceData
import typingsJapgolly.nivoLine.mod.LineValue
import typingsJapgolly.nivoLine.mod.TooltipFormatter
import typingsJapgolly.nivoLine.mod.TooltipProp
import typingsJapgolly.nivoLine.nivoLineBooleans.`false`
import typingsJapgolly.nivoLine.nivoLineStrings.linear
import typingsJapgolly.nivoLine.nivoLineStrings.monotoneX
import typingsJapgolly.nivoLine.nivoLineStrings.monotoneY
import typingsJapgolly.nivoLine.nivoLineStrings.natural
import typingsJapgolly.nivoLine.nivoLineStrings.step
import typingsJapgolly.nivoLine.nivoLineStrings.stepAfter
import typingsJapgolly.nivoLine.nivoLineStrings.stepBefore
import typingsJapgolly.nivoLine.nivoLineStrings.x
import typingsJapgolly.nivoLine.nivoLineStrings.y
import typingsJapgolly.nivoScales.mod.Scale
import typingsJapgolly.nivoTooltip.mod.CrosshairType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveLineCanvas {
  def apply(
    data: js.Array[LineSerieData],
    areaBaselineValue: LineValue = null,
    areaOpacity: Int | Double = null,
    axisBottom: AxisProps = null,
    axisLeft: AxisProps = null,
    axisRight: AxisProps = null,
    axisTop: AxisProps = null,
    colors: OrdinalColorsInstruction[_] = null,
    crosshairType: CrosshairType = null,
    curve: linear | monotoneX | monotoneY | natural | stepBefore | step | stepAfter = null,
    debugMesh: js.UndefOr[Boolean] = js.undefined,
    debugSlices: js.UndefOr[Boolean] = js.undefined,
    enableArea: js.UndefOr[Boolean] = js.undefined,
    enableCrosshair: js.UndefOr[Boolean] = js.undefined,
    enableGridX: js.UndefOr[Boolean] = js.undefined,
    enableGridY: js.UndefOr[Boolean] = js.undefined,
    enablePoints: js.UndefOr[Boolean] = js.undefined,
    enableSlices: x | y | `false` = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    layers: js.Array[Layer] = null,
    legends: js.Array[LegendProps] = null,
    lineWidth: Int | Double = null,
    margin: Box = null,
    markers: js.Array[CartesianMarkerProps] = null,
    pixelRatio: Int | Double = null,
    pointBorderColor: js.Any = null,
    pointBorderWidth: Int | Double = null,
    pointColor: js.Any = null,
    pointSize: Int | Double = null,
    sliceTooltip: /* data */ LineSliceData => CallbackTo[Node] = null,
    theme: Theme = null,
    tooltip: TooltipProp = null,
    tooltipFormat: TooltipFormatter | String = null,
    xFormat: String | DataFormatter = null,
    xScale: Scale = null,
    yFormat: String | DataFormatter = null,
    yScale: Scale = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    LineCanvasProps, 
    typingsJapgolly.nivoLine.mod.ResponsiveLineCanvas, 
    Unit, 
    LineCanvasProps
  ] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
      if (areaBaselineValue != null) __obj.updateDynamic("areaBaselineValue")(areaBaselineValue.asInstanceOf[js.Any])
    if (areaOpacity != null) __obj.updateDynamic("areaOpacity")(areaOpacity.asInstanceOf[js.Any])
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom.asInstanceOf[js.Any])
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft.asInstanceOf[js.Any])
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight.asInstanceOf[js.Any])
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (crosshairType != null) __obj.updateDynamic("crosshairType")(crosshairType.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(curve.asInstanceOf[js.Any])
    if (!js.isUndefined(debugMesh)) __obj.updateDynamic("debugMesh")(debugMesh.asInstanceOf[js.Any])
    if (!js.isUndefined(debugSlices)) __obj.updateDynamic("debugSlices")(debugSlices.asInstanceOf[js.Any])
    if (!js.isUndefined(enableArea)) __obj.updateDynamic("enableArea")(enableArea.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCrosshair)) __obj.updateDynamic("enableCrosshair")(enableCrosshair.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePoints)) __obj.updateDynamic("enablePoints")(enablePoints.asInstanceOf[js.Any])
    if (enableSlices != null) __obj.updateDynamic("enableSlices")(enableSlices.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (lineWidth != null) __obj.updateDynamic("lineWidth")(lineWidth.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (pointBorderColor != null) __obj.updateDynamic("pointBorderColor")(pointBorderColor.asInstanceOf[js.Any])
    if (pointBorderWidth != null) __obj.updateDynamic("pointBorderWidth")(pointBorderWidth.asInstanceOf[js.Any])
    if (pointColor != null) __obj.updateDynamic("pointColor")(pointColor.asInstanceOf[js.Any])
    if (pointSize != null) __obj.updateDynamic("pointSize")(pointSize.asInstanceOf[js.Any])
    if (sliceTooltip != null) __obj.updateDynamic("sliceTooltip")(js.Any.fromFunction1((t0: /* data */ typingsJapgolly.nivoLine.mod.LineSliceData) => sliceTooltip(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    if (xFormat != null) __obj.updateDynamic("xFormat")(xFormat.asInstanceOf[js.Any])
    if (xScale != null) __obj.updateDynamic("xScale")(xScale.asInstanceOf[js.Any])
    if (yFormat != null) __obj.updateDynamic("yFormat")(yFormat.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(yScale.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nivoLine.mod.LineCanvasProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nivoLine.mod.ResponsiveLineCanvas](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nivoLine.mod.LineCanvasProps])(children: _*)
  }
  @JSImport("@nivo/line", "ResponsiveLineCanvas")
  @js.native
  object componentImport extends js.Object
  
}

