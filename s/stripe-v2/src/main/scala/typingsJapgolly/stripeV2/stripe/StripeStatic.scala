package typingsJapgolly.stripeV2.stripe

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StripeStatic extends StObject {
  
  var applePay: StripeApplePay
  
  var bankAccount: StripeBankAccount
  
  var card: StripeCard
  
  def cardType(cardNumber: String): StripeCardDataBrand
  
  def createToken(
    data: StripeCardTokenData,
    responseHandler: js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]
  ): Unit
  
  def getToken(
    token: String,
    responseHandler: js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]
  ): Unit
  
  def setPublishableKey(key: String): Unit
  
  def validateCVC(cardCVC: String): Boolean
  
  def validateCardNumber(cardNumber: String): Boolean
  
  def validateExpiry(month: String, year: String): Boolean
}
object StripeStatic {
  
  inline def apply(
    applePay: StripeApplePay,
    bankAccount: StripeBankAccount,
    card: StripeCard,
    cardType: String => StripeCardDataBrand,
    createToken: (StripeCardTokenData, js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => Callback,
    getToken: (String, js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => Callback,
    setPublishableKey: String => Callback,
    validateCVC: String => Boolean,
    validateCardNumber: String => Boolean,
    validateExpiry: (String, String) => Boolean
  ): StripeStatic = {
    val __obj = js.Dynamic.literal(applePay = applePay.asInstanceOf[js.Any], bankAccount = bankAccount.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], cardType = js.Any.fromFunction1(cardType), createToken = js.Any.fromFunction2((t0: StripeCardTokenData, t1: js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => (createToken(t0, t1)).runNow()), getToken = js.Any.fromFunction2((t0: String, t1: js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => (getToken(t0, t1)).runNow()), setPublishableKey = js.Any.fromFunction1((t0: String) => setPublishableKey(t0).runNow()), validateCVC = js.Any.fromFunction1(validateCVC), validateCardNumber = js.Any.fromFunction1(validateCardNumber), validateExpiry = js.Any.fromFunction2(validateExpiry))
    __obj.asInstanceOf[StripeStatic]
  }
  
  extension [Self <: StripeStatic](x: Self) {
    
    inline def setApplePay(value: StripeApplePay): Self = StObject.set(x, "applePay", value.asInstanceOf[js.Any])
    
    inline def setBankAccount(value: StripeBankAccount): Self = StObject.set(x, "bankAccount", value.asInstanceOf[js.Any])
    
    inline def setCard(value: StripeCard): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setCardType(value: String => StripeCardDataBrand): Self = StObject.set(x, "cardType", js.Any.fromFunction1(value))
    
    inline def setCreateToken(
      value: (StripeCardTokenData, js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => Callback
    ): Self = StObject.set(x, "createToken", js.Any.fromFunction2((t0: StripeCardTokenData, t1: js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setGetToken(
      value: (String, js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => Callback
    ): Self = StObject.set(x, "getToken", js.Any.fromFunction2((t0: String, t1: js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setSetPublishableKey(value: String => Callback): Self = StObject.set(x, "setPublishableKey", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setValidateCVC(value: String => Boolean): Self = StObject.set(x, "validateCVC", js.Any.fromFunction1(value))
    
    inline def setValidateCardNumber(value: String => Boolean): Self = StObject.set(x, "validateCardNumber", js.Any.fromFunction1(value))
    
    inline def setValidateExpiry(value: (String, String) => Boolean): Self = StObject.set(x, "validateExpiry", js.Any.fromFunction2(value))
  }
}
