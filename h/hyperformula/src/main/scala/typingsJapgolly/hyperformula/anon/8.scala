package typingsJapgolly.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `8` extends StObject {
  
  var method: String
  
  var parameters: js.Array[
    DefaultValueMinValueOptionalArg | ArgumentTypeDefaultValueMinValueOptionalArg | MinValueUndefined
  ]
}
object `8` {
  
  inline def apply(
    method: String,
    parameters: js.Array[
      DefaultValueMinValueOptionalArg | ArgumentTypeDefaultValueMinValueOptionalArg | MinValueUndefined
    ]
  ): `8` = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[`8`]
  }
  
  extension [Self <: `8`](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(
      value: js.Array[
          DefaultValueMinValueOptionalArg | ArgumentTypeDefaultValueMinValueOptionalArg | MinValueUndefined
        ]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(
      value: (DefaultValueMinValueOptionalArg | ArgumentTypeDefaultValueMinValueOptionalArg | MinValueUndefined)*
    ): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
