package typingsJapgolly.grpc.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listener extends js.Object {
  var onReceiveMessage: js.UndefOr[MessageListener] = js.undefined
  var onReceiveMetadata: js.UndefOr[MetadataListener] = js.undefined
  var onReceiveStatus: js.UndefOr[StatusListener] = js.undefined
}

object Listener {
  @scala.inline
  def apply(
    onReceiveMessage: (/* message */ js.Any, /* next */ js.Function) => Callback = null,
    onReceiveMetadata: (/* metadata */ Metadata, /* next */ js.Function) => Callback = null,
    onReceiveStatus: (/* status */ StatusObject, /* next */ js.Function) => Callback = null
  ): Listener = {
    val __obj = js.Dynamic.literal()
    if (onReceiveMessage != null) __obj.updateDynamic("onReceiveMessage")(js.Any.fromFunction2((t0: /* message */ js.Any, t1: /* next */ js.Function) => onReceiveMessage(t0, t1).runNow()))
    if (onReceiveMetadata != null) __obj.updateDynamic("onReceiveMetadata")(js.Any.fromFunction2((t0: /* metadata */ typingsJapgolly.grpc.mod.Metadata, t1: /* next */ js.Function) => onReceiveMetadata(t0, t1).runNow()))
    if (onReceiveStatus != null) __obj.updateDynamic("onReceiveStatus")(js.Any.fromFunction2((t0: /* status */ typingsJapgolly.grpc.mod.StatusObject, t1: /* next */ js.Function) => onReceiveStatus(t0, t1).runNow()))
    __obj.asInstanceOf[Listener]
  }
}

