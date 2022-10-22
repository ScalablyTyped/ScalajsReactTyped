package typingsJapgolly.baseui.anon

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.std.ClientRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewState extends StObject {
  
  var newIndex: Double
  
  var newState: js.Array[Node]
  
  var oldIndex: Double
  
  var targetRect: ClientRect
}
object NewState {
  
  inline def apply(newIndex: Double, newState: js.Array[Node], oldIndex: Double, targetRect: ClientRect): NewState = {
    val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], newState = newState.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], targetRect = targetRect.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewState]
  }
  
  extension [Self <: NewState](x: Self) {
    
    inline def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
    
    inline def setNewState(value: js.Array[Node]): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
    
    inline def setNewStateVarargs(value: Node*): Self = StObject.set(x, "newState", js.Array(value*))
    
    inline def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
    
    inline def setTargetRect(value: ClientRect): Self = StObject.set(x, "targetRect", value.asInstanceOf[js.Any])
  }
}
