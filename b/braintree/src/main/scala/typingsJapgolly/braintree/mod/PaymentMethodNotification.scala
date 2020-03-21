package typingsJapgolly.braintree.mod

import typingsJapgolly.braintree.AnonCustomerId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethodNotification
  extends BaseWebhookNotification
     with WebhookNotification {
  @JSName("kind")
  var kind_PaymentMethodNotification: PaymentMethodNotificationKind
  var revokedPaymentMethodMetadata: AnonCustomerId
}

object PaymentMethodNotification {
  @scala.inline
  def apply(
    kind: PaymentMethodNotificationKind,
    revokedPaymentMethodMetadata: AnonCustomerId,
    timestamp: js.Date
  ): PaymentMethodNotification = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], revokedPaymentMethodMetadata = revokedPaymentMethodMetadata.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PaymentMethodNotification]
  }
}

