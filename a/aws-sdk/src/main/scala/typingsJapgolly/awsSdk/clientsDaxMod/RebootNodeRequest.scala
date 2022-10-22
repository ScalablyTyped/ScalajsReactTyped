package typingsJapgolly.awsSdk.clientsDaxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RebootNodeRequest extends StObject {
  
  /**
    * The name of the DAX cluster containing the node to be rebooted.
    */
  var ClusterName: String
  
  /**
    * The system-assigned ID of the node to be rebooted.
    */
  var NodeId: String
}
object RebootNodeRequest {
  
  inline def apply(ClusterName: String, NodeId: String): RebootNodeRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any], NodeId = NodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RebootNodeRequest]
  }
  
  extension [Self <: RebootNodeRequest](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    inline def setNodeId(value: String): Self = StObject.set(x, "NodeId", value.asInstanceOf[js.Any])
  }
}
