package typingsJapgolly.slackMock.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncomingWebhooks[T] extends js.Object {
  var calls: js.Array[IncomingWebhookCall[T]]
  def addResponse(opts: IncomingWebhookOptions[T]): Unit
  def reset(): Unit
}

object IncomingWebhooks {
  @scala.inline
  def apply[T](
    addResponse: IncomingWebhookOptions[T] => Callback,
    calls: js.Array[IncomingWebhookCall[T]],
    reset: Callback
  ): IncomingWebhooks[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any])
    __obj.updateDynamic("addResponse")(js.Any.fromFunction1((t0: typingsJapgolly.slackMock.mod.IncomingWebhookOptions[T]) => addResponse(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[IncomingWebhooks[T]]
  }
}

