package typingsJapgolly.awsSdk.clientsPinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendVoiceMessageRequest extends StObject {
  
  /**
    * The phone number that appears on recipients' devices when they receive the message.
    */
  var CallerId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the configuration set that you want to use to send the message.
    */
  var ConfigurationSetName: js.UndefOr[WordCharactersWithDelimiters] = js.undefined
  
  var Content: js.UndefOr[VoiceMessageContent] = js.undefined
  
  /**
    * The phone number that you want to send the voice message to.
    */
  var DestinationPhoneNumber: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The phone number that Amazon Pinpoint should use to send the voice message. This isn't necessarily the phone number that appears on recipients' devices when they receive the message, because you can specify a CallerId parameter in the request.
    */
  var OriginationPhoneNumber: js.UndefOr[NonEmptyString] = js.undefined
}
object SendVoiceMessageRequest {
  
  inline def apply(): SendVoiceMessageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SendVoiceMessageRequest]
  }
  
  extension [Self <: SendVoiceMessageRequest](x: Self) {
    
    inline def setCallerId(value: String): Self = StObject.set(x, "CallerId", value.asInstanceOf[js.Any])
    
    inline def setCallerIdUndefined: Self = StObject.set(x, "CallerId", js.undefined)
    
    inline def setConfigurationSetName(value: WordCharactersWithDelimiters): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    inline def setContent(value: VoiceMessageContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setDestinationPhoneNumber(value: NonEmptyString): Self = StObject.set(x, "DestinationPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setDestinationPhoneNumberUndefined: Self = StObject.set(x, "DestinationPhoneNumber", js.undefined)
    
    inline def setOriginationPhoneNumber(value: NonEmptyString): Self = StObject.set(x, "OriginationPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setOriginationPhoneNumberUndefined: Self = StObject.set(x, "OriginationPhoneNumber", js.undefined)
  }
}
