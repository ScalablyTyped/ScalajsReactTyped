package typingsJapgolly.naverWhale.whale

import typingsJapgolly.chrome.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Google Cloud Messaging
////////////////////
/**
  * Use chrome.gcm to enable apps and extensions to send and receive messages through the Google Cloud Messaging Service.
  * Availability: Since Chrome 35.
  * Permissions:  "gcm"
  */
object gcm {
  
  trait GcmError extends StObject {
    
    /** Additional details related to the error, when available. */
    var detail: js.Object
    
    /** The error message describing the problem. */
    var errorMessage: String
    
    /** Optional. The ID of the message with this error, if error is related to a specific message. */
    var messageId: js.UndefOr[String] = js.undefined
  }
  object GcmError {
    
    inline def apply(detail: js.Object, errorMessage: String): GcmError = {
      val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[GcmError]
    }
    
    extension [Self <: GcmError](x: Self) {
      
      inline def setDetail(value: js.Object): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    }
  }
  
  type GcmErrorEvent = Event[js.Function1[/* error */ typingsJapgolly.chrome.chrome.gcm.GcmError, Unit]]
  
  trait IncomingMessage extends StObject {
    
    /**
      * Optional.
      * The collapse key of a message. See Collapsible Messages section of Cloud Messaging documentation for details.
      */
    var collapseKey: js.UndefOr[String] = js.undefined
    
    /** The message data. */
    var data: js.Object
    
    /**
      * Optional.
      * The sender who issued the message.
      * @since Since Chrome 41.
      */
    var from: js.UndefOr[String] = js.undefined
  }
  object IncomingMessage {
    
    inline def apply(data: js.Object): IncomingMessage = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[IncomingMessage]
    }
    
    extension [Self <: IncomingMessage](x: Self) {
      
      inline def setCollapseKey(value: String): Self = StObject.set(x, "collapseKey", value.asInstanceOf[js.Any])
      
      inline def setCollapseKeyUndefined: Self = StObject.set(x, "collapseKey", js.undefined)
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    }
  }
  
  type MessageDeletionEvent = Event[js.Function0[Unit]]
  
  type MessageReceptionEvent = Event[
    js.Function1[/* message */ typingsJapgolly.chrome.chrome.gcm.IncomingMessage, Unit]
  ]
  
  trait OutgoingMessage extends StObject {
    
    /** Message data to send to the server. Case-insensitive goog. and google, as well as case-sensitive collapse_key are disallowed as key prefixes. Sum of all key/value pairs should not exceed gcm.MAX_MESSAGE_SIZE. */
    var data: js.Object
    
    /** The ID of the server to send the message to as assigned by Google API Console. */
    var destinationId: String
    
    /** The ID of the message. It must be unique for each message in scope of the applications. See the Cloud Messaging documentation for advice for picking and handling an ID. */
    var messageId: String
    
    /** Optional. Time-to-live of the message in seconds. If it is not possible to send the message within that time, an onSendError event will be raised. A time-to-live of 0 indicates that the message should be sent immediately or fail if it's not possible. The maximum and a default value of time-to-live is 86400 seconds (1 day). */
    var timeToLive: js.UndefOr[Double] = js.undefined
  }
  object OutgoingMessage {
    
    inline def apply(data: js.Object, destinationId: String, messageId: String): OutgoingMessage = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], destinationId = destinationId.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any])
      __obj.asInstanceOf[OutgoingMessage]
    }
    
    extension [Self <: OutgoingMessage](x: Self) {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDestinationId(value: String): Self = StObject.set(x, "destinationId", value.asInstanceOf[js.Any])
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setTimeToLive(value: Double): Self = StObject.set(x, "timeToLive", value.asInstanceOf[js.Any])
      
      inline def setTimeToLiveUndefined: Self = StObject.set(x, "timeToLive", js.undefined)
    }
  }
}
