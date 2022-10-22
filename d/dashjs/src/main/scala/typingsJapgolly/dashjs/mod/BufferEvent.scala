package typingsJapgolly.dashjs.mod

import typingsJapgolly.dashjs.dashjsStrings.bufferLoaded
import typingsJapgolly.dashjs.dashjsStrings.bufferStalled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BufferEvent
  extends StObject
     with Event {
  
  var mediaType: MediaType
  
  @JSName("type")
  var type_BufferEvent: bufferStalled | bufferLoaded
}
object BufferEvent {
  
  inline def apply(mediaType: MediaType, `type`: bufferStalled | bufferLoaded): BufferEvent = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferEvent]
  }
  
  extension [Self <: BufferEvent](x: Self) {
    
    inline def setMediaType(value: MediaType): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setType(value: bufferStalled | bufferLoaded): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
