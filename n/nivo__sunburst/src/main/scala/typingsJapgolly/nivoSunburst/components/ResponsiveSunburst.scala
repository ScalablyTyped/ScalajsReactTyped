package typingsJapgolly.nivoSunburst.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoArcs.distTypesArcLabelsArcLabelMod.ArcLabelProps
import typingsJapgolly.nivoArcs.distTypesArcTransitionModeMod.ArcTransitionMode
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typingsJapgolly.nivoCore.anon.Dictkey
import typingsJapgolly.nivoCore.anon.Id
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoCore.mod.ValueFormat
import typingsJapgolly.nivoSunburst.distTypesResponsiveSunburstMod.ResponsiveSunburstProps
import typingsJapgolly.nivoSunburst.distTypesTypesMod.ComputedDatum
import typingsJapgolly.nivoSunburst.distTypesTypesMod.DatumId
import typingsJapgolly.nivoSunburst.distTypesTypesMod.SunburstLayer
import typingsJapgolly.nivoSunburst.nivoSunburstStrings.color
import typingsJapgolly.nivoSunburst.nivoSunburstStrings.depth
import typingsJapgolly.nivoSunburst.nivoSunburstStrings.fill
import typingsJapgolly.nivoSunburst.nivoSunburstStrings.id
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResponsiveSunburst {
  
  inline def apply[RawDatum](data: RawDatum): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[ResponsiveSunburstProps[RawDatum]]))
  }
  
  @JSImport("@nivo/sunburst", "ResponsiveSunburst")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def arcLabel(value: PropertyAccessor[ComputedDatum[RawDatum], String]): this.type = set("arcLabel", value.asInstanceOf[js.Any])
    
    inline def arcLabelFunction1(value: ComputedDatum[RawDatum] => String): this.type = set("arcLabel", js.Any.fromFunction1(value))
    
    inline def arcLabelsComponent(value: /* props */ ArcLabelProps[ComputedDatum[RawDatum]] => Element): this.type = set("arcLabelsComponent", js.Any.fromFunction1(value))
    
    inline def arcLabelsRadiusOffset(value: Double): this.type = set("arcLabelsRadiusOffset", value.asInstanceOf[js.Any])
    
    inline def arcLabelsSkipAngle(value: Double): this.type = set("arcLabelsSkipAngle", value.asInstanceOf[js.Any])
    
    inline def arcLabelsTextColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): this.type = set("arcLabelsTextColor", value.asInstanceOf[js.Any])
    
    inline def borderColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    inline def borderWidth(value: Double): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    inline def childColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): this.type = set("childColor", value.asInstanceOf[js.Any])
    
    inline def colorBy(value: id | depth): this.type = set("colorBy", value.asInstanceOf[js.Any])
    
    inline def colors(value: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsFunction1(value: Omit[ComputedDatum[RawDatum], color | fill] => String): this.type = set("colors", js.Any.fromFunction1(value))
    
    inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
    
    inline def cornerRadius(value: Double): this.type = set("cornerRadius", value.asInstanceOf[js.Any])
    
    inline def defs(value: js.Array[Dictkey]): this.type = set("defs", value.asInstanceOf[js.Any])
    
    inline def defsVarargs(value: Dictkey*): this.type = set("defs", js.Array(value*))
    
    inline def enableArcLabels(value: Boolean): this.type = set("enableArcLabels", value.asInstanceOf[js.Any])
    
    inline def fill(value: js.Array[Id[RawDatum]]): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def fillVarargs(value: Id[RawDatum]*): this.type = set("fill", js.Array(value*))
    
    inline def id(value: PropertyAccessor[RawDatum, DatumId]): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def idFunction1(value: RawDatum => DatumId): this.type = set("id", js.Any.fromFunction1(value))
    
    inline def inheritColorFromParent(value: Boolean): this.type = set("inheritColorFromParent", value.asInstanceOf[js.Any])
    
    inline def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    inline def layers(value: js.Array[SunburstLayer[RawDatum]]): this.type = set("layers", value.asInstanceOf[js.Any])
    
    inline def layersVarargs(value: SunburstLayer[RawDatum]*): this.type = set("layers", js.Array(value*))
    
    inline def margin(value: Box): this.type = set("margin", value.asInstanceOf[js.Any])
    
    inline def motionConfig(
      value: String | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringConfig */ Any)
    ): this.type = set("motionConfig", value.asInstanceOf[js.Any])
    
    inline def onClick(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onClick", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseEnter(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onMouseEnter", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseLeave(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onMouseLeave", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
    
    inline def onMouseMove(
      value: (/* datum */ ComputedDatum[RawDatum], /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => Callback
    ): this.type = set("onMouseMove", js.Any.fromFunction2((t0: /* datum */ ComputedDatum[RawDatum], t1: /* event */ ReactMouseEventFrom[org.scalajs.dom.Element]) => (value(t0, t1)).runNow()))
    
    inline def renderWrapper(value: Boolean): this.type = set("renderWrapper", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: /* props */ ComputedDatum[RawDatum] => Element): this.type = set("tooltip", js.Any.fromFunction1(value))
    
    inline def transitionMode(value: ArcTransitionMode): this.type = set("transitionMode", value.asInstanceOf[js.Any])
    
    inline def value(value: PropertyAccessor[RawDatum, Double]): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueFormat(value: ValueFormat[Double, Unit]): this.type = set("valueFormat", value.asInstanceOf[js.Any])
    
    inline def valueFunction1(value: RawDatum => Double): this.type = set("value", js.Any.fromFunction1(value))
  }
  
  def withProps[RawDatum](p: ResponsiveSunburstProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
