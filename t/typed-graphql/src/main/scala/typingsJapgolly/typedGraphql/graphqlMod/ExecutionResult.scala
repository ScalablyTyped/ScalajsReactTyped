package typingsJapgolly.typedGraphql.graphqlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionResult extends StObject {
  
  var data: Any
  
  var errors: js.UndefOr[js.Array[js.Error]] = js.undefined
}
object ExecutionResult {
  
  inline def apply(data: Any): ExecutionResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionResult]
  }
  
  extension [Self <: ExecutionResult](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: js.Array[js.Error]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: js.Error*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
