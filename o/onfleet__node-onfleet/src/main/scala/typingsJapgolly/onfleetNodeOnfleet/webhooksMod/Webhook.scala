package typingsJapgolly.onfleetNodeOnfleet.webhooksMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Webhook extends js.Object {
  def create(webhook: OnfleetWebhook): js.Promise[WebhookResult]
  def deleteOne(id: String): js.Promise[Unit]
  def get(): js.Promise[js.Array[GetWebhookResult]]
}

object Webhook {
  @scala.inline
  def apply(
    create: OnfleetWebhook => CallbackTo[js.Promise[WebhookResult]],
    deleteOne: String => CallbackTo[js.Promise[Unit]],
    get: CallbackTo[js.Promise[js.Array[GetWebhookResult]]]
  ): Webhook = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.onfleetNodeOnfleet.webhooksMod.OnfleetWebhook) => create(t0).runNow()))
    __obj.updateDynamic("deleteOne")(js.Any.fromFunction1((t0: java.lang.String) => deleteOne(t0).runNow()))
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.asInstanceOf[Webhook]
  }
}

