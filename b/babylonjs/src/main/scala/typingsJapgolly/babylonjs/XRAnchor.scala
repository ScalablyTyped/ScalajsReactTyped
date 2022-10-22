package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRAnchor extends StObject {
  
  var anchorSpace: EventTarget
  
  def delete(): Unit
}
object XRAnchor {
  
  inline def apply(anchorSpace: EventTarget, delete: Callback): XRAnchor = {
    val __obj = js.Dynamic.literal(anchorSpace = anchorSpace.asInstanceOf[js.Any], delete = delete.toJsFn)
    __obj.asInstanceOf[XRAnchor]
  }
  
  extension [Self <: XRAnchor](x: Self) {
    
    inline def setAnchorSpace(value: EventTarget): Self = StObject.set(x, "anchorSpace", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: Callback): Self = StObject.set(x, "delete", value.toJsFn)
  }
}
