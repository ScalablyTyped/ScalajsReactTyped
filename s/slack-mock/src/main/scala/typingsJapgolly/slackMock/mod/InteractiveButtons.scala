package typingsJapgolly.slackMock.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InteractiveButtons[T] extends js.Object {
  var calls: js.Array[InteractiveButtonCall[T]]
  def addResponse(opts: InteractiveButtonOptions[T]): Unit
  def reset(): Unit
  def send(targetUrl: InteractiveButtonUrl, body: T): js.Promise[Unit]
}

object InteractiveButtons {
  @scala.inline
  def apply[T](
    addResponse: InteractiveButtonOptions[T] => Callback,
    calls: js.Array[InteractiveButtonCall[T]],
    reset: Callback,
    send: (InteractiveButtonUrl, T) => CallbackTo[js.Promise[Unit]]
  ): InteractiveButtons[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any])
    __obj.updateDynamic("addResponse")(js.Any.fromFunction1((t0: typingsJapgolly.slackMock.mod.InteractiveButtonOptions[T]) => addResponse(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("send")(js.Any.fromFunction2((t0: typingsJapgolly.slackMock.mod.InteractiveButtonUrl, t1: T) => send(t0, t1).runNow()))
    __obj.asInstanceOf[InteractiveButtons[T]]
  }
}

