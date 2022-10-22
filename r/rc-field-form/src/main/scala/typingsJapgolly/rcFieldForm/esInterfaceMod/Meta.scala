package typingsJapgolly.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Meta extends StObject {
  
  var errors: js.Array[String]
  
  var name: InternalNamePath
  
  var touched: Boolean
  
  var validating: Boolean
  
  var warnings: js.Array[String]
}
object Meta {
  
  inline def apply(
    errors: js.Array[String],
    name: InternalNamePath,
    touched: Boolean,
    validating: Boolean,
    warnings: js.Array[String]
  ): Meta = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], validating = validating.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  
  extension [Self <: Meta](x: Self) {
    
    inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setName(value: InternalNamePath): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameVarargs(value: (String | Double)*): Self = StObject.set(x, "name", js.Array(value*))
    
    inline def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
    
    inline def setValidating(value: Boolean): Self = StObject.set(x, "validating", value.asInstanceOf[js.Any])
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
