package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociatePhoneNumberContactFlowRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * A unique identifier for the phone number.
    */
  var PhoneNumberId: typingsJapgolly.awsSdk.clientsConnectMod.PhoneNumberId
}
object DisassociatePhoneNumberContactFlowRequest {
  
  inline def apply(InstanceId: InstanceId, PhoneNumberId: PhoneNumberId): DisassociatePhoneNumberContactFlowRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], PhoneNumberId = PhoneNumberId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociatePhoneNumberContactFlowRequest]
  }
  
  extension [Self <: DisassociatePhoneNumberContactFlowRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberId(value: PhoneNumberId): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
  }
}
