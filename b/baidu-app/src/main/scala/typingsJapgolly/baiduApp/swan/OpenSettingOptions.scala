package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.AnonAuthSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenSettingOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_OpenSettingOptions: js.UndefOr[js.Function1[/* res */ AnonAuthSetting, Unit]] = js.undefined
}

object OpenSettingOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonAuthSetting => Callback = null
  ): OpenSettingOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.baiduApp.AnonAuthSetting) => success(t0).runNow()))
    __obj.asInstanceOf[OpenSettingOptions]
  }
}

