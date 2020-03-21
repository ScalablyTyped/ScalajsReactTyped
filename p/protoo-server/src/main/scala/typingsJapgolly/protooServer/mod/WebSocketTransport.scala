package typingsJapgolly.protooServer.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSocketTransport extends js.Object {
  var closed: Boolean
  def close(): Unit
  def send(message: js.Any): js.Promise[Unit]
}

object WebSocketTransport {
  @scala.inline
  def apply(close: Callback, closed: Boolean, send: js.Any => CallbackTo[js.Promise[Unit]]): WebSocketTransport = {
    val __obj = js.Dynamic.literal(closed = closed.asInstanceOf[js.Any])
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: js.Any) => send(t0).runNow()))
    __obj.asInstanceOf[WebSocketTransport]
  }
}

