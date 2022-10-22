package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContactFlowRequest extends StObject {
  
  /**
    * The identifier of the flow.
    */
  var ContactFlowId: typingsJapgolly.awsSdk.clientsConnectMod.ContactFlowId
  
  /**
    * The identifier of the Amazon Connect instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
}
object DescribeContactFlowRequest {
  
  inline def apply(ContactFlowId: ContactFlowId, InstanceId: InstanceId): DescribeContactFlowRequest = {
    val __obj = js.Dynamic.literal(ContactFlowId = ContactFlowId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeContactFlowRequest]
  }
  
  extension [Self <: DescribeContactFlowRequest](x: Self) {
    
    inline def setContactFlowId(value: ContactFlowId): Self = StObject.set(x, "ContactFlowId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
  }
}
