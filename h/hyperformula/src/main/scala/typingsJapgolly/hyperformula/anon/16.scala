package typingsJapgolly.hyperformula.anon

import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.NumberType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16` extends StObject {
  
  var method: String
  
  var parameters: js.Array[ArgumentTypeArgumentTypesGreaterThanUndefined | GreaterThanNumber]
  
  var returnNumberType: NumberType
}
object `16` {
  
  inline def apply(
    method: String,
    parameters: js.Array[ArgumentTypeArgumentTypesGreaterThanUndefined | GreaterThanNumber],
    returnNumberType: NumberType
  ): `16` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], returnNumberType = returnNumberType.asInstanceOf[js.Any])
    __obj.asInstanceOf[`16`]
  }
  
  extension [Self <: `16`](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[ArgumentTypeArgumentTypesGreaterThanUndefined | GreaterThanNumber]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (ArgumentTypeArgumentTypesGreaterThanUndefined | GreaterThanNumber)*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setReturnNumberType(value: NumberType): Self = StObject.set(x, "returnNumberType", value.asInstanceOf[js.Any])
  }
}
