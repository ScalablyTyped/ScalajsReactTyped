package typingsJapgolly.signalrNoJquery.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Proxy extends js.Object {
  var connection: Connection
  var hubName: String
  var state: js.Any
  def hasSubscriptions(): Boolean
  def init(connection: Connection, hubName: String): Unit
  /**
    * Invokes a server hub method with the given arguments.
    *
    * @param methodName The name of the server hub method.
    */
  def invoke(methodName: String, args: js.Any*): js.Promise[_]
  /**
    * Removes the callback invocation request from the server hub for the given event name.
    *
    * @param eventName The name of the hub event to unregister the callback for.
    * @param callback The callback to be invoked.
    */
  def off(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Proxy
  /**
    * Wires up a callback to be invoked when a invocation request is received from the server hub.
    *
    * @param eventName The name of the hub event to register the callback for.
    * @param callback The callback to be invoked.
    */
  def on(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Proxy
}

object Proxy {
  @scala.inline
  def apply(
    connection: Connection,
    hasSubscriptions: CallbackTo[Boolean],
    hubName: String,
    init: (Connection, String) => Callback,
    invoke: (String, /* repeated */ js.Any) => CallbackTo[js.Promise[js.Any]],
    off: (String, js.Function1[/* repeated */ js.Any, Unit]) => CallbackTo[Proxy],
    on: (String, js.Function1[/* repeated */ js.Any, Unit]) => CallbackTo[Proxy],
    state: js.Any
  ): Proxy = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], hubName = hubName.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("hasSubscriptions")(hasSubscriptions.toJsFn)
    __obj.updateDynamic("init")(js.Any.fromFunction2((t0: typingsJapgolly.signalrNoJquery.mod.Connection, t1: java.lang.String) => init(t0, t1).runNow()))
    __obj.updateDynamic("invoke")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => invoke(t0, t1).runNow()))
    __obj.updateDynamic("off")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, scala.Unit]) => off(t0, t1).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* repeated */ js.Any, scala.Unit]) => on(t0, t1).runNow()))
    __obj.asInstanceOf[Proxy]
  }
}

