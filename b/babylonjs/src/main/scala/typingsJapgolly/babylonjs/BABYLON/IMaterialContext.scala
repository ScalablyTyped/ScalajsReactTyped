package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMaterialContext extends StObject {
  
  def reset(): Unit
  
  var uniqueId: Double
}
object IMaterialContext {
  
  inline def apply(reset: Callback, uniqueId: Double): IMaterialContext = {
    val __obj = js.Dynamic.literal(reset = reset.toJsFn, uniqueId = uniqueId.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMaterialContext]
  }
  
  extension [Self <: IMaterialContext](x: Self) {
    
    inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    
    inline def setUniqueId(value: Double): Self = StObject.set(x, "uniqueId", value.asInstanceOf[js.Any])
  }
}
