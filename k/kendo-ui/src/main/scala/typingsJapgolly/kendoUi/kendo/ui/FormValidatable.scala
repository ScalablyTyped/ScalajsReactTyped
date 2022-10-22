package typingsJapgolly.kendoUi.kendo.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormValidatable extends StObject {
  
  var errorTemplate: String | js.Function
  
  var validateOnBlur: Boolean
  
  var validationSummary: Boolean
}
object FormValidatable {
  
  inline def apply(errorTemplate: String | js.Function, validateOnBlur: Boolean, validationSummary: Boolean): FormValidatable = {
    val __obj = js.Dynamic.literal(errorTemplate = errorTemplate.asInstanceOf[js.Any], validateOnBlur = validateOnBlur.asInstanceOf[js.Any], validationSummary = validationSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormValidatable]
  }
  
  extension [Self <: FormValidatable](x: Self) {
    
    inline def setErrorTemplate(value: String | js.Function): Self = StObject.set(x, "errorTemplate", value.asInstanceOf[js.Any])
    
    inline def setValidateOnBlur(value: Boolean): Self = StObject.set(x, "validateOnBlur", value.asInstanceOf[js.Any])
    
    inline def setValidationSummary(value: Boolean): Self = StObject.set(x, "validationSummary", value.asInstanceOf[js.Any])
  }
}
