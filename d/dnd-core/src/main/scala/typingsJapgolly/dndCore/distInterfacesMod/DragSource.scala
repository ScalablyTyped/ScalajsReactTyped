package typingsJapgolly.dndCore.distInterfacesMod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragSource extends StObject {
  
  def beginDrag(monitor: DragDropMonitor, targetId: Identifier): Unit
  
  def canDrag(monitor: DragDropMonitor, targetId: Identifier): Boolean
  
  def endDrag(monitor: DragDropMonitor, targetId: Identifier): Unit
  
  def isDragging(monitor: DragDropMonitor, targetId: Identifier): Boolean
}
object DragSource {
  
  inline def apply(
    beginDrag: (DragDropMonitor, Identifier) => Callback,
    canDrag: (DragDropMonitor, Identifier) => Boolean,
    endDrag: (DragDropMonitor, Identifier) => Callback,
    isDragging: (DragDropMonitor, Identifier) => Boolean
  ): DragSource = {
    val __obj = js.Dynamic.literal(beginDrag = js.Any.fromFunction2((t0: DragDropMonitor, t1: Identifier) => (beginDrag(t0, t1)).runNow()), canDrag = js.Any.fromFunction2(canDrag), endDrag = js.Any.fromFunction2((t0: DragDropMonitor, t1: Identifier) => (endDrag(t0, t1)).runNow()), isDragging = js.Any.fromFunction2(isDragging))
    __obj.asInstanceOf[DragSource]
  }
  
  extension [Self <: DragSource](x: Self) {
    
    inline def setBeginDrag(value: (DragDropMonitor, Identifier) => Callback): Self = StObject.set(x, "beginDrag", js.Any.fromFunction2((t0: DragDropMonitor, t1: Identifier) => (value(t0, t1)).runNow()))
    
    inline def setCanDrag(value: (DragDropMonitor, Identifier) => Boolean): Self = StObject.set(x, "canDrag", js.Any.fromFunction2(value))
    
    inline def setEndDrag(value: (DragDropMonitor, Identifier) => Callback): Self = StObject.set(x, "endDrag", js.Any.fromFunction2((t0: DragDropMonitor, t1: Identifier) => (value(t0, t1)).runNow()))
    
    inline def setIsDragging(value: (DragDropMonitor, Identifier) => Boolean): Self = StObject.set(x, "isDragging", js.Any.fromFunction2(value))
  }
}
