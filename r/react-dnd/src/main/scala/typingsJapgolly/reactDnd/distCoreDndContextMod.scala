package typingsJapgolly.reactDnd

import typingsJapgolly.dndCore.distInterfacesMod.DragDropManager
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCoreDndContextMod {
  
  @JSImport("react-dnd/dist/core/DndContext", "DndContext")
  @js.native
  val DndContext: Context[DndContextType] = js.native
  
  trait DndContextType extends StObject {
    
    var dragDropManager: js.UndefOr[DragDropManager] = js.undefined
  }
  object DndContextType {
    
    inline def apply(): DndContextType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DndContextType]
    }
    
    extension [Self <: DndContextType](x: Self) {
      
      inline def setDragDropManager(value: DragDropManager): Self = StObject.set(x, "dragDropManager", value.asInstanceOf[js.Any])
      
      inline def setDragDropManagerUndefined: Self = StObject.set(x, "dragDropManager", js.undefined)
    }
  }
}
