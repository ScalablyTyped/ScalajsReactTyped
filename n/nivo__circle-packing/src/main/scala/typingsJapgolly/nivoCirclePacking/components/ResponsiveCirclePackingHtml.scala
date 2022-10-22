package typingsJapgolly.nivoCirclePacking.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoCirclePacking.distTypesResponsiveCirclePackingHtmlMod.ResponsiveCirclePackingHtmlProps
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.CirclePackingLayer
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.CircleProps
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.ComputedDatum
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.ComputedLabel
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.LabelProps
import typingsJapgolly.nivoCirclePacking.nivoCirclePackingStrings.color
import typingsJapgolly.nivoCirclePacking.nivoCirclePackingStrings.depth
import typingsJapgolly.nivoCirclePacking.nivoCirclePackingStrings.fill
import typingsJapgolly.nivoCirclePacking.nivoCirclePackingStrings.id
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoColors.distTypesScalesOrdinalColorScaleMod.OrdinalColorScaleConfig
import typingsJapgolly.nivoCore.mod.Box
import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.nivoCore.mod.Theme
import typingsJapgolly.nivoCore.mod.ValueFormat
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResponsiveCirclePackingHtml {
  
  inline def apply[RawDatum](data: RawDatum): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[ResponsiveCirclePackingHtmlProps[RawDatum]]))
  }
  
  @JSImport("@nivo/circle-packing", "ResponsiveCirclePackingHtml")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animate(value: Boolean): this.type = set("animate", value.asInstanceOf[js.Any])
    
    inline def borderColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    inline def borderWidth(value: Double): this.type = set("borderWidth", value.asInstanceOf[js.Any])
    
    inline def childColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): this.type = set("childColor", value.asInstanceOf[js.Any])
    
    inline def circleComponent(value: /* props */ CircleProps[RawDatum] => Element): this.type = set("circleComponent", js.Any.fromFunction1(value))
    
    inline def colorBy(value: id | depth): this.type = set("colorBy", value.asInstanceOf[js.Any])
    
    inline def colors(value: OrdinalColorScaleConfig[Omit[ComputedDatum[RawDatum], color | fill]]): this.type = set("colors", value.asInstanceOf[js.Any])
    
    inline def colorsFunction1(value: Omit[ComputedDatum[RawDatum], color | fill] => String): this.type = set("colors", js.Any.fromFunction1(value))
    
    inline def colorsVarargs(value: String*): this.type = set("colors", js.Array(value*))
    
    inline def enableLabels(value: Boolean): this.type = set("enableLabels", value.asInstanceOf[js.Any])
    
    inline def id(value: PropertyAccessor[RawDatum, String]): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def idFunction1(value: RawDatum => String): this.type = set("id", js.Any.fromFunction1(value))
    
    inline def inheritColorFromParent(value: Boolean): this.type = set("inheritColorFromParent", value.asInstanceOf[js.Any])
    
    inline def isInteractive(value: Boolean): this.type = set("isInteractive", value.asInstanceOf[js.Any])
    
    inline def label(value: PropertyAccessor[ComputedDatum[RawDatum], String]): this.type = set("label", value.asInstanceOf[js.Any])
    
    inline def labelComponent(value: /* props */ LabelProps[RawDatum] => Element): this.type = set("labelComponent", js.Any.fromFunction1(value))
    
    inline def labelFunction1(value: ComputedDatum[RawDatum] => String): this.type = set("label", js.Any.fromFunction1(value))
    
    inline def labelTextColor(value: InheritedColorConfig[ComputedDatum[RawDatum]]): this.type = set("labelTextColor", value.asInstanceOf[js.Any])
    
    inline def labelsFilter(value: /* label */ ComputedLabel[RawDatum] => Boolean): this.type = set("labelsFilter", js.Any.fromFunction1(value))
    
    inline def labelsSkipRadius(value: Double): this.type = set("labelsSkipRadius", value.asInstanceOf[js.Any])
    
    inline def layers(value: js.Array[CirclePackingLayer[RawDatum]]): this.type = set("layers", value.asInstanceOf[js.Any])
    
    inline def layersVarargs(value: CirclePackingLayer[RawDatum]*): this.type = set("layers", js.Array(value*))
    
    inline def leavesOnly(value: Boolean): this.type = set("leavesOnly", value.asInstanceOf[js.Any])
    
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
    
    inline def padding(value: Double): this.type = set("padding", value.asInstanceOf[js.Any])
    
    inline def renderWrapper(value: Boolean): this.type = set("renderWrapper", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def theme(value: Theme): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: /* props */ ComputedDatum[RawDatum] => Element): this.type = set("tooltip", js.Any.fromFunction1(value))
    
    inline def value(value: PropertyAccessor[RawDatum, Double]): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueFormat(value: ValueFormat[Double, Unit]): this.type = set("valueFormat", value.asInstanceOf[js.Any])
    
    inline def valueFunction1(value: RawDatum => Double): this.type = set("value", js.Any.fromFunction1(value))
    
    inline def zoomedId(value: String): this.type = set("zoomedId", value.asInstanceOf[js.Any])
    
    inline def zoomedIdNull: this.type = set("zoomedId", null)
  }
  
  def withProps[RawDatum](p: ResponsiveCirclePackingHtmlProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
