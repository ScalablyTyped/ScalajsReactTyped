package typingsJapgolly.weappApi.mod.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasAction extends StObject {
  
  var data: js.Array[CanvasAction | Double | String]
  
  var method: String
}
object CanvasAction {
  
  inline def apply(data: js.Array[CanvasAction | Double | String], method: String): CanvasAction = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasAction]
  }
  
  extension [Self <: CanvasAction](x: Self) {
    
    inline def setData(value: js.Array[CanvasAction | Double | String]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: (CanvasAction | Double | String)*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
  }
}
