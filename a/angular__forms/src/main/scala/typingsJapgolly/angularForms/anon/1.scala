package typingsJapgolly.angularForms.anon

import typingsJapgolly.angularForms.angularFormsStrings.formGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var form: formGroup
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal(form = "formGroup")
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setForm(value: formGroup): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
  }
}
