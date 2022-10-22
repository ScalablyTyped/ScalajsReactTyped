package typingsJapgolly.nivoChord.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoChord.anon.OmitArcDatumlabelcolor
import typingsJapgolly.nivoChord.anon.OmitChordCanvasPropswidth
import typingsJapgolly.nivoChord.distTypesTypesMod.ArcDatum
import typingsJapgolly.nivoChord.distTypesTypesMod.ArcTooltipComponent
import typingsJapgolly.nivoChord.distTypesTypesMod.CustomCanvasLayer
import typingsJapgolly.nivoChord.distTypesTypesMod.LayerId
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.CssMixBlendMode
import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoCore.mod.ValueFormat
import typingsJapgolly.nivoLegends.distTypesTypesMod.LegendProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResponsiveChordCanvas {
  
  inline def apply(data: js.Array[js.Array[Double]], keys: js.Array[String]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[OmitChordCanvasPropswidth]))
  }
  
  @JSImport("@nivo/chord", "ResponsiveChordCanvas")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def activeArcOpacity(value: Double): this.type = set("activeArcOpacity", value.asInstanceOf[js.Any])
    
    inline def activeRibbonOpacity(value: Double): this.type = set("activeRibbonOpacity", value.asInstanceOf[js.Any])
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def arcBorderColor(value: InheritedColorConfig[ArcDatum]): this.type = set("arcBorderColor", value.asInstanceOf[js.Any])
    
    inline def arcBorderWidth(value: Double): this.type = set("arcBorderWidth", value.asInstanceOf[js.Any])
    
    inline def arcOpacity(value: Double): this.type = set("arcOpacity", value.asInstanceOf[js.Any])
    
    inline def arcTooltip(value: ArcTooltipComponent): this.type = set("arcTooltip", value.asInstanceOf[js.Any])
    
    inline def ariaDescribedBy(value: String): this.type = set("ariaDescribedBy", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def colors(value: OrdinalColorScaleConfig[OmitArcDatumlabelcolor]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsFunction1(value: OmitArcDatumlabelcolor => String): this.type = set("colors", js.Any.fromFunction1(value))
    
    inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
    
    inline def enableLabel(value: Boolean): this.type = set("enableLabel", value.asInstanceOf[js.Any])
    
    inline def inactiveArcOpacity(value: Double): this.type = set("inactiveArcOpacity", value.asInstanceOf[js.Any])
    
    inline def inactiveRibbonOpacity(value: Double): this.type = set("inactiveRibbonOpacity", value.asInstanceOf[js.Any])
    
    inline def innerRadiusOffset(value: Double): this.type = set("innerRadiusOffset", value.asInstanceOf[js.Any])
    
    inline def innerRadiusRatio(value: Double): this.type = set("innerRadiusRatio", value.asInstanceOf[js.Any])
    
    inline def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    inline def label(value: PropertyAccessor[OmitArcDatumlabelcolor, String]): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelFunction1(value: OmitArcDatumlabelcolor => String): this.type = set("label", js.Any.fromFunction1(value))
    
    inline def labelOffset(value: Double): this.type = set("labelOffset", value.asInstanceOf[js.Any])
    
    inline def labelRotation(value: Double): this.type = set("labelRotation", value.asInstanceOf[js.Any])
    
    inline def labelTextColor(value: InheritedColorConfig[ArcDatum]): this.type = set("labelTextColor", value.asInstanceOf[js.Any])
    
    inline def layers(value: js.Array[LayerId | CustomCanvasLayer]): this.type = set("layers", value.asInstanceOf[js.Any])
    
    inline def layersVarargs(value: (LayerId | CustomCanvasLayer)*): this.type = set("layers", js.Array(value*))
    
    inline def legends(value: js.Array[LegendProps]): this.type = set("legends", value.asInstanceOf[js.Any])
    
    inline def legendsVarargs(value: LegendProps*): this.type = set("legends", js.Array(value*))
    
    inline def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def motionConfig(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): this.type = set("motionConfig", value.asInstanceOf[js.Any])
    
    inline def onArcClick(value: (/* arc */ Any, /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onArcClick", js.Any.fromFunction2((t0: /* arc */ Any, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onArcMouseEnter(value: (/* arc */ Any, /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onArcMouseEnter", js.Any.fromFunction2((t0: /* arc */ Any, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onArcMouseLeave(value: (/* arc */ Any, /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onArcMouseLeave", js.Any.fromFunction2((t0: /* arc */ Any, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def onArcMouseMove(value: (/* arc */ Any, /* event */ ReactMouseEventFrom[Element]) => Callback): this.type = set("onArcMouseMove", js.Any.fromFunction2((t0: /* arc */ Any, t1: /* event */ ReactMouseEventFrom[Element]) => (value(t0, t1)).runNow()))
    
    inline def padAngle(value: Double): this.type = set("padAngle", value.asInstanceOf[js.Any])
    
    inline def pixelRatio(value: Double): this.type = set("pixelRatio", value.asInstanceOf[js.Any])
    
    inline def renderWrapper(value: Boolean): this.type = set("renderWrapper", value.asInstanceOf[js.Any])
    
    inline def ribbonBlendMode(value: CssMixBlendMode): this.type = set("ribbonBlendMode", value.asInstanceOf[js.Any])
    
    inline def ribbonBorderColor(value: InheritedColorConfig[ArcDatum]): this.type = set("ribbonBorderColor", value.asInstanceOf[js.Any])
    
    inline def ribbonBorderWidth(value: Double): this.type = set("ribbonBorderWidth", value.asInstanceOf[js.Any])
    
    inline def ribbonOpacity(value: Double): this.type = set("ribbonOpacity", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def valueFormat(value: ValueFormat[Double, Unit]): this.type = set("valueFormat", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OmitChordCanvasPropswidth): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
