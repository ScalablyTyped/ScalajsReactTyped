package typingsJapgolly.dndCore.distInterfacesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropTarget extends StObject {
  
  def canDrop(monitor: DragDropMonitor, targetId: Identifier): Boolean
  
  def drop(monitor: DragDropMonitor, targetId: Identifier): Any
  
  def hover(monitor: DragDropMonitor, targetId: Identifier): Unit
}
object DropTarget {
  
  inline def apply(
    canDrop: (DragDropMonitor, Identifier) => Boolean,
    drop: (DragDropMonitor, Identifier) => Any,
    hover: (DragDropMonitor, Identifier) => Callback
  ): DropTarget = {
    val __obj = js.Dynamic.literal(canDrop = js.Any.fromFunction2(canDrop), drop = js.Any.fromFunction2(drop), hover = js.Any.fromFunction2((t0: DragDropMonitor, t1: Identifier) => (hover(t0, t1)).runNow()))
    __obj.asInstanceOf[DropTarget]
  }
  
  extension [Self <: DropTarget](x: Self) {
    
    inline def setCanDrop(value: (DragDropMonitor, Identifier) => Boolean): Self = StObject.set(x, "canDrop", js.Any.fromFunction2(value))
    
    inline def setDrop(value: (DragDropMonitor, Identifier) => Any): Self = StObject.set(x, "drop", js.Any.fromFunction2(value))
    
    inline def setHover(value: (DragDropMonitor, Identifier) => Callback): Self = StObject.set(x, "hover", js.Any.fromFunction2((t0: DragDropMonitor, t1: Identifier) => (value(t0, t1)).runNow()))
  }
}
