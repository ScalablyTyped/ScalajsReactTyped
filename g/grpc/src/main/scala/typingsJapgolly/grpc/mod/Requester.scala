package typingsJapgolly.grpc.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Requester extends js.Object {
  var cancel: js.UndefOr[CancelRequester] = js.undefined
  var getPeer: js.UndefOr[GetPeerRequester] = js.undefined
  var halfClose: js.UndefOr[CloseRequester] = js.undefined
  var sendMessage: js.UndefOr[MessageRequester] = js.undefined
  var start: js.UndefOr[MetadataRequester] = js.undefined
}

object Requester {
  @scala.inline
  def apply(
    cancel: /* next */ js.Function => Callback = null,
    getPeer: /* next */ js.Function => CallbackTo[String] = null,
    halfClose: /* next */ js.Function => Callback = null,
    sendMessage: (/* message */ js.Any, /* next */ js.Function) => Callback = null,
    start: (/* metadata */ Metadata, /* listener */ Listener, /* next */ js.Function) => Callback = null
  ): Requester = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: /* next */ js.Function) => cancel(t0).runNow()))
    if (getPeer != null) __obj.updateDynamic("getPeer")(js.Any.fromFunction1((t0: /* next */ js.Function) => getPeer(t0).runNow()))
    if (halfClose != null) __obj.updateDynamic("halfClose")(js.Any.fromFunction1((t0: /* next */ js.Function) => halfClose(t0).runNow()))
    if (sendMessage != null) __obj.updateDynamic("sendMessage")(js.Any.fromFunction2((t0: /* message */ js.Any, t1: /* next */ js.Function) => sendMessage(t0, t1).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction3((t0: /* metadata */ typingsJapgolly.grpc.mod.Metadata, t1: /* listener */ typingsJapgolly.grpc.mod.Listener, t2: /* next */ js.Function) => start(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Requester]
  }
}

