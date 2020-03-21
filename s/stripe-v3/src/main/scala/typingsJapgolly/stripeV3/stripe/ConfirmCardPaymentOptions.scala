package typingsJapgolly.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfirmCardPaymentOptions extends js.Object {
  /*
    * Set this to false if you want to handle next actions yourself, or if
    * you want to defer next action handling until later (e.g. for use in
    * the PaymentRequest API). Default is true.
    */
  var handleActions: js.UndefOr[Boolean] = js.undefined
}

object ConfirmCardPaymentOptions {
  @scala.inline
  def apply(handleActions: js.UndefOr[Boolean] = js.undefined): ConfirmCardPaymentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(handleActions)) __obj.updateDynamic("handleActions")(handleActions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmCardPaymentOptions]
  }
}

