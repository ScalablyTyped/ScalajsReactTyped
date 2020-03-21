package typingsJapgolly.slackMock.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutgoingWebhooks[T] extends js.Object {
  var calls: js.Array[OutgoingWebhookCall[T]]
  def reset(): Unit
  def send(targetUrl: OutgoingWebhookUrl, body: T): js.Promise[Unit]
}

object OutgoingWebhooks {
  @scala.inline
  def apply[T](
    calls: js.Array[OutgoingWebhookCall[T]],
    reset: Callback,
    send: (OutgoingWebhookUrl, T) => CallbackTo[js.Promise[Unit]]
  ): OutgoingWebhooks[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any])
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("send")(js.Any.fromFunction2((t0: typingsJapgolly.slackMock.mod.OutgoingWebhookUrl, t1: T) => send(t0, t1).runNow()))
    __obj.asInstanceOf[OutgoingWebhooks[T]]
  }
}

