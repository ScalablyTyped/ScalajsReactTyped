package typingsJapgolly.dashjs.mod

import typingsJapgolly.dashjs.dashjsStrings.public_keyError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyErrorEvent
  extends StObject
     with Event {
  
  var data: KeyError
  
  @JSName("type")
  var type_KeyErrorEvent: public_keyError
}
object KeyErrorEvent {
  
  inline def apply(data: KeyError): KeyErrorEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("public_keyError")
    __obj.asInstanceOf[KeyErrorEvent]
  }
  
  extension [Self <: KeyErrorEvent](x: Self) {
    
    inline def setData(value: KeyError): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setType(value: public_keyError): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
