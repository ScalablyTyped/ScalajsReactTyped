package typingsJapgolly.stripe

import typingsJapgolly.stripe.stripeStrings.available
import typingsJapgolly.stripe.stripeStrings.email
import typingsJapgolly.stripe.stripeStrings.manual
import typingsJapgolly.stripe.stripeStrings.missing
import typingsJapgolly.stripe.stripeStrings.none
import typingsJapgolly.stripe.stripeStrings.requested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmountcharged extends js.Object {
  var address: String
  var amount_charged: Double
  var amount_received: Double
  var amount_returned: Double
  var refund_attributes_method: email | manual | none
  var refund_attributes_status: missing | requested | available
}

object AnonAmountcharged {
  @scala.inline
  def apply(
    address: String,
    amount_charged: Double,
    amount_received: Double,
    amount_returned: Double,
    refund_attributes_method: email | manual | none,
    refund_attributes_status: missing | requested | available
  ): AnonAmountcharged = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], amount_charged = amount_charged.asInstanceOf[js.Any], amount_received = amount_received.asInstanceOf[js.Any], amount_returned = amount_returned.asInstanceOf[js.Any], refund_attributes_method = refund_attributes_method.asInstanceOf[js.Any], refund_attributes_status = refund_attributes_status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAmountcharged]
  }
}

