package typingsJapgolly.stripe.mod.disputes

import typingsJapgolly.stripe.AnonDueby
import typingsJapgolly.stripe.mod.IMetadata
import typingsJapgolly.stripe.mod.IResourceObject
import typingsJapgolly.stripe.mod.balance.IBalanceTransaction
import typingsJapgolly.stripe.mod.charges.ICharge
import typingsJapgolly.stripe.stripeStrings.bank_cannot_process
import typingsJapgolly.stripe.stripeStrings.charge_refunded
import typingsJapgolly.stripe.stripeStrings.credit_not_processed
import typingsJapgolly.stripe.stripeStrings.debit_not_authorized
import typingsJapgolly.stripe.stripeStrings.dispute
import typingsJapgolly.stripe.stripeStrings.duplicate
import typingsJapgolly.stripe.stripeStrings.fraudulent
import typingsJapgolly.stripe.stripeStrings.general
import typingsJapgolly.stripe.stripeStrings.incorrect_account_details
import typingsJapgolly.stripe.stripeStrings.insufficient_funds
import typingsJapgolly.stripe.stripeStrings.lost
import typingsJapgolly.stripe.stripeStrings.needs_response
import typingsJapgolly.stripe.stripeStrings.product_not_received
import typingsJapgolly.stripe.stripeStrings.product_unacceptable
import typingsJapgolly.stripe.stripeStrings.response_disabled
import typingsJapgolly.stripe.stripeStrings.subscription_canceled
import typingsJapgolly.stripe.stripeStrings.under_review
import typingsJapgolly.stripe.stripeStrings.unrecognized
import typingsJapgolly.stripe.stripeStrings.warning_closed
import typingsJapgolly.stripe.stripeStrings.warning_needs_response
import typingsJapgolly.stripe.stripeStrings.warning_under_review
import typingsJapgolly.stripe.stripeStrings.won
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A dispute occurs when a customer questions your charge with their bank or credit card company.
  * When a customer disputes your charge, you're given the opportunity to respond to the dispute with
  * evidence that shows the charge is legitimate. You can find more information about the dispute process
  * in our disputes FAQ: https://stripe.com/help/disputes
  */
trait IDispute extends IResourceObject {
  /**
    * Disputed amount. Usually the amount of the charge, but can differ (usually because of currency
    * fluctuation or because only part of the order is disputed).
    */
  var amount: Double
  /**
    * List of zero, one, or two balance transactions that show funds withdrawn and reinstated to your
    * Stripe account as a result of this dispute.
    */
  var balance_transactions: js.Array[IBalanceTransaction]
  /**
    * ID of the charge that was disputed. [Expandable]
    */
  var charge: String | ICharge
  /**
    * Date dispute was opened
    */
  var created: Double
  /**
    * Three-letter ISO currency code representing the currency of the amount that was disputed.
    */
  var currency: String
  /**
    * Evidence provided to respond to a dispute. Updating any field in the hash will submit all fields in the hash for review.
    */
  var evidence: IDisputeEvidence
  /**
    * Information about the evidence submission.
    */
  var evidence_details: js.UndefOr[AnonDueby] = js.undefined
  /**
    * If true, it is still possible to refund the disputed payment. Once the payment has been fully
    * refunded, no further funds will be withdrawn from your Stripe account as a result of this dispute.
    */
  var is_charge_refundable: Boolean
  var livemode: Boolean
  var metadata: IMetadata
  /**
    * Value is 'dispute'
    */
  @JSName("object")
  var object_IDispute: dispute
  /**
    * Reason given by cardholder for dispute.
    * Possible values are duplicate, fraudulent, subscription_canceled, product_unacceptable,
    * product_not_received, unrecognized, credit_not_processed, incorrect_account_details,
    * insufficient_funds, bank_cannot_process, debit_not_authorized, general.
    * Read more about dispute reasons: https://stripe.com/help/disputes#reasons
    */
  var reason: duplicate | fraudulent | subscription_canceled | product_unacceptable | product_not_received | unrecognized | credit_not_processed | incorrect_account_details | insufficient_funds | bank_cannot_process | debit_not_authorized | general
  /**
    * Current status of dispute. Possible values are warning_needs_response, warning_under_review, warning_closed,
    * needs_response, response_disabled, under_review, charge_refunded, won, lost.
    */
  var status: warning_needs_response | warning_under_review | warning_closed | needs_response | response_disabled | under_review | charge_refunded | won | lost
}

object IDispute {
  @scala.inline
  def apply(
    amount: Double,
    balance_transactions: js.Array[IBalanceTransaction],
    charge: String | ICharge,
    created: Double,
    currency: String,
    evidence: IDisputeEvidence,
    id: String,
    is_charge_refundable: Boolean,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: dispute,
    reason: duplicate | fraudulent | subscription_canceled | product_unacceptable | product_not_received | unrecognized | credit_not_processed | incorrect_account_details | insufficient_funds | bank_cannot_process | debit_not_authorized | general,
    status: warning_needs_response | warning_under_review | warning_closed | needs_response | response_disabled | under_review | charge_refunded | won | lost,
    evidence_details: AnonDueby = null
  ): IDispute = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], balance_transactions = balance_transactions.asInstanceOf[js.Any], charge = charge.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], evidence = evidence.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_charge_refundable = is_charge_refundable.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (evidence_details != null) __obj.updateDynamic("evidence_details")(evidence_details.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDispute]
  }
}

