package typingsJapgolly.awsSdk.anon

import typingsJapgolly.awsSdk.clientsOpsworkscmMod.NodeAssociationStatusToken
import typingsJapgolly.awsSdk.clientsOpsworkscmMod.ServerName
import typingsJapgolly.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/opsworkscm.DescribeNodeAssociationStatusRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeNodeAssociationSt extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The token returned in either the AssociateNodeResponse or the DisassociateNodeResponse. 
    */
  var NodeAssociationStatusToken: typingsJapgolly.awsSdk.clientsOpsworkscmMod.NodeAssociationStatusToken
  
  /**
    * The name of the server from which to disassociate the node. 
    */
  var ServerName: typingsJapgolly.awsSdk.clientsOpsworkscmMod.ServerName
}
object DescribeNodeAssociationSt {
  
  inline def apply(NodeAssociationStatusToken: NodeAssociationStatusToken, ServerName: ServerName): DescribeNodeAssociationSt = {
    val __obj = js.Dynamic.literal(NodeAssociationStatusToken = NodeAssociationStatusToken.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNodeAssociationSt]
  }
  
  extension [Self <: DescribeNodeAssociationSt](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setNodeAssociationStatusToken(value: NodeAssociationStatusToken): Self = StObject.set(x, "NodeAssociationStatusToken", value.asInstanceOf[js.Any])
    
    inline def setServerName(value: ServerName): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
  }
}
