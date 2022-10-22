package typingsJapgolly.contentstackUtils

import typingsJapgolly.contentstackUtils.distTypesGqlMod.AnyNode
import typingsJapgolly.contentstackUtils.distTypesModelsMetadataModelMod.Attributes
import typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNodesNodeMod {
  
  @JSImport("@contentstack/utils/dist/types/nodes/node", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Node
       with AnyNode
       with typingsJapgolly.contentstackUtils.distTypesJsonToHtmlMod.AnyNode {
    
    /* CompleteClass */
    var attrs: Attributes = js.native
    
    /* CompleteClass */
    var children: js.Array[typingsJapgolly.contentstackUtils.distTypesJsonToHtmlMod.AnyNode] = js.native
    
    /* CompleteClass */
    var `type`: NodeType = js.native
  }
  
  trait Node extends StObject {
    
    var attrs: Attributes
    
    var children: js.Array[typingsJapgolly.contentstackUtils.distTypesJsonToHtmlMod.AnyNode]
    
    var `type`: NodeType
  }
  object Node {
    
    inline def apply(
      attrs: Attributes,
      children: js.Array[typingsJapgolly.contentstackUtils.distTypesJsonToHtmlMod.AnyNode],
      `type`: NodeType
    ): Node = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setAttrs(value: Attributes): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[typingsJapgolly.contentstackUtils.distTypesJsonToHtmlMod.AnyNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: typingsJapgolly.contentstackUtils.distTypesJsonToHtmlMod.AnyNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
