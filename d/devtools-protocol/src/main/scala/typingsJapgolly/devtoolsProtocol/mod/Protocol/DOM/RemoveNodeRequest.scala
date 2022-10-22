package typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveNodeRequest extends StObject {
  
  /**
    * Id of the node to remove.
    */
  var nodeId: NodeId
}
object RemoveNodeRequest {
  
  inline def apply(nodeId: NodeId): RemoveNodeRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveNodeRequest]
  }
  
  extension [Self <: RemoveNodeRequest](x: Self) {
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
