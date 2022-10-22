package typingsJapgolly.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DraggableDescriptor extends StObject {
  
  // Inherited from Droppable
  var droppableId: DroppableId
  
  var id: DraggableId
  
  var index: Double
  
  // This is technically redundant but it avoids
  // needing to look up a parent droppable just to get its type
  var `type`: TypeId
}
object DraggableDescriptor {
  
  inline def apply(droppableId: DroppableId, id: DraggableId, index: Double, `type`: TypeId): DraggableDescriptor = {
    val __obj = js.Dynamic.literal(droppableId = droppableId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableDescriptor]
  }
  
  extension [Self <: DraggableDescriptor](x: Self) {
    
    inline def setDroppableId(value: DroppableId): Self = StObject.set(x, "droppableId", value.asInstanceOf[js.Any])
    
    inline def setId(value: DraggableId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setType(value: TypeId): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
