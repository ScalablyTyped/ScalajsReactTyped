package typingsJapgolly.nivoArcs.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoArcs.distTypesArcLabelsArcLabelMod.ArcLabelProps
import typingsJapgolly.nivoArcs.distTypesArcLabelsArcLabelsLayerMod.ArcLabelsLayerProps
import typingsJapgolly.nivoArcs.distTypesArcTransitionModeMod.ArcTransitionMode
import typingsJapgolly.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArcLabelsLayer {
  
  inline def apply[Datum /* <: DatumWithArcAndColor */](
    center: js.Tuple2[Double, Double],
    data: js.Array[Datum],
    label: PropertyAccessor[Datum, String],
    radiusOffset: Double,
    skipAngle: Double,
    textColor: InheritedColorConfig[Datum],
    transitionMode: ArcTransitionMode
  ): Builder[Datum] = {
    val __props = js.Dynamic.literal(center = center.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], radiusOffset = radiusOffset.asInstanceOf[js.Any], skipAngle = skipAngle.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], transitionMode = transitionMode.asInstanceOf[js.Any])
    new Builder[Datum](js.Array(this.component, __props.asInstanceOf[ArcLabelsLayerProps[Datum]]))
  }
  
  @JSImport("@nivo/arcs", "ArcLabelsLayer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Datum /* <: DatumWithArcAndColor */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def component(value: /* props */ ArcLabelProps[Datum] => Element): this.type = set("component", js.Any.fromFunction1(value))
  }
  
  def withProps[Datum /* <: DatumWithArcAndColor */](p: ArcLabelsLayerProps[Datum]): Builder[Datum] = new Builder[Datum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
