package typingsJapgolly.angularForms.anon

import typingsJapgolly.angularForms.angularFormsStrings.disabled_
import typingsJapgolly.angularForms.angularFormsStrings.formControl
import typingsJapgolly.angularForms.angularFormsStrings.ngModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Form extends StObject {
  
  var form: formControl
  
  var isDisabled: disabled_
  
  var model: ngModel
}
object Form {
  
  inline def apply(): Form = {
    val __obj = js.Dynamic.literal(form = "formControl", isDisabled = "disabled", model = "ngModel")
    __obj.asInstanceOf[Form]
  }
  
  extension [Self <: Form](x: Self) {
    
    inline def setForm(value: formControl): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setIsDisabled(value: disabled_): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
    
    inline def setModel(value: ngModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
  }
}
