package typingsJapgolly.nivoPie.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoArcs.distTypesArcLabelsArcLabelMod.ArcLabelProps
import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsArcLinkLabelMod.ArcLinkLabelProps
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoCore.mod.ValueFormat
import typingsJapgolly.nivoLegends.distTypesTypesMod.LegendProps
import typingsJapgolly.nivoPie.distTypesTypesMod.ComputedDatum
import typingsJapgolly.nivoPie.distTypesTypesMod.DatumId
import typingsJapgolly.nivoPie.distTypesTypesMod.PieCanvasProps
import typingsJapgolly.nivoPie.distTypesTypesMod.PieTooltipProps
import typingsJapgolly.nivoPie.nivoPieStrings.arc
import typingsJapgolly.nivoPie.nivoPieStrings.color
import typingsJapgolly.nivoPie.nivoPieStrings.fill
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResponsivePieCanvas {
  
  inline def apply[RawDatum](data: js.Array[RawDatum], height: Double, width: Double): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[PieCanvasProps[RawDatum]]))
  }
  
  @JSImport("@nivo/pie", "ResponsivePieCanvas")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def activeInnerRadiusOffset(value: Double): this.type = set("activeInnerRadiusOffset", value.asInstanceOf[js.Any])
    
    inline def activeOuterRadiusOffset(value: Double): this.type = set("activeOuterRadiusOffset", value.asInstanceOf[js.Any])
    
    inline def arcLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): this.type = set("arcLabel", value.asInstanceOf[js.Any])
    
    inline def arcLabelFunction1(value: ComputedDatum[RawDatum] => String): this.type = set("arcLabel", js.Any.fromFunction1(value))
    
    inline def arcLabelsComponent(value: /* props */ ArcLabelProps[ComputedDatum[RawDatum]] => Element): this.type = set("arcLabelsComponent", js.Any.fromFunction1(value))
    
    inline def arcLabelsRadiusOffset(value: Double): this.type = set("arcLabelsRadiusOffset", value.asInstanceOf[js.Any])
    
    inline def arcLabelsSkipAngle(value: Double): this.type = set("arcLabelsSkipAngle", value.asInstanceOf[js.Any])
    
    inline def arcLabelsTextColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): this.type = set("arcLabelsTextColor", value.asInstanceOf[js.Any])
    
    inline def arcLinkLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): this.type = set("arcLinkLabel", value.asInstanceOf[js.Any])
    
    inline def arcLinkLabelFunction1(value: ComputedDatum[RawDatum] => String): this.type = set("arcLinkLabel", js.Any.fromFunction1(value))
    
    inline def arcLinkLabelsColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): this.type = set("arcLinkLabelsColor", value.asInstanceOf[js.Any])
    
    inline def arcLinkLabelsDiagonalLength(value: Double): this.type = set("arcLinkLabelsDiagonalLength", value.asInstanceOf[js.Any])
    
    inline def arcLinkLabelsOffset(value: Double): this.type = set("arcLinkLabelsOffset", value.asInstanceOf[js.Any])
    
    inline def arcLinkLabelsSkipAngle(value: Double): this.type = set("arcLinkLabelsSkipAngle", value.asInstanceOf[js.Any])
    
    inline def arcLinkLabelsStraightLength(value: Double): this.type = set("arcLinkLabelsStraightLength", value.asInstanceOf[js.Any])
    
    inline def arcLinkLabelsTextColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): this.type = set("arcLinkLabelsTextColor", value.asInstanceOf[js.Any])
    
    inline def arcLinkLabelsTextOffset(value: Double): this.type = set("arcLinkLabelsTextOffset", value.asInstanceOf[js.Any])
    
    inline def arcLinkLabelsThickness(value: Double): this.type = set("arcLinkLabelsThickness", value.asInstanceOf[js.Any])
    
    inline def borderColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    inline def borderWidth(value: Double): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    inline def colors(value: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill | arc]]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsFunction1(value: Omit[ComputedDatum[RawDatum], color | fill | arc] => String): this.type = set("colors", js.Any.fromFunction1(value))
    
    inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
    
    inline def component(value: /* props */ ArcLinkLabelProps[ComputedDatum[RawDatum]] => Element): this.type = set("component", js.Any.fromFunction1(value))
    
    inline def cornerRadius(value: Double): this.type = set("cornerRadius", value.asInstanceOf[js.Any])
    
    inline def enableArcLabels(value: Boolean): this.type = set("enableArcLabels", value.asInstanceOf[js.Any])
    
    inline def enableArcLinkLabels(value: Boolean): this.type = set("enableArcLinkLabels", value.asInstanceOf[js.Any])
    
    inline def endAngle(value: Double): this.type = set("endAngle", value.asInstanceOf[js.Any])
    
    inline def fit(value: Boolean): this.type = set("fit", value.asInstanceOf[js.Any])
    
    inline def id(value: PropertyAccessor[RawDatum, DatumId]): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def idFunction1(value: RawDatum => DatumId): this.type = set("id", js.Any.fromFunction1(value))
    
    inline def innerRadius(value: Double): this.type = set("innerRadius", value.asInstanceOf[js.Any])
    
    inline def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    inline def legends(value: js.Array[LegendProps]): this.type = set("legends", value.asInstanceOf[js.Any])
    
    inline def legendsVarargs(value: LegendProps*): this.type = set("legends", js.Array(value*))
    
    inline def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def onClick(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[HTMLCanvasElement & org.scalajs.dom.Element]) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement & org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseMove(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[HTMLCanvasElement & org.scalajs.dom.Element]) => Callback
    ): this.type = set("onMouseMove", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[HTMLCanvasElement & org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
    
    inline def padAngle(value: Double): this.type = set("padAngle", value.asInstanceOf[js.Any])
    
    inline def pixelRatio(value: Double): this.type = set("pixelRatio", value.asInstanceOf[js.Any])
    
    inline def renderWrapper(value: Boolean): this.type = set("renderWrapper", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def sortByValue(value: Boolean): this.type = set("sortByValue", value.asInstanceOf[js.Any])
    
    inline def startAngle(value: Double): this.type = set("startAngle", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: FC[PieTooltipProps[RawDatum]]): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def value(value: PropertyAccessor[RawDatum, Double]): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueFormat(value: ValueFormat[Double, Unit]): this.type = set("valueFormat", value.asInstanceOf[js.Any])
    
    inline def valueFunction1(value: RawDatum => Double): this.type = set("value", js.Any.fromFunction1(value))
  }
  
  def withProps[RawDatum](p: PieCanvasProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
