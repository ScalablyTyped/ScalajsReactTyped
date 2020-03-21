package typingsJapgolly.wegameApi.wx.types

import japgolly.scalajs.react.Callback
import typingsJapgolly.wegameApi.AnonDataAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStorageParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var key: String
  var success: js.UndefOr[js.Function1[/* res */ AnonDataAny, Unit]] = js.undefined
}

object GetStorageParams {
  @scala.inline
  def apply(
    key: String,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    success: /* res */ AnonDataAny => Callback = null
  ): GetStorageParams = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonDataAny) => success(t0).runNow()))
    __obj.asInstanceOf[GetStorageParams]
  }
}

