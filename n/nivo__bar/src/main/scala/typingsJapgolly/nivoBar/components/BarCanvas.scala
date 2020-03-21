package typingsJapgolly.nivoBar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLCanvasElement
import typingsJapgolly.nivoBar.dataFromindexeskeysLegend
import typingsJapgolly.nivoBar.mod.AccessorFunc
import typingsJapgolly.nivoBar.mod.Axis
import typingsJapgolly.nivoBar.mod.BarCanvasProps
import typingsJapgolly.nivoBar.mod.BarDatumWithColor
import typingsJapgolly.nivoBar.mod.BarExtendedDatum
import typingsJapgolly.nivoBar.mod.BarItemProps
import typingsJapgolly.nivoBar.mod.IndexByFunc
import typingsJapgolly.nivoBar.mod.LabelFormatter
import typingsJapgolly.nivoBar.mod.TooltipProp
import typingsJapgolly.nivoBar.mod.ValueFormatter
import typingsJapgolly.nivoBar.nivoBarStrings.auto
import typingsJapgolly.nivoBar.nivoBarStrings.grouped
import typingsJapgolly.nivoBar.nivoBarStrings.horizontal
import typingsJapgolly.nivoBar.nivoBarStrings.stacked
import typingsJapgolly.nivoBar.nivoBarStrings.vertical
import typingsJapgolly.nivoColors.mod.InheritedColorProp
import typingsJapgolly.nivoColors.mod.OrdinalColorsInstruction
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.CartesianMarkerProps
import typingsJapgolly.nivoCore.mod.Dimensions
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object BarCanvas {
  def apply(
    data: js.Array[js.Object],
    height: Double,
    width: Double,
    axisBottom: Axis = null,
    axisLeft: Axis = null,
    axisRight: Axis = null,
    axisTop: Axis = null,
    barComponent: StatelessComponent[BarItemProps] = null,
    borderRadius: Int | Double = null,
    borderWidth: Int | Double = null,
    colors: OrdinalColorsInstruction[_] = null,
    enableGridX: js.UndefOr[Boolean] = js.undefined,
    enableGridY: js.UndefOr[Boolean] = js.undefined,
    enableLabel: js.UndefOr[Boolean] = js.undefined,
    groupMode: stacked | grouped = null,
    indexBy: String | IndexByFunc = null,
    innerPadding: Int | Double = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    keys: js.Array[String] = null,
    label: String | AccessorFunc = null,
    labelFormat: String | LabelFormatter = null,
    labelLinkColor: InheritedColorProp[BarDatumWithColor] = null,
    labelSkipHeight: Int | Double = null,
    labelSkipWidth: Int | Double = null,
    labelTextColor: InheritedColorProp[BarDatumWithColor] = null,
    layout: horizontal | vertical = null,
    legends: js.Array[dataFromindexeskeysLegend] = null,
    margin: Box = null,
    markers: js.Array[CartesianMarkerProps] = null,
    maxValue: Double | auto = null,
    minValue: Double | auto = null,
    onClick: (/* datum */ BarExtendedDatum, /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => Callback = null,
    padding: Int | Double = null,
    pixelRatio: Int | Double = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    theme: Theme = null,
    tooltip: TooltipProp = null,
    tooltipFormat: String | ValueFormatter = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    BarCanvasProps with Dimensions, 
    typingsJapgolly.nivoBar.mod.BarCanvas, 
    Unit, 
    BarCanvasProps with Dimensions
  ] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
      if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom.asInstanceOf[js.Any])
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft.asInstanceOf[js.Any])
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight.asInstanceOf[js.Any])
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop.asInstanceOf[js.Any])
    if (barComponent != null) __obj.updateDynamic("barComponent")(barComponent.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLabel)) __obj.updateDynamic("enableLabel")(enableLabel.asInstanceOf[js.Any])
    if (groupMode != null) __obj.updateDynamic("groupMode")(groupMode.asInstanceOf[js.Any])
    if (indexBy != null) __obj.updateDynamic("indexBy")(indexBy.asInstanceOf[js.Any])
    if (innerPadding != null) __obj.updateDynamic("innerPadding")(innerPadding.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelFormat != null) __obj.updateDynamic("labelFormat")(labelFormat.asInstanceOf[js.Any])
    if (labelLinkColor != null) __obj.updateDynamic("labelLinkColor")(labelLinkColor.asInstanceOf[js.Any])
    if (labelSkipHeight != null) __obj.updateDynamic("labelSkipHeight")(labelSkipHeight.asInstanceOf[js.Any])
    if (labelSkipWidth != null) __obj.updateDynamic("labelSkipWidth")(labelSkipWidth.asInstanceOf[js.Any])
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(labelTextColor.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (legends != null) __obj.updateDynamic("legends")(legends.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* datum */ typingsJapgolly.nivoBar.mod.BarExtendedDatum, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLCanvasElement]) => onClick(t0, t1).runNow()))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (pixelRatio != null) __obj.updateDynamic("pixelRatio")(pixelRatio.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nivoBar.mod.BarCanvasProps with typingsJapgolly.nivoCore.mod.Dimensions, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nivoBar.mod.BarCanvas](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nivoBar.mod.BarCanvasProps with typingsJapgolly.nivoCore.mod.Dimensions])(children: _*)
  }
  @JSImport("@nivo/bar", "BarCanvas")
  @js.native
  object componentImport extends js.Object
  
}

