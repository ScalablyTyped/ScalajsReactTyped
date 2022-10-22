package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPostCalendarEventsRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var calendar_id: Id
  
  var events: js.Array[MlCalendarEvent]
}
object MlPostCalendarEventsRequest {
  
  inline def apply(calendar_id: Id, events: js.Array[MlCalendarEvent]): MlPostCalendarEventsRequest = {
    val __obj = js.Dynamic.literal(calendar_id = calendar_id.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPostCalendarEventsRequest]
  }
  
  extension [Self <: MlPostCalendarEventsRequest](x: Self) {
    
    inline def setCalendar_id(value: Id): Self = StObject.set(x, "calendar_id", value.asInstanceOf[js.Any])
    
    inline def setEvents(value: js.Array[MlCalendarEvent]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsVarargs(value: MlCalendarEvent*): Self = StObject.set(x, "events", js.Array(value*))
  }
}
