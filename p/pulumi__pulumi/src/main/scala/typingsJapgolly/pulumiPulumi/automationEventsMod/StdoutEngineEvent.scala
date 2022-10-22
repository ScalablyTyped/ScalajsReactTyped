package typingsJapgolly.pulumiPulumi.automationEventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StdoutEngineEvent extends StObject {
  
  var color: String
  
  var message: String
}
object StdoutEngineEvent {
  
  inline def apply(color: String, message: String): StdoutEngineEvent = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[StdoutEngineEvent]
  }
  
  extension [Self <: StdoutEngineEvent](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
