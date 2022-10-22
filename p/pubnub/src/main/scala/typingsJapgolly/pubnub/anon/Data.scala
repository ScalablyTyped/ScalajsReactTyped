package typingsJapgolly.pubnub.anon

import typingsJapgolly.pubnub.pubnubStrings.channel
import typingsJapgolly.pubnub.pubnubStrings.delete
import typingsJapgolly.pubnub.pubnubStrings.membership
import typingsJapgolly.pubnub.pubnubStrings.set
import typingsJapgolly.pubnub.pubnubStrings.uuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: js.Object
  
  var event: set | delete
  
  var `type`: uuid | channel | membership
}
object Data {
  
  inline def apply(data: js.Object, event: set | delete, `type`: uuid | channel | membership): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEvent(value: set | delete): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setType(value: uuid | channel | membership): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
