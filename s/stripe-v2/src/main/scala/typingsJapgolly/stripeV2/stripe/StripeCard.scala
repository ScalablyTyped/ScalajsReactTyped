package typingsJapgolly.stripeV2.stripe

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeCard extends js.Object {
  var address_city: js.UndefOr[String] = js.undefined
  var address_country: js.UndefOr[String] = js.undefined
  var address_line1: js.UndefOr[String] = js.undefined
  var address_line2: js.UndefOr[String] = js.undefined
  var address_state: js.UndefOr[String] = js.undefined
  var address_zip: js.UndefOr[String] = js.undefined
  var brand: js.UndefOr[StripeCardDataBrand] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var exp_month: Double
  var exp_year: Double
  var funding: js.UndefOr[StripeCardDataFunding] = js.undefined
  var last4: String
  var name: js.UndefOr[String] = js.undefined
  var `object`: String
  def createToken(
    data: StripeCardTokenData,
    responseHandler: js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]
  ): Unit
  def validateCVC(cardCVC: String): Boolean
  def validateCardNumber(cardNumber: String): Boolean
  def validateExpiry(month: String, year: String): Boolean
}

object StripeCard {
  @scala.inline
  def apply(
    createToken: (StripeCardTokenData, js.Function2[/* status */ Double, /* response */ StripeCardTokenResponse, Unit]) => Callback,
    exp_month: Double,
    exp_year: Double,
    last4: String,
    `object`: String,
    validateCVC: String => CallbackTo[Boolean],
    validateCardNumber: String => CallbackTo[Boolean],
    validateExpiry: (String, String) => CallbackTo[Boolean],
    address_city: String = null,
    address_country: String = null,
    address_line1: String = null,
    address_line2: String = null,
    address_state: String = null,
    address_zip: String = null,
    brand: StripeCardDataBrand = null,
    country: String = null,
    funding: StripeCardDataFunding = null,
    name: String = null
  ): StripeCard = {
    val __obj = js.Dynamic.literal(exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any])
    __obj.updateDynamic("createToken")(js.Any.fromFunction2((t0: typingsJapgolly.stripeV2.stripe.StripeCardTokenData, t1: js.Function2[
  /* status */ scala.Double, 
  /* response */ typingsJapgolly.stripeV2.stripe.StripeCardTokenResponse, 
  scala.Unit]) => createToken(t0, t1).runNow()))
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("validateCVC")(js.Any.fromFunction1((t0: java.lang.String) => validateCVC(t0).runNow()))
    __obj.updateDynamic("validateCardNumber")(js.Any.fromFunction1((t0: java.lang.String) => validateCardNumber(t0).runNow()))
    __obj.updateDynamic("validateExpiry")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => validateExpiry(t0, t1).runNow()))
    if (address_city != null) __obj.updateDynamic("address_city")(address_city.asInstanceOf[js.Any])
    if (address_country != null) __obj.updateDynamic("address_country")(address_country.asInstanceOf[js.Any])
    if (address_line1 != null) __obj.updateDynamic("address_line1")(address_line1.asInstanceOf[js.Any])
    if (address_line2 != null) __obj.updateDynamic("address_line2")(address_line2.asInstanceOf[js.Any])
    if (address_state != null) __obj.updateDynamic("address_state")(address_state.asInstanceOf[js.Any])
    if (address_zip != null) __obj.updateDynamic("address_zip")(address_zip.asInstanceOf[js.Any])
    if (brand != null) __obj.updateDynamic("brand")(brand.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (funding != null) __obj.updateDynamic("funding")(funding.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeCard]
  }
}

