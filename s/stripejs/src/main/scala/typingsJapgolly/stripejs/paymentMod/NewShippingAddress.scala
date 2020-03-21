package typingsJapgolly.stripejs.paymentMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.stripejs.shippingMod.ShippingAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewShippingAddress extends js.Object {
  /**
    * The customer's selected ShippingAddress.
    */
  var shippingAddress: ShippingAddress
  /**
    * Calling this function with an UpdateDetails object merges your updates into the
    * current PaymentRequest object.
    */
  def updateWith(dataToUpdate: UpdateOptions): Unit
}

object NewShippingAddress {
  @scala.inline
  def apply(shippingAddress: ShippingAddress, updateWith: UpdateOptions => Callback): NewShippingAddress = {
    val __obj = js.Dynamic.literal(shippingAddress = shippingAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("updateWith")(js.Any.fromFunction1((t0: typingsJapgolly.stripejs.paymentMod.UpdateOptions) => updateWith(t0).runNow()))
    __obj.asInstanceOf[NewShippingAddress]
  }
}

