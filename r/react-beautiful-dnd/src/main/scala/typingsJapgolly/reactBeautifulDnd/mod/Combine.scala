package typingsJapgolly.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Combine extends StObject {
  
  var draggableId: DraggableId
  
  var droppableId: DroppableId
}
object Combine {
  
  inline def apply(draggableId: DraggableId, droppableId: DroppableId): Combine = {
    val __obj = js.Dynamic.literal(draggableId = draggableId.asInstanceOf[js.Any], droppableId = droppableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Combine]
  }
  
  extension [Self <: Combine](x: Self) {
    
    inline def setDraggableId(value: DraggableId): Self = StObject.set(x, "draggableId", value.asInstanceOf[js.Any])
    
    inline def setDroppableId(value: DroppableId): Self = StObject.set(x, "droppableId", value.asInstanceOf[js.Any])
  }
}
