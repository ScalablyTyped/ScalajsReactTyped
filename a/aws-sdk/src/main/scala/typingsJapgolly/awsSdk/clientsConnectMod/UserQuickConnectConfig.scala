package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserQuickConnectConfig extends StObject {
  
  /**
    * The identifier of the flow.
    */
  var ContactFlowId: typingsJapgolly.awsSdk.clientsConnectMod.ContactFlowId
  
  /**
    * The identifier of the user.
    */
  var UserId: typingsJapgolly.awsSdk.clientsConnectMod.UserId
}
object UserQuickConnectConfig {
  
  inline def apply(ContactFlowId: ContactFlowId, UserId: UserId): UserQuickConnectConfig = {
    val __obj = js.Dynamic.literal(ContactFlowId = ContactFlowId.asInstanceOf[js.Any], UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserQuickConnectConfig]
  }
  
  extension [Self <: UserQuickConnectConfig](x: Self) {
    
    inline def setContactFlowId(value: ContactFlowId): Self = StObject.set(x, "ContactFlowId", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
