package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartOutboundVoiceContactResponse extends StObject {
  
  /**
    * The identifier of this contact within the Amazon Connect instance.
    */
  var ContactId: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.ContactId] = js.undefined
}
object StartOutboundVoiceContactResponse {
  
  inline def apply(): StartOutboundVoiceContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartOutboundVoiceContactResponse]
  }
  
  extension [Self <: StartOutboundVoiceContactResponse](x: Self) {
    
    inline def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setContactIdUndefined: Self = StObject.set(x, "ContactId", js.undefined)
  }
}
