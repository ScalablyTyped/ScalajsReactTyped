package typingsJapgolly.stripe.mod.paymentMethods

import typingsJapgolly.stripe.AnonChecks
import typingsJapgolly.stripe.AnonEmail
import typingsJapgolly.stripe.mod.IMetadata
import typingsJapgolly.stripe.mod.customers.ICustomer
import typingsJapgolly.stripe.stripeStrings.card
import typingsJapgolly.stripe.stripeStrings.card_present
import typingsJapgolly.stripe.stripeStrings.payment_method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.mod.paymentMethods.ICardPaymentMethod
  - typingsJapgolly.stripe.mod.paymentMethods.ICardPresentPaymentMethod
*/
trait IPaymentMethod extends js.Object

object IPaymentMethod {
  @scala.inline
  def ICardPaymentMethod(
    card: AnonChecks,
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: payment_method,
    `type`: card,
    billing_details: AnonEmail = null,
    customer: String | ICustomer = null
  ): IPaymentMethod = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethod]
  }
  @scala.inline
  def ICardPresentPaymentMethod(
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: payment_method,
    `type`: card_present,
    billing_details: AnonEmail = null,
    customer: String | ICustomer = null
  ): IPaymentMethod = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethod]
  }
}

