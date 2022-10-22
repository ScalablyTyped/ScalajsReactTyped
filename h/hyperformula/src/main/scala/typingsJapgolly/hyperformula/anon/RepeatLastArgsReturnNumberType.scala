package typingsJapgolly.hyperformula.anon

import typingsJapgolly.hyperformula.typingsInterpreterInterpreterValueMod.NumberType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RepeatLastArgsReturnNumberType extends StObject {
  
  var method: String
  
  var parameters: js.Array[ArgumentType]
  
  var repeatLastArgs: Double
  
  var returnNumberType: NumberType
}
object RepeatLastArgsReturnNumberType {
  
  inline def apply(
    method: String,
    parameters: js.Array[ArgumentType],
    repeatLastArgs: Double,
    returnNumberType: NumberType
  ): RepeatLastArgsReturnNumberType = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any], repeatLastArgs = repeatLastArgs.asInstanceOf[js.Any], returnNumberType = returnNumberType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RepeatLastArgsReturnNumberType]
  }
  
  extension [Self <: RepeatLastArgsReturnNumberType](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[ArgumentType]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: ArgumentType*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setRepeatLastArgs(value: Double): Self = StObject.set(x, "repeatLastArgs", value.asInstanceOf[js.Any])
    
    inline def setReturnNumberType(value: NumberType): Self = StObject.set(x, "returnNumberType", value.asInstanceOf[js.Any])
  }
}
