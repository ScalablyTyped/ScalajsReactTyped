package typingsJapgolly.cometd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extension extends js.Object {
  var incoming: js.UndefOr[Listener] = js.undefined
  var outgoing: js.UndefOr[Listener] = js.undefined
  var registered: js.UndefOr[js.Function2[/* name */ String, /* cometd */ CometD, Unit]] = js.undefined
  var unregistered: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object Extension {
  @scala.inline
  def apply(
    incoming: /* message */ Message => japgolly.scalajs.react.Callback = null,
    outgoing: /* message */ Message => japgolly.scalajs.react.Callback = null,
    registered: (/* name */ String, /* cometd */ CometD) => japgolly.scalajs.react.Callback = null,
    unregistered: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined
  ): Extension = {
    val __obj = js.Dynamic.literal()
    if (incoming != null) __obj.updateDynamic("incoming")(js.Any.fromFunction1((t0: /* message */ typingsJapgolly.cometd.mod.Message) => incoming(t0).runNow()))
    if (outgoing != null) __obj.updateDynamic("outgoing")(js.Any.fromFunction1((t0: /* message */ typingsJapgolly.cometd.mod.Message) => outgoing(t0).runNow()))
    if (registered != null) __obj.updateDynamic("registered")(js.Any.fromFunction2((t0: /* name */ java.lang.String, t1: /* cometd */ typingsJapgolly.cometd.mod.CometD) => registered(t0, t1).runNow()))
    unregistered.foreach(p => __obj.updateDynamic("unregistered")(p.toJsFn))
    __obj.asInstanceOf[Extension]
  }
}

