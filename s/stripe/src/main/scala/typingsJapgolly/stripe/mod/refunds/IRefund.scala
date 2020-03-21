package typingsJapgolly.stripe.mod.refunds

import typingsJapgolly.stripe.mod.IMetadata
import typingsJapgolly.stripe.mod.balance.IBalanceTransaction
import typingsJapgolly.stripe.mod.charges.ICharge
import typingsJapgolly.stripe.stripeStrings.canceled
import typingsJapgolly.stripe.stripeStrings.expired_or_canceled_card
import typingsJapgolly.stripe.stripeStrings.failed
import typingsJapgolly.stripe.stripeStrings.lost_or_stolen_card
import typingsJapgolly.stripe.stripeStrings.pending
import typingsJapgolly.stripe.stripeStrings.succeeded
import typingsJapgolly.stripe.stripeStrings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRefund extends js.Object {
  /**
    * Amount in cents/pence.
    */
  var amount: Double
  /**
    * Balance transaction that describes the impact of this reversal on your account balance.
    */
  var balance_transaction: String | IBalanceTransaction
  /**
    * ID of the charge that was refunded. [Expandable]
    */
  var charge: String | ICharge
  var created: Double
  /**
    * Three-letter ISO currency code representing the currency in which the charge was made.
    */
  var currency: String
  var description: js.UndefOr[String] = js.undefined
  /**
    * If the refund failed, the reason for refund failure if known.
    */
  var failure_reason: js.UndefOr[lost_or_stolen_card | expired_or_canceled_card | unknown_] = js.undefined
  var id: String
  /**
    * A set of key/value pairs that you can attach to the object. It can be useful
    * for storing additional information in a structured format.
    */
  var metadata: IMetadata
  /**
    * Value is 'refund'
    */
  var `object`: String
  /**
    * Reason for the refund. If set, possible values are "duplicate", "fraudulent", and "requested_by_customer".
    */
  var reason: String
  /**
    * This is the transaction number that appears on email receipts sent for this refund.
    */
  var receipt_number: String
  /**
    * The transfer reversal that is associated with the refund. Only present if the charge
    * came from another Stripe account. See the Connect documentation for details.
    */
  var source_transfer_reversal: js.UndefOr[String | Null] = js.undefined
  /**
    * Status of the refund. For credit card refunds, this can be succeeded or failed.
    * For other types of refunds, it can be pending, succeeded, failed, or canceled.
    */
  var status: pending | succeeded | failed | canceled
  /**
    * If the accompanying transfer was reversed, the transfer reversal object. Only
    * applicable if the charge was created using the destination parameter.
    */
  var transfer_reversal: js.UndefOr[String | Null] = js.undefined
}

object IRefund {
  @scala.inline
  def apply(
    amount: Double,
    balance_transaction: String | IBalanceTransaction,
    charge: String | ICharge,
    created: Double,
    currency: String,
    id: String,
    metadata: IMetadata,
    `object`: String,
    reason: String,
    receipt_number: String,
    status: pending | succeeded | failed | canceled,
    description: String = null,
    failure_reason: lost_or_stolen_card | expired_or_canceled_card | unknown_ = null,
    source_transfer_reversal: String = null,
    transfer_reversal: String = null
  ): IRefund = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], receipt_number = receipt_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (failure_reason != null) __obj.updateDynamic("failure_reason")(failure_reason.asInstanceOf[js.Any])
    if (source_transfer_reversal != null) __obj.updateDynamic("source_transfer_reversal")(source_transfer_reversal.asInstanceOf[js.Any])
    if (transfer_reversal != null) __obj.updateDynamic("transfer_reversal")(transfer_reversal.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRefund]
  }
}

