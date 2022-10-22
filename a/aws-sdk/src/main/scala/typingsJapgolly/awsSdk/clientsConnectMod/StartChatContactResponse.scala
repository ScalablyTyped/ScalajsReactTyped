package typingsJapgolly.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartChatContactResponse extends StObject {
  
  /**
    * The identifier of this contact within the Amazon Connect instance. 
    */
  var ContactId: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.ContactId] = js.undefined
  
  /**
    * The identifier for a chat participant. The participantId for a chat participant is the same throughout the chat lifecycle.
    */
  var ParticipantId: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.ParticipantId] = js.undefined
  
  /**
    * The token used by the chat participant to call CreateParticipantConnection. The participant token is valid for the lifetime of a chat participant.
    */
  var ParticipantToken: js.UndefOr[typingsJapgolly.awsSdk.clientsConnectMod.ParticipantToken] = js.undefined
}
object StartChatContactResponse {
  
  inline def apply(): StartChatContactResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartChatContactResponse]
  }
  
  extension [Self <: StartChatContactResponse](x: Self) {
    
    inline def setContactId(value: ContactId): Self = StObject.set(x, "ContactId", value.asInstanceOf[js.Any])
    
    inline def setContactIdUndefined: Self = StObject.set(x, "ContactId", js.undefined)
    
    inline def setParticipantId(value: ParticipantId): Self = StObject.set(x, "ParticipantId", value.asInstanceOf[js.Any])
    
    inline def setParticipantIdUndefined: Self = StObject.set(x, "ParticipantId", js.undefined)
    
    inline def setParticipantToken(value: ParticipantToken): Self = StObject.set(x, "ParticipantToken", value.asInstanceOf[js.Any])
    
    inline def setParticipantTokenUndefined: Self = StObject.set(x, "ParticipantToken", js.undefined)
  }
}
