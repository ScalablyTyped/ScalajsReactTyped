package typingsJapgolly.nivoSankey.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoSankey.distTypesSankeyLabelsMod.SankeyLabelsProps
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultLink
import typingsJapgolly.nivoSankey.distTypesTypesMod.DefaultNode
import typingsJapgolly.nivoSankey.distTypesTypesMod.SankeyNodeDatum
import typingsJapgolly.nivoSankey.nivoSankeyStrings.horizontal
import typingsJapgolly.nivoSankey.nivoSankeyStrings.inside
import typingsJapgolly.nivoSankey.nivoSankeyStrings.outside
import typingsJapgolly.nivoSankey.nivoSankeyStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SankeyLabels {
  
  inline def apply[N /* <: DefaultNode */, L /* <: DefaultLink */](
    getLabelTextColor: SankeyNodeDatum[N, L] => String,
    height: Double,
    labelOrientation: horizontal | vertical,
    labelPadding: Double,
    labelPosition: inside | outside,
    layout: horizontal | vertical,
    nodes: js.Array[SankeyNodeDatum[N, L]],
    width: Double
  ): Builder[N, L] = {
    val __props = js.Dynamic.literal(getLabelTextColor = js.Any.fromFunction1(getLabelTextColor), height = height.asInstanceOf[js.Any], labelOrientation = labelOrientation.asInstanceOf[js.Any], labelPadding = labelPadding.asInstanceOf[js.Any], labelPosition = labelPosition.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Builder[N, L](js.Array(this.component, __props.asInstanceOf[SankeyLabelsProps[N, L]]))
  }
  
  @JSImport("@nivo/sankey/dist/types/SankeyLabels", "SankeyLabels")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[N /* <: DefaultNode */, L /* <: DefaultLink */] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object]
  
  def withProps[N /* <: DefaultNode */, L /* <: DefaultLink */](p: SankeyLabelsProps[N, L]): Builder[N, L] = new Builder[N, L](js.Array(this.component, p.asInstanceOf[js.Any]))
}
