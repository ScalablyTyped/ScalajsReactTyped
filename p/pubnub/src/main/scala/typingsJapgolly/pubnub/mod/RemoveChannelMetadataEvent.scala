package typingsJapgolly.pubnub.mod

import typingsJapgolly.pubnub.anon.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveChannelMetadataEvent
  extends StObject
     with BaseObjectsEvent
     with ObjectsEvent[Any, Any, Any] {
  
  @JSName("message")
  var message_RemoveChannelMetadataEvent: Event
}
object RemoveChannelMetadataEvent {
  
  inline def apply(channel: String, message: Event, timetoken: Double): RemoveChannelMetadataEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[RemoveChannelMetadataEvent]
  }
  
  extension [Self <: RemoveChannelMetadataEvent](x: Self) {
    
    inline def setMessage(value: Event): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
