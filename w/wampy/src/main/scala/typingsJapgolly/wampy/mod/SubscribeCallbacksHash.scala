package typingsJapgolly.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeCallbacksHash extends js.Object {
  var onError: js.UndefOr[ErrorCallback] = js.undefined
  var onEvent: js.UndefOr[EventCallback] = js.undefined
  var onSuccess: js.UndefOr[Callback] = js.undefined
}

object SubscribeCallbacksHash {
  @scala.inline
  def apply(
    onError: /* args */ ErrorArgs => japgolly.scalajs.react.Callback = null,
    onEvent: /* args */ DataArgs => japgolly.scalajs.react.Callback = null,
    onSuccess: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined
  ): SubscribeCallbacksHash = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.wampy.mod.ErrorArgs) => onError(t0).runNow()))
    if (onEvent != null) __obj.updateDynamic("onEvent")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.wampy.mod.DataArgs) => onEvent(t0).runNow()))
    onSuccess.foreach(p => __obj.updateDynamic("onSuccess")(p.toJsFn))
    __obj.asInstanceOf[SubscribeCallbacksHash]
  }
}

