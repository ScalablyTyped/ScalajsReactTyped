package typingsJapgolly.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var method: String
  
  var parameters: js.Array[DefaultValueUndefined | DefaultValueString]
}
object `1` {
  
  inline def apply(method: String, parameters: js.Array[DefaultValueUndefined | DefaultValueString]): `1` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[DefaultValueUndefined | DefaultValueString]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (DefaultValueUndefined | DefaultValueString)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
