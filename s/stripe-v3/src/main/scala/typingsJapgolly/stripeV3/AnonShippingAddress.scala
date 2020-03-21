package typingsJapgolly.stripeV3

import japgolly.scalajs.react.Callback
import typingsJapgolly.stripeV3.stripe.paymentRequest.ShippingAddress
import typingsJapgolly.stripeV3.stripe.paymentRequest.UpdateDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShippingAddress extends js.Object {
  var shippingAddress: ShippingAddress
  def updateWith(options: UpdateDetails): Unit
}

object AnonShippingAddress {
  @scala.inline
  def apply(shippingAddress: ShippingAddress, updateWith: UpdateDetails => Callback): AnonShippingAddress = {
    val __obj = js.Dynamic.literal(shippingAddress = shippingAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("updateWith")(js.Any.fromFunction1((t0: typingsJapgolly.stripeV3.stripe.paymentRequest.UpdateDetails) => updateWith(t0).runNow()))
    __obj.asInstanceOf[AnonShippingAddress]
  }
}

