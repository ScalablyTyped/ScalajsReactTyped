package typingsJapgolly.stripe.mod.paymentMethods

import typingsJapgolly.stripe.stripeStrings.visa_checkout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisaCheckoutWallet extends CardWallet {
  var `type`: visa_checkout
  var visa_checkout: WalletData
}

object VisaCheckoutWallet {
  @scala.inline
  def apply(`type`: visa_checkout, visa_checkout: WalletData): VisaCheckoutWallet = {
    val __obj = js.Dynamic.literal(visa_checkout = visa_checkout.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisaCheckoutWallet]
  }
}

