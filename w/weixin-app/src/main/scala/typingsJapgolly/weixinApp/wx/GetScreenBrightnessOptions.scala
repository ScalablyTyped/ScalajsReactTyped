package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetScreenBrightnessOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 屏幕亮度值，范围 0~1，0 最暗，1 最亮 */
  @JSName("success")
  def success_MGetScreenBrightnessOptions(value: Double): Unit
}

object GetScreenBrightnessOptions {
  @scala.inline
  def apply(
    success: Double => Callback,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null
  ): GetScreenBrightnessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: scala.Double) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[GetScreenBrightnessOptions]
  }
}

