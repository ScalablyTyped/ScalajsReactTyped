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
import typingsJapgolly.nivoSunburst.distTypesTypesMod.ComputedDatum
import typingsJapgolly.nivoSunburst.distTypesTypesMod.DatumId
import typingsJapgolly.nivoSunburst.distTypesTypesMod.SunburstLayer
import typingsJapgolly.nivoSunburst.distTypesTypesMod.SunburstSvgProps
import typingsJapgolly.nivoSunburst.nivoSunburstStrings.color
import typingsJapgolly.nivoSunburst.nivoSunburstStrings.depth
import typingsJapgolly.nivoSunburst.nivoSunburstStrings.fill
import typingsJapgolly.nivoSunburst.nivoSunburstStrings.id
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sunburst {
  
  inline def apply[RawDatum](
    animate: Boolean,
    arcLabel: PropertyAccessor[ComputedDatum[RawDatum], String],
    arcLabelsComponent: /* props */ ArcLabelProps[ComputedDatum[RawDatum]] => Element,
    arcLabelsRadiusOffset: Double,
    arcLabelsSkipAngle: Double,
    arcLabelsTextColor: InheritedColorConfig[ComputedDatum[RawDatum]],
    borderColor: InheritedColorConfig[ComputedDatum[RawDatum]],
    borderWidth: Double,
    childColor: InheritedColorConfig[ComputedDatum[RawDatum]],
    colorBy: id | depth,
    colors: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]],
    cornerRadius: Double,
    data: RawDatum,
    enableArcLabels: Boolean,
    height: Double,
    id: PropertyAccessor[RawDatum, DatumId],
    inheritColorFromParent: Boolean,
    isInteractive: Boolean,
    layers: js.Array[SunburstLayer[RawDatum]],
    renderWrapper: Boolean,
    role: String,
    theme: Theme,
    tooltip: ComputedDatum[RawDatum] => Element,
    transitionMode: ArcTransitionMode,
    value: PropertyAccessor[RawDatum, Double],
    width: Double
  ): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], arcLabel = arcLabel.asInstanceOf[js.Any], arcLabelsComponent = js.Any.fromFunction1(arcLabelsComponent), arcLabelsRadiusOffset = arcLabelsRadiusOffset.asInstanceOf[js.Any], arcLabelsSkipAngle = arcLabelsSkipAngle.asInstanceOf[js.Any], arcLabelsTextColor = arcLabelsTextColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], childColor = childColor.asInstanceOf[js.Any], colorBy = colorBy.asInstanceOf[js.Any], colors = colors.asInstanceOf[js.Any], cornerRadius = cornerRadius.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], enableArcLabels = enableArcLabels.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inheritColorFromParent = inheritColorFromParent.asInstanceOf[js.Any], isInteractive = isInteractive.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], renderWrapper = renderWrapper.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], tooltip = js.Any.fromFunction1(tooltip), transitionMode = transitionMode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[SunburstSvgProps[RawDatum]]))
  }
  
  @JSImport("@nivo/sunburst", "Sunburst")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def defs(value: js.Array[Dictkey]): this.type = set("defs", value.asInstanceOf[js.Any])
    
    inline def defsVarargs(value: Dictkey*): this.type = set("defs", js.Array(value*))
    
    inline def fill(value: js.Array[Id[RawDatum]]): this.type = set("fill", value.asInstanceOf[js.Any])
    
    inline def fillVarargs(value: Id[RawDatum]*): this.type = set("fill", js.Array(value*))
    
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
    
    inline def valueFormat(value: ValueFormat[Double, Unit]): this.type = set("valueFormat", value.asInstanceOf[js.Any])
  }
  
  def withProps[RawDatum](p: SunburstSvgProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
