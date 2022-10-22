package typingsJapgolly.nivoBar.distTypesTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.nivoAnnotations.distTypesTypesMod.AnnotationMatcher
import typingsJapgolly.nivoAxes.distTypesTypesMod.CanvasAxisProps
import typingsJapgolly.nivoAxes.distTypesTypesMod.GridValues
import typingsJapgolly.nivoBar.anon.Color
import typingsJapgolly.nivoBar.nivoBarStrings.auto
import typingsJapgolly.nivoBar.nivoBarStrings.grouped
import typingsJapgolly.nivoBar.nivoBarStrings.horizontal
import typingsJapgolly.nivoBar.nivoBarStrings.id
import typingsJapgolly.nivoBar.nivoBarStrings.indexValue
import typingsJapgolly.nivoBar.nivoBarStrings.stacked
import typingsJapgolly.nivoBar.nivoBarStrings.vertical
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoCore.mod.ValueFormat
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleBandSpec
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleSpec
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@nivo/bar.@nivo/bar/dist/types/types.BarCommonProps<RawDatum>> & @nivo/bar.@nivo/bar/dist/types/types.DataProps<RawDatum> & @nivo/bar.@nivo/bar/dist/types/types.BarHandlers<RawDatum, std.HTMLCanvasElement> & @nivo/core.@nivo/core.Dimensions & std.Partial<{  axisBottom :@nivo/axes.@nivo/axes.CanvasAxisProps<any> | null,   axisLeft :@nivo/axes.@nivo/axes.CanvasAxisProps<any> | null,   axisRight :@nivo/axes.@nivo/axes.CanvasAxisProps<any> | null,   axisTop :@nivo/axes.@nivo/axes.CanvasAxisProps<any> | null, renderBar (context : std.CanvasRenderingContext2D, props : @nivo/bar.@nivo/bar/dist/types/types.RenderBarProps<RawDatum>): void,   layers :std.Array<@nivo/bar.@nivo/bar/dist/types/types.BarCanvasLayer<RawDatum>>,   pixelRatio :number}> */
trait BarCanvasProps[RawDatum /* <: BarDatum */] extends StObject {
  
  var annotations: js.UndefOr[js.Array[AnnotationMatcher[ComputedBarDatum[RawDatum]]]] = js.undefined
  
  var axisBottom: js.UndefOr[CanvasAxisProps[Any] | Null] = js.undefined
  
  var axisLeft: js.UndefOr[CanvasAxisProps[Any] | Null] = js.undefined
  
  var axisRight: js.UndefOr[CanvasAxisProps[Any] | Null] = js.undefined
  
  var axisTop: js.UndefOr[CanvasAxisProps[Any] | Null] = js.undefined
  
  var borderColor: js.UndefOr[InheritedColorConfig[ComputedBarDatumWithValue[RawDatum]]] = js.undefined
  
  var borderRadius: js.UndefOr[Double] = js.undefined
  
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  var colorBy: js.UndefOr[id | indexValue] = js.undefined
  
  var colors: js.UndefOr[OrdinalColorScaleConfig[ComputedDatum[RawDatum]]] = js.undefined
  
  var data: js.Array[RawDatum]
  
  var enableGridX: js.UndefOr[Boolean] = js.undefined
  
  var enableGridY: js.UndefOr[Boolean] = js.undefined
  
  var enableLabel: js.UndefOr[Boolean] = js.undefined
  
  var gridXValues: js.UndefOr[GridValues[String | Double]] = js.undefined
  
  var gridYValues: js.UndefOr[GridValues[String | Double]] = js.undefined
  
  var groupMode: js.UndefOr[grouped | stacked] = js.undefined
  
  var height: Double
  
  var indexBy: js.UndefOr[PropertyAccessor[RawDatum, String]] = js.undefined
  
  var indexScale: js.UndefOr[ScaleBandSpec] = js.undefined
  
  var initialHiddenIds: js.UndefOr[js.Array[String]] = js.undefined
  
