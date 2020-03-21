package typingsJapgolly.wegameApi.wx.types

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbacksWithType2[T, F] extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ F, Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ T, Unit]] = js.undefined
}

object CallbacksWithType2 {
  @scala.inline
  def apply[T, F](
    complete: js.UndefOr[Callback] = js.undefined,
    fail: /* res */ F => Callback = null,
    success: /* res */ T => Callback = null
  ): CallbacksWithType2[T, F] = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ F) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ T) => success(t0).runNow()))
    __obj.asInstanceOf[CallbacksWithType2[T, F]]
  }
}

