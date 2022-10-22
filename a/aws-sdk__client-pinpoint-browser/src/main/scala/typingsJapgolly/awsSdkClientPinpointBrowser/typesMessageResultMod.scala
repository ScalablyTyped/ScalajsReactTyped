package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.DUPLICATE
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.OPT_OUT
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PERMANENT_FAILURE
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.SUCCESSFUL
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.TEMPORARY_FAILURE
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.THROTTLED
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.UNKNOWN_FAILURE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMessageResultMod {
  
  trait MessageResult extends StObject {
    
    /**
      * The delivery status of the message. Possible values:
      *
      * SUCCESS - The message was successfully delivered to the endpoint.
      *
      * TRANSIENT_FAILURE - A temporary error occurred. Amazon Pinpoint will attempt to deliver the message again later.
      *
      * FAILURE_PERMANENT - An error occurred when delivering the message to the endpoint. Amazon Pinpoint won't attempt to send the message again.
      *
      * TIMEOUT - The message couldn't be sent within the timeout period.
      *
      * QUIET_TIME - The local time for the endpoint was within the Quiet Hours for the campaign.
      *
      * DAILY_CAP - The endpoint has received the maximum number of messages it can receive within a 24-hour period.
      *
      * HOLDOUT - The endpoint was in a hold out treatment for the campaign.
      *
      * THROTTLED - Amazon Pinpoint throttled sending to this endpoint.
      *
      * EXPIRED - The endpoint address is expired.
      *
      * CAMPAIGN_CAP - The endpoint received the maximum number of messages allowed by the campaign.
      *
      * SERVICE_FAILURE - A service-level failure prevented Amazon Pinpoint from delivering the message.
      *
      * UNKNOWN - An unknown error occurred.
      */
    var DeliveryStatus: js.UndefOr[
        SUCCESSFUL | THROTTLED | TEMPORARY_FAILURE | PERMANENT_FAILURE | UNKNOWN_FAILURE | OPT_OUT | DUPLICATE | String
      ] = js.undefined
    
    /**
      * Unique message identifier associated with the message that was sent.
      */
    var MessageId: js.UndefOr[String] = js.undefined
    
    /**
      * Downstream service status code.
      */
    var StatusCode: js.UndefOr[Double] = js.undefined
    
    /**
      * Status message for message delivery.
      */
    var StatusMessage: js.UndefOr[String] = js.undefined
    
    /**
      * If token was updated as part of delivery. (This is GCM Specific)
      */
    var UpdatedToken: js.UndefOr[String] = js.undefined
  }
  object MessageResult {
    
    inline def apply(): MessageResult = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageResult]
    }
    
    extension [Self <: MessageResult](x: Self) {
      
      inline def setDeliveryStatus(
        value: SUCCESSFUL | THROTTLED | TEMPORARY_FAILURE | PERMANENT_FAILURE | UNKNOWN_FAILURE | OPT_OUT | DUPLICATE | String
      ): Self = StObject.set(x, "DeliveryStatus", value.asInstanceOf[js.Any])
      
      inline def setDeliveryStatusUndefined: Self = StObject.set(x, "DeliveryStatus", js.undefined)
      
      inline def setMessageId(value: String): Self = StObject.set(x, "MessageId", value.asInstanceOf[js.Any])
      
      inline def setMessageIdUndefined: Self = StObject.set(x, "MessageId", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "StatusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "StatusCode", js.undefined)
      
      inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
      
      inline def setUpdatedToken(value: String): Self = StObject.set(x, "UpdatedToken", value.asInstanceOf[js.Any])
      
      inline def setUpdatedTokenUndefined: Self = StObject.set(x, "UpdatedToken", js.undefined)
    }
  }
  
  type UnmarshalledMessageResult = MessageResult
}
