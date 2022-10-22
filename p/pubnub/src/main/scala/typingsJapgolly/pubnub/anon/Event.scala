package typingsJapgolly.pubnub.anon

import typingsJapgolly.pubnub.pubnubStrings.channel
import typingsJapgolly.pubnub.pubnubStrings.delete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var data: Id
  
  var event: delete
  
  var `type`: channel
}
object Event {
  
  inline def apply(data: Id): Event = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = "delete")
    __obj.updateDynamic("type")("channel")
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setData(value: Id): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: delete): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: channel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
