package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetScreenBrightnessOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 需要设置的屏幕亮度，取值范围0-1 */
  var brightness: Double
}

object SetScreenBrightnessOptions {
  @scala.inline
  def apply(
    brightness: Double,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): SetScreenBrightnessOptions = {
    val __obj = js.Dynamic.literal(brightness = brightness.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[SetScreenBrightnessOptions]
  }
}

