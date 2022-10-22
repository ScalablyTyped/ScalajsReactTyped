package typingsJapgolly.hyperformula.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MethodStringParametersArray extends StObject {
  
  var method: String
  
  var parameters: js.Array[DefaultValue | PassSubtype | ArgumentTypeDefaultValue]
}
object MethodStringParametersArray {
  
  inline def apply(method: String, parameters: js.Array[DefaultValue | PassSubtype | ArgumentTypeDefaultValue]): MethodStringParametersArray = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodStringParametersArray]
  }
  
  extension [Self <: MethodStringParametersArray](x: Self) {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: js.Array[DefaultValue | PassSubtype | ArgumentTypeDefaultValue]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: (DefaultValue | PassSubtype | ArgumentTypeDefaultValue)*): Self = StObject.set(x, "parameters", js.Array(value*))
  }
}
