package typingsJapgolly.nivoTreemap.components

import typingsJapgolly.nivoTreemap.distTypesTypesMod.ComputedNodeWithHandlers
import typingsJapgolly.nivoTreemap.distTypesTypesMod.NodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TreeMapNode {
  
  inline def apply[Datum /* <: js.Object */](
    animatedProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<NodeAnimatedProps> */ Any,
    borderWidth: Double,
    enableLabel: Boolean,
    enableParentLabel: Boolean,
    labelSkipSize: Double,
    node: ComputedNodeWithHandlers[Datum]
  ): SharedBuilder_NodeProps1894763695[Datum] = {
    val __props = js.Dynamic.literal(animatedProps = animatedProps.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], enableLabel = enableLabel.asInstanceOf[js.Any], enableParentLabel = enableParentLabel.asInstanceOf[js.Any], labelSkipSize = labelSkipSize.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    new SharedBuilder_NodeProps1894763695[Datum](js.Array(this.component, __props.asInstanceOf[NodeProps[Datum]]))
  }
  
  @JSImport("@nivo/treemap/dist/types/TreeMapNode", "TreeMapNode")
  @js.native
  val component: js.Object = js.native
  
  def withProps[Datum /* <: js.Object */](p: NodeProps[Datum]): SharedBuilder_NodeProps1894763695[Datum] = new SharedBuilder_NodeProps1894763695[Datum](js.Array(this.component, p.asInstanceOf[js.Any]))
}
