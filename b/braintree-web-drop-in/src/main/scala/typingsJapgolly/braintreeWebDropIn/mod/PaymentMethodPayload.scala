package typingsJapgolly.braintreeWebDropIn.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.braintreeWebDropIn.braintreeWebDropInStrings.AndroidPayCard
import typingsJapgolly.braintreeWebDropIn.braintreeWebDropInStrings.ApplePayCard
import typingsJapgolly.braintreeWebDropIn.braintreeWebDropInStrings.CreditCard
import typingsJapgolly.braintreeWebDropIn.braintreeWebDropInStrings.PayPalAccount
import typingsJapgolly.braintreeWebDropIn.braintreeWebDropInStrings.VenmoAccount
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodPayload
  extends /* key */ StringDictionary[js.Any] {
  var details: js.Object
  var deviceData: String | Null
  var nonce: String
  var `type`: CreditCard | PayPalAccount | VenmoAccount | AndroidPayCard | ApplePayCard
}

object PaymentMethodPayload {
  @scala.inline
  def apply(
    details: js.Object,
    nonce: String,
    `type`: CreditCard | PayPalAccount | VenmoAccount | AndroidPayCard | ApplePayCard,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    deviceData: String = null
  ): PaymentMethodPayload = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (deviceData != null) __obj.updateDynamic("deviceData")(deviceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethodPayload]
  }
}