  var innerPadding: js.UndefOr[Double] = js.undefined
  
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  
  var keys: js.UndefOr[js.Array[String]] = js.undefined
  
  var label: js.UndefOr[PropertyAccessor[ComputedDatum[RawDatum], String]] = js.undefined
  
  var labelFormat: js.UndefOr[String | LabelFormatter] = js.undefined
  
  var labelSkipHeight: js.UndefOr[Double] = js.undefined
  
  var labelSkipWidth: js.UndefOr[Double] = js.undefined
  
  var labelTextColor: js.UndefOr[InheritedColorConfig[ComputedBarDatumWithValue[RawDatum]]] = js.undefined
  
  var layers: js.UndefOr[js.Array[BarCanvasLayer[RawDatum]]] = js.undefined
  
  var layout: js.UndefOr[horizontal | vertical] = js.undefined
  
  var legendLabel: js.UndefOr[PropertyAccessor[LegendLabelDatum[RawDatum], String]] = js.undefined
  
  var legends: js.UndefOr[js.Array[BarLegendProps]] = js.undefined
  
  var margin: js.UndefOr[Box] = js.undefined
  
  var maxValue: js.UndefOr[auto | Double] = js.undefined
  
  var minValue: js.UndefOr[auto | Double] = js.undefined
  
  var onClick: js.UndefOr[
    js.Function2[
      /* datum */ ComputedDatum[RawDatum] & Color, 
      /* event */ ReactMouseEventFrom[HTMLCanvasElement], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseEnter: js.UndefOr[
    js.Function2[
      /* datum */ ComputedDatum[RawDatum], 
      /* event */ ReactMouseEventFrom[HTMLCanvasElement], 
      Unit
    ]
  ] = js.undefined
  
  var onMouseLeave: js.UndefOr[
    js.Function2[
      /* datum */ ComputedDatum[RawDatum], 
      /* event */ ReactMouseEventFrom[HTMLCanvasElement], 
      Unit
    ]
  ] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var pixelRatio: js.UndefOr[Double] = js.undefined
  
  var renderBar: js.UndefOr[
    js.Function2[/* context */ CanvasRenderingContext2D, /* props */ RenderBarProps[RawDatum], Unit]
  ] = js.undefined
  
  var renderWrapper: js.UndefOr[Boolean] = js.undefined
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var theme: js.UndefOr[Theme] = js.undefined
  
  var tooltip: js.UndefOr[FC[BarTooltipProps[RawDatum]]] = js.undefined
  
  var tooltipLabel: js.UndefOr[PropertyAccessor[ComputedDatum[RawDatum], String]] = js.undefined
  
  var valueFormat: js.UndefOr[ValueFormat[Double, Unit]] = js.undefined
  
  var valueScale: js.UndefOr[ScaleSpec] = js.undefined
  
  var width: Double
}
object BarCanvasProps {
  
  inline def apply[RawDatum /* <: BarDatum */](data: js.Array[RawDatum], height: Double, width: Double): BarCanvasProps[RawDatum] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarCanvasProps[RawDatum]]
  }
  
  extension [Self <: BarCanvasProps[?], RawDatum /* <: BarDatum */](x: Self & BarCanvasProps[RawDatum]) {
    
