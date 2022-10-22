package typingsJapgolly.ngGrid.ngGrid

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEventProvider extends StObject {
  
  def assignEvents(): Unit
  
  def assignGridEventHandlers(): Unit
  
  var colToMove: IColumn
  
  def dragOver(event: Any): Unit
  
  def dragStart(event: Any): Unit
  
  var groupToMove: Any
  
  def onGroupDrop(event: Any): Unit
  
  def onGroupMouseDown(event: Any): Unit
  
  def onHeaderDrop(event: Any): Unit
  
  def onHeaderMouseDown(event: Any): Unit
  
  def setDraggables(): Unit
}
object IEventProvider {
  
  inline def apply(
    assignEvents: Callback,
    assignGridEventHandlers: Callback,
    colToMove: IColumn,
    dragOver: Any => Callback,
    dragStart: Any => Callback,
    groupToMove: Any,
    onGroupDrop: Any => Callback,
    onGroupMouseDown: Any => Callback,
    onHeaderDrop: Any => Callback,
    onHeaderMouseDown: Any => Callback,
    setDraggables: Callback
  ): IEventProvider = {
    val __obj = js.Dynamic.literal(assignEvents = assignEvents.toJsFn, assignGridEventHandlers = assignGridEventHandlers.toJsFn, colToMove = colToMove.asInstanceOf[js.Any], dragOver = js.Any.fromFunction1((t0: Any) => dragOver(t0).runNow()), dragStart = js.Any.fromFunction1((t0: Any) => dragStart(t0).runNow()), groupToMove = groupToMove.asInstanceOf[js.Any], onGroupDrop = js.Any.fromFunction1((t0: Any) => onGroupDrop(t0).runNow()), onGroupMouseDown = js.Any.fromFunction1((t0: Any) => onGroupMouseDown(t0).runNow()), onHeaderDrop = js.Any.fromFunction1((t0: Any) => onHeaderDrop(t0).runNow()), onHeaderMouseDown = js.Any.fromFunction1((t0: Any) => onHeaderMouseDown(t0).runNow()), setDraggables = setDraggables.toJsFn)
    __obj.asInstanceOf[IEventProvider]
  }
  
  extension [Self <: IEventProvider](x: Self) {
    
    inline def setAssignEvents(value: Callback): Self = StObject.set(x, "assignEvents", value.toJsFn)
    
    inline def setAssignGridEventHandlers(value: Callback): Self = StObject.set(x, "assignGridEventHandlers", value.toJsFn)
    
    inline def setColToMove(value: IColumn): Self = StObject.set(x, "colToMove", value.asInstanceOf[js.Any])
    
    inline def setDragOver(value: Any => Callback): Self = StObject.set(x, "dragOver", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setDragStart(value: Any => Callback): Self = StObject.set(x, "dragStart", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setGroupToMove(value: Any): Self = StObject.set(x, "groupToMove", value.asInstanceOf[js.Any])
    
    inline def setOnGroupDrop(value: Any => Callback): Self = StObject.set(x, "onGroupDrop", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setOnGroupMouseDown(value: Any => Callback): Self = StObject.set(x, "onGroupMouseDown", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setOnHeaderDrop(value: Any => Callback): Self = StObject.set(x, "onHeaderDrop", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setOnHeaderMouseDown(value: Any => Callback): Self = StObject.set(x, "onHeaderMouseDown", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setSetDraggables(value: Callback): Self = StObject.set(x, "setDraggables", value.toJsFn)
  }
}
