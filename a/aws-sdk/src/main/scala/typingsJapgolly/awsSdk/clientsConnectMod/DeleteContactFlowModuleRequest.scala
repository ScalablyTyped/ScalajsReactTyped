package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteContactFlowModuleRequest extends StObject {
  
  /**
    * The identifier of the flow module.
    */
  var ContactFlowModuleId: typingsJapgolly.awsSdk.clientsConnectMod.ContactFlowModuleId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
}
object DeleteContactFlowModuleRequest {
  
  inline def apply(ContactFlowModuleId: ContactFlowModuleId, InstanceId: InstanceId): DeleteContactFlowModuleRequest = {
    val __obj = js.Dynamic.literal(ContactFlowModuleId = ContactFlowModuleId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteContactFlowModuleRequest]
  }
  
  extension [Self <: DeleteContactFlowModuleRequest](x: Self) {
    
    inline def setContactFlowModuleId(value: ContactFlowModuleId): Self = StObject.set(x, "ContactFlowModuleId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
