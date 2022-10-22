package typingsJapgolly.nivoCirclePacking.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoCirclePacking.distTypesLabelsMod.CirclesProps
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.ComputedDatum
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.ComputedLabel
import typingsJapgolly.nivoCirclePacking.distTypesTypesMod.LabelProps
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Labels {
  
  inline def apply[RawDatum](
    component: /* props */ LabelProps[RawDatum] => Element,
    label: PropertyAccessor[ComputedDatum[RawDatum], String],
    nodes: js.Array[ComputedDatum[RawDatum]],
    skipRadius: Double,
    textColor: InheritedColorConfig[ComputedDatum[RawDatum]]
  ): Builder[RawDatum] = {
    val __props = js.Dynamic.literal(component = js.Any.fromFunction1(component), label = label.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], skipRadius = skipRadius.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any])
    new Builder[RawDatum](js.Array(this.component, __props.asInstanceOf[CirclesProps[RawDatum]]))
  }
  
  @JSImport("@nivo/circle-packing/dist/types/Labels", "Labels")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[RawDatum] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def filter(value: /* label */ ComputedLabel[RawDatum] => Boolean): this.type = set("filter", js.Any.fromFunction1(value))
  }
  
  def withProps[RawDatum](p: CirclesProps[RawDatum]): Builder[RawDatum] = new Builder[RawDatum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
