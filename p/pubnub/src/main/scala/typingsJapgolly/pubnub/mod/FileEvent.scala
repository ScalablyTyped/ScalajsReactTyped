package typingsJapgolly.pubnub.mod

import typingsJapgolly.pubnub.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileEvent extends StObject {
  
  var channel: String
  
  var file: Name
  
  var message: Any
  
  var publisher: String
  
  var subscription: String
  
  var timetoken: String
}
object FileEvent {
  
  inline def apply(
    channel: String,
    file: Name,
    message: Any,
    publisher: String,
    subscription: String,
    timetoken: String
  ): FileEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileEvent]
  }
  
  extension [Self <: FileEvent](x: Self) {
    
    inline def setChannel(value: String): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setFile(value: Name): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setSubscription(value: String): Self = StObject.set(x, "subscription", value.asInstanceOf[js.Any])
    
    inline def setTimetoken(value: String): Self = StObject.set(x, "timetoken", value.asInstanceOf[js.Any])
  }
}
