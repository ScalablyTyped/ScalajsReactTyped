package typingsJapgolly.maximMazurokGapiClientDeploymentmanager.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errors extends StObject {
  
  /** [Output Only] The array of errors encountered while processing this operation. */
  var errors: js.UndefOr[js.Array[Code]] = js.undefined
}
object Errors {
  
  inline def apply(): Errors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Errors]
  }
  
  extension [Self <: Errors](x: Self) {
    
    inline def setErrors(value: js.Array[Code]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setErrorsVarargs(value: Code*): Self = StObject.set(x, "errors", js.Array(value*))
  }
}
