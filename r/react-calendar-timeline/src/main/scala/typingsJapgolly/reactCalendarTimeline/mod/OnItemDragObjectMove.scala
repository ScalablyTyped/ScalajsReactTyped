package typingsJapgolly.reactCalendarTimeline.mod

import typingsJapgolly.reactCalendarTimeline.reactCalendarTimelineStrings.move
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnItemDragObjectMove
  extends StObject
     with OnItemDragObjectBase {
  
  @JSName("eventType")
  var eventType_OnItemDragObjectMove: move
  
  var newGroupOrder: Double
}
object OnItemDragObjectMove {
  
  inline def apply(itemId: Id, newGroupOrder: Double, time: Double): OnItemDragObjectMove = {
    val __obj = js.Dynamic.literal(eventType = "move", itemId = itemId.asInstanceOf[js.Any], newGroupOrder = newGroupOrder.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnItemDragObjectMove]
  }
  
  extension [Self <: OnItemDragObjectMove](x: Self) {
    
    inline def setEventType(value: move): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setNewGroupOrder(value: Double): Self = StObject.set(x, "newGroupOrder", value.asInstanceOf[js.Any])
  }
}
