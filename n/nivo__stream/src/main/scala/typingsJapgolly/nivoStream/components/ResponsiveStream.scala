package typingsJapgolly.nivoStream.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoAxes.distTypesTypesMod.AxisProps
import typingsJapgolly.nivoAxes.distTypesTypesMod.GridValues
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typingsJapgolly.nivoCore.anon.Dictkey
import typingsJapgolly.nivoCore.anon.Id
import typingsJapgolly.nivoCore.mod.AreaCurve
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.nivoCore.mod.StackOffset
import typingsJapgolly.nivoCore.mod.StackOrder
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoCore.mod.ValueFormat
import typingsJapgolly.nivoLegends.distTypesTypesMod.LegendProps
import typingsJapgolly.nivoStream.anon.OmitStreamLayerDatalabelc
import typingsJapgolly.nivoStream.anon.`0`
import typingsJapgolly.nivoStream.distTypesTypesMod.DotComponent
import typingsJapgolly.nivoStream.distTypesTypesMod.StreamDatum
import typingsJapgolly.nivoStream.distTypesTypesMod.StreamLayerData
import typingsJapgolly.nivoStream.distTypesTypesMod.StreamLayerDatum
import typingsJapgolly.nivoStream.distTypesTypesMod.StreamSvgProps
import typingsJapgolly.nivoStream.distTypesTypesMod.Tooltip
import typingsJapgolly.nivoStream.nivoStreamStrings.center
import typingsJapgolly.nivoStream.nivoStreamStrings.end
import typingsJapgolly.nivoStream.nivoStreamStrings.start
import typingsJapgolly.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResponsiveStream {
  
  inline def apply[RawDatum /* <: StreamDatum */](
    data: js.Array[RawDatum],
    height: Double,
    keys: js.Array[Exclude[/* keyof RawDatum */ String, js.Symbol]],
    width: Double
  ): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[StreamSvgProps[RawDatum]]))
  }
  
  @JSImport("@nivo/stream", "ResponsiveStream")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum /* <: StreamDatum */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def ariaDescribedBy(value: String): this.type = set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def axisBottom(value: AxisProps[Any]): this.type = set("axisBottom", value.asInstanceOf[js.Any])
    
    inline def axisBottomNull: this.type = set("axisBottom", null)
    
    inline def axisLeft(value: AxisProps[Any]): this.type = set("axisLeft", value.asInstanceOf[js.Any])
    
    inline def axisLeftNull: this.type = set("axisLeft", null)
    
    inline def axisRight(value: AxisProps[Any]): this.type = set("axisRight", value.asInstanceOf[js.Any])
    
    inline def axisRightNull: this.type = set("axisRight", null)
    
    inline def axisTop(value: AxisProps[Any]): this.type = set("axisTop", value.asInstanceOf[js.Any])
    
    inline def axisTopNull: this.type = set("axisTop", null)
    
    inline def borderColor(value: InheritedColorConfig[StreamLayerData]): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    inline def borderWidth(value: Double): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    inline def colors(value: OrdinalColorScaleConfig[OmitStreamLayerDatalabelc]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsFunction1(value: OmitStreamLayerDatalabelc => String): this.type = set("colors", js.Any.fromFunction1(value))
    
    inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
    
    inline def curve(value: AreaCurve): this.type = set("curve", value.asInstanceOf[js.Any])
    
    inline def defs(value: js.Array[Dictkey]): this.type = set("defs", value.asInstanceOf[js.Any])
    
    inline def defsVarargs(value: Dictkey*): this.type = set("defs", js.Array(value*))
    
    inline def dotBorderColor(value: InheritedColorConfig[StreamLayerDatum]): this.type = set("dotBorderColor", value.asInstanceOf[js.Any])
    
    inline def dotBorderWidth(value: (js.Function1[/* datum */ StreamLayerDatum, Double]) | Double): this.type = set("dotBorderWidth", value.asInstanceOf[js.Any])
    
    inline def dotBorderWidthFunction1(value: /* datum */ StreamLayerDatum => Double): this.type = set("dotBorderWidth", js.Any.fromFunction1(value))
    
    inline def dotColor(value: InheritedColorConfig[StreamLayerDatum]): this.type = set("dotColor", value.asInstanceOf[js.Any])
    
    inline def dotComponent(value: DotComponent): this.type = set("dotComponent", value.asInstanceOf[js.Any])
    
    inline def dotPosition(value: start | center | end): this.type = set("dotPosition", value.asInstanceOf[js.Any])
    
    inline def dotSize(value: (js.Function1[/* datum */ StreamLayerDatum, Double]) | Double): this.type = set("dotSize", value.asInstanceOf[js.Any])
    
    inline def dotSizeFunction1(value: /* datum */ StreamLayerDatum => Double): this.type = set("dotSize", js.Any.fromFunction1(value))
    
    inline def enableDots(value: Boolean): this.type = set("enableDots", value.asInstanceOf[js.Any])
    
    inline def enableGridX(value: Boolean): this.type = set("enableGridX", value.asInstanceOf[js.Any])
    
    inline def enableGridY(value: Boolean): this.type = set("enableGridY", value.asInstanceOf[js.Any])
    
    inline def enableStackTooltip(value: Boolean): this.type = set("enableStackTooltip", value.asInstanceOf[js.Any])
    
    inline def fill(value: js.Array[Id[StreamLayerData]]): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def fillOpacity(value: Double): this.type = set("fillOpacity", value.asInstanceOf[js.Any])
    
    inline def fillVarargs(value: Id[StreamLayerData]*): this.type = set("fill", js.Array(value*))
    
    inline def gridXValues(value: GridValues[String | Double]): this.type = set("gridXValues", value.asInstanceOf[js.Any])
    
    inline def gridYValues(value: GridValues[Double]): this.type = set("gridYValues", value.asInstanceOf[js.Any])
    
    inline def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    inline def label(value: PropertyAccessor[OmitStreamLayerDatalabelc, String | Double]): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelFunction1(value: OmitStreamLayerDatalabelc => String | Double): this.type = set("label", js.Any.fromFunction1(value))
    
    inline def layers(value: js.Array[typingsJapgolly.nivoStream.distTypesTypesMod.StreamLayer]): this.type = set("layers", value.asInstanceOf[js.Any])
    
    inline def layersVarargs(value: typingsJapgolly.nivoStream.distTypesTypesMod.StreamLayer*): this.type = set("layers", js.Array(value*))
    
    inline def legends(value: js.Array[LegendProps]): this.type = set("legends", value.asInstanceOf[js.Any])
    
    inline def legendsVarargs(value: LegendProps*): this.type = set("legends", js.Array(value*))
    
    inline def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def motionConfig(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): this.type = set("motionConfig", value.asInstanceOf[js.Any])
    
    inline def offsetType(value: StackOffset): this.type = set("offsetType", value.asInstanceOf[js.Any])
    
    inline def order(value: StackOrder): this.type = set("order", value.asInstanceOf[js.Any])
    
    inline def renderWrapper(value: Boolean): this.type = set("renderWrapper", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def stack(value: /* data */ js.Array[RawDatum] => js.Array[js.Array[`0`[RawDatum]]]): this.type = set("stack", js.Any.fromFunction1(value))
    
    inline def stackTooltip(value: typingsJapgolly.nivoStream.distTypesTypesMod.StackTooltip): this.type = set("stackTooltip", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: Tooltip): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def valueFormat(value: ValueFormat[Double, Unit]): this.type = set("valueFormat", value.asInstanceOf[js.Any])
  }
  
  def withProps[RawDatum /* <: StreamDatum */](p: StreamSvgProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
