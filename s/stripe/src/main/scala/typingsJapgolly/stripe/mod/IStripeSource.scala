package typingsJapgolly.stripe.mod

import typingsJapgolly.stripe.AnonAmountcharged
import typingsJapgolly.stripe.AnonAttemptsremaining
import typingsJapgolly.stripe.AnonBankname
import typingsJapgolly.stripe.AnonFailurereason
import typingsJapgolly.stripe.AnonPhone
import typingsJapgolly.stripe.mod.accounts.IAccount
import typingsJapgolly.stripe.mod.bitcoinReceivers.IBitcoinTransaction
import typingsJapgolly.stripe.mod.customers.ICustomer
import typingsJapgolly.stripe.mod.recipients.IRecipient
import typingsJapgolly.stripe.stripeStrings.Discover
import typingsJapgolly.stripe.stripeStrings.JCB
import typingsJapgolly.stripe.stripeStrings.MasterCard
import typingsJapgolly.stripe.stripeStrings.Unknown
import typingsJapgolly.stripe.stripeStrings.Visa
import typingsJapgolly.stripe.stripeStrings.`American Express`
import typingsJapgolly.stripe.stripeStrings.`Diners Club`
import typingsJapgolly.stripe.stripeStrings.`new`
import typingsJapgolly.stripe.stripeStrings.ach_credit_transfer
import typingsJapgolly.stripe.stripeStrings.ach_debit
import typingsJapgolly.stripe.stripeStrings.alipay
import typingsJapgolly.stripe.stripeStrings.android_pay
import typingsJapgolly.stripe.stripeStrings.apple_pay
import typingsJapgolly.stripe.stripeStrings.bancontact
import typingsJapgolly.stripe.stripeStrings.bank_account
import typingsJapgolly.stripe.stripeStrings.bitcoin_receiver
import typingsJapgolly.stripe.stripeStrings.canceled
import typingsJapgolly.stripe.stripeStrings.card
import typingsJapgolly.stripe.stripeStrings.card_present
import typingsJapgolly.stripe.stripeStrings.chargeable
import typingsJapgolly.stripe.stripeStrings.code_verification
import typingsJapgolly.stripe.stripeStrings.company
import typingsJapgolly.stripe.stripeStrings.consumed
import typingsJapgolly.stripe.stripeStrings.credit
import typingsJapgolly.stripe.stripeStrings.debit
import typingsJapgolly.stripe.stripeStrings.eps
import typingsJapgolly.stripe.stripeStrings.errored
import typingsJapgolly.stripe.stripeStrings.fail
import typingsJapgolly.stripe.stripeStrings.failed
import typingsJapgolly.stripe.stripeStrings.giropay
import typingsJapgolly.stripe.stripeStrings.ideal
import typingsJapgolly.stripe.stripeStrings.individual
import typingsJapgolly.stripe.stripeStrings.multibanco
import typingsJapgolly.stripe.stripeStrings.none
import typingsJapgolly.stripe.stripeStrings.p24
import typingsJapgolly.stripe.stripeStrings.pass
import typingsJapgolly.stripe.stripeStrings.pending
import typingsJapgolly.stripe.stripeStrings.prepaid
import typingsJapgolly.stripe.stripeStrings.receiver
import typingsJapgolly.stripe.stripeStrings.redirect
import typingsJapgolly.stripe.stripeStrings.reusable
import typingsJapgolly.stripe.stripeStrings.sepa_debit
import typingsJapgolly.stripe.stripeStrings.single_use
import typingsJapgolly.stripe.stripeStrings.sofort
import typingsJapgolly.stripe.stripeStrings.source
import typingsJapgolly.stripe.stripeStrings.three_d_secure
import typingsJapgolly.stripe.stripeStrings.unavailable
import typingsJapgolly.stripe.stripeStrings.unchecked
import typingsJapgolly.stripe.stripeStrings.unknown_
import typingsJapgolly.stripe.stripeStrings.validated
import typingsJapgolly.stripe.stripeStrings.verification_failed
import typingsJapgolly.stripe.stripeStrings.verified
import typingsJapgolly.stripe.stripeStrings.wechat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Any Stripe source, including a bank account, credit/debit card, or less common "Source" types (see https://stripe.com/docs/api/sources/object). */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.mod.cards.ICard
  - typingsJapgolly.stripe.mod.bitcoinReceivers.IBitcoinReceiver
  - typingsJapgolly.stripe.mod.bankAccounts.IBankAccount
  - typingsJapgolly.stripe.mod.sources.ISource
*/
trait IStripeSource extends js.Object

object IStripeSource {
  @scala.inline
  def ICard(
    brand: Visa | (`American Express`) | MasterCard | Discover | JCB | (`Diners Club`) | Unknown,
    country: String,
    cvc_check: pass | fail | unavailable | unchecked,
    exp_month: Double,
    exp_year: Double,
    fingerprint: String,
    funding: credit | debit | prepaid | unknown_,
    id: String,
    last4: String,
    `object`: card,
    account: String | IAccount = null,
    address_city: String = null,
    address_country: String = null,
    address_line1: String = null,
    address_line1_check: pass | fail | unavailable | unchecked = null,
    address_line2: String = null,
    address_state: String = null,
    address_zip: String = null,
    address_zip_check: pass | fail | unavailable | unchecked = null,
    currency: String = null,
    customer: String | ICustomer = null,
    default_for_currency: js.UndefOr[Boolean] = js.undefined,
    dynamic_last4: String = null,
    metadata: IMetadata = null,
    name: String = null,
    number: String = null,
    recipient: String | IRecipient = null,
    tokenization_method: apple_pay | android_pay = null
  ): IStripeSource = {
    val __obj = js.Dynamic.literal(brand = brand.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], cvc_check = cvc_check.asInstanceOf[js.Any], exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], funding = funding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (address_city != null) __obj.updateDynamic("address_city")(address_city.asInstanceOf[js.Any])
    if (address_country != null) __obj.updateDynamic("address_country")(address_country.asInstanceOf[js.Any])
    if (address_line1 != null) __obj.updateDynamic("address_line1")(address_line1.asInstanceOf[js.Any])
    if (address_line1_check != null) __obj.updateDynamic("address_line1_check")(address_line1_check.asInstanceOf[js.Any])
    if (address_line2 != null) __obj.updateDynamic("address_line2")(address_line2.asInstanceOf[js.Any])
    if (address_state != null) __obj.updateDynamic("address_state")(address_state.asInstanceOf[js.Any])
    if (address_zip != null) __obj.updateDynamic("address_zip")(address_zip.asInstanceOf[js.Any])
    if (address_zip_check != null) __obj.updateDynamic("address_zip_check")(address_zip_check.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (!js.isUndefined(default_for_currency)) __obj.updateDynamic("default_for_currency")(default_for_currency.asInstanceOf[js.Any])
    if (dynamic_last4 != null) __obj.updateDynamic("dynamic_last4")(dynamic_last4.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (recipient != null) __obj.updateDynamic("recipient")(recipient.asInstanceOf[js.Any])
    if (tokenization_method != null) __obj.updateDynamic("tokenization_method")(tokenization_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStripeSource]
  }
  @scala.inline
  def IBitcoinReceiver(
    active: Boolean,
    amount: Double,
    amount_received: Double,
    bitcoin_amount: Double,
    bitcoin_amount_received: Double,
    bitcoin_uri: Double,
    created: Double,
    currency: String,
    customer: String,
    description: String,
    email: String,
    filled: Boolean,
    id: String,
    inbound_address: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: bitcoin_receiver,
    payment: String,
    refund_address: String,
    transactions: IList[IBitcoinTransaction],
    uncaptured_funds: Boolean,
    used_for_payment: Boolean
  ): IStripeSource = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], amount = amount.asInstanceOf[js.Any], amount_received = amount_received.asInstanceOf[js.Any], bitcoin_amount = bitcoin_amount.asInstanceOf[js.Any], bitcoin_amount_received = bitcoin_amount_received.asInstanceOf[js.Any], bitcoin_uri = bitcoin_uri.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], customer = customer.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], filled = filled.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inbound_address = inbound_address.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], payment = payment.asInstanceOf[js.Any], refund_address = refund_address.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], uncaptured_funds = uncaptured_funds.asInstanceOf[js.Any], used_for_payment = used_for_payment.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStripeSource]
  }
  @scala.inline
  def IBankAccount(
    bank_name: String,
    country: String,
    currency: String,
    fingerprint: String,
    id: String,
    last4: String,
    metadata: IMetadata,
    `object`: bank_account,
    routing_number: String,
    status: `new` | validated | verified | verification_failed | errored,
    account: String = null,
    account_holder_name: String = null,
    account_holder_type: individual | company = null,
    customer: String = null,
    default_for_currency: js.UndefOr[Boolean] = js.undefined
  ): IStripeSource = {
    val __obj = js.Dynamic.literal(bank_name = bank_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (account_holder_name != null) __obj.updateDynamic("account_holder_name")(account_holder_name.asInstanceOf[js.Any])
    if (account_holder_type != null) __obj.updateDynamic("account_holder_type")(account_holder_type.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (!js.isUndefined(default_for_currency)) __obj.updateDynamic("default_for_currency")(default_for_currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStripeSource]
  }
  @scala.inline
  def ISource(
    client_secret: String,
    created: Double,
    flow: redirect | receiver | code_verification | none,
    id: String,
    livemode: Boolean,
    metadata: IMetadata,
    `object`: source,
    owner: AnonPhone,
    status: canceled | chargeable | consumed | failed | pending,
    `type`: ach_credit_transfer | ach_debit | alipay | bancontact | card | card_present | eps | giropay | ideal | multibanco | p24 | sepa_debit | sofort | three_d_secure | wechat,
    usage: reusable | single_use,
    ach_credit_transfer: AnonBankname = null,
    amount: Int | Double = null,
    card: ICardHashInfo = null,
    code_verification: AnonAttemptsremaining = null,
    currency: String = null,
    customer: String = null,
    receiver: AnonAmountcharged = null,
    redirect: AnonFailurereason = null,
    statement_descriptor: String = null
  ): IStripeSource = {
    val __obj = js.Dynamic.literal(client_secret = client_secret.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ach_credit_transfer != null) __obj.updateDynamic("ach_credit_transfer")(ach_credit_transfer.asInstanceOf[js.Any])
    if (amount != null) __obj.updateDynamic("amount")(amount.asInstanceOf[js.Any])
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (code_verification != null) __obj.updateDynamic("code_verification")(code_verification.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (receiver != null) __obj.updateDynamic("receiver")(receiver.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStripeSource]
  }
}

