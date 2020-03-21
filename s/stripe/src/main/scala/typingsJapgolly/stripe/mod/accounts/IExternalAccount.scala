package typingsJapgolly.stripe.mod.accounts

import typingsJapgolly.stripe.mod.IMetadata
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
import typingsJapgolly.stripe.stripeStrings.android_pay
import typingsJapgolly.stripe.stripeStrings.apple_pay
import typingsJapgolly.stripe.stripeStrings.bank_account
import typingsJapgolly.stripe.stripeStrings.card
import typingsJapgolly.stripe.stripeStrings.company
import typingsJapgolly.stripe.stripeStrings.credit
import typingsJapgolly.stripe.stripeStrings.debit
import typingsJapgolly.stripe.stripeStrings.errored
import typingsJapgolly.stripe.stripeStrings.fail
import typingsJapgolly.stripe.stripeStrings.individual
import typingsJapgolly.stripe.stripeStrings.pass
import typingsJapgolly.stripe.stripeStrings.prepaid
import typingsJapgolly.stripe.stripeStrings.unavailable
import typingsJapgolly.stripe.stripeStrings.unchecked
import typingsJapgolly.stripe.stripeStrings.unknown_
import typingsJapgolly.stripe.stripeStrings.validated
import typingsJapgolly.stripe.stripeStrings.verification_failed
import typingsJapgolly.stripe.stripeStrings.verified
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Helper
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.stripe.mod.bankAccounts.IBankAccount
  - typingsJapgolly.stripe.mod.cards.ICard
*/
trait IExternalAccount extends js.Object

object IExternalAccount {
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
  ): IExternalAccount = {
    val __obj = js.Dynamic.literal(bank_name = bank_name.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], fingerprint = fingerprint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], routing_number = routing_number.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (account != null) __obj.updateDynamic("account")(account.asInstanceOf[js.Any])
    if (account_holder_name != null) __obj.updateDynamic("account_holder_name")(account_holder_name.asInstanceOf[js.Any])
    if (account_holder_type != null) __obj.updateDynamic("account_holder_type")(account_holder_type.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (!js.isUndefined(default_for_currency)) __obj.updateDynamic("default_for_currency")(default_for_currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExternalAccount]
  }
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
  ): IExternalAccount = {
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
    __obj.asInstanceOf[IExternalAccount]
  }
}

