package typingsJapgolly.angularDevkitBuildAngular.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined esbuild.esbuild.BuildFailure & {  outputFiles :never | undefined} */
trait BuildFailureoutputFilesne extends StObject {
  
  /* standard es2022.error */
  var cause: js.UndefOr[Any] = js.undefined
  
  var errors: js.Array[typingsJapgolly.esbuild.mod.Message]
  
  /* standard es5 */
  var message: String
  
  /* standard es5 */
  var name: String
  
  var outputFiles: js.UndefOr[scala.Nothing] = js.undefined
  
  /* standard es5 */
  var stack: js.UndefOr[String] = js.undefined
  
  var warnings: js.Array[typingsJapgolly.esbuild.mod.Message]
}
object BuildFailureoutputFilesne {
  
  inline def apply(
    errors: js.Array[typingsJapgolly.esbuild.mod.Message],
    message: String,
    name: String,
    warnings: js.Array[typingsJapgolly.esbuild.mod.Message]
  ): BuildFailureoutputFilesne = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildFailureoutputFilesne]
  }
  
  extension [Self <: BuildFailureoutputFilesne](x: Self) {
    
    inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setErrors(value: js.Array[typingsJapgolly.esbuild.mod.Message]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: typingsJapgolly.esbuild.mod.Message*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setWarnings(value: js.Array[typingsJapgolly.esbuild.mod.Message]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: typingsJapgolly.esbuild.mod.Message*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
