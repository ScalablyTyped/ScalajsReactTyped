package typingsJapgolly.typescript.anon

import typingsJapgolly.typescript.mod.CompilerOptions
import typingsJapgolly.typescript.mod.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Errors extends StObject {
  
  var errors: js.Array[Diagnostic]
  
  var options: CompilerOptions
}
object Errors {
  
  inline def apply(errors: js.Array[Diagnostic], options: CompilerOptions): Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[Errors]
  }
  
  extension [Self <: Errors](x: Self) {
    
    inline def setErrors(value: js.Array[Diagnostic]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: Diagnostic*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setOptions(value: CompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
  }
}
