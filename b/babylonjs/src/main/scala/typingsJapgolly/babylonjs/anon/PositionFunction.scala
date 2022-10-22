package typingsJapgolly.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PositionFunction extends StObject {
  
  var positionFunction: js.UndefOr[Any] = js.undefined
  
  var storage: js.UndefOr[js.Array[Any]] = js.undefined
  
  var vertexFunction: js.UndefOr[Any] = js.undefined
}
object PositionFunction {
  
  inline def apply(): PositionFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionFunction]
  }
  
  extension [Self <: PositionFunction](x: Self) {
    
    inline def setPositionFunction(value: Any): Self = StObject.set(x, "positionFunction", value.asInstanceOf[js.Any])
    
    inline def setPositionFunctionUndefined: Self = StObject.set(x, "positionFunction", js.undefined)
    
    inline def setStorage(value: js.Array[Any]): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    inline def setStorageVarargs(value: Any*): Self = StObject.set(x, "storage", js.Array(value*))
    
    inline def setVertexFunction(value: Any): Self = StObject.set(x, "vertexFunction", value.asInstanceOf[js.Any])
    
    inline def setVertexFunctionUndefined: Self = StObject.set(x, "vertexFunction", js.undefined)
  }
}
