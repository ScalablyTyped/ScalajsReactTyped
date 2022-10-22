package typingsJapgolly.primereact.treeTreeMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeSelectionParams extends StObject {
  
  var originalEvent: ReactEventFrom[Element]
  
  var value: TreeSelectionKeys
}
object TreeSelectionParams {
  
  inline def apply(originalEvent: ReactEventFrom[Element]): TreeSelectionParams = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[TreeSelectionParams]
  }
  
  extension [Self <: TreeSelectionParams](x: Self) {
    
    inline def setOriginalEvent(value: ReactEventFrom[Element]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TreeSelectionKeys): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
  }
}
