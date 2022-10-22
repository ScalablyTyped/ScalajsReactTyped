package typingsJapgolly.braintree.mod

import typingsJapgolly.braintree.anon.AuthorizationExpiredAt
import typingsJapgolly.braintree.anon.Between
import typingsJapgolly.braintree.anon.Contains
import typingsJapgolly.braintree.anon.EndsWith
import typingsJapgolly.braintree.anon.In
import typingsJapgolly.braintree.anon.Is
import typingsJapgolly.braintree.anon.`0`
import typingsJapgolly.braintree.braintreeStrings.account_updater_daily_report
import typingsJapgolly.braintree.braintreeStrings.payment_method_revoked_by_customer
import typingsJapgolly.braintree.braintreeStrings.sub_merchant_account_approved
import typingsJapgolly.braintree.braintreeStrings.sub_merchant_account_declined
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountUpdaterNotificationKind = account_updater_daily_report

type AuthenticationError = js.Error

type AuthorizationError = js.Error

type EqualitySearchFn[T] = js.Function0[Is[T]]

type GatewayTimeoutError = js.Error

type InvalidChallengeError = js.Error

type InvalidKeysError = js.Error

type InvalidSignatureError = js.Error

type KeyValueSearchFn[T] = js.Function0[`0`[T]]

type MultiValueSearchFn[T] = js.Function0[In[T]]

type NotFoundError = js.Error

type PartialMatchSearchFn[T] = js.Function0[EndsWith[T]]

type PaymentMethodNotificationKind = payment_method_revoked_by_customer

type RangeFieldSearchFn[T] = js.Function0[Between[T]]

type RequestTimeoutError = js.Error

type ServerError = js.Error

type ServiceUnavailableError = js.Error

type SubMerchantAccountApprovedNotificationKind = sub_merchant_account_approved

type SubMerchantAccountDeclinedNotificationKind = sub_merchant_account_declined

type TestOperationPerformedInProductionError = js.Error

type TextFieldSearchFn = js.Function0[Contains]

type TooManyRequestsError = js.Error

type TransactionSearchFn = js.Function1[/* search */ AuthorizationExpiredAt, Unit]

type UnexpectedError = js.Error

type UpgradeRequired = js.Error

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.braintree.mod.AccountUpdaterNotificationKind
  - typingsJapgolly.braintree.mod.DisputeNotificationKind
  - typingsJapgolly.braintree.mod.SubscriptionNotificationKind
  - typingsJapgolly.braintree.mod.SubMerchantAccountApprovedNotificationKind
  - typingsJapgolly.braintree.mod.SubMerchantAccountDeclinedNotificationKind
  - typingsJapgolly.braintree.mod.TransactionNotificationKind
  - typingsJapgolly.braintree.mod.PaymentMethodNotificationKind
  - typingsJapgolly.braintree.mod.DisbursementNotificationKind
  - typingsJapgolly.braintree.braintreeStrings.check
  - typingsJapgolly.braintree.braintreeStrings.connected_merchant_paypal_status_changed
  - typingsJapgolly.braintree.braintreeStrings.connected_merchant_status_transitioned
  - typingsJapgolly.braintree.braintreeStrings.grantor_updated_granted_payment_method
  - typingsJapgolly.braintree.braintreeStrings.granted_payment_method_revoked
  - typingsJapgolly.braintree.braintreeStrings.local_payment_completed
  - typingsJapgolly.braintree.braintreeStrings.partner_merchant_connected
  - typingsJapgolly.braintree.braintreeStrings.partner_merchant_disconnected
  - typingsJapgolly.braintree.braintreeStrings.partner_merchant_declined
  - typingsJapgolly.braintree.braintreeStrings.oauth_access_revoked
  - typingsJapgolly.braintree.braintreeStrings.recipient_updated_granted_payment_method
*/
type WebhookNotificationKind = _WebhookNotificationKind | AccountUpdaterNotificationKind | SubMerchantAccountApprovedNotificationKind | SubMerchantAccountDeclinedNotificationKind | PaymentMethodNotificationKind
