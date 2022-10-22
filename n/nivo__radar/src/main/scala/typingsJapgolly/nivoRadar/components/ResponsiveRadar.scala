package typingsJapgolly.nivoRadar.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typingsJapgolly.nivoCore.anon.Dictkey
import typingsJapgolly.nivoCore.anon.Id
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.ClosedCurveFactoryId
import typingsJapgolly.nivoCore.mod.CssMixBlendMode
import typingsJapgolly.nivoCore.mod.DotsItemSymbolComponent
import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoCore.mod.ValueFormat
import typingsJapgolly.nivoLegends.distTypesTypesMod.LegendProps
import typingsJapgolly.nivoRadar.anon.Color
import typingsJapgolly.nivoRadar.anon.Index
import typingsJapgolly.nivoRadar.distTypesTypesMod.GridLabelComponent
import typingsJapgolly.nivoRadar.distTypesTypesMod.PointData
import typingsJapgolly.nivoRadar.distTypesTypesMod.RadarCustomLayer
import typingsJapgolly.nivoRadar.distTypesTypesMod.RadarLayerId
import typingsJapgolly.nivoRadar.distTypesTypesMod.RadarSliceTooltipComponent
import typingsJapgolly.nivoRadar.distTypesTypesMod.RadarSvgFillMatcherDatum
import typingsJapgolly.nivoRadar.distTypesTypesMod.RadarSvgProps
import typingsJapgolly.nivoRadar.nivoRadarStrings.auto
import typingsJapgolly.nivoRadar.nivoRadarStrings.circular
import typingsJapgolly.nivoRadar.nivoRadarStrings.linear
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResponsiveRadar {
  
  inline def apply[D /* <: Record[String, Any] */](
    data: js.Array[D],
    height: Double,
    indexBy: PropertyAccessor[D, String],
    keys: js.Array[String],
    width: Double
  ): Builder[D] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], indexBy = indexBy.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder[D](js.Array(this.component, __props.asInstanceOf[RadarSvgProps[D]]))
  }
  
  @JSImport("@nivo/radar", "ResponsiveRadar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[D /* <: Record[String, Any] */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def ariaDescribedBy(value: String): this.type = set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def blendMode(value: CssMixBlendMode): this.type = set("blendMode", value.asInstanceOf[js.Any])
    
    inline def borderColor(value: InheritedColorConfig[Color]): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    inline def borderWidth(value: Double): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    inline def colors(value: OrdinalColorScaleConfig[Index]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsFunction1(value: Index => String): this.type = set("colors", js.Any.fromFunction1(value))
    
    inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
    
    inline def curve(value: ClosedCurveFactoryId): this.type = set("curve", value.asInstanceOf[js.Any])
    
    inline def defs(value: js.Array[Dictkey]): this.type = set("defs", value.asInstanceOf[js.Any])
    
    inline def defsVarargs(value: Dictkey*): this.type = set("defs", js.Array(value*))
    
    inline def dotBorderColor(value: InheritedColorConfig[PointData]): this.type = set("dotBorderColor", value.asInstanceOf[js.Any])
    
    inline def dotBorderWidth(value: Double): this.type = set("dotBorderWidth", value.asInstanceOf[js.Any])
    
    inline def dotColor(value: InheritedColorConfig[PointData]): this.type = set("dotColor", value.asInstanceOf[js.Any])
    
    inline def dotLabel(value: PropertyAccessor[PointData, String | Double]): this.type = set("dotLabel", value.asInstanceOf[js.Any])
    
    inline def dotLabelFormat(value: ValueFormat[Double, Unit]): this.type = set("dotLabelFormat", value.asInstanceOf[js.Any])
    
    inline def dotLabelFunction1(value: PointData => String | Double): this.type = set("dotLabel", js.Any.fromFunction1(value))
    
    inline def dotLabelYOffset(value: Double): this.type = set("dotLabelYOffset", value.asInstanceOf[js.Any])
    
    inline def dotSize(value: Double): this.type = set("dotSize", value.asInstanceOf[js.Any])
    
    inline def dotSymbol(value: DotsItemSymbolComponent): this.type = set("dotSymbol", value.asInstanceOf[js.Any])
    
    inline def enableDotLabel(value: Boolean): this.type = set("enableDotLabel", value.asInstanceOf[js.Any])
    
    inline def enableDots(value: Boolean): this.type = set("enableDots", value.asInstanceOf[js.Any])
    
    inline def fill(value: js.Array[Id[RadarSvgFillMatcherDatum[D]]]): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def fillOpacity(value: Double): this.type = set("fillOpacity", value.asInstanceOf[js.Any])
    
    inline def fillVarargs(value: Id[RadarSvgFillMatcherDatum[D]]*): this.type = set("fill", js.Array(value*))
    
    inline def gridLabel(value: GridLabelComponent): this.type = set("gridLabel", value.asInstanceOf[js.Any])
    
    inline def gridLabelOffset(value: Double): this.type = set("gridLabelOffset", value.asInstanceOf[js.Any])
    
    inline def gridLevels(value: Double): this.type = set("gridLevels", value.asInstanceOf[js.Any])
    
    inline def gridShape(value: circular | linear): this.type = set("gridShape", value.asInstanceOf[js.Any])
    
    inline def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    inline def layers(value: js.Array[RadarLayerId | RadarCustomLayer[D]]): this.type = set("layers", value.asInstanceOf[js.Any])
    
    inline def layersVarargs(value: (RadarLayerId | RadarCustomLayer[D])*): this.type = set("layers", js.Array(value*))
    
    inline def legends(value: js.Array[LegendProps]): this.type = set("legends", value.asInstanceOf[js.Any])
    
    inline def legendsVarargs(value: LegendProps*): this.type = set("legends", js.Array(value*))
    
    inline def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def maxValue(value: Double | auto): this.type = set("maxValue", value.asInstanceOf[js.Any])
    
    inline def motionConfig(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): this.type = set("motionConfig", value.asInstanceOf[js.Any])
    
    inline def renderWrapper(value: Boolean): this.type = set("renderWrapper", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def rotation(value: Double): this.type = set("rotation", value.asInstanceOf[js.Any])
    
    inline def sliceTooltip(value: RadarSliceTooltipComponent): this.type = set("sliceTooltip", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def valueFormat(value: ValueFormat[Double, String]): this.type = set("valueFormat", value.asInstanceOf[js.Any])
  }
  
  def withProps[D /* <: Record[String, Any] */](p: RadarSvgProps[D]): Builder[D] = new Builder[D](js.Array(this.component, p.asInstanceOf[js.Any]))
}
