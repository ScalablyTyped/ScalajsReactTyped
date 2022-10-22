package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlashSwfPanel extends StObject {
  
  def call(): Any
  
  var name: Any
  
  var path: Any
  
  def setFocus(): Any
}
object FlashSwfPanel {
  
  inline def apply(call: CallbackTo[Any], name: Any, path: Any, setFocus: CallbackTo[Any]): FlashSwfPanel = {
    val __obj = js.Dynamic.literal(call = call.toJsFn, name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], setFocus = setFocus.toJsFn)
    __obj.asInstanceOf[FlashSwfPanel]
  }
  
  extension [Self <: FlashSwfPanel](x: Self) {
    
    inline def setCall(value: CallbackTo[Any]): Self = StObject.set(x, "call", value.toJsFn)
    
    inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSetFocus(value: CallbackTo[Any]): Self = StObject.set(x, "setFocus", value.toJsFn)
  }
}
