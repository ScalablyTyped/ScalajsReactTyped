package typingsJapgolly.stripejs.paymentMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.stripejs.shippingMod.ShippingOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewShippingOptions extends js.Object {
  /**
    * The selected shipping option
    */
  var shippingOption: ShippingOption
  /**
    * Calling this function with an UpdateDetails object merges your updates into the
    * current PaymentRequest object.
    */
  def updateWith(dataToUpdate: UpdateOptions): Unit
}

object NewShippingOptions {
  @scala.inline
  def apply(shippingOption: ShippingOption, updateWith: UpdateOptions => Callback): NewShippingOptions = {
    val __obj = js.Dynamic.literal(shippingOption = shippingOption.asInstanceOf[js.Any])
    __obj.updateDynamic("updateWith")(js.Any.fromFunction1((t0: typingsJapgolly.stripejs.paymentMod.UpdateOptions) => updateWith(t0).runNow()))
    __obj.asInstanceOf[NewShippingOptions]
  }
}

