package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContactFlowMetadataRequest extends StObject {
  
  /**
    * The identifier of the flow.
    */
  var ContactFlowId: typingsJapgolly.awsSdk.clientsConnectMod.ContactFlowId
  
  /**
    * The state of flow.
    */
  var ContactFlowState: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.ContactFlowState] = js.undefined
  
  /**
    * The description of the flow.
    */
  var Description: js.UndefOr[ContactFlowDescription] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * The name of the flow.
    */
  var Name: js.UndefOr[ContactFlowName] = js.undefined
}
object UpdateContactFlowMetadataRequest {
  
  inline def apply(ContactFlowId: ContactFlowId, InstanceId: InstanceId): UpdateContactFlowMetadataRequest = {
    val __obj = js.Dynamic.literal(ContactFlowId = ContactFlowId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateContactFlowMetadataRequest]
  }
  
  extension [Self <: UpdateContactFlowMetadataRequest](x: Self) {
    
    inline def setContactFlowId(value: ContactFlowId): Self = StObject.set(x, "ContactFlowId", value.asInstanceOf[js.Any])
    
    inline def setContactFlowState(value: ContactFlowState): Self = StObject.set(x, "ContactFlowState", value.asInstanceOf[js.Any])
    
    inline def setContactFlowStateUndefined: Self = StObject.set(x, "ContactFlowState", js.undefined)
    
    inline def setDescription(value: ContactFlowDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setName(value: ContactFlowName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
