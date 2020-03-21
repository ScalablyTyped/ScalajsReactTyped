package typingsJapgolly.stripejs

import typingsJapgolly.stripejs.elementMod.PaymentRequestButtonStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComplete extends js.Object {
  var base: js.UndefOr[PaymentRequestButtonStyle] = js.undefined
  var complete: js.UndefOr[PaymentRequestButtonStyle] = js.undefined
  var empty: js.UndefOr[PaymentRequestButtonStyle] = js.undefined
  var invalid: js.UndefOr[PaymentRequestButtonStyle] = js.undefined
  var paymentRequestButton: js.UndefOr[PaymentRequestButtonStyle] = js.undefined
}

object AnonComplete {
  @scala.inline
  def apply(
    base: PaymentRequestButtonStyle = null,
    complete: PaymentRequestButtonStyle = null,
    empty: PaymentRequestButtonStyle = null,
    invalid: PaymentRequestButtonStyle = null,
    paymentRequestButton: PaymentRequestButtonStyle = null
  ): AnonComplete = {
    val __obj = js.Dynamic.literal()
    if (base != null) __obj.updateDynamic("base")(base.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (invalid != null) __obj.updateDynamic("invalid")(invalid.asInstanceOf[js.Any])
    if (paymentRequestButton != null) __obj.updateDynamic("paymentRequestButton")(paymentRequestButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComplete]
  }
}

