package typingsJapgolly.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlowExecutionMessage extends StObject {
  
  /**
    * The type of flow event .
    */
  var eventType: js.UndefOr[FlowExecutionEventType] = js.undefined
  
  /**
    * The unique identifier of the message.
    */
  var messageId: js.UndefOr[FlowExecutionMessageId] = js.undefined
  
  /**
    * A string containing information about the flow event.
    */
  var payload: js.UndefOr[FlowExecutionMessagePayload] = js.undefined
  
  /**
    * The date and time when the message was last updated.
    */
  var timestamp: js.UndefOr[js.Date] = js.undefined
}
object FlowExecutionMessage {
  
  inline def apply(): FlowExecutionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowExecutionMessage]
  }
  
  extension [Self <: FlowExecutionMessage](x: Self) {
    
    inline def setEventType(value: FlowExecutionEventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setMessageId(value: FlowExecutionMessageId): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    inline def setPayload(value: FlowExecutionMessagePayload): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
