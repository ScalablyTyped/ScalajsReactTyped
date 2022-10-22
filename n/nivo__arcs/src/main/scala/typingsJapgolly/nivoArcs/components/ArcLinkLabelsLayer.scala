package typingsJapgolly.nivoArcs.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsArcLinkLabelMod.ArcLinkLabelProps
import typingsJapgolly.nivoArcs.distTypesArcLinkLabelsArcLinkLabelsLayerMod.ArcLinkLabelsLayerProps
import typingsJapgolly.nivoArcs.distTypesTypesMod.DatumWithArcAndColor
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoCore.mod.PropertyAccessor
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ArcLinkLabelsLayer {
  
  inline def apply[Datum /* <: DatumWithArcAndColor */](
    center: js.Tuple2[Double, Double],
    data: js.Array[Datum],
    diagonalLength: Double,
    label: PropertyAccessor[Datum, String],
    linkColor: InheritedColorConfig[Datum],
    offset: Double,
    skipAngle: Double,
    straightLength: Double,
    strokeWidth: Double,
    textColor: InheritedColorConfig[Datum],
    textOffset: Double
  ): Builder[Datum] = {
    val __props = js.Dynamic.literal(center = center.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], diagonalLength = diagonalLength.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], linkColor = linkColor.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], skipAngle = skipAngle.asInstanceOf[js.Any], straightLength = straightLength.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], textColor = textColor.asInstanceOf[js.Any], textOffset = textOffset.asInstanceOf[js.Any])
    new Builder[Datum](js.Array(this.component, __props.asInstanceOf[ArcLinkLabelsLayerProps[Datum]]))
  }
  
  @JSImport("@nivo/arcs", "ArcLinkLabelsLayer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[Datum /* <: DatumWithArcAndColor */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def component(value: /* props */ ArcLinkLabelProps[Datum] => Element): this.type = set("component", js.Any.fromFunction1(value))
  }
  
  def withProps[Datum /* <: DatumWithArcAndColor */](p: ArcLinkLabelsLayerProps[Datum]): Builder[Datum] = new Builder[Datum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
