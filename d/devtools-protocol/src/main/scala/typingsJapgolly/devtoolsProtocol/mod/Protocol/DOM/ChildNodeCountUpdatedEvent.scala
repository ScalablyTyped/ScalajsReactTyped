package typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM

import typingsJapgolly.devtoolsProtocol.mod.Protocol.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildNodeCountUpdatedEvent extends StObject {
  
  /**
    * New node count.
    */
  var childNodeCount: integer
  
  /**
    * Id of the node that has changed.
    */
  var nodeId: NodeId
}
object ChildNodeCountUpdatedEvent {
  
  inline def apply(childNodeCount: integer, nodeId: NodeId): ChildNodeCountUpdatedEvent = {
    val __obj = js.Dynamic.literal(childNodeCount = childNodeCount.asInstanceOf[js.Any], nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildNodeCountUpdatedEvent]
  }
  
  extension [Self <: ChildNodeCountUpdatedEvent](x: Self) {
    
    inline def setChildNodeCount(value: integer): Self = StObject.set(x, "childNodeCount", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: NodeId): Self = StObject.set(x, "nodeId", value.asInstanceOf[js.Any])
  }
}
