package typingsJapgolly.nivoRadar.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nivoColors.mod.InheritedColorProp
import typingsJapgolly.nivoColors.mod.OrdinalColorsInstruction
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.CssMixBlendMode
import typingsJapgolly.nivoLegends.mod.LegendProps
import typingsJapgolly.nivoRadar.mod.CustomDotLabel
import typingsJapgolly.nivoRadar.mod.CustomFormatter
import typingsJapgolly.nivoRadar.mod.IndexByCustomFunctiono
import typingsJapgolly.nivoRadar.mod.RadarProps
import typingsJapgolly.nivoRadar.nivoRadarStrings.auto
import typingsJapgolly.nivoRadar.nivoRadarStrings.circular
import typingsJapgolly.nivoRadar.nivoRadarStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveRadar {
  def apply(
    data: js.Array[js.Object],
    indexBy: Double | String | IndexByCustomFunctiono[_],
    keys: js.Array[String | Double],
    legends: js.Array[LegendProps],
    animate: js.UndefOr[Boolean] = js.undefined,
    blendMode: CssMixBlendMode = null,
    borderColor: InheritedColorProp[_] = null,
    borderWidth: Int | Double = null,
    colors: OrdinalColorsInstruction[_] = null,
    curve: String = null,
    dotBorderColor: InheritedColorProp[_] = null,
    dotBorderWidth: Int | Double = null,
    dotColor: InheritedColorProp[_] = null,
    dotLabel: String | CustomDotLabel = null,
    dotLabelFormat: String | CustomFormatter = null,
    dotLabelYOffset: Int | Double = null,
    dotSize: Int | Double = null,
    dotSymbol: /* repeated */ js.Any => CallbackTo[Node] = null,
    enableDotLabel: js.UndefOr[Boolean] = js.undefined,
    enableDots: js.UndefOr[Boolean] = js.undefined,
    fillOpacity: Int | Double = null,
    gridLabel: /* repeated */ js.Any => CallbackTo[String] = null,
    gridLabelOffset: Int | Double = null,
    gridLevels: Int | Double = null,
    gridShape: circular | linear = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    margin: Box = null,
    maxValue: auto | Double = null,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    tooltipFormat: String | CustomFormatter = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[RadarProps, typingsJapgolly.nivoRadar.mod.ResponsiveRadar, Unit, RadarProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], indexBy = indexBy.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], legends = legends.asInstanceOf[js.Any])
  
      if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (blendMode != null) __obj.updateDynamic("blendMode")(blendMode.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (curve != null) __obj.updateDynamic("curve")(curve.asInstanceOf[js.Any])
    if (dotBorderColor != null) __obj.updateDynamic("dotBorderColor")(dotBorderColor.asInstanceOf[js.Any])
    if (dotBorderWidth != null) __obj.updateDynamic("dotBorderWidth")(dotBorderWidth.asInstanceOf[js.Any])
    if (dotColor != null) __obj.updateDynamic("dotColor")(dotColor.asInstanceOf[js.Any])
    if (dotLabel != null) __obj.updateDynamic("dotLabel")(dotLabel.asInstanceOf[js.Any])
    if (dotLabelFormat != null) __obj.updateDynamic("dotLabelFormat")(dotLabelFormat.asInstanceOf[js.Any])
    if (dotLabelYOffset != null) __obj.updateDynamic("dotLabelYOffset")(dotLabelYOffset.asInstanceOf[js.Any])
    if (dotSize != null) __obj.updateDynamic("dotSize")(dotSize.asInstanceOf[js.Any])
    if (dotSymbol != null) __obj.updateDynamic("dotSymbol")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => dotSymbol(t0).runNow()))
    if (!js.isUndefined(enableDotLabel)) __obj.updateDynamic("enableDotLabel")(enableDotLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDots)) __obj.updateDynamic("enableDots")(enableDots.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (gridLabel != null) __obj.updateDynamic("gridLabel")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => gridLabel(t0).runNow()))
    if (gridLabelOffset != null) __obj.updateDynamic("gridLabelOffset")(gridLabelOffset.asInstanceOf[js.Any])
    if (gridLevels != null) __obj.updateDynamic("gridLevels")(gridLevels.asInstanceOf[js.Any])
    if (gridShape != null) __obj.updateDynamic("gridShape")(gridShape.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nivoRadar.mod.RadarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nivoRadar.mod.ResponsiveRadar](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nivoRadar.mod.RadarProps])(children: _*)
  }
  @JSImport("@nivo/radar", "ResponsiveRadar")
  @js.native
  object componentImport extends js.Object
  
}

