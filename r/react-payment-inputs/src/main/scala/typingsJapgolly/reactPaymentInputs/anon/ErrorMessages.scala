package typingsJapgolly.reactPaymentInputs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorMessages extends StObject {
  
  var errorMessages: typingsJapgolly.reactPaymentInputs.mod.ErrorMessages
}
object ErrorMessages {
  
  inline def apply(errorMessages: typingsJapgolly.reactPaymentInputs.mod.ErrorMessages): ErrorMessages = {
    val __obj = js.Dynamic.literal(errorMessages = errorMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorMessages]
  }
  
  extension [Self <: ErrorMessages](x: Self) {
    
    inline def setErrorMessages(value: typingsJapgolly.reactPaymentInputs.mod.ErrorMessages): Self = StObject.set(x, "errorMessages", value.asInstanceOf[js.Any])
  }
}
