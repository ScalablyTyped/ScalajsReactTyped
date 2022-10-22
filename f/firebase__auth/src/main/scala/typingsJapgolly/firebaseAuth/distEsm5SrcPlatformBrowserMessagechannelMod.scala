package typingsJapgolly.firebaseAuth

import typingsJapgolly.firebaseAuth.distEsm5SrcPlatformBrowserMessagechannelPromiseMod.PromiseSettledResult
import typingsJapgolly.firebaseAuth.firebaseAuthInts.`3000`
import typingsJapgolly.firebaseAuth.firebaseAuthInts.`50`
import typingsJapgolly.firebaseAuth.firebaseAuthInts.`800`
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.ack_
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.connection_closed
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.connection_unavailable
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.done
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.invalid_response
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.keyChanged
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.ping
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.timeout
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.unknown_error
import typingsJapgolly.firebaseAuth.firebaseAuthStrings.unsupported_event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsm5SrcPlatformBrowserMessagechannelMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.keyChanged
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.ping
  */
  trait EventType extends StObject
  object EventType {
    
    inline def KEY_CHANGED: keyChanged = "keyChanged".asInstanceOf[keyChanged]
    
    inline def PING: ping = "ping".asInstanceOf[ping]
  }
  
  trait KeyChangedRequest
    extends StObject
       with SenderRequest {
    
    var key: String
  }
  object KeyChangedRequest {
    
    inline def apply(key: String): KeyChangedRequest = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyChangedRequest]
    }
    
    extension [Self <: KeyChangedRequest](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyChangedResponse extends StObject {
    
    var keyProcessed: Boolean
  }
  object KeyChangedResponse {
    
    inline def apply(keyProcessed: Boolean): KeyChangedResponse = {
      val __obj = js.Dynamic.literal(keyProcessed = keyProcessed.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyChangedResponse]
    }
    
    extension [Self <: KeyChangedResponse](x: Self) {
      
      inline def setKeyProcessed(value: Boolean): Self = StObject.set(x, "keyProcessed", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.connection_closed
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.connection_unavailable
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.invalid_response
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.timeout
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.unknown_error
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.unsupported_event
  */
  trait MessageError extends StObject
  object MessageError {
    
    inline def CONNECTION_CLOSED: connection_closed = "connection_closed".asInstanceOf[connection_closed]
    
    inline def CONNECTION_UNAVAILABLE: connection_unavailable = "connection_unavailable".asInstanceOf[connection_unavailable]
    
    inline def INVALID_RESPONSE: invalid_response = "invalid_response".asInstanceOf[invalid_response]
    
    inline def TIMEOUT: timeout = "timeout".asInstanceOf[timeout]
    
    inline def UNKNOWN: unknown_error = "unknown_error".asInstanceOf[unknown_error]
    
    inline def UNSUPPORTED_EVENT: unsupported_event = "unsupported_event".asInstanceOf[unsupported_event]
  }
  
  trait MessageEvent extends StObject {
    
    var eventId: String
    
    var eventType: EventType
  }
  object MessageEvent {
    
    inline def apply(eventId: String, eventType: EventType): MessageEvent = {
      val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageEvent]
    }
    
    extension [Self <: MessageEvent](x: Self) {
      
      inline def setEventId(value: String): Self = StObject.set(x, "eventId", value.asInstanceOf[js.Any])
      
      inline def setEventType(value: EventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    }
  }
  
  trait PingRequest
    extends StObject
       with SenderRequest
  
  type PingResponse = js.Array[EventType]
  
  type ReceiverHandler[T /* <: ReceiverResponse */, S /* <: SenderRequest */] = js.Function2[/* origin */ String, /* data */ S, T | js.Promise[T]]
  
  trait ReceiverMessageEvent[T /* <: ReceiverResponse */]
    extends StObject
       with MessageEvent {
    
    var response: ReceiverMessageResponse[T]
    
    var status: Status
  }
  object ReceiverMessageEvent {
    
    inline def apply[T /* <: ReceiverResponse */](eventId: String, eventType: EventType, status: Status): ReceiverMessageEvent[T] = {
      val __obj = js.Dynamic.literal(eventId = eventId.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], response = null)
      __obj.asInstanceOf[ReceiverMessageEvent[T]]
    }
    
    extension [Self <: ReceiverMessageEvent[?], T /* <: ReceiverResponse */](x: Self & ReceiverMessageEvent[T]) {
      
      inline def setResponse(value: ReceiverMessageResponse[T]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      inline def setResponseNull: Self = StObject.set(x, "response", null)
      
      inline def setResponseVarargs(value: PromiseSettledResult[T]*): Self = StObject.set(x, "response", js.Array(value*))
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  type ReceiverMessageResponse[T /* <: ReceiverResponse */] = js.Array[PromiseSettledResult[T]] | Null
  
  type ReceiverResponse = KeyChangedResponse | PingResponse
  
  trait SenderMessageEvent[T /* <: SenderRequest */]
    extends StObject
       with MessageEvent {
    
    var data: T
  }
  object SenderMessageEvent {
    
    inline def apply[T /* <: SenderRequest */](data: T, eventId: String, eventType: EventType): SenderMessageEvent[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], eventId = eventId.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any])
      __obj.asInstanceOf[SenderMessageEvent[T]]
    }
    
    extension [Self <: SenderMessageEvent[?], T /* <: SenderRequest */](x: Self & SenderMessageEvent[T]) {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAuth.distEsm5SrcPlatformBrowserMessagechannelMod.KeyChangedRequest
    - typingsJapgolly.firebaseAuth.distEsm5SrcPlatformBrowserMessagechannelMod.PingRequest
  */
  trait SenderRequest extends StObject
  object SenderRequest {
    
    inline def KeyChangedRequest(key: String): typingsJapgolly.firebaseAuth.distEsm5SrcPlatformBrowserMessagechannelMod.KeyChangedRequest = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.firebaseAuth.distEsm5SrcPlatformBrowserMessagechannelMod.KeyChangedRequest]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.ack_
    - typingsJapgolly.firebaseAuth.firebaseAuthStrings.done
  */
  trait Status extends StObject
  object Status {
    
    inline def ACK: ack_ = "ack".asInstanceOf[ack_]
    
    inline def DONE: done = "done".asInstanceOf[done]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseAuth.firebaseAuthInts.`50`
    - typingsJapgolly.firebaseAuth.firebaseAuthInts.`3000`
    - typingsJapgolly.firebaseAuth.firebaseAuthInts.`800`
  */
  trait TimeoutDuration extends StObject
  object TimeoutDuration {
    
    inline def ACK: `50` = 50.asInstanceOf[`50`]
    
    inline def COMPLETION: `3000` = 3000.asInstanceOf[`3000`]
    
    inline def LONG_ACK: `800` = 800.asInstanceOf[`800`]
  }
}
