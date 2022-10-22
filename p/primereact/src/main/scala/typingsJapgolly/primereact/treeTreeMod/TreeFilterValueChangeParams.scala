package typingsJapgolly.primereact.treeTreeMod

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TreeFilterValueChangeParams extends StObject {
  
  var originalEvent: ReactEventFrom[HTMLInputElement]
  
  var value: String
}
object TreeFilterValueChangeParams {
  
  inline def apply(originalEvent: ReactEventFrom[HTMLInputElement], value: String): TreeFilterValueChangeParams = {
    val __obj = js.Dynamic.literal(originalEvent = originalEvent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeFilterValueChangeParams]
  }
  
  extension [Self <: TreeFilterValueChangeParams](x: Self) {
    
    inline def setOriginalEvent(value: ReactEventFrom[HTMLInputElement]): Self = StObject.set(x, "originalEvent", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
