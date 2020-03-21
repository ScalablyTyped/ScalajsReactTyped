package typingsJapgolly.stripe.mod.charges

import typingsJapgolly.stripe.stripeStrings.eps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEpsPaymentMethodDetails extends IPaymentMethodDetails {
  var `type`: eps
}

object IEpsPaymentMethodDetails {
  @scala.inline
  def apply(`type`: eps): IEpsPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEpsPaymentMethodDetails]
  }
}

