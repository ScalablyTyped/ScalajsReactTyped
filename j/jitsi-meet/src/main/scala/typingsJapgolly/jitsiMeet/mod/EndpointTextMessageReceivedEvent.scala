package typingsJapgolly.jitsiMeet.mod

import typingsJapgolly.jitsiMeet.anon.Id
import typingsJapgolly.jitsiMeet.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointTextMessageReceivedEvent extends StObject {
  
  var eventData: Name
  
  var senderInfo: Id
}
object EndpointTextMessageReceivedEvent {
  
  inline def apply(eventData: Name, senderInfo: Id): EndpointTextMessageReceivedEvent = {
    val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], senderInfo = senderInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndpointTextMessageReceivedEvent]
  }
  
  extension [Self <: EndpointTextMessageReceivedEvent](x: Self) {
    
    inline def setEventData(value: Name): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
    
    inline def setSenderInfo(value: Id): Self = StObject.set(x, "senderInfo", value.asInstanceOf[js.Any])
  }
}
