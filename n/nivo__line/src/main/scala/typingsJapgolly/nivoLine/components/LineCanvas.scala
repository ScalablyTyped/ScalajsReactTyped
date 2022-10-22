package typingsJapgolly.nivoLine.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoAxes.distTypesTypesMod.AxisProps
import typingsJapgolly.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.CartesianMarkerProps
import typingsJapgolly.nivoCore.mod.Dimensions
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoCore.mod.ValueFormat
import typingsJapgolly.nivoLegends.distTypesTypesMod.LegendProps
import typingsJapgolly.nivoLine.anon.ReadonlyPointSymbolProps
import typingsJapgolly.nivoLine.mod.CanvasLayer
import typingsJapgolly.nivoLine.mod.DatumValue
import typingsJapgolly.nivoLine.mod.LineCanvasProps
import typingsJapgolly.nivoLine.mod.Point
import typingsJapgolly.nivoLine.mod.PointTooltip
import typingsJapgolly.nivoLine.mod.Serie
import typingsJapgolly.nivoLine.mod.SliceTooltip
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

object LineCanvas {
  
  inline def apply(data: js.Array[Serie], height: Double, width: Double): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LineCanvasProps & Dimensions]))
  }
  
  @JSImport("@nivo/line", "LineCanvas")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.nivoLine.mod.LineCanvas] {
    
    inline def areaBaselineValue(value: DatumValue): this.type = set("areaBaselineValue", value.asInstanceOf[js.Any])
    
    inline def areaOpacity(value: Double): this.type = set("areaOpacity", value.asInstanceOf[js.Any])
    
    inline def axisBottom(value: AxisProps[Any]): this.type = set("axisBottom", value.asInstanceOf[js.Any])
    
    inline def axisBottomNull: this.type = set("axisBottom", null)
    
    inline def axisLeft(value: AxisProps[Any]): this.type = set("axisLeft", value.asInstanceOf[js.Any])
    
    inline def axisLeftNull: this.type = set("axisLeft", null)
    
    inline def axisRight(value: AxisProps[Any]): this.type = set("axisRight", value.asInstanceOf[js.Any])
    
    inline def axisRightNull: this.type = set("axisRight", null)
    
    inline def axisTop(value: AxisProps[Any]): this.type = set("axisTop", value.asInstanceOf[js.Any])
    
    inline def axisTopNull: this.type = set("axisTop", null)
    
    inline def colors(value: OrdinalColorScaleConfig[Any]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsFunction1(value: Any => String): this.type = set("colors", js.Any.fromFunction1(value))
    
    inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
    
    inline def crosshairType(value: CrosshairType): this.type = set("crosshairType", value.asInstanceOf[js.Any])
    
    inline def curve(
      value: basis | cardinal | catmullRom | linear | monotoneX | monotoneY | natural | step | stepAfter | stepBefore
    ): this.type = set("curve", value.asInstanceOf[js.Any])
    
    inline def debugMesh(value: Boolean): this.type = set("debugMesh", value.asInstanceOf[js.Any])
    
    inline def debugSlices(value: Boolean): this.type = set("debugSlices", value.asInstanceOf[js.Any])
    
    inline def enableArea(value: Boolean): this.type = set("enableArea", value.asInstanceOf[js.Any])
    
    inline def enableCrosshair(value: Boolean): this.type = set("enableCrosshair", value.asInstanceOf[js.Any])
    
    inline def enableGridX(value: Boolean): this.type = set("enableGridX", value.asInstanceOf[js.Any])
    
    inline def enableGridY(value: Boolean): this.type = set("enableGridY", value.asInstanceOf[js.Any])
    
    inline def enablePoints(value: Boolean): this.type = set("enablePoints", value.asInstanceOf[js.Any])
    
    inline def enableSlices(value: x | y | `false`): this.type = set("enableSlices", value.asInstanceOf[js.Any])
    
    inline def gridXValues(value: TicksSpec[DatumValue]): this.type = set("gridXValues", value.asInstanceOf[js.Any])
    
    inline def gridXValuesVarargs(value: DatumValue*): this.type = set("gridXValues", js.Array(value*))
    
    inline def gridYValues(value: TicksSpec[DatumValue]): this.type = set("gridYValues", value.asInstanceOf[js.Any])
    
    inline def gridYValuesVarargs(value: DatumValue*): this.type = set("gridYValues", js.Array(value*))
    
    inline def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    inline def layers(value: js.Array[CanvasLayer]): this.type = set("layers", value.asInstanceOf[js.Any])
    
    inline def layersVarargs(value: CanvasLayer*): this.type = set("layers", js.Array(value*))
    
    inline def legends(value: js.Array[LegendProps]): this.type = set("legends", value.asInstanceOf[js.Any])
    
    inline def legendsVarargs(value: LegendProps*): this.type = set("legends", js.Array(value*))
    
    inline def lineWidth(value: Double): this.type = set("lineWidth", value.asInstanceOf[js.Any])
    
    inline def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def markers(value: js.Array[CartesianMarkerProps[typingsJapgolly.nivoCore.mod.DatumValue]]): this.type = set("markers", value.asInstanceOf[js.Any])
    
    inline def markersVarargs(value: CartesianMarkerProps[typingsJapgolly.nivoCore.mod.DatumValue]*): this.type = set("markers", js.Array(value*))
    
    inline def onClick(value: (/* point */ Point, /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onClick", js.Any.fromFunction2((t0: /* point */ Point, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(value: (/* point */ Point, /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* point */ Point, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(value: (/* point */ Point, /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* point */ Point, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseMove(value: (/* point */ Point, /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onMouseMove", js.Any.fromFunction2((t0: /* point */ Point, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def pixelRatio(value: Double): this.type = set("pixelRatio", value.asInstanceOf[js.Any])
    
    inline def pointBorderColor(value: Any): this.type = set("pointBorderColor", value.asInstanceOf[js.Any])
    
    inline def pointBorderWidth(value: Double): this.type = set("pointBorderWidth", value.asInstanceOf[js.Any])
    
    inline def pointColor(value: Any): this.type = set("pointColor", value.asInstanceOf[js.Any])
    
    inline def pointSize(value: Double): this.type = set("pointSize", value.asInstanceOf[js.Any])
    
    inline def pointSymbol(value: /* props */ ReadonlyPointSymbolProps => Node): this.type = set("pointSymbol", js.Any.fromFunction1(value))
    
    inline def sliceTooltip(value: SliceTooltip): this.type = set("sliceTooltip", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: PointTooltip): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def tooltipFormat(value: ValueFormat[DatumValue, Unit]): this.type = set("tooltipFormat", value.asInstanceOf[js.Any])
    
    inline def xFormat(value: ValueFormat[DatumValue, Unit]): this.type = set("xFormat", value.asInstanceOf[js.Any])
    
    inline def xScale(value: ScaleSpec): this.type = set("xScale", value.asInstanceOf[js.Any])
    
    inline def yFormat(value: ValueFormat[DatumValue, Unit]): this.type = set("yFormat", value.asInstanceOf[js.Any])
    
    inline def yScale(value: ScaleSpec): this.type = set("yScale", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LineCanvasProps & Dimensions): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
