package typingsJapgolly.rcTree.anon

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.rcTree.esInterfaceMod.BasicDataNode
import typingsJapgolly.rcTree.esInterfaceMod.EventDataNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventMouseEvent[TreeDataType /* <: BasicDataNode */] extends StObject {
  
  var event: ReactMouseEventFrom[Element]
  
  var node: EventDataNode[TreeDataType]
}
object EventMouseEvent {
  
  inline def apply[TreeDataType /* <: BasicDataNode */](event: ReactMouseEventFrom[Element], node: EventDataNode[TreeDataType]): EventMouseEvent[TreeDataType] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMouseEvent[TreeDataType]]
  }
  
  extension [Self <: EventMouseEvent[?], TreeDataType /* <: BasicDataNode */](x: Self & EventMouseEvent[TreeDataType]) {
    
    inline def setEvent(value: ReactMouseEventFrom[Element]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setNode(value: EventDataNode[TreeDataType]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
  }
}
