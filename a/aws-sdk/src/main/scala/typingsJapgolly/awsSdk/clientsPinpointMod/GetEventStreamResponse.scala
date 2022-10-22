package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEventStreamResponse extends StObject {
  
  var EventStream: typingsJapgolly.awsSdk.clientsPinpointMod.EventStream
}
object GetEventStreamResponse {
  
  inline def apply(EventStream: EventStream): GetEventStreamResponse = {
    val __obj = js.Dynamic.literal(EventStream = EventStream.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEventStreamResponse]
  }
  
  extension [Self <: GetEventStreamResponse](x: Self) {
    
    inline def setEventStream(value: EventStream): Self = StObject.set(x, "EventStream", value.asInstanceOf[js.Any])
  }
}
