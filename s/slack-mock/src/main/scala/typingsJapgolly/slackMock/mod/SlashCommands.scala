package typingsJapgolly.slackMock.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlashCommands[T] extends js.Object {
  var calls: js.Array[SlashCommandCall[T]]
  def addResponse(opts: SlashCommandOptions[T]): Unit
  def reset(): Unit
  def send(targetUrl: SlashCommandUrl, body: T): js.Promise[Unit]
}

object SlashCommands {
  @scala.inline
  def apply[T](
    addResponse: SlashCommandOptions[T] => Callback,
    calls: js.Array[SlashCommandCall[T]],
    reset: Callback,
    send: (SlashCommandUrl, T) => CallbackTo[js.Promise[Unit]]
  ): SlashCommands[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any])
    __obj.updateDynamic("addResponse")(js.Any.fromFunction1((t0: typingsJapgolly.slackMock.mod.SlashCommandOptions[T]) => addResponse(t0).runNow()))
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("send")(js.Any.fromFunction2((t0: typingsJapgolly.slackMock.mod.SlashCommandUrl, t1: T) => send(t0, t1).runNow()))
    __obj.asInstanceOf[SlashCommands[T]]
  }
}