    inline def setAnnotations(value: js.Array[AnnotationMatcher[ComputedBarDatum[RawDatum]]]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: AnnotationMatcher[ComputedBarDatum[RawDatum]]*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setAxisBottom(value: CanvasAxisProps[Any]): Self = StObject.set(x, "axisBottom", value.asInstanceOf[js.Any])
    
    inline def setAxisBottomNull: Self = StObject.set(x, "axisBottom", null)
    
    inline def setAxisBottomUndefined: Self = StObject.set(x, "axisBottom", js.undefined)
    
    inline def setAxisLeft(value: CanvasAxisProps[Any]): Self = StObject.set(x, "axisLeft", value.asInstanceOf[js.Any])
    
    inline def setAxisLeftNull: Self = StObject.set(x, "axisLeft", null)
    
    inline def setAxisLeftUndefined: Self = StObject.set(x, "axisLeft", js.undefined)
    
    inline def setAxisRight(value: CanvasAxisProps[Any]): Self = StObject.set(x, "axisRight", value.asInstanceOf[js.Any])
    
    inline def setAxisRightNull: Self = StObject.set(x, "axisRight", null)
    
    inline def setAxisRightUndefined: Self = StObject.set(x, "axisRight", js.undefined)
    
    inline def setAxisTop(value: CanvasAxisProps[Any]): Self = StObject.set(x, "axisTop", value.asInstanceOf[js.Any])
    
    inline def setAxisTopNull: Self = StObject.set(x, "axisTop", null)
    
    inline def setAxisTopUndefined: Self = StObject.set(x, "axisTop", js.undefined)
    
    inline def setBorderColor(value: InheritedColorConfig[ComputedBarDatumWithValue[RawDatum]]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setColorBy(value: id | indexValue): Self = StObject.set(x, "colorBy", value.asInstanceOf[js.Any])
    
    inline def setColorByUndefined: Self = StObject.set(x, "colorBy", js.undefined)
    
    inline def setColors(value: OrdinalColorScaleConfig[ComputedDatum[RawDatum]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setData(value: js.Array[RawDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: RawDatum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setEnableGridX(value: Boolean): Self = StObject.set(x, "enableGridX", value.asInstanceOf[js.Any])
    
    inline def setEnableGridXUndefined: Self = StObject.set(x, "enableGridX", js.undefined)
    
    inline def setEnableGridY(value: Boolean): Self = StObject.set(x, "enableGridY", value.asInstanceOf[js.Any])
    
    inline def setEnableGridYUndefined: Self = StObject.set(x, "enableGridY", js.undefined)
    
    inline def setEnableLabel(value: Boolean): Self = StObject.set(x, "enableLabel", value.asInstanceOf[js.Any])
    
    inline def setEnableLabelUndefined: Self = StObject.set(x, "enableLabel", js.undefined)
    
    inline def setGridXValues(value: GridValues[String | Double]): Self = StObject.set(x, "gridXValues", value.asInstanceOf[js.Any])
    
    inline def setGridXValuesUndefined: Self = StObject.set(x, "gridXValues", js.undefined)
    
    inline def setGridYValues(value: GridValues[String | Double]): Self = StObject.set(x, "gridYValues", value.asInstanceOf[js.Any])
    
    inline def setGridYValuesUndefined: Self = StObject.set(x, "gridYValues", js.undefined)
    
    inline def setGroupMode(value: grouped | stacked): Self = StObject.set(x, "groupMode", value.asInstanceOf[js.Any])
    
    inline def setGroupModeUndefined: Self = StObject.set(x, "groupMode", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setIndexBy(value: PropertyAccessor[RawDatum, String]): Self = StObject.set(x, "indexBy", value.asInstanceOf[js.Any])
    
    inline def setIndexByFunction1(value: RawDatum => String): Self = StObject.set(x, "indexBy", js.Any.fromFunction1(value))
    
    inline def setIndexByUndefined: Self = StObject.set(x, "indexBy", js.undefined)
    
    inline def setIndexScale(value: ScaleBandSpec): Self = StObject.set(x, "indexScale", value.asInstanceOf[js.Any])
    
    inline def setIndexScaleUndefined: Self = StObject.set(x, "indexScale", js.undefined)
    
    inline def setInitialHiddenIds(value: js.Array[String]): Self = StObject.set(x, "initialHiddenIds", value.asInstanceOf[js.Any])
    
    inline def setInitialHiddenIdsUndefined: Self = StObject.set(x, "initialHiddenIds", js.undefined)
    
    inline def setInitialHiddenIdsVarargs(value: String*): Self = StObject.set(x, "initialHiddenIds", js.Array(value*))
    
    inline def setInnerPadding(value: Double): Self = StObject.set(x, "innerPadding", value.asInstanceOf[js.Any])
    
    inline def setInnerPaddingUndefined: Self = StObject.set(x, "innerPadding", js.undefined)
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelFormat(value: String | LabelFormatter): Self = StObject.set(x, "labelFormat", value.asInstanceOf[js.Any])
    
    inline def setLabelFormatFunction1(value: /* label */ String | Double => String | Double): Self = StObject.set(x, "labelFormat", js.Any.fromFunction1(value))
    
    inline def setLabelFormatUndefined: Self = StObject.set(x, "labelFormat", js.undefined)
    
    inline def setLabelFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "label", js.Any.fromFunction1(value))
    
    inline def setLabelSkipHeight(value: Double): Self = StObject.set(x, "labelSkipHeight", value.asInstanceOf[js.Any])
    
    inline def setLabelSkipHeightUndefined: Self = StObject.set(x, "labelSkipHeight", js.undefined)
    
    inline def setLabelSkipWidth(value: Double): Self = StObject.set(x, "labelSkipWidth", value.asInstanceOf[js.Any])
    
    inline def setLabelSkipWidthUndefined: Self = StObject.set(x, "labelSkipWidth", js.undefined)
    
    inline def setLabelTextColor(value: InheritedColorConfig[ComputedBarDatumWithValue[RawDatum]]): Self = StObject.set(x, "labelTextColor", value.asInstanceOf[js.Any])
    
    inline def setLabelTextColorUndefined: Self = StObject.set(x, "labelTextColor", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setLayers(value: js.Array[BarCanvasLayer[RawDatum]]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: BarCanvasLayer[RawDatum]*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setLegendLabel(value: PropertyAccessor[LegendLabelDatum[RawDatum], String]): Self = StObject.set(x, "legendLabel", value.asInstanceOf[js.Any])
    
    inline def setLegendLabelFunction1(value: LegendLabelDatum[RawDatum] => String): Self = StObject.set(x, "legendLabel", js.Any.fromFunction1(value))
    
    inline def setLegendLabelUndefined: Self = StObject.set(x, "legendLabel", js.undefined)
    
    inline def setLegends(value: js.Array[BarLegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
    
    inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
    
    inline def setLegendsVarargs(value: BarLegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
    
    inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMaxValue(value: auto | Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    inline def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    inline def setMinValue(value: auto | Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    inline def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    inline def setOnClick(
      value: (/* datum */ ComputedDatum[RawDatum] & Color, /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => Callback
    ): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum] & Color, t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => (value(t0, t1)).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => Callback
    ): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => Callback
    ): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPixelRatio(value: Double): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
    
    inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
    
    inline def setRenderBar(value: (/* context */ CanvasRenderingContext2D, /* props */ RenderBarProps[RawDatum]) => Callback): Self = StObject.set(x, "renderBar", js.Any.fromFunction2((t0: /* context */ CanvasRenderingContext2D, t1: /* props */ RenderBarProps[RawDatum]) => (value(t0, t1)).runNow()))
    
    inline def setRenderBarUndefined: Self = StObject.set(x, "renderBar", js.undefined)
    
    inline def setRenderWrapper(value: Boolean): Self = StObject.set(x, "renderWrapper", value.asInstanceOf[js.Any])
    
    inline def setRenderWrapperUndefined: Self = StObject.set(x, "renderWrapper", js.undefined)
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTooltip(value: FC[BarTooltipProps[RawDatum]]): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): Self = StObject.set(x, "tooltipLabel", value.asInstanceOf[js.Any])
    
    inline def setTooltipLabelFunction1(value: ComputedDatum[RawDatum] => String): Self = StObject.set(x, "tooltipLabel", js.Any.fromFunction1(value))
    
    inline def setTooltipLabelUndefined: Self = StObject.set(x, "tooltipLabel", js.undefined)
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setValueFormat(value: ValueFormat[Double, Unit]): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
    
    inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
    
    inline def setValueScale(value: ScaleSpec): Self = StObject.set(x, "valueScale", value.asInstanceOf[js.Any])
    
    inline def setValueScaleUndefined: Self = StObject.set(x, "valueScale", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
