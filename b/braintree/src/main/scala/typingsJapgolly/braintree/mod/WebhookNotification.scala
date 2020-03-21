package typingsJapgolly.braintree.mod

import typingsJapgolly.braintree.AnonCustomerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.braintree.mod.TransactionNotification
  - typingsJapgolly.braintree.mod.SubMerchantAccountApprovedNotification
  - typingsJapgolly.braintree.mod.SubMerchantAccountDeclinedNotification
  - typingsJapgolly.braintree.mod.SubscriptionNotification
  - typingsJapgolly.braintree.mod.DisputeNotification
  - typingsJapgolly.braintree.mod.AccountUpdaterNotification
  - typingsJapgolly.braintree.mod.PaymentMethodNotification
*/
trait WebhookNotification extends js.Object

object WebhookNotification {
  @scala.inline
  def DisputeNotification(dispute: Dispute, kind: DisputeNotificationKind, timestamp: js.Date): WebhookNotification = {
    val __obj = js.Dynamic.literal(dispute = dispute.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookNotification]
  }
  @scala.inline
  def SubMerchantAccountDeclinedNotification(
    kind: SubMerchantAccountDeclinedNotificationKind,
    merchantAccount: MerchantAccount,
    timestamp: js.Date
  ): WebhookNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], merchantAccount = merchantAccount.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookNotification]
  }
  @scala.inline
  def SubMerchantAccountApprovedNotification(
    kind: SubMerchantAccountApprovedNotificationKind,
    merchantAccount: MerchantAccount,
    timestamp: js.Date
  ): WebhookNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], merchantAccount = merchantAccount.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookNotification]
  }
  @scala.inline
  def PaymentMethodNotification(
    kind: PaymentMethodNotificationKind,
    revokedPaymentMethodMetadata: AnonCustomerId,
    timestamp: js.Date
  ): WebhookNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], revokedPaymentMethodMetadata = revokedPaymentMethodMetadata.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookNotification]
  }
  @scala.inline
  def SubscriptionNotification(kind: SubscriptionNotificationKind, subscription: Subscription, timestamp: js.Date): WebhookNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookNotification]
  }
  @scala.inline
  def TransactionNotification(kind: TransactionNotificationKind, timestamp: js.Date, transaction: Transaction): WebhookNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transaction = transaction.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookNotification]
  }
  @scala.inline
  def AccountUpdaterNotification(
    accountUpdaterDailyReport: AccountUpdaterDailyReport,
    kind: AccountUpdaterNotificationKind,
    timestamp: js.Date
  ): WebhookNotification = {
    val __obj = js.Dynamic.literal(accountUpdaterDailyReport = accountUpdaterDailyReport.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebhookNotification]
  }
}

