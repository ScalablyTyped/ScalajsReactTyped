package typingsJapgolly.reactCalendarTimeline.mod

import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.resize
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnItemDragObjectResize
  extends StObject
     with OnItemDragObjectBase {
  
  var edge: js.UndefOr[left | right] = js.undefined
  
  @JSName("eventType")
  var eventType_OnItemDragObjectResize: resize
}
object OnItemDragObjectResize {
  
  inline def apply(itemId: Id, time: Double): OnItemDragObjectResize = {
    val __obj = js.Dynamic.literal(eventType = "resize", itemId = itemId.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnItemDragObjectResize]
  }
  
  extension [Self <: OnItemDragObjectResize](x: Self) {
    
    inline def setEdge(value: left | right): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
    
    inline def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
    
    inline def setEventType(value: resize): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
  }
}
