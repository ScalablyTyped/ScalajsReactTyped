package typingsJapgolly.wampy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelCallbacksHash extends js.Object {
  var onError: js.UndefOr[Callback] = js.undefined
  var onSuccess: js.UndefOr[Callback] = js.undefined
}

object CancelCallbacksHash {
  @scala.inline
  def apply(
    onError: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined,
    onSuccess: js.UndefOr[japgolly.scalajs.react.Callback] = js.undefined
  ): CancelCallbacksHash = {
    val __obj = js.Dynamic.literal()
    onError.foreach(p => __obj.updateDynamic("onError")(p.toJsFn))
    onSuccess.foreach(p => __obj.updateDynamic("onSuccess")(p.toJsFn))
    __obj.asInstanceOf[CancelCallbacksHash]
  }
}

