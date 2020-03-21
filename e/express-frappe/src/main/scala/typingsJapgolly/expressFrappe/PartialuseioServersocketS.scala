package typingsJapgolly.expressFrappe

import japgolly.scalajs.react.Callback
import typingsJapgolly.socketIo.mod.Server
import typingsJapgolly.socketIo.mod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{use (io : socket.io.socket.io.Server, socket : socket.io.socket.io.Socket, next : (err ? : any): void): void, onConnect (io : socket.io.socket.io.Server, socket : socket.io.socket.io.Socket): void, onDisconnect (io : socket.io.socket.io.Server, socket : socket.io.socket.io.Socket): void, [eventHandler: string] : (io : socket.io.socket.io.Server, socket : socket.io.socket.io.Socket, data : any, cb : std.Function): void}> */
trait PartialuseioServersocketS extends js.Object {
  var onConnect: js.UndefOr[js.Function2[/* io */ Server, /* socket */ Socket, Unit]] = js.undefined
  var onDisconnect: js.UndefOr[js.Function2[/* io */ Server, /* socket */ Socket, Unit]] = js.undefined
  var use: js.UndefOr[
    js.Function3[
      /* io */ Server, 
      /* socket */ Socket, 
      /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit], 
      Unit
    ]
  ] = js.undefined
}

object PartialuseioServersocketS {
  @scala.inline
  def apply(
    onConnect: (/* io */ Server, /* socket */ Socket) => Callback = null,
    onDisconnect: (/* io */ Server, /* socket */ Socket) => Callback = null,
    use: (/* io */ Server, /* socket */ Socket, /* next */ js.Function1[/* err */ js.UndefOr[js.Any], Unit]) => Callback = null
  ): PartialuseioServersocketS = {
    val __obj = js.Dynamic.literal()
    if (onConnect != null) __obj.updateDynamic("onConnect")(js.Any.fromFunction2((t0: /* io */ typingsJapgolly.socketIo.mod.Server, t1: /* socket */ typingsJapgolly.socketIo.mod.Socket) => onConnect(t0, t1).runNow()))
    if (onDisconnect != null) __obj.updateDynamic("onDisconnect")(js.Any.fromFunction2((t0: /* io */ typingsJapgolly.socketIo.mod.Server, t1: /* socket */ typingsJapgolly.socketIo.mod.Socket) => onDisconnect(t0, t1).runNow()))
    if (use != null) __obj.updateDynamic("use")(js.Any.fromFunction3((t0: /* io */ typingsJapgolly.socketIo.mod.Server, t1: /* socket */ typingsJapgolly.socketIo.mod.Socket, t2: /* next */ js.Function1[/* err */ js.UndefOr[js.Any], scala.Unit]) => use(t0, t1, t2).runNow()))
    __obj.asInstanceOf[PartialuseioServersocketS]
  }
}

