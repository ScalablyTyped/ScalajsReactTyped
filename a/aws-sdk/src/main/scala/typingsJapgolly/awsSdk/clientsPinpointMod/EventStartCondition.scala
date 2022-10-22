package typingsJapgolly.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventStartCondition extends StObject {
  
  var EventFilter: js.UndefOr[typingsJapgolly.awsSdk.clientsPinpointMod.EventFilter] = js.undefined
  
  var SegmentId: js.UndefOr[string] = js.undefined
}
object EventStartCondition {
  
  inline def apply(): EventStartCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventStartCondition]
  }
  
  extension [Self <: EventStartCondition](x: Self) {
    
    inline def setEventFilter(value: EventFilter): Self = StObject.set(x, "EventFilter", value.asInstanceOf[js.Any])
    
    inline def setEventFilterUndefined: Self = StObject.set(x, "EventFilter", js.undefined)
    
    inline def setSegmentId(value: string): Self = StObject.set(x, "SegmentId", value.asInstanceOf[js.Any])
    
    inline def setSegmentIdUndefined: Self = StObject.set(x, "SegmentId", js.undefined)
  }
}
