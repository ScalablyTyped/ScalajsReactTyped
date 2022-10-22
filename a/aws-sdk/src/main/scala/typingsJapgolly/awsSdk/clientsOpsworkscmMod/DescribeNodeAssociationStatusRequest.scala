package typingsJapgolly.awsSdk.clientsOpsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNodeAssociationStatusRequest extends StObject {
  
  /**
    * The token returned in either the AssociateNodeResponse or the DisassociateNodeResponse. 
    */
  var NodeAssociationStatusToken: typingsJapgolly.awsSdk.clientsOpsworkscmMod.NodeAssociationStatusToken
  
  /**
    * The name of the server from which to disassociate the node. 
    */
  var ServerName: typingsJapgolly.awsSdk.clientsOpsworkscmMod.ServerName
}
object DescribeNodeAssociationStatusRequest {
  
  inline def apply(NodeAssociationStatusToken: NodeAssociationStatusToken, ServerName: ServerName): DescribeNodeAssociationStatusRequest = {
    val __obj = js.Dynamic.literal(NodeAssociationStatusToken = NodeAssociationStatusToken.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNodeAssociationStatusRequest]
  }
  
  extension [Self <: DescribeNodeAssociationStatusRequest](x: Self) {
    
    inline def setNodeAssociationStatusToken(value: NodeAssociationStatusToken): Self = StObject.set(x, "NodeAssociationStatusToken", value.asInstanceOf[js.Any])
    
    inline def setServerName(value: ServerName): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
  }
}
