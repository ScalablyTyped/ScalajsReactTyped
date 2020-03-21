package typingsJapgolly.socketclusterClient.transportMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.node.NodeJS.Timer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventObject extends js.Object {
  var callback: js.UndefOr[EventObjectCallback] = js.undefined
  var cid: js.UndefOr[Double] = js.undefined
  var data: js.Any
  var event: String
  var timeout: js.UndefOr[Timer] = js.undefined
}

object EventObject {
  @scala.inline
  def apply(
    data: js.Any,
    event: String,
    callback: (/* error */ js.Error, /* eventObject */ EventObject) => Callback = null,
    cid: Int | Double = null,
    timeout: Timer = null
  ): EventObject = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* eventObject */ typingsJapgolly.socketclusterClient.transportMod.EventObject) => callback(t0, t1).runNow()))
    if (cid != null) __obj.updateDynamic("cid")(cid.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObject]
  }
}

