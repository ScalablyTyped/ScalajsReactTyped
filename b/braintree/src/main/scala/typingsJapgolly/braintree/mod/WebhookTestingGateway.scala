package typingsJapgolly.braintree.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookTestingGateway extends js.Object {
  def sampleNotification(kind: WebhookNotificationKind, id: String): js.Promise[SampleNotification]
}

object WebhookTestingGateway {
  @scala.inline
  def apply(
    sampleNotification: (WebhookNotificationKind, String) => CallbackTo[js.Promise[SampleNotification]]
  ): WebhookTestingGateway = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("sampleNotification")(js.Any.fromFunction2((t0: typingsJapgolly.braintree.mod.WebhookNotificationKind, t1: java.lang.String) => sampleNotification(t0, t1).runNow()))
    __obj.asInstanceOf[WebhookTestingGateway]
  }
}

