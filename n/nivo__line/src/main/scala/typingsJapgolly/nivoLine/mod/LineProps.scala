package typingsJapgolly.nivoLine.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import typingsJapgolly.nivoAxes.distTypesTypesMod.AxisProps
import typingsJapgolly.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.CartesianMarkerProps
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoCore.mod.ValueFormat
import typingsJapgolly.nivoLegends.distTypesTypesMod.LegendProps
import typingsJapgolly.nivoLine.anon.ReadonlyPointSymbolProps
import typingsJapgolly.nivoLine.nivoLineBooleans.`false`
import typingsJapgolly.nivoLine.nivoLineStrings.basis
import typingsJapgolly.nivoLine.nivoLineStrings.cardinal
import typingsJapgolly.nivoLine.nivoLineStrings.catmullRom
import typingsJapgolly.nivoLine.nivoLineStrings.linear
import typingsJapgolly.nivoLine.nivoLineStrings.monotoneX
import typingsJapgolly.nivoLine.nivoLineStrings.monotoneY
import typingsJapgolly.nivoLine.nivoLineStrings.natural
import typingsJapgolly.nivoLine.nivoLineStrings.step
import typingsJapgolly.nivoLine.nivoLineStrings.stepAfter
import typingsJapgolly.nivoLine.nivoLineStrings.stepBefore
import typingsJapgolly.nivoLine.nivoLineStrings.x
import typingsJapgolly.nivoLine.nivoLineStrings.y
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleSpec
import typingsJapgolly.nivoScales.distTypesTypesMod.TicksSpec
import typingsJapgolly.nivoTooltip.distTypesTypesMod.CrosshairType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineProps extends StObject {
  
  var areaBaselineValue: js.UndefOr[DatumValue] = js.undefined
  
  var areaOpacity: js.UndefOr[Double] = js.undefined
  
  var axisBottom: js.UndefOr[AxisProps[Any] | Null] = js.undefined
  
  var axisLeft: js.UndefOr[AxisProps[Any] | Null] = js.undefined
  
  var axisRight: js.UndefOr[AxisProps[Any] | Null] = js.undefined
  
  var axisTop: js.UndefOr[AxisProps[Any] | Null] = js.undefined
  
  var colors: js.UndefOr[OrdinalColorScaleConfig[Any]] = js.undefined
  
  var crosshairType: js.UndefOr[CrosshairType] = js.undefined
  
  var curve: js.UndefOr[
    basis | cardinal | catmullRom | linear | monotoneX | monotoneY | natural | step | stepAfter | stepBefore
  ] = js.undefined
  
  var data: js.Array[Serie]
  
  var debugMesh: js.UndefOr[Boolean] = js.undefined
  
  var debugSlices: js.UndefOr[Boolean] = js.undefined
  
  var enableArea: js.UndefOr[Boolean] = js.undefined
  
  var enableCrosshair: js.UndefOr[Boolean] = js.undefined
  
  var enableGridX: js.UndefOr[Boolean] = js.undefined
  
  var enableGridY: js.UndefOr[Boolean] = js.undefined
  
  var enablePoints: js.UndefOr[Boolean] = js.undefined
  
  var enableSlices: js.UndefOr[x | y | `false`] = js.undefined
  
  var gridXValues: js.UndefOr[TicksSpec[DatumValue]] = js.undefined
  
  var gridYValues: js.UndefOr[TicksSpec[DatumValue]] = js.undefined
  
  var isInteractive: js.UndefOr[Boolean] = js.undefined
  
  var layers: js.UndefOr[js.Array[Layer]] = js.undefined
  
  var legends: js.UndefOr[js.Array[LegendProps]] = js.undefined
  
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  var margin: js.UndefOr[Box] = js.undefined
  
  var markers: js.UndefOr[js.Array[CartesianMarkerProps[typingsJapgolly.nivoCore.mod.DatumValue]]] = js.undefined
  
  var onClick: js.UndefOr[PointMouseHandler] = js.undefined
  
  var onMouseEnter: js.UndefOr[PointMouseHandler] = js.undefined
  
  var onMouseLeave: js.UndefOr[PointMouseHandler] = js.undefined
  
  var onMouseMove: js.UndefOr[PointMouseHandler] = js.undefined
  
  var pointBorderColor: js.UndefOr[Any] = js.undefined
  
  var pointBorderWidth: js.UndefOr[Double] = js.undefined
  
  var pointColor: js.UndefOr[Any] = js.undefined
  
  var pointSize: js.UndefOr[Double] = js.undefined
  
  var pointSymbol: js.UndefOr[js.Function1[/* props */ ReadonlyPointSymbolProps, Node]] = js.undefined
  
  var sliceTooltip: js.UndefOr[SliceTooltip] = js.undefined
  
  var theme: js.UndefOr[Theme] = js.undefined
  
  var tooltip: js.UndefOr[PointTooltip] = js.undefined
  
  var tooltipFormat: js.UndefOr[ValueFormat[DatumValue, Unit]] = js.undefined
  
  var xFormat: js.UndefOr[ValueFormat[DatumValue, Unit]] = js.undefined
  
  var xScale: js.UndefOr[ScaleSpec] = js.undefined
  
  var yFormat: js.UndefOr[ValueFormat[DatumValue, Unit]] = js.undefined
  
  var yScale: js.UndefOr[ScaleSpec] = js.undefined
}
object LineProps {
  
