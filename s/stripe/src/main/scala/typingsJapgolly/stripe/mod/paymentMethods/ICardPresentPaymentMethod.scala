package typingsJapgolly.stripe.mod.paymentMethods

import typingsJapgolly.stripe.AnonEmail
import typingsJapgolly.stripe.mod.IMetadata
import typingsJapgolly.stripe.mod.customers.ICustomer
import typingsJapgolly.stripe.stripeStrings.card_present
import typingsJapgolly.stripe.stripeStrings.payment_method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICardPresentPaymentMethod
  extends IBasePaymentMethod
     with IPaymentMethod {
  var `type`: card_present
}

object ICardPresentPaymentMethod {
  @scala.inline
  def apply(
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: payment_method,
    `type`: card_present,
    billing_details: AnonEmail = null,
    customer: String | ICustomer = null
  ): ICardPresentPaymentMethod = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICardPresentPaymentMethod]
  }
}

