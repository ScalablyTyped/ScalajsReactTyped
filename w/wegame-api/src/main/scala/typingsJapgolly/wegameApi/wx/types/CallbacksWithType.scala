package typingsJapgolly.wegameApi.wx.types

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallbacksWithType[T] extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function1[/* res */ T, Unit]] = js.undefined
}

object CallbacksWithType {
  @scala.inline
  def apply[T](
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: /* res */ T => Callback = null
  ): CallbacksWithType[T] = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ T) => success(t0).runNow()))
    __obj.asInstanceOf[CallbacksWithType[T]]
  }
}

