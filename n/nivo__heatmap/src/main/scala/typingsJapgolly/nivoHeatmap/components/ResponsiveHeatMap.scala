package typingsJapgolly.nivoHeatmap.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.SVGGElement
import typingsJapgolly.nivoAxes.mod.Axis
import typingsJapgolly.nivoColors.mod.InheritedColorProp
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.Colors
import typingsJapgolly.nivoCore.mod.GetColor
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoHeatmap.mod.HeatMapDatum
import typingsJapgolly.nivoHeatmap.mod.HeatMapDatumWithColor
import typingsJapgolly.nivoHeatmap.mod.HeatMapSvgProps
import typingsJapgolly.nivoHeatmap.mod.IndexByFunc
import typingsJapgolly.nivoHeatmap.mod.NodeData
import typingsJapgolly.nivoHeatmap.mod.ValueFormatter
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.auto
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.cell
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.circle
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.column
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.rect
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.row
import typingsJapgolly.nivoHeatmap.nivoHeatmapStrings.rowColumn
import typingsJapgolly.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ResponsiveHeatMap {
  def apply(
    data: js.Array[HeatMapDatum],
    animate: js.UndefOr[Boolean] = js.undefined,
    axisBottom: Axis = null,
    axisLeft: Axis = null,
    axisRight: Axis = null,
    axisTop: Axis = null,
    cellBorderColor: InheritedColorProp[HeatMapDatumWithColor] = null,
    cellBorderWidth: Int | Double = null,
    cellHoverOpacity: Int | Double = null,
    cellHoverOthersOpacity: Int | Double = null,
    cellOpacity: Int | Double = null,
    cellShape: rect | circle | StatelessComponent[_] = null,
    colorBy: String | GetColor[HeatMapDatum] = null,
    colors: Colors = null,
    enableGridX: js.UndefOr[Boolean] = js.undefined,
    enableGridY: js.UndefOr[Boolean] = js.undefined,
    enableLabels: js.UndefOr[Boolean] = js.undefined,
    forceSquare: js.UndefOr[Boolean] = js.undefined,
    hoverTarget: cell | row | column | rowColumn = null,
    indexBy: String | IndexByFunc = null,
    isInteractive: js.UndefOr[Boolean] = js.undefined,
    keys: js.Array[String] = null,
    labelTextColor: InheritedColorProp[HeatMapDatumWithColor] = null,
    margin: Box = null,
    maxValue: Double | auto = null,
    minValue: Double | auto = null,
    motionDamping: Int | Double = null,
    motionStiffness: Int | Double = null,
    onClick: (/* datum */ NodeData, /* event */ ReactMouseEventFrom[SVGGElement]) => Callback = null,
    padding: Int | Double = null,
    sizeVariation: Int | Double = null,
    theme: Theme = null,
    tooltipFormat: String | ValueFormatter = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    HeatMapSvgProps, 
    typingsJapgolly.nivoHeatmap.mod.ResponsiveHeatMap, 
    Unit, 
    HeatMapSvgProps
  ] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
      if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (axisBottom != null) __obj.updateDynamic("axisBottom")(axisBottom.asInstanceOf[js.Any])
    if (axisLeft != null) __obj.updateDynamic("axisLeft")(axisLeft.asInstanceOf[js.Any])
    if (axisRight != null) __obj.updateDynamic("axisRight")(axisRight.asInstanceOf[js.Any])
    if (axisTop != null) __obj.updateDynamic("axisTop")(axisTop.asInstanceOf[js.Any])
    if (cellBorderColor != null) __obj.updateDynamic("cellBorderColor")(cellBorderColor.asInstanceOf[js.Any])
    if (cellBorderWidth != null) __obj.updateDynamic("cellBorderWidth")(cellBorderWidth.asInstanceOf[js.Any])
    if (cellHoverOpacity != null) __obj.updateDynamic("cellHoverOpacity")(cellHoverOpacity.asInstanceOf[js.Any])
    if (cellHoverOthersOpacity != null) __obj.updateDynamic("cellHoverOthersOpacity")(cellHoverOthersOpacity.asInstanceOf[js.Any])
    if (cellOpacity != null) __obj.updateDynamic("cellOpacity")(cellOpacity.asInstanceOf[js.Any])
    if (cellShape != null) __obj.updateDynamic("cellShape")(cellShape.asInstanceOf[js.Any])
    if (colorBy != null) __obj.updateDynamic("colorBy")(colorBy.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridX)) __obj.updateDynamic("enableGridX")(enableGridX.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGridY)) __obj.updateDynamic("enableGridY")(enableGridY.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLabels)) __obj.updateDynamic("enableLabels")(enableLabels.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSquare)) __obj.updateDynamic("forceSquare")(forceSquare.asInstanceOf[js.Any])
    if (hoverTarget != null) __obj.updateDynamic("hoverTarget")(hoverTarget.asInstanceOf[js.Any])
    if (indexBy != null) __obj.updateDynamic("indexBy")(indexBy.asInstanceOf[js.Any])
    if (!js.isUndefined(isInteractive)) __obj.updateDynamic("isInteractive")(isInteractive.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (labelTextColor != null) __obj.updateDynamic("labelTextColor")(labelTextColor.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (motionDamping != null) __obj.updateDynamic("motionDamping")(motionDamping.asInstanceOf[js.Any])
    if (motionStiffness != null) __obj.updateDynamic("motionStiffness")(motionStiffness.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2((t0: /* datum */ typingsJapgolly.nivoHeatmap.mod.NodeData, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.SVGGElement]) => onClick(t0, t1).runNow()))
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (sizeVariation != null) __obj.updateDynamic("sizeVariation")(sizeVariation.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.nivoHeatmap.mod.HeatMapSvgProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.nivoHeatmap.mod.ResponsiveHeatMap](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.nivoHeatmap.mod.HeatMapSvgProps])(children: _*)
  }
  @JSImport("@nivo/heatmap", "ResponsiveHeatMap")
  @js.native
  object componentImport extends js.Object
  
}

