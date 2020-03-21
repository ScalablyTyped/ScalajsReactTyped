package typingsJapgolly.braintree.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebhookNotificationGateway extends js.Object {
  def parse(signature: String, payload: String): js.Promise[WebhookNotification]
}

object WebhookNotificationGateway {
  @scala.inline
  def apply(parse: (String, String) => CallbackTo[js.Promise[WebhookNotification]]): WebhookNotificationGateway = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parse")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => parse(t0, t1).runNow()))
    __obj.asInstanceOf[WebhookNotificationGateway]
  }
}

