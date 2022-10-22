package typingsJapgolly.devtoolsProtocol.mod.Protocol.CSS

import typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM.NodeId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInlineStylesForNodeRequest extends StObject {
  
  var nodeId: NodeId
}
object GetInlineStylesForNodeRequest {
  
  inline def apply(nodeId: NodeId): GetInlineStylesForNodeRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInlineStylesForNodeRequest]
  }
  
  extension [Self <: GetInlineStylesForNodeRequest](x: Self) {
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
