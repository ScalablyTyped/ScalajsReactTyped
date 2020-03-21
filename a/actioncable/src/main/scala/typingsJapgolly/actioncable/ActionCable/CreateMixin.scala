package typingsJapgolly.actioncable.ActionCable

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMixin
  extends /* key */ StringDictionary[js.Any] {
  var connected: js.UndefOr[js.Function0[Unit]] = js.undefined
  var disconnected: js.UndefOr[js.Function0[Unit]] = js.undefined
  var received: js.UndefOr[js.Function1[/* obj */ js.Any, Unit]] = js.undefined
}

object CreateMixin {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    connected: js.UndefOr[Callback] = js.undefined,
    disconnected: js.UndefOr[Callback] = js.undefined,
    received: /* obj */ js.Any => Callback = null
  ): CreateMixin = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    connected.foreach(p => __obj.updateDynamic("connected")(p.toJsFn))
    disconnected.foreach(p => __obj.updateDynamic("disconnected")(p.toJsFn))
    if (received != null) __obj.updateDynamic("received")(js.Any.fromFunction1((t0: /* obj */ js.Any) => received(t0).runNow()))
    __obj.asInstanceOf[CreateMixin]
  }
}

