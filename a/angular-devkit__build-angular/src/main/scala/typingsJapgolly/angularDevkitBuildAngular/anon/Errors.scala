package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errors extends StObject {
  
  var errors: js.Array[typingsJapgolly.esbuild.mod.Message]
  
  var warnings: js.Array[typingsJapgolly.esbuild.mod.Message]
}
object Errors {
  
  inline def apply(
    errors: js.Array[typingsJapgolly.esbuild.mod.Message],
    warnings: js.Array[typingsJapgolly.esbuild.mod.Message]
  ): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  
  extension [Self <: Errors](x: Self) {
    
    inline def setErrors(value: js.Array[typingsJapgolly.esbuild.mod.Message]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: typingsJapgolly.esbuild.mod.Message*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setWarnings(value: js.Array[typingsJapgolly.esbuild.mod.Message]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: typingsJapgolly.esbuild.mod.Message*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
