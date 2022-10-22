package typingsJapgolly.angularForms.anon

import typingsJapgolly.angularForms.angularFormsStrings.formControlName
import typingsJapgolly.angularForms.angularFormsStrings.name
import typingsJapgolly.angularForms.angularFormsStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormControlName extends StObject {
  
  var formControlName: typingsJapgolly.angularForms.angularFormsStrings.formControlName
  
  var name: typingsJapgolly.angularForms.angularFormsStrings.name
  
  var value: typingsJapgolly.angularForms.angularFormsStrings.value
}
object FormControlName {
  
  inline def apply(): FormControlName = {
    val __obj = js.Dynamic.literal(formControlName = "formControlName", name = "name", value = "value")
    __obj.asInstanceOf[FormControlName]
  }
  
  extension [Self <: FormControlName](x: Self) {
    
    inline def setFormControlName(value: formControlName): Self = StObject.set(x, "formControlName", value.asInstanceOf[js.Any])
    
    inline def setName(value: name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
