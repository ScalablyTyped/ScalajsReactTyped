package typingsJapgolly.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `6` extends StObject {
  
  var method: String
  
  var parameters: js.Array[DefaultValueMaxValue | MaxValueMinValue]
}
object `6` {
  
  inline def apply(method: String, parameters: js.Array[DefaultValueMaxValue | MaxValueMinValue]): `6` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`6`]
  }
  
  extension [Self <: `6`](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[DefaultValueMaxValue | MaxValueMinValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (DefaultValueMaxValue | MaxValueMinValue)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
