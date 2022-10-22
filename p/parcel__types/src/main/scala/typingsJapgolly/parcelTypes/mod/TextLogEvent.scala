package typingsJapgolly.parcelTypes.mod

import typingsJapgolly.parcelTypes.parcelTypesStrings.log
import typingsJapgolly.parcelTypes.parcelTypesStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextLogEvent
  extends StObject
     with LogEvent {
  
  val level: success
  
  val message: String
  
  val `type`: log
}
object TextLogEvent {
  
  inline def apply(message: String): TextLogEvent = {
    val __obj = js.Dynamic.literal(level = "success", message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("log")
    __obj.asInstanceOf[TextLogEvent]
  }
  
  extension [Self <: TextLogEvent](x: Self) {
    
    inline def setLevel(value: success): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setType(value: log): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
