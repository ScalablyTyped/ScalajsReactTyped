package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateUserPhoneConfigRequest extends StObject {
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var InstanceId: typingsJapgolly.awsSdk.clientsConnectMod.InstanceId
  
  /**
    * Information about phone configuration settings for the user.
    */
  var PhoneConfig: UserPhoneConfig
  
  /**
    * The identifier of the user account.
    */
  var UserId: typingsJapgolly.awsSdk.clientsConnectMod.UserId
}
object UpdateUserPhoneConfigRequest {
  
  inline def apply(InstanceId: InstanceId, PhoneConfig: UserPhoneConfig, UserId: UserId): UpdateUserPhoneConfigRequest = {
    val __obj = js.Dynamic.literal(InstanceId = InstanceId.asInstanceOf[js.Any], PhoneConfig = PhoneConfig.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserPhoneConfigRequest]
  }
  
  extension [Self <: UpdateUserPhoneConfigRequest](x: Self) {
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setPhoneConfig(value: UserPhoneConfig): Self = StObject.set(x, "PhoneConfig", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
