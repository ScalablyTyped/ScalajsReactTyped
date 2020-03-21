package typingsJapgolly.stripe.mod.paymentMethods

import typingsJapgolly.stripe.stripeStrings.google_pay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePayWallet
  extends TokenizedWallet
     with CardWallet {
  var `type`: google_pay
}

object GooglePayWallet {
  @scala.inline
  def apply(`type`: google_pay, dynamic_last4: String = null): GooglePayWallet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dynamic_last4 != null) __obj.updateDynamic("dynamic_last4")(dynamic_last4.asInstanceOf[js.Any])
    __obj.asInstanceOf[GooglePayWallet]
  }
}

