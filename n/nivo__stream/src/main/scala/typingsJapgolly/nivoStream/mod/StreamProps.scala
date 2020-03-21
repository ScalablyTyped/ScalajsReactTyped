package typingsJapgolly.nivoStream.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nivoAxes.mod.AxisProps
import typingsJapgolly.nivoColors.mod.InheritedColorProp
import typingsJapgolly.nivoColors.mod.OrdinalColorsInstruction
import typingsJapgolly.nivoCore.AnonDictkey
import typingsJapgolly.nivoCore.AnonId
import typingsJapgolly.nivoCore.mod.AreaCurve
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.StackOffset
import typingsJapgolly.nivoCore.mod.StackOrder
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoLegends.mod.LegendProps
import typingsJapgolly.nivoScales.mod.Scale
import typingsJapgolly.nivoStream.Anon0
import typingsJapgolly.nivoStream.nivoStreamStrings.center
import typingsJapgolly.nivoStream.nivoStreamStrings.end
import typingsJapgolly.nivoStream.nivoStreamStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined parent std.Partial<@nivo/stream.@nivo/stream.OptionalStreamProps<T>> */
trait StreamProps[T] extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var axisBottom: js.UndefOr[AxisProps] = js.undefined
  var axisLeft: js.UndefOr[AxisProps] = js.undefined
  var axisRight: js.UndefOr[AxisProps] = js.undefined
  var axisTop: js.UndefOr[AxisProps] = js.undefined
  var borderColor: js.UndefOr[InheritedColorProp[_]] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
  var colors: js.UndefOr[OrdinalColorsInstruction[_]] = js.undefined
  var curve: js.UndefOr[AreaCurve] = js.undefined
  var data: js.Array[T]
  var defs: js.UndefOr[js.Array[AnonDictkey]] = js.undefined
  var dotBorderColor: js.UndefOr[InheritedColorProp[_]] = js.undefined
  var dotBorderWidth: js.UndefOr[DatumToNumber | Double] = js.undefined
  var dotColor: js.UndefOr[InheritedColorProp[_]] = js.undefined
  var dotPosition: js.UndefOr[start | center | end] = js.undefined
  var dotSize: js.UndefOr[DatumToNumber | Double] = js.undefined
  var enableDots: js.UndefOr[Boolean] = js.undefined
  var enableGridX: js.UndefOr[Boolean] = js.undefined
  var enableGridY: js.UndefOr[Boolean] = js.undefined
  var enableStackTooltip: js.UndefOr[Boolean] = js.undefined
  var fill: js.UndefOr[js.Array[AnonId[T]]] = js.undefined
  var fillOpacity: js.UndefOr[Double] = js.undefined
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  var keys: js.Array[String]
  var legends: js.UndefOr[js.Array[LegendProps]] = js.undefined
  var margin: js.UndefOr[Box] = js.undefined
  var motionDamping: js.UndefOr[Double] = js.undefined
  var motionStiffness: js.UndefOr[Double] = js.undefined
  var offsetType: js.UndefOr[StackOffset] = js.undefined
  var order: js.UndefOr[StackOrder] = js.undefined
  var renderDot: js.UndefOr[StreamDotsItem] = js.undefined
  var stack: js.UndefOr[StackFunc[T]] = js.undefined
  var theme: js.UndefOr[Theme] = js.undefined
  var tooltipFormat: js.UndefOr[TooltipFormatter[T] | String] = js.undefined
  var tooltipLabel: js.UndefOr[TooltipLabel[T]] = js.undefined
  var xScale: js.UndefOr[Scale] = js.undefined
  var yScale: js.UndefOr[Scale] = js.undefined
}

object StreamProps {
  @scala.inline
  def apply[T](
    data: js.Array[T],
    keys: js.Array[String],
    animate: js.UndefOr[Boolean] = js.undefined,
    axisBottom: AxisProps = null,
    axisLeft: AxisProps = null,
    axisRight: AxisProps = null,
    axisTop: AxisProps = null,
    borderColor: InheritedColorProp[_] = null,
    borderWidth: Int | Double = null,
    colors: OrdinalColorsInstruction[_] = null,
    curve: AreaCurve = null,
    defs: js.Array[AnonDictkey] = null,
    dotBorderColor: InheritedColorProp[_] = null,
    dotBorderWidth: DatumToNumber | Double = null,
    dotColor: InheritedColorProp[_] = null,
    dotPosition: start | center | end = null,
    dotSize: DatumToNumber | Double = null,
    enableDots: js.UndefOr[Boolean] = js.undefined,
    enableGridX: js.UndefOr[Boolean] = js.undefined,
    enableGridY: js.UndefOr[Boolean] = js.undefined,
    enableStackTooltip: js.UndefOr[Boolean] = js.undefined,
    fill: js.Array[AnonId[T]] = null,
    fillOpacity: Int | Double = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    legends: js.Array[LegendProps] = null,
    margin: Box = null,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    offsetType: StackOffset = null,
    order: StackOrder = null,
    renderDot: StreamDotsItem = null,
    stack: /* data */ js.Array[T] => CallbackTo[js.Array[js.Array[Anon0[T]]]] = null,
    theme: Theme = null,
    tooltipFormat: TooltipFormatter[T] | String = null,
    tooltipLabel: T => CallbackTo[String] = null,
    xScale: Scale = null,
    yScale: Scale = null
  ): StreamProps[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom.asInstanceOf[js.Any])
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft.asInstanceOf[js.Any])
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight.asInstanceOf[js.Any])
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(curve.asInstanceOf[js.Any])
    if (defs != null) __obj.updateDynamic("defs")(defs.asInstanceOf[js.Any])
    if (dotBorderColor != null) __obj.updateDynamic("dotBorderColor")(dotBorderColor.asInstanceOf[js.Any])
    if (dotBorderWidth != null) __obj.updateDynamic("dotBorderWidth")(dotBorderWidth.asInstanceOf[js.Any])
    if (dotColor != null) __obj.updateDynamic("dotColor")(dotColor.asInstanceOf[js.Any])
    if (dotPosition != null) __obj.updateDynamic("dotPosition")(dotPosition.asInstanceOf[js.Any])
    if (dotSize != null) __obj.updateDynamic("dotSize")(dotSize.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDots)) __obj.updateDynamic("enableDots")(enableDots.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY.asInstanceOf[js.Any])
    if (!js.isUndefined(enableStackTooltip)) __obj.updateDynamic("enableStackTooltip")(enableStackTooltip.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (offsetType != null) __obj.updateDynamic("offsetType")(offsetType.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (renderDot != null) __obj.updateDynamic("renderDot")(renderDot.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(js.Any.fromFunction1((t0: /* data */ js.Array[T]) => stack(t0).runNow()))
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    if (tooltipLabel != null) __obj.updateDynamic("tooltipLabel")(js.Any.fromFunction1((t0: T) => tooltipLabel(t0).runNow()))
    if (xScale != null) __obj.updateDynamic("xScale")(xScale.asInstanceOf[js.Any])
    if (yScale != null) __obj.updateDynamic("yScale")(yScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamProps[T]]
  }
}

