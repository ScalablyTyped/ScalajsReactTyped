package typingsJapgolly.fullcalendarCommon.anon

import org.scalajs.dom.XMLHttpRequest
import typingsJapgolly.fullcalendarCommon.mod.EventInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RawEvents extends StObject {
  
  var rawEvents: js.Array[EventInput]
  
  var xhr: js.UndefOr[XMLHttpRequest] = js.undefined
}
object RawEvents {
  
  inline def apply(rawEvents: js.Array[EventInput]): RawEvents = {
    val __obj = js.Dynamic.literal(rawEvents = rawEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawEvents]
  }
  
  extension [Self <: RawEvents](x: Self) {
    
    inline def setRawEvents(value: js.Array[EventInput]): Self = StObject.set(x, "rawEvents", value.asInstanceOf[js.Any])
    
    inline def setRawEventsVarargs(value: EventInput*): Self = StObject.set(x, "rawEvents", js.Array(value*))
    
    inline def setXhr(value: XMLHttpRequest): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    
    inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
  }
}
