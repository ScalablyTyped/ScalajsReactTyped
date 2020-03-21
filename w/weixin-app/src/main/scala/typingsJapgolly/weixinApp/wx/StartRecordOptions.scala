package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartRecordOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 超过30s或页面onHide时会结束录像 */
  var timeoutCallback: js.UndefOr[js.Function1[/* res */ RecordResponse, Unit]] = js.undefined
}

object StartRecordOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null,
    timeoutCallback: /* res */ RecordResponse => Callback = null
  ): StartRecordOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    if (timeoutCallback != null) __obj.updateDynamic("timeoutCallback")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.weixinApp.wx.RecordResponse) => timeoutCallback(t0).runNow()))
    __obj.asInstanceOf[StartRecordOptions]
  }
}

