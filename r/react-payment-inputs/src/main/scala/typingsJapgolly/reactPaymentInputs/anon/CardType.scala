package typingsJapgolly.reactPaymentInputs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardType extends StObject {
  
  var cardType: typingsJapgolly.reactPaymentInputs.mod.CardType
  
  var cvc: String
  
  var errorMessages: typingsJapgolly.reactPaymentInputs.mod.ErrorMessages
}
object CardType {
  
  inline def apply(
    cardType: typingsJapgolly.reactPaymentInputs.mod.CardType,
    cvc: String,
    errorMessages: typingsJapgolly.reactPaymentInputs.mod.ErrorMessages
  ): CardType = {
    val __obj = js.Dynamic.literal(cardType = cardType.asInstanceOf[js.Any], cvc = cvc.asInstanceOf[js.Any], errorMessages = errorMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardType]
  }
  
  extension [Self <: CardType](x: Self) {
    
    inline def setCardType(value: typingsJapgolly.reactPaymentInputs.mod.CardType): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    inline def setCvc(value: String): Self = StObject.set(x, "cvc", value.asInstanceOf[js.Any])
    
    inline def setErrorMessages(value: typingsJapgolly.reactPaymentInputs.mod.ErrorMessages): Self = StObject.set(x, "errorMessages", value.asInstanceOf[js.Any])
  }
}
