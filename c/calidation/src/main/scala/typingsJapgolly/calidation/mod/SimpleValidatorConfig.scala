package typingsJapgolly.calidation.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimpleValidatorConfig[T /* <: js.Object */] extends StObject {
  
  var message: String
  
  var validateIf: js.UndefOr[(js.Function1[/* context */ ValidatorContext[T], Boolean]) | Boolean] = js.undefined
}
object SimpleValidatorConfig {
  
  inline def apply[T /* <: js.Object */](message: String): SimpleValidatorConfig[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleValidatorConfig[T]]
  }
  
  extension [Self <: SimpleValidatorConfig[?], T /* <: js.Object */](x: Self & SimpleValidatorConfig[T]) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setValidateIf(value: (js.Function1[/* context */ ValidatorContext[T], Boolean]) | Boolean): Self = StObject.set(x, "validateIf", value.asInstanceOf[js.Any])
    
    inline def setValidateIfFunction1(value: /* context */ ValidatorContext[T] => Boolean): Self = StObject.set(x, "validateIf", js.Any.fromFunction1(value))
    
    inline def setValidateIfUndefined: Self = StObject.set(x, "validateIf", js.undefined)
  }
}
