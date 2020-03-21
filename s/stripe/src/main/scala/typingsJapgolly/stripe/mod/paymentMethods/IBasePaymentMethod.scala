package typingsJapgolly.stripe.mod.paymentMethods

import typingsJapgolly.stripe.AnonEmail
import typingsJapgolly.stripe.mod.IMetadata
import typingsJapgolly.stripe.mod.IResourceObject
import typingsJapgolly.stripe.mod.customers.ICustomer
import typingsJapgolly.stripe.stripeStrings.payment_method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBasePaymentMethod extends IResourceObject {
  /** Billing information associated with the PaymentMethod that may be used or required by particular types of payment methods. */
  var billing_details: Null | AnonEmail
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  var created: Double
  /** The ID of the Customer to which this PaymentMethod is saved. This will not be set when the PaymentMethod has not been saved to a Customer. [Expandable] */
  var customer: String | ICustomer | Null
  /** Has the value true if the object exists in live mode or the value false if the object exists in test mode. */
  var livemode: Boolean
  /** Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. */
  var metadata: IMetadata
  @JSName("object")
  var object_IBasePaymentMethod: payment_method
}

object IBasePaymentMethod {
  @scala.inline
  def apply(
    created: Double,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: payment_method,
    billing_details: AnonEmail = null,
    customer: String | ICustomer = null
  ): IBasePaymentMethod = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBasePaymentMethod]
  }
}

