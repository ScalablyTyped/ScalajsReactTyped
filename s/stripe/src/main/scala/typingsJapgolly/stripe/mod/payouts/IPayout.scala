package typingsJapgolly.stripe.mod.payouts

import typingsJapgolly.stripe.mod.IMetadata
import typingsJapgolly.stripe.mod.IResourceObject
import typingsJapgolly.stripe.mod.balance.IBalanceTransaction
import typingsJapgolly.stripe.mod.bankAccounts.IBankAccount
import typingsJapgolly.stripe.mod.cards.ICardHash
import typingsJapgolly.stripe.stripeStrings.alipay_account
import typingsJapgolly.stripe.stripeStrings.bank_account
import typingsJapgolly.stripe.stripeStrings.bitcoin_receiver
import typingsJapgolly.stripe.stripeStrings.canceled
import typingsJapgolly.stripe.stripeStrings.card
import typingsJapgolly.stripe.stripeStrings.failed
import typingsJapgolly.stripe.stripeStrings.in_transit
import typingsJapgolly.stripe.stripeStrings.paid
import typingsJapgolly.stripe.stripeStrings.payout
import typingsJapgolly.stripe.stripeStrings.pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPayout extends IResourceObject {
  /**
    * Amount (in cents) to be transferred to your bank account or debit card
    */
  var amount: Double
  /**
    * Date the payout is expected to arrive in the bank. This factors in delays like weekends or bank holidays
    */
  var arrival_date: Double
  /**
    * Returns true if the payout was created by an automated payout schedule, and false if it was requested manually.
    */
  var automatic: Boolean
  /**
    * Balance transaction that describes the impact of this transfer on your account balance. [Expandable]
    */
  var balance_transaction: String | IBalanceTransaction
  /**
    * Time at which the object was created. Measured in seconds since the Unix epoch
    */
  var created: Double
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    * https://stripe.com/docs/currencies
    */
  var currency: String
  /**
    * An arbitrary string attached to the object. Often useful for displaying to users
    */
  var description: String
  /**
    * ID of the bank account or card the payout was sent to. [Expandable]
    */
  var destination: String | IBankAccount | ICardHash
  /**
    * If the payout failed or was canceled, this will be the ID of the balance
    * transaction that reversed the initial balance transaction, and puts the
    * funds from the failed payout back in your balance. [Expandable]
    */
  var failure_balance_transaction: String | IBalanceTransaction
  /**
    * Error code explaining reason for payout failure if available. See Types of payout failures for a
    * list of failure codes: https://stripe.com/docs/api#payout_failures
    */
  var failure_code: String
  /**
    * Message to user further explaining reason for the payout failure if available
    */
  var failure_message: String
  /**
    * Flag indicating whether the object exists in live mode or test mode
    */
  var livemode: Boolean
  /**
    * Set of key/value pairs that you can attach to an object. It can be useful for storing additional
    * information about the object in a structured format.
    */
  var metadata: IMetadata
  /**
    * The method used to send this payout, which can be standard or instant. instant is only supported
    * for payouts to debit cards.
    */
  var method: PayoutMethods
  /**
    * Value is "payout"
    */
  @JSName("object")
  var object_IPayout: payout
  /**
    * The source balance this payout came from.
    * One of card, bank_account, bitcoin_receiver, or alipay_account
    */
  var source_type: alipay_account | bank_account | bitcoin_receiver | card
  /**
    * Extra information about a payout to be displayed on the user's bank statement
    */
  var statement_descriptor: String
  /**
    * Current status of the payout (paid, pending, in_transit, canceled or failed).
    * A payout will be pending until it is submitted to the bank, at which point it
    * becomes in_transit. It will then change to paid if the transaction goes through.
    * If it does not go through successfully, its status will change to failed or canceled.
    */
  var status: canceled | failed | in_transit | paid | pending
  /**
    * Can be bank_account or card.
    */
  var `type`: PayoutTypes
}

object IPayout {
  @scala.inline
  def apply(
    amount: Double,
    arrival_date: Double,
    automatic: Boolean,
    balance_transaction: String | IBalanceTransaction,
    created: Double,
    currency: String,
    description: String,
    destination: String | IBankAccount | ICardHash,
    failure_balance_transaction: String | IBalanceTransaction,
    failure_code: String,
    failure_message: String,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    method: PayoutMethods,
    `object`: payout,
    source_type: alipay_account | bank_account | bitcoin_receiver | card,
    statement_descriptor: String,
    status: canceled | failed | in_transit | paid | pending,
    `type`: PayoutTypes
  ): IPayout = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], arrival_date = arrival_date.asInstanceOf[js.Any], automatic = automatic.asInstanceOf[js.Any], balance_transaction = balance_transaction.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], failure_balance_transaction = failure_balance_transaction.asInstanceOf[js.Any], failure_code = failure_code.asInstanceOf[js.Any], failure_message = failure_message.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], source_type = source_type.asInstanceOf[js.Any], statement_descriptor = statement_descriptor.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPayout]
  }
}

