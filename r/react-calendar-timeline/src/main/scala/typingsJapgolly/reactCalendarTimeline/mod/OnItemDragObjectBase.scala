package typingsJapgolly.reactCalendarTimeline.mod

import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.move
import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.resize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnItemDragObjectBase extends StObject {
  
  var eventType: move | resize
  
  var itemId: Id
  
  var time: Double
}
object OnItemDragObjectBase {
  
  inline def apply(eventType: move | resize, itemId: Id, time: Double): OnItemDragObjectBase = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], itemId = itemId.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnItemDragObjectBase]
  }
  
  extension [Self <: OnItemDragObjectBase](x: Self) {
    
    inline def setEventType(value: move | resize): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setItemId(value: Id): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
