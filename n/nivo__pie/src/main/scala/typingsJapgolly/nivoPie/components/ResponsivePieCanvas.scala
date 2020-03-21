package typingsJapgolly.nivoPie.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGPathElement
import typingsJapgolly.nivoColors.mod.InheritedColorProp
import typingsJapgolly.nivoColors.mod.OrdinalColorsInstruction
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoLegends.mod.LegendProps
import typingsJapgolly.nivoPie.mod.AccessorFunc
import typingsJapgolly.nivoPie.mod.PieCanvasProps
import typingsJapgolly.nivoPie.mod.PieDatum
import typingsJapgolly.nivoPie.mod.PieDatumWithColor
import typingsJapgolly.nivoPie.mod.ValueFormatter
import typingsJapgolly.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsivePieCanvas {
  def apply(
    data: js.Array[PieDatum],
    animate: js.UndefOr[Boolean] = js.undefined,
    borderColor: InheritedColorProp[PieDatum] = null,
    borderWidth: Int | Double = null,
    colors: OrdinalColorsInstruction[PieDatum] = null,
    cornerRadius: Int | Double = null,
    enableRadialLabels: js.UndefOr[Boolean] = js.undefined,
    enableSlicesLabels: js.UndefOr[Boolean] = js.undefined,
    endAngle: Int | Double = null,
    fit: js.UndefOr[Boolean] = js.undefined,
    innerRadius: Int | Double = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    legends: js.Array[LegendProps] = null,
    margin: Box = null,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    onClick: (/* datum */ PieDatum, /* event */ ReactMouseEventFrom[SVGPathElement]) => Callback = null,
    padAngle: Int | Double = null,
    pixelRatio: Int | Double = null,
    radialLabel: String | AccessorFunc = null,
    radialLabelsLinkColor: InheritedColorProp[PieDatumWithColor] = null,
    radialLabelsLinkDiagonalLength: Int | Double = null,
    radialLabelsLinkHorizontalLength: Int | Double = null,
    radialLabelsLinkOffset: Int | Double = null,
    radialLabelsLinkStrokeWidth: Int | Double = null,
    radialLabelsSkipAngle: Int | Double = null,
    radialLabelsTextColor: InheritedColorProp[PieDatumWithColor] = null,
    radialLabelsTextXOffset: Int | Double = null,
    sliceLabel: String | AccessorFunc = null,
    slicesLabelsSkipAngle: Int | Double = null,
    slicesLabelsTextColor: InheritedColorProp[PieDatumWithColor] = null,
    sortByValue: js.UndefOr[Boolean] = js.undefined,
    startAngle: Int | Double = null,
    theme: Theme = null,
    tooltip: StatelessComponent[PieDatumWithColor] = null,
    tooltipFormat: String | ValueFormatter = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[PieCanvasProps, typingsJapgolly.nivoPie.mod.ResponsivePieCanvas, Unit, PieCanvasProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
      if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (cornerRadius != null) __obj.updateDynamic("cornerRadius")(cornerRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRadialLabels)) __obj.updateDynamic("enableRadialLabels")(enableRadialLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSlicesLabels)) __obj.updateDynamic("enableSlicesLabels")(enableSlicesLabels.asInstanceOf[js.Any])
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (!js.isUndefined(fit)) __obj.updateDynamic("fit")(fit.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* datum */ typingsJapgolly.nivoPie.mod.PieDatum, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGPathElement]) => onClick(t0, t1).runNow()))
    if (padAngle != null) __obj.updateDynamic("padAngle")(padAngle.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (radialLabel != null) __obj.updateDynamic("radialLabel")(radialLabel.asInstanceOf[js.Any])
    if (radialLabelsLinkColor != null) __obj.updateDynamic("radialLabelsLinkColor")(radialLabelsLinkColor.asInstanceOf[js.Any])
    if (radialLabelsLinkDiagonalLength != null) __obj.updateDynamic("radialLabelsLinkDiagonalLength")(radialLabelsLinkDiagonalLength.asInstanceOf[js.Any])
    if (radialLabelsLinkHorizontalLength != null) __obj.updateDynamic("radialLabelsLinkHorizontalLength")(radialLabelsLinkHorizontalLength.asInstanceOf[js.Any])
    if (radialLabelsLinkOffset != null) __obj.updateDynamic("radialLabelsLinkOffset")(radialLabelsLinkOffset.asInstanceOf[js.Any])
    if (radialLabelsLinkStrokeWidth != null) __obj.updateDynamic("radialLabelsLinkStrokeWidth")(radialLabelsLinkStrokeWidth.asInstanceOf[js.Any])
    if (radialLabelsSkipAngle != null) __obj.updateDynamic("radialLabelsSkipAngle")(radialLabelsSkipAngle.asInstanceOf[js.Any])
    if (radialLabelsTextColor != null) __obj.updateDynamic("radialLabelsTextColor")(radialLabelsTextColor.asInstanceOf[js.Any])
    if (radialLabelsTextXOffset != null) __obj.updateDynamic("radialLabelsTextXOffset")(radialLabelsTextXOffset.asInstanceOf[js.Any])
    if (sliceLabel != null) __obj.updateDynamic("sliceLabel")(sliceLabel.asInstanceOf[js.Any])
    if (slicesLabelsSkipAngle != null) __obj.updateDynamic("slicesLabelsSkipAngle")(slicesLabelsSkipAngle.asInstanceOf[js.Any])
    if (slicesLabelsTextColor != null) __obj.updateDynamic("slicesLabelsTextColor")(slicesLabelsTextColor.asInstanceOf[js.Any])
    if (!js.isUndefined(sortByValue)) __obj.updateDynamic("sortByValue")(sortByValue.asInstanceOf[js.Any])
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nivoPie.mod.PieCanvasProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nivoPie.mod.ResponsivePieCanvas](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nivoPie.mod.PieCanvasProps])(children: _*)
  }
  @JSImport("@nivo/pie", "ResponsivePieCanvas")
  @js.native
  object componentImport extends js.Object
  
}

