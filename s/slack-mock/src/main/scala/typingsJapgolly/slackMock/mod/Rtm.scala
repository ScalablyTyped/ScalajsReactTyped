package typingsJapgolly.slackMock.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// RTM
trait Rtm[T] extends js.Object {
  var calls: js.Array[RtmCall[T]]
  var clients: js.Array[typingsJapgolly.ws.mod.^]
  def reset(): Unit
  def send(token: String, message: T): js.Promise[Unit]
  def startServer(token: String): Unit
  def stopServer(token: String): Unit
}

object Rtm {
  @scala.inline
  def apply[T](
    calls: js.Array[RtmCall[T]],
    clients: js.Array[typingsJapgolly.ws.mod.^],
    reset: Callback,
    send: (String, T) => CallbackTo[js.Promise[Unit]],
    startServer: String => Callback,
    stopServer: String => Callback
  ): Rtm[T] = {
    val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], clients = clients.asInstanceOf[js.Any])
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.updateDynamic("send")(js.Any.fromFunction2((t0: java.lang.String, t1: T) => send(t0, t1).runNow()))
    __obj.updateDynamic("startServer")(js.Any.fromFunction1((t0: java.lang.String) => startServer(t0).runNow()))
    __obj.updateDynamic("stopServer")(js.Any.fromFunction1((t0: java.lang.String) => stopServer(t0).runNow()))
    __obj.asInstanceOf[Rtm[T]]
  }
}

