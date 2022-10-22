package typingsJapgolly.primereact.treeTreeMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeExpandedParams extends StObject {
  
  var originalEvent: ReactEventFrom[Element]
  
  var value: TreeExpandedKeysType
}
object TreeExpandedParams {
  
  inline def apply(originalEvent: ReactEventFrom[Element], value: TreeExpandedKeysType): TreeExpandedParams = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeExpandedParams]
  }
  
  extension [Self <: TreeExpandedParams](x: Self) {
    
    inline def setOriginalEvent(value: ReactEventFrom[Element]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TreeExpandedKeysType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
