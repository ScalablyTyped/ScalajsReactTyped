package typingsJapgolly.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentOperatorsResult
  extends StObject
     with ResultStatus {
  
  var operators: js.Array[AgentOperatorInfo]
}
object AgentOperatorsResult {
  
  inline def apply(errorMessage: String, operators: js.Array[AgentOperatorInfo], success: Boolean): AgentOperatorsResult = {
    val __obj = js.Dynamic.literal(errorMessage = errorMessage.asInstanceOf[js.Any], operators = operators.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentOperatorsResult]
  }
  
  extension [Self <: AgentOperatorsResult](x: Self) {
    
    inline def setOperators(value: js.Array[AgentOperatorInfo]): Self = StObject.set(x, "operators", value.asInstanceOf[js.Any])
    
    inline def setOperatorsVarargs(value: AgentOperatorInfo*): Self = StObject.set(x, "operators", js.Array(value*))
  }
}
