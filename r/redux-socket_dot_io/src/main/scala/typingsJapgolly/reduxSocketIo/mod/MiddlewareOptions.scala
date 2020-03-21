package typingsJapgolly.reduxSocketIo.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.socketIoClient.SocketIOClient.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiddlewareOptions extends js.Object {
  var eventName: js.UndefOr[String] = js.undefined
  var execute: js.UndefOr[
    js.Function4[
      /* action */ Action[_], 
      /* emitBound */ Socket, 
      /* next */ Dispatch[_], 
      /* dispatch */ Dispatch[_], 
      _
    ]
  ] = js.undefined
}

object MiddlewareOptions {
  @scala.inline
  def apply(
    eventName: String = null,
    execute: (/* action */ Action[js.Any], /* emitBound */ Socket, /* next */ Dispatch[js.Any], /* dispatch */ Dispatch[js.Any]) => CallbackTo[js.Any] = null
  ): MiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (eventName != null) __obj.updateDynamic("eventName")(eventName.asInstanceOf[js.Any])
    if (execute != null) __obj.updateDynamic("execute")(js.Any.fromFunction4((t0: /* action */ typingsJapgolly.redux.mod.Action[js.Any], t1: /* emitBound */ typingsJapgolly.socketIoClient.SocketIOClient.Socket, t2: /* next */ typingsJapgolly.redux.mod.Dispatch[js.Any], t3: /* dispatch */ typingsJapgolly.redux.mod.Dispatch[js.Any]) => execute(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[MiddlewareOptions]
  }
}

