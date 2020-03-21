package typingsJapgolly.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallCallbacksHash extends js.Object {
  var onError: js.UndefOr[ErrorCallback] = js.undefined
  var onSuccess: js.UndefOr[SuccessCallback] = js.undefined
}

object CallCallbacksHash {
  @scala.inline
  def apply(
    onError: /* args */ ErrorArgs => japgolly.scalajs.react.Callback = null,
    onSuccess: /* args */ DataArgs => japgolly.scalajs.react.Callback = null
  ): CallCallbacksHash = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.wampy.mod.ErrorArgs) => onError(t0).runNow()))
    if (onSuccess != null) __obj.updateDynamic("onSuccess")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.wampy.mod.DataArgs) => onSuccess(t0).runNow()))
    __obj.asInstanceOf[CallCallbacksHash]
  }
}

