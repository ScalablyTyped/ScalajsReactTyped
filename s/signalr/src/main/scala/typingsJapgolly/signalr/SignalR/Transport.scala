package typingsJapgolly.signalr.SignalR

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transport extends js.Object {
  var name: String
  def abort(connection: Connection, async: Boolean): Unit
  def lostConnection(connection: Connection): Unit
  def reconnect(connection: Connection): Unit
  def send(connection: Connection, data: js.Any): Unit
  def start(
    connection: Connection,
    onSuccess: js.Function0[Unit],
    onFailed: js.Function1[/* error */ js.UndefOr[ConnectionError], Unit]
  ): Unit
  def stop(connection: Connection): Unit
  def supportsKeepAlive(): Boolean
}

object Transport {
  @scala.inline
  def apply(
    abort: (Connection, Boolean) => Callback,
    lostConnection: Connection => Callback,
    name: String,
    reconnect: Connection => Callback,
    send: (Connection, js.Any) => Callback,
    start: (Connection, js.Function0[Unit], js.Function1[/* error */ js.UndefOr[ConnectionError], Unit]) => Callback,
    stop: Connection => Callback,
    supportsKeepAlive: CallbackTo[Boolean]
  ): Transport = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("abort")(js.Any.fromFunction2((t0: typingsJapgolly.signalr.SignalR.Connection, t1: scala.Boolean) => abort(t0, t1).runNow()))
    __obj.updateDynamic("lostConnection")(js.Any.fromFunction1((t0: typingsJapgolly.signalr.SignalR.Connection) => lostConnection(t0).runNow()))
    __obj.updateDynamic("reconnect")(js.Any.fromFunction1((t0: typingsJapgolly.signalr.SignalR.Connection) => reconnect(t0).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction2((t0: typingsJapgolly.signalr.SignalR.Connection, t1: js.Any) => send(t0, t1).runNow()))
    __obj.updateDynamic("start")(js.Any.fromFunction3((t0: typingsJapgolly.signalr.SignalR.Connection, t1: js.Function0[scala.Unit], t2: js.Function1[
  /* error */ js.UndefOr[typingsJapgolly.signalr.SignalR.ConnectionError], 
  scala.Unit]) => start(t0, t1, t2).runNow()))
    __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: typingsJapgolly.signalr.SignalR.Connection) => stop(t0).runNow()))
    __obj.updateDynamic("supportsKeepAlive")(supportsKeepAlive.toJsFn)
    __obj.asInstanceOf[Transport]
  }
}

