package typingsJapgolly.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDestination extends js.Object {
  /**
    * The amount transferred to the destination account, if specified. By
    * default, the entire charge amount is transferred to the destination account.
    */
  var amount: js.UndefOr[Double | Null] = js.undefined
  /**
    * ID of an existing, connected Stripe account to transfer funds to if
    * transfer_data was specified in the charge request.
    */
  var destination: String
}

object AnonDestination {
  @scala.inline
  def apply(destination: String, amount: Int | Double = null): AnonDestination = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDestination]
  }
}

