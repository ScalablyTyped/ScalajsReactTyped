package typingsJapgolly.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputValue extends StObject {
  
  var inputValue: String
  
  var ok: Boolean
}
object InputValue {
  
  inline def apply(inputValue: String, ok: Boolean): InputValue = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputValue]
  }
  
  extension [Self <: InputValue](x: Self) {
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
  }
}
