package typingsJapgolly.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetVariableResult extends StObject {
  
  /**
    * The errors from the request.
    */
  var errors: js.UndefOr[BatchGetVariableErrorList] = js.undefined
  
  /**
    * The returned variables.
    */
  var variables: js.UndefOr[VariableList] = js.undefined
}
object BatchGetVariableResult {
  
  inline def apply(): BatchGetVariableResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetVariableResult]
  }
  
  extension [Self <: BatchGetVariableResult](x: Self) {
    
    inline def setErrors(value: BatchGetVariableErrorList): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: BatchGetVariableError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setVariables(value: VariableList): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
    
    inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
    
    inline def setVariablesVarargs(value: Variable*): Self = StObject.set(x, "variables", js.Array(value*))
  }
}
