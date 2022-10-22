package typingsJapgolly.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Checkbox extends StObject {
  
  var checkbox: Boolean
  
  var radio: Boolean
}
object Checkbox {
  
  inline def apply(checkbox: Boolean, radio: Boolean): Checkbox = {
    val __obj = js.Dynamic.literal(checkbox = checkbox.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any])
    __obj.asInstanceOf[Checkbox]
  }
  
  extension [Self <: Checkbox](x: Self) {
    
    inline def setCheckbox(value: Boolean): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    inline def setRadio(value: Boolean): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
  }
}
