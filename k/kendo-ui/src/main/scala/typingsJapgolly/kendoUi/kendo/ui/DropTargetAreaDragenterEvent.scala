package typingsJapgolly.kendoUi.kendo.ui

import org.scalajs.dom.Element
import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropTargetAreaDragenterEvent
  extends StObject
     with DropTargetAreaEvent {
  
  var draggable: js.UndefOr[Draggable] = js.undefined
  
  var dropTarget: js.UndefOr[JQuery] = js.undefined
  
  var target: js.UndefOr[Element] = js.undefined
}
object DropTargetAreaDragenterEvent {
  
  inline def apply(sender: DropTargetArea): DropTargetAreaDragenterEvent = {
    val __obj = js.Dynamic.literal(sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropTargetAreaDragenterEvent]
  }
  
  extension [Self <: DropTargetAreaDragenterEvent](x: Self) {
    
    inline def setDraggable(value: Draggable): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    
    inline def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    
    inline def setDropTarget(value: JQuery): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
    
    inline def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
    
    inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
  }
}
