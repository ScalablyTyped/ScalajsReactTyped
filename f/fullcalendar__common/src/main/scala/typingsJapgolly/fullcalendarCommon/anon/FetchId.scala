package typingsJapgolly.fullcalendarCommon.anon

import typingsJapgolly.fullcalendarCommon.fullcalendarCommonStrings.RECEIVE_EVENTS
import typingsJapgolly.fullcalendarCommon.mod.Action
import typingsJapgolly.fullcalendarCommon.mod.DateRange
import typingsJapgolly.fullcalendarCommon.mod.EventInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchId
  extends StObject
     with Action {
  
  var fetchId: String
  
  var fetchRange: DateRange | Null
  
  var rawEvents: js.Array[EventInput]
  
  var sourceId: String
  
  var `type`: RECEIVE_EVENTS
}
object FetchId {
  
  inline def apply(fetchId: String, rawEvents: js.Array[EventInput], sourceId: String): FetchId = {
    val __obj = js.Dynamic.literal(fetchId = fetchId.asInstanceOf[js.Any], rawEvents = rawEvents.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any], fetchRange = null)
    __obj.updateDynamic("type")("RECEIVE_EVENTS")
    __obj.asInstanceOf[FetchId]
  }
  
  extension [Self <: FetchId](x: Self) {
    
    inline def setFetchId(value: String): Self = StObject.set(x, "fetchId", value.asInstanceOf[js.Any])
    
    inline def setFetchRange(value: DateRange): Self = StObject.set(x, "fetchRange", value.asInstanceOf[js.Any])
    
    inline def setFetchRangeNull: Self = StObject.set(x, "fetchRange", null)
    
    inline def setRawEvents(value: js.Array[EventInput]): Self = StObject.set(x, "rawEvents", value.asInstanceOf[js.Any])
    
    inline def setRawEventsVarargs(value: EventInput*): Self = StObject.set(x, "rawEvents", js.Array(value*))
    
    inline def setSourceId(value: String): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
    
    inline def setType(value: RECEIVE_EVENTS): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
