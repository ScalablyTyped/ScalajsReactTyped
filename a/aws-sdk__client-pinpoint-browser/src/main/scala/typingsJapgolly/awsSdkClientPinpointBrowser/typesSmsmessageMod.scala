package typingsJapgolly.awsSdkClientPinpointBrowser

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PROMOTIONAL
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.TRANSACTIONAL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSmsmessageMod {
  
  trait SMSMessage extends StObject {
    
    /**
      * The body of the SMS message.
      */
    var Body: js.UndefOr[String] = js.undefined
    
    /**
      * The SMS program name that you provided to AWS Support when you requested your dedicated number.
      */
    var Keyword: js.UndefOr[String] = js.undefined
    
    /**
      * Is this a transaction priority message or lower priority.
      */
    var MessageType: js.UndefOr[TRANSACTIONAL | PROMOTIONAL | String] = js.undefined
    
    /**
      * The phone number that the SMS message originates from. Specify one of the dedicated long codes or short codes that you requested from AWS Support and that is assigned to your account. If this attribute is not specified, Amazon Pinpoint randomly assigns a long code.
      */
    var OriginationNumber: js.UndefOr[String] = js.undefined
    
    /**
      * The sender ID that is shown as the message sender on the recipient's device. Support for sender IDs varies by country or region.
      */
    var SenderId: js.UndefOr[String] = js.undefined
    
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    var Substitutions: js.UndefOr[
        (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]])
      ] = js.undefined
  }
  object SMSMessage {
    
    inline def apply(): SMSMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SMSMessage]
    }
    
    extension [Self <: SMSMessage](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      inline def setKeyword(value: String): Self = StObject.set(x, "Keyword", value.asInstanceOf[js.Any])
      
      inline def setKeywordUndefined: Self = StObject.set(x, "Keyword", js.undefined)
      
      inline def setMessageType(value: TRANSACTIONAL | PROMOTIONAL | String): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
      
      inline def setMessageTypeUndefined: Self = StObject.set(x, "MessageType", js.undefined)
      
      inline def setOriginationNumber(value: String): Self = StObject.set(x, "OriginationNumber", value.asInstanceOf[js.Any])
      
      inline def setOriginationNumberUndefined: Self = StObject.set(x, "OriginationNumber", js.undefined)
      
      inline def setSenderId(value: String): Self = StObject.set(x, "SenderId", value.asInstanceOf[js.Any])
      
      inline def setSenderIdUndefined: Self = StObject.set(x, "SenderId", js.undefined)
      
      inline def setSubstitutions(
        value: (StringDictionary[js.Array[String] | js.Iterable[String]]) | (js.Iterable[js.Tuple2[String, js.Array[String] | js.Iterable[String]]])
      ): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      inline def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
    }
  }
  
  trait UnmarshalledSMSMessage
    extends StObject
       with SMSMessage {
    
    /**
      * Default message substitutions. Can be overridden by individual address substitutions.
      */
    @JSName("Substitutions")
    var Substitutions_UnmarshalledSMSMessage: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  }
  object UnmarshalledSMSMessage {
    
    inline def apply(): UnmarshalledSMSMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledSMSMessage]
    }
    
    extension [Self <: UnmarshalledSMSMessage](x: Self) {
      
      inline def setSubstitutions(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "Substitutions", value.asInstanceOf[js.Any])
      
      inline def setSubstitutionsUndefined: Self = StObject.set(x, "Substitutions", js.undefined)
    }
  }
}
