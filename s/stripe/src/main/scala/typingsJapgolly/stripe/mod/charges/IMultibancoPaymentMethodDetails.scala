package typingsJapgolly.stripe.mod.charges

import typingsJapgolly.stripe.stripeStrings.multibanco
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultibancoPaymentMethodDetails extends js.Object {
  var `type`: multibanco
}

object IMultibancoPaymentMethodDetails {
  @scala.inline
  def apply(`type`: multibanco): IMultibancoPaymentMethodDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultibancoPaymentMethodDetails]
  }
}

