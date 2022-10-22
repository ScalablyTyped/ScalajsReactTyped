package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeViewDragendEvent
  extends StObject
     with TreeViewEvent {
  
  var destinationNode: js.UndefOr[Element] = js.undefined
  
  var dropPosition: js.UndefOr[String] = js.undefined
  
  var sourceNode: js.UndefOr[Element] = js.undefined
}
object TreeViewDragendEvent {
  
  inline def apply(isDefaultPrevented: CallbackTo[Boolean], preventDefault: js.Function, sender: TreeView): TreeViewDragendEvent = {
    val __obj = js.Dynamic.literal(isDefaultPrevented = isDefaultPrevented.toJsFn, preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeViewDragendEvent]
  }
  
  extension [Self <: TreeViewDragendEvent](x: Self) {
    
    inline def setDestinationNode(value: Element): Self = StObject.set(x, "destinationNode", value.asInstanceOf[js.Any])
    
    inline def setDestinationNodeUndefined: Self = StObject.set(x, "destinationNode", js.undefined)
    
    inline def setDropPosition(value: String): Self = StObject.set(x, "dropPosition", value.asInstanceOf[js.Any])
    
    inline def setDropPositionUndefined: Self = StObject.set(x, "dropPosition", js.undefined)
    
    inline def setSourceNode(value: Element): Self = StObject.set(x, "sourceNode", value.asInstanceOf[js.Any])
    
    inline def setSourceNodeUndefined: Self = StObject.set(x, "sourceNode", js.undefined)
  }
}
