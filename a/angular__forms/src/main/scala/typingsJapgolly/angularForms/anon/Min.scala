package typingsJapgolly.angularForms.anon

import typingsJapgolly.angularForms.angularFormsStrings.min
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Min extends StObject {
  
  var min: typingsJapgolly.angularForms.angularFormsStrings.min
}
object Min {
  
  inline def apply(): Min = {
    val __obj = js.Dynamic.literal(min = "min")
    __obj.asInstanceOf[Min]
  }
  
  extension [Self <: Min](x: Self) {
    
    inline def setMin(value: min): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
  }
}
