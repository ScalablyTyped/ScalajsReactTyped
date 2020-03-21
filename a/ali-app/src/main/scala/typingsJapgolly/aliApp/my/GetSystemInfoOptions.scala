package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSystemInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_GetSystemInfoOptions: js.UndefOr[js.Function1[/* res */ SystemInfo, Unit]] = js.undefined
}

object GetSystemInfoOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ SystemInfo => Callback = null
  ): GetSystemInfoOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.aliApp.my.SystemInfo) => success(t0).runNow()))
    __obj.asInstanceOf[GetSystemInfoOptions]
  }
}

