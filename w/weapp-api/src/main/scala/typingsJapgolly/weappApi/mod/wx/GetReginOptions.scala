package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReginOptions extends CommonCallbackOptions {
  @JSName("success")
  var success_GetReginOptions: js.UndefOr[
    js.Function1[/* callback */ js.Function1[/* res */ GetReginSuccessCallbackOptions, Unit], Unit]
  ] = js.undefined
}

object GetReginOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    fail: /* res */ js.Any => Callback = null,
    success: /* callback */ js.Function1[/* res */ GetReginSuccessCallbackOptions, Unit] => Callback = null
  ): GetReginOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* callback */ js.Function1[
  /* res */ typingsJapgolly.weappApi.mod.wx.GetReginSuccessCallbackOptions, 
  scala.Unit]) => success(t0).runNow()))
    __obj.asInstanceOf[GetReginOptions]
  }
}

