package typingsJapgolly.reactBeautifulDnd.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DroppableStateSnapshot extends StObject {
  
  var draggingFromThisWith: js.UndefOr[DraggableId] = js.undefined
  
  var draggingOverWith: js.UndefOr[DraggableId] = js.undefined
  
  var isDraggingOver: Boolean
  
  var isUsingPlaceholder: Boolean
}
object DroppableStateSnapshot {
  
  inline def apply(isDraggingOver: Boolean, isUsingPlaceholder: Boolean): DroppableStateSnapshot = {
    val __obj = js.Dynamic.literal(isDraggingOver = isDraggingOver.asInstanceOf[js.Any], isUsingPlaceholder = isUsingPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DroppableStateSnapshot]
  }
  
  extension [Self <: DroppableStateSnapshot](x: Self) {
    
    inline def setDraggingFromThisWith(value: DraggableId): Self = StObject.set(x, "draggingFromThisWith", value.asInstanceOf[js.Any])
    
    inline def setDraggingFromThisWithUndefined: Self = StObject.set(x, "draggingFromThisWith", js.undefined)
    
    inline def setDraggingOverWith(value: DraggableId): Self = StObject.set(x, "draggingOverWith", value.asInstanceOf[js.Any])
    
    inline def setDraggingOverWithUndefined: Self = StObject.set(x, "draggingOverWith", js.undefined)
    
    inline def setIsDraggingOver(value: Boolean): Self = StObject.set(x, "isDraggingOver", value.asInstanceOf[js.Any])
    
    inline def setIsUsingPlaceholder(value: Boolean): Self = StObject.set(x, "isUsingPlaceholder", value.asInstanceOf[js.Any])
  }
}
