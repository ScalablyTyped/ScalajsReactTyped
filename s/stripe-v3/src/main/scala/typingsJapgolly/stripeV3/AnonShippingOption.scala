package typingsJapgolly.stripeV3

import japgolly.scalajs.react.Callback
import typingsJapgolly.stripeV3.stripe.paymentRequest.ShippingOption
import typingsJapgolly.stripeV3.stripe.paymentRequest.UpdateDetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShippingOption extends js.Object {
  var shippingOption: ShippingOption
  def updateWith(options: UpdateDetails): Unit
}

object AnonShippingOption {
  @scala.inline
  def apply(shippingOption: ShippingOption, updateWith: UpdateDetails => Callback): AnonShippingOption = {
    val __obj = js.Dynamic.literal(shippingOption = shippingOption.asInstanceOf[js.Any])
    __obj.updateDynamic("updateWith")(js.Any.fromFunction1((t0: typingsJapgolly.stripeV3.stripe.paymentRequest.UpdateDetails) => updateWith(t0).runNow()))
    __obj.asInstanceOf[AnonShippingOption]
  }
}

