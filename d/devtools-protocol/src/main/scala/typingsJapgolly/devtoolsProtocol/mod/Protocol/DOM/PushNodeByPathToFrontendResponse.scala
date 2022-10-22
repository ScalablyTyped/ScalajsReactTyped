package typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PushNodeByPathToFrontendResponse extends StObject {
  
  /**
    * Id of the node for given path.
    */
  var nodeId: NodeId
}
object PushNodeByPathToFrontendResponse {
  
  inline def apply(nodeId: NodeId): PushNodeByPathToFrontendResponse = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PushNodeByPathToFrontendResponse]
  }
  
  extension [Self <: PushNodeByPathToFrontendResponse](x: Self) {
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
