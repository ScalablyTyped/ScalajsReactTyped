package typingsJapgolly.dashjs.mod

import typingsJapgolly.dashjs.anon.Code
import typingsJapgolly.dashjs.dashjsStrings.error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaPlayerErrorEvent
  extends StObject
     with Event
     with ErrorEvent {
  
  var error: Code
  
  @JSName("type")
  var type_MediaPlayerErrorEvent: error
}
object MediaPlayerErrorEvent {
  
  inline def apply(error: Code): MediaPlayerErrorEvent = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("error")
    __obj.asInstanceOf[MediaPlayerErrorEvent]
  }
  
  extension [Self <: MediaPlayerErrorEvent](x: Self) {
    
    inline def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setType(value: error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
