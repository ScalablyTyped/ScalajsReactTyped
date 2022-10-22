package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContactFlowModuleRequest extends StObject {
  
  /**
    * The identifier of the flow module.
    */
  var ContactFlowModuleId: typingsJapgolly.awsSdk.clientsConnectMod.ContactFlowModuleId
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
}
object DescribeContactFlowModuleRequest {
  
  inline def apply(ContactFlowModuleId: ContactFlowModuleId, InstanceId: InstanceId): DescribeContactFlowModuleRequest = {
    val __obj = js.Dynamic.literal(ContactFlowModuleId = ContactFlowModuleId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContactFlowModuleRequest]
  }
  
  extension [Self <: DescribeContactFlowModuleRequest](x: Self) {
    
    inline def setContactFlowModuleId(value: ContactFlowModuleId): Self = StObject.set(x, "ContactFlowModuleId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