  inline def apply(data: js.Array[Serie]): LineProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineProps]
  }
  
  extension [Self <: LineProps](x: Self) {
    
    inline def setAreaBaselineValue(value: DatumValue): Self = StObject.set(x, "areaBaselineValue", value.asInstanceOf[js.Any])
    
    inline def setAreaBaselineValueUndefined: Self = StObject.set(x, "areaBaselineValue", js.undefined)
    
    inline def setAreaOpacity(value: Double): Self = StObject.set(x, "areaOpacity", value.asInstanceOf[js.Any])
    
    inline def setAreaOpacityUndefined: Self = StObject.set(x, "areaOpacity", js.undefined)
    
    inline def setAxisBottom(value: AxisProps[Any]): Self = StObject.set(x, "axisBottom", value.asInstanceOf[js.Any])
    
    inline def setAxisBottomNull: Self = StObject.set(x, "axisBottom", null)
    
    inline def setAxisBottomUndefined: Self = StObject.set(x, "axisBottom", js.undefined)
    
    inline def setAxisLeft(value: AxisProps[Any]): Self = StObject.set(x, "axisLeft", value.asInstanceOf[js.Any])
    
    inline def setAxisLeftNull: Self = StObject.set(x, "axisLeft", null)
    
    inline def setAxisLeftUndefined: Self = StObject.set(x, "axisLeft", js.undefined)
    
    inline def setAxisRight(value: AxisProps[Any]): Self = StObject.set(x, "axisRight", value.asInstanceOf[js.Any])
    
    inline def setAxisRightNull: Self = StObject.set(x, "axisRight", null)
    
    inline def setAxisRightUndefined: Self = StObject.set(x, "axisRight", js.undefined)
    
    inline def setAxisTop(value: AxisProps[Any]): Self = StObject.set(x, "axisTop", value.asInstanceOf[js.Any])
    
    inline def setAxisTopNull: Self = StObject.set(x, "axisTop", null)
    
    inline def setAxisTopUndefined: Self = StObject.set(x, "axisTop", js.undefined)
    
    inline def setColors(value: OrdinalColorScaleConfig[Any]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsFunction1(value: Any => String): Self = StObject.set(x, "colors", js.Any.fromFunction1(value))
    
    inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
    
    inline def setColorsVarargs(value: String*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setCrosshairType(value: CrosshairType): Self = StObject.set(x, "crosshairType", value.asInstanceOf[js.Any])
    
    inline def setCrosshairTypeUndefined: Self = StObject.set(x, "crosshairType", js.undefined)
    
    inline def setCurve(
      value: basis | cardinal | catmullRom | linear | monotoneX | monotoneY | natural | step | stepAfter | stepBefore
    ): Self = StObject.set(x, "curve", value.asInstanceOf[js.Any])
    
    inline def setCurveUndefined: Self = StObject.set(x, "curve", js.undefined)
    
    inline def setData(value: js.Array[Serie]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: Serie*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setDebugMesh(value: Boolean): Self = StObject.set(x, "debugMesh", value.asInstanceOf[js.Any])
    
    inline def setDebugMeshUndefined: Self = StObject.set(x, "debugMesh", js.undefined)
    
    inline def setDebugSlices(value: Boolean): Self = StObject.set(x, "debugSlices", value.asInstanceOf[js.Any])
    
    inline def setDebugSlicesUndefined: Self = StObject.set(x, "debugSlices", js.undefined)
    
    inline def setEnableArea(value: Boolean): Self = StObject.set(x, "enableArea", value.asInstanceOf[js.Any])
    
    inline def setEnableAreaUndefined: Self = StObject.set(x, "enableArea", js.undefined)
    
    inline def setEnableCrosshair(value: Boolean): Self = StObject.set(x, "enableCrosshair", value.asInstanceOf[js.Any])
    
    inline def setEnableCrosshairUndefined: Self = StObject.set(x, "enableCrosshair", js.undefined)
    
    inline def setEnableGridX(value: Boolean): Self = StObject.set(x, "enableGridX", value.asInstanceOf[js.Any])
    
    inline def setEnableGridXUndefined: Self = StObject.set(x, "enableGridX", js.undefined)
    
    inline def setEnableGridY(value: Boolean): Self = StObject.set(x, "enableGridY", value.asInstanceOf[js.Any])
    
    inline def setEnableGridYUndefined: Self = StObject.set(x, "enableGridY", js.undefined)
    
    inline def setEnablePoints(value: Boolean): Self = StObject.set(x, "enablePoints", value.asInstanceOf[js.Any])
    
    inline def setEnablePointsUndefined: Self = StObject.set(x, "enablePoints", js.undefined)
    
    inline def setEnableSlices(value: typingsJapgolly.nivoLine.nivoLineStrings.x | y | `false`): Self = StObject.set(x, "enableSlices", value.asInstanceOf[js.Any])
    
    inline def setEnableSlicesUndefined: Self = StObject.set(x, "enableSlices", js.undefined)
    
    inline def setGridXValues(value: TicksSpec[DatumValue]): Self = StObject.set(x, "gridXValues", value.asInstanceOf[js.Any])
    
    inline def setGridXValuesUndefined: Self = StObject.set(x, "gridXValues", js.undefined)
    
    inline def setGridXValuesVarargs(value: DatumValue*): Self = StObject.set(x, "gridXValues", js.Array(value*))
    
    inline def setGridYValues(value: TicksSpec[DatumValue]): Self = StObject.set(x, "gridYValues", value.asInstanceOf[js.Any])
    
    inline def setGridYValuesUndefined: Self = StObject.set(x, "gridYValues", js.undefined)
    
    inline def setGridYValuesVarargs(value: DatumValue*): Self = StObject.set(x, "gridYValues", js.Array(value*))
    
    inline def setIsInteractive(value: Boolean): Self = StObject.set(x, "isInteractive", value.asInstanceOf[js.Any])
    
    inline def setIsInteractiveUndefined: Self = StObject.set(x, "isInteractive", js.undefined)
    
    inline def setLayers(value: js.Array[Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setLayersVarargs(value: Layer*): Self = StObject.set(x, "layers", js.Array(value*))
    
    inline def setLegends(value: js.Array[LegendProps]): Self = StObject.set(x, "legends", value.asInstanceOf[js.Any])
    
    inline def setLegendsUndefined: Self = StObject.set(x, "legends", js.undefined)
    
    inline def setLegendsVarargs(value: LegendProps*): Self = StObject.set(x, "legends", js.Array(value*))
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setMargin(value: Box): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setMarkers(value: js.Array[CartesianMarkerProps[typingsJapgolly.nivoCore.mod.DatumValue]]): Self = StObject.set(x, "markers", value.asInstanceOf[js.Any])
    
    inline def setMarkersUndefined: Self = StObject.set(x, "markers", js.undefined)
    
    inline def setMarkersVarargs(value: CartesianMarkerProps[typingsJapgolly.nivoCore.mod.DatumValue]*): Self = StObject.set(x, "markers", js.Array(value*))
    
    inline def setOnClick(value: (/* point */ Point, /* event */ ReactMouseEventFrom[Element]) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: /* point */ Point, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnMouseEnter(value: (/* point */ Point, /* event */ ReactMouseEventFrom[Element]) => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2((t0: /* point */ Point, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
    
    inline def setOnMouseLeave(value: (/* point */ Point, /* event */ ReactMouseEventFrom[Element]) => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2((t0: /* point */ Point, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
    
    inline def setOnMouseMove(value: (/* point */ Point, /* event */ ReactMouseEventFrom[Element]) => Callback): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2((t0: /* point */ Point, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
    
    inline def setPointBorderColor(value: Any): Self = StObject.set(x, "pointBorderColor", value.asInstanceOf[js.Any])
    
    inline def setPointBorderColorUndefined: Self = StObject.set(x, "pointBorderColor", js.undefined)
    
    inline def setPointBorderWidth(value: Double): Self = StObject.set(x, "pointBorderWidth", value.asInstanceOf[js.Any])
    
    inline def setPointBorderWidthUndefined: Self = StObject.set(x, "pointBorderWidth", js.undefined)
    
    inline def setPointColor(value: Any): Self = StObject.set(x, "pointColor", value.asInstanceOf[js.Any])
    
    inline def setPointColorUndefined: Self = StObject.set(x, "pointColor", js.undefined)
    
    inline def setPointSize(value: Double): Self = StObject.set(x, "pointSize", value.asInstanceOf[js.Any])
    
    inline def setPointSizeUndefined: Self = StObject.set(x, "pointSize", js.undefined)
    
    inline def setPointSymbol(value: /* props */ ReadonlyPointSymbolProps => Node): Self = StObject.set(x, "pointSymbol", js.Any.fromFunction1(value))
    
    inline def setPointSymbolUndefined: Self = StObject.set(x, "pointSymbol", js.undefined)
    
    inline def setSliceTooltip(value: SliceTooltip): Self = StObject.set(x, "sliceTooltip", value.asInstanceOf[js.Any])
    
    inline def setSliceTooltipUndefined: Self = StObject.set(x, "sliceTooltip", js.undefined)
    
    inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setTooltip(value: PointTooltip): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipFormat(value: ValueFormat[DatumValue, Unit]): Self = StObject.set(x, "tooltipFormat", value.asInstanceOf[js.Any])
    
    inline def setTooltipFormatUndefined: Self = StObject.set(x, "tooltipFormat", js.undefined)
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    
    inline def setXFormat(value: ValueFormat[DatumValue, Unit]): Self = StObject.set(x, "xFormat", value.asInstanceOf[js.Any])
    
    inline def setXFormatUndefined: Self = StObject.set(x, "xFormat", js.undefined)
    
    inline def setXScale(value: ScaleSpec): Self = StObject.set(x, "xScale", value.asInstanceOf[js.Any])
    
    inline def setXScaleUndefined: Self = StObject.set(x, "xScale", js.undefined)
    
    inline def setYFormat(value: ValueFormat[DatumValue, Unit]): Self = StObject.set(x, "yFormat", value.asInstanceOf[js.Any])
    
    inline def setYFormatUndefined: Self = StObject.set(x, "yFormat", js.undefined)
    
    inline def setYScale(value: ScaleSpec): Self = StObject.set(x, "yScale", value.asInstanceOf[js.Any])
    
    inline def setYScaleUndefined: Self = StObject.set(x, "yScale", js.undefined)
  }
}
