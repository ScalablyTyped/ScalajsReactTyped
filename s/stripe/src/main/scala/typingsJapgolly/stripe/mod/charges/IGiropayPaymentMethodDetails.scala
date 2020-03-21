package typingsJapgolly.stripe.mod.charges

import typingsJapgolly.stripe.stripeStrings.giropay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGiropayPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: giropay
}

object IGiropayPaymentMethodDetails {
  @scala.inline
  def apply(`type`: giropay): IGiropayPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGiropayPaymentMethodDetails]
  }
}

