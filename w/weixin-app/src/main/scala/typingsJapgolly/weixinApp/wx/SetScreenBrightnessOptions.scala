package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// 设备-----屏幕亮度
trait SetScreenBrightnessOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 屏幕亮度值，范围 0~1，0 最暗，1 最亮 */
  var value: Double
}

object SetScreenBrightnessOptions {
  @scala.inline
  def apply(
    value: Double,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): SetScreenBrightnessOptions = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[SetScreenBrightnessOptions]
  }
}

