package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.AnonErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetKeepScreenOnOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 是否保持屏幕常亮 */
  var keepScreenOn: Boolean
  @JSName("success")
  var success_SetKeepScreenOnOptions: js.UndefOr[js.Function1[/* res */ AnonErrMsg, Unit]] = js.undefined
}

object SetKeepScreenOnOptions {
  @scala.inline
  def apply(
    keepScreenOn: Boolean,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonErrMsg => Callback = null
  ): SetKeepScreenOnOptions = {
    val __obj = js.Dynamic.literal(keepScreenOn = keepScreenOn.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.baiduApp.AnonErrMsg) => success(t0).runNow()))
    __obj.asInstanceOf[SetKeepScreenOnOptions]
  }
}

