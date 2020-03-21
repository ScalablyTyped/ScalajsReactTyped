package typingsJapgolly.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishCallbacksHash extends js.Object {
  var onError: js.UndefOr[ErrorCallback] = js.undefined
  var onSuccess: js.UndefOr[Callback] = js.undefined
}

object PublishCallbacksHash {
  @scala.inline
  def apply(
    onError: /* args */ ErrorArgs => japgolly.scalajs.react.Callback = null,
    onSuccess: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined
  ): PublishCallbacksHash = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.wampy.mod.ErrorArgs) => onError(t0).runNow()))
    onSuccess.foreach(p => __obj.updateDynamic("onSuccess")(p.toJsFn))
    __obj.asInstanceOf[PublishCallbacksHash]
  }
}

