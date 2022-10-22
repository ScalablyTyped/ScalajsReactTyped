package typingsJapgolly.microsoftteams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageEvent extends StObject {
  
  var originalEvent: MessageEvent
}
object MessageEvent {
  
  inline def apply(originalEvent: MessageEvent): MessageEvent = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageEvent]
  }
  
  extension [Self <: MessageEvent](x: Self) {
    
    inline def setOriginalEvent(value: MessageEvent): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
  }
}
