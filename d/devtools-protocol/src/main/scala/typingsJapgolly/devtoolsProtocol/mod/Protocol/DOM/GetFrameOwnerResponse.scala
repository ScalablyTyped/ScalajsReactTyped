package typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFrameOwnerResponse extends StObject {
  
  /**
    * Resulting node.
    */
  var backendNodeId: BackendNodeId
  
  /**
    * Id of the node at given coordinates, only when enabled and requested document.
    */
  var nodeId: js.UndefOr[NodeId] = js.undefined
}
object GetFrameOwnerResponse {
  
  inline def apply(backendNodeId: BackendNodeId): GetFrameOwnerResponse = {
    val __obj = js.Dynamic.literal(backendNodeId = backendNodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFrameOwnerResponse]
  }
  
  extension [Self <: GetFrameOwnerResponse](x: Self) {
    
    inline def setBackendNodeId(value: BackendNodeId): Self = StObject.set(x, "backendNodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
    
    inline def setNodeIdUndefined: Self = StObject.set(x, "nodeId", js.undefined)
  }
}
