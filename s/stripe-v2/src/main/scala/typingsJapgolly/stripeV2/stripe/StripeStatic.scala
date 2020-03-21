package typingsJapgolly.stripeV2.stripe

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeStatic extends js.Object {
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
  @scala.inline
  def apply(
    applePay: StripeApplePay,
    bankAccount: StripeBankAccount,
    card: StripeCard,
    cardType: String => CallbackTo[StripeCardDataBrand],
    createToken: (StripeCardTokenData, js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => Callback,
    getToken: (String, js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => Callback,
    setPublishableKey: String => Callback,
    validateCVC: String => CallbackTo[Boolean],
    validateCardNumber: String => CallbackTo[Boolean],
    validateExpiry: (String, String) => CallbackTo[Boolean]
  ): StripeStatic = {
    val __obj = js.Dynamic.literal(applePay = applePay.asInstanceOf[js.Any], bankAccount = bankAccount.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any])
    __obj.updateDynamic("cardType")(js.Any.fromFunction1((t0: java.lang.String) => cardType(t0).runNow()))
    __obj.updateDynamic("createToken")(js.Any.fromFunction2((t0: typingsJapgolly.stripeV2.stripe.StripeCardTokenData, t1: js.Function2[
  /* status */ scala.Double, 
  /* response */ typingsJapgolly.stripeV2.stripe.StripeCardTokenResponse, 
  scala.Unit]) => createToken(t0, t1).runNow()))
    __obj.updateDynamic("getToken")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function2[
  /* status */ scala.Double, 
  /* response */ typingsJapgolly.stripeV2.stripe.StripeCardTokenResponse, 
  scala.Unit]) => getToken(t0, t1).runNow()))
    __obj.updateDynamic("setPublishableKey")(js.Any.fromFunction1((t0: java.lang.String) => setPublishableKey(t0).runNow()))
    __obj.updateDynamic("validateCVC")(js.Any.fromFunction1((t0: java.lang.String) => validateCVC(t0).runNow()))
    __obj.updateDynamic("validateCardNumber")(js.Any.fromFunction1((t0: java.lang.String) => validateCardNumber(t0).runNow()))
    __obj.updateDynamic("validateExpiry")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => validateExpiry(t0, t1).runNow()))
    __obj.asInstanceOf[StripeStatic]
  }
}

