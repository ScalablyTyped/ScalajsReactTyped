package typingsJapgolly.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AccountUpdaterNotificationKind = typingsJapgolly.braintree.braintreeStrings.account_updater_daily_report
  type AuthenticationError = js.Error
  type AuthorizationError = js.Error
  type DownForMaintenanceError = js.Error
  type InvalidChallengeError = js.Error
  type InvalidKeysError = js.Error
  type InvalidSignatureError = js.Error
  type InvalidTransparentRedirectHashError = js.Error
  type NotFoundError = js.Error
  type PaymentMethodNotificationKind = typingsJapgolly.braintree.braintreeStrings.payment_method_revoked_by_customer
  type ServerError = js.Error
  type SubMerchantAccountApprovedNotificationKind = typingsJapgolly.braintree.braintreeStrings.sub_merchant_account_approved
  type SubMerchantAccountDeclinedNotificationKind = typingsJapgolly.braintree.braintreeStrings.sub_merchant_account_declined
  type TestOperationPerformedInProductionError = js.Error
  type TooManyRequestsError = js.Error
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
    - typingsJapgolly.braintree.braintreeStrings.check
    - typingsJapgolly.braintree.braintreeStrings.connected_merchant_paypal_status_changed
    - typingsJapgolly.braintree.braintreeStrings.connected_merchant_status_transitioned
    - typingsJapgolly.braintree.braintreeStrings.disbursement
    - typingsJapgolly.braintree.braintreeStrings.disbursement_exception
    - typingsJapgolly.braintree.braintreeStrings.grantor_updated_granted_payment_method
    - typingsJapgolly.braintree.braintreeStrings.granted_payment_method_revoked
    - typingsJapgolly.braintree.braintreeStrings.local_payment_completed
    - typingsJapgolly.braintree.braintreeStrings.partner_merchant_connected
    - typingsJapgolly.braintree.braintreeStrings.partner_merchant_disconnected
    - typingsJapgolly.braintree.braintreeStrings.partner_merchant_declined
    - typingsJapgolly.braintree.braintreeStrings.oauth_access_revoked
    - typingsJapgolly.braintree.braintreeStrings.recipient_updated_granted_payment_method
  */
  type WebhookNotificationKind = typingsJapgolly.braintree.mod._WebhookNotificationKind | typingsJapgolly.braintree.mod.AccountUpdaterNotificationKind | typingsJapgolly.braintree.mod.SubMerchantAccountApprovedNotificationKind | typingsJapgolly.braintree.mod.SubMerchantAccountDeclinedNotificationKind | typingsJapgolly.braintree.mod.PaymentMethodNotificationKind
}
