package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JourneySMSMessage extends StObject {
  
  /**
    * The entity ID or Principal Entity (PE) id received from the regulatory body for sending SMS in your country.
    */
  var EntityId: js.UndefOr[string] = js.undefined
  
  /**
    * The SMS message type. Valid values are TRANSACTIONAL (for messages that are critical or time-sensitive, such as a one-time passwords) and PROMOTIONAL (for messsages that aren't critical or time-sensitive, such as marketing messages).
    */
  var MessageType: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointMod.MessageType] = js.undefined
  
  /**
    * The long code to send the SMS message from. This value should be one of the dedicated long codes that's assigned to your AWS account. Although it isn't required, we recommend that you specify the long code using an E.164 format to ensure prompt and accurate delivery of the message. For example, +12065550100.
    */
  var OriginationNumber: js.UndefOr[string] = js.undefined
  
  /**
    * The sender ID to display as the sender of the message on a recipient's device. Support for sender IDs varies by country or region. For more information, see Supported Countries and Regions in the Amazon Pinpoint User Guide.
    */
  var SenderId: js.UndefOr[string] = js.undefined
  
  /**
    * The template ID received from the regulatory body for sending SMS in your country.
    */
  var TemplateId: js.UndefOr[string] = js.undefined
}
object JourneySMSMessage {
  
  inline def apply(): JourneySMSMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JourneySMSMessage]
  }
  
  extension [Self <: JourneySMSMessage](x: Self) {
    
    inline def setEntityId(value: string): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    inline def setEntityIdUndefined: Self = StObject.set(x, "EntityId", js.undefined)
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "MessageType", js.undefined)
    
    inline def setOriginationNumber(value: string): Self = StObject.set(x, "OriginationNumber", value.asInstanceOf[js.Any])
    
    inline def setOriginationNumberUndefined: Self = StObject.set(x, "OriginationNumber", js.undefined)
    
    inline def setSenderId(value: string): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
    
    inline def setSenderIdUndefined: Self = StObject.set(x, "SenderId", js.undefined)
    
    inline def setTemplateId(value: string): Self = StObject.set(x, "TemplateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "TemplateId", js.undefined)
  }
}
