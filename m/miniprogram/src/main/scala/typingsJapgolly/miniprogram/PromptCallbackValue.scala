package typingsJapgolly.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromptCallbackValue extends StObject {
  
  /**
    * When OK is true, return the user's entry.
    */
  var inputValue: String
  
  /**
    * Click OK to return true; click Cancel to return false.
    */
  var ok: Boolean
}
object PromptCallbackValue {
  
  inline def apply(inputValue: String, ok: Boolean): PromptCallbackValue = {
    val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromptCallbackValue]
  }
  
  extension [Self <: PromptCallbackValue](x: Self) {
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
  }
}
