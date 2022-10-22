package typingsJapgolly.awsSdk.clientsOpsworkscmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateNodeRequest extends StObject {
  
  /**
    * Engine attributes that are used for disassociating the node. No attributes are required for Puppet.   Attributes required in a DisassociateNode request for Chef     CHEF_ORGANIZATION: The Chef organization with which the node was associated. By default only one organization named default can exist.   
    */
  var EngineAttributes: js.UndefOr[typingsJapgolly.awsSdk.clientsOpsworkscmMod.EngineAttributes] = js.undefined
  
  /**
    * The name of the client node. 
    */
  var NodeName: typingsJapgolly.awsSdk.clientsOpsworkscmMod.NodeName
  
  /**
    * The name of the server from which to disassociate the node. 
    */
  var ServerName: typingsJapgolly.awsSdk.clientsOpsworkscmMod.ServerName
}
object DisassociateNodeRequest {
  
  inline def apply(NodeName: NodeName, ServerName: ServerName): DisassociateNodeRequest = {
    val __obj = js.Dynamic.literal(NodeName = NodeName.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateNodeRequest]
  }
  
  extension [Self <: DisassociateNodeRequest](x: Self) {
    
    inline def setEngineAttributes(value: EngineAttributes): Self = StObject.set(x, "EngineAttributes", value.asInstanceOf[js.Any])
    
    inline def setEngineAttributesUndefined: Self = StObject.set(x, "EngineAttributes", js.undefined)
    
    inline def setEngineAttributesVarargs(value: EngineAttribute*): Self = StObject.set(x, "EngineAttributes", js.Array(value*))
    
    inline def setNodeName(value: NodeName): Self = StObject.set(x, "NodeName", value.asInstanceOf[js.Any])
    
    inline def setServerName(value: ServerName): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
  }
}
