package typingsJapgolly.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var method: String
  
  var parameters: js.Array[DefaultValueMinValue | ArgumentTypeDefaultValueMinValue]
}
object `3` {
  
  inline def apply(method: String, parameters: js.Array[DefaultValueMinValue | ArgumentTypeDefaultValueMinValue]): `3` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[DefaultValueMinValue | ArgumentTypeDefaultValueMinValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (DefaultValueMinValue | ArgumentTypeDefaultValueMinValue)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
