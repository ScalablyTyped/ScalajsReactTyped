package typingsJapgolly.reactPaymentInputs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CardNumberCardType extends StObject {
  
  var cardNumber: String
  
  var cardType: typingsJapgolly.reactPaymentInputs.mod.CardType
  
  var errorMessages: typingsJapgolly.reactPaymentInputs.mod.ErrorMessages
}
object CardNumberCardType {
  
  inline def apply(
    cardNumber: String,
    cardType: typingsJapgolly.reactPaymentInputs.mod.CardType,
    errorMessages: typingsJapgolly.reactPaymentInputs.mod.ErrorMessages
  ): CardNumberCardType = {
    val __obj = js.Dynamic.literal(cardNumber = cardNumber.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], errorMessages = errorMessages.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardNumberCardType]
  }
  
  extension [Self <: CardNumberCardType](x: Self) {
    
    inline def setCardNumber(value: String): Self = StObject.set(x, "cardNumber", value.asInstanceOf[js.Any])
    
    inline def setCardType(value: typingsJapgolly.reactPaymentInputs.mod.CardType): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    inline def setErrorMessages(value: typingsJapgolly.reactPaymentInputs.mod.ErrorMessages): Self = StObject.set(x, "errorMessages", value.asInstanceOf[js.Any])
  }
}
