package typingsJapgolly.stripeV3.stripe.paymentRequest

import typingsJapgolly.stripeV3.stripeV3Strings.fail
import typingsJapgolly.stripeV3.stripeV3Strings.invalid_shipping_address
import typingsJapgolly.stripeV3.stripeV3Strings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDetails extends js.Object {
  var displayItems: js.UndefOr[js.Array[DisplayItem]] = js.undefined
  var shippingOptions: js.UndefOr[js.Array[ShippingOption]] = js.undefined
  var status: success | fail | invalid_shipping_address
  var total: js.UndefOr[DisplayItem] = js.undefined
}

object UpdateDetails {
  @scala.inline
  def apply(
    status: success | fail | invalid_shipping_address,
    displayItems: js.Array[DisplayItem] = null,
    shippingOptions: js.Array[ShippingOption] = null,
    total: DisplayItem = null
  ): UpdateDetails = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    if (displayItems != null) __obj.updateDynamic("displayItems")(displayItems.asInstanceOf[js.Any])
    if (shippingOptions != null) __obj.updateDynamic("shippingOptions")(shippingOptions.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDetails]
  }
}

