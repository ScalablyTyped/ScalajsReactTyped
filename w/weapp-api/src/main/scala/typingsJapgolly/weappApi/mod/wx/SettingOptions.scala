package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 设置
trait SettingOptions extends CommonCallbackOptions {
  @JSName("success")
  var success_SettingOptions: js.UndefOr[js.Function1[/* res */ AuthSetting, Unit]] = js.undefined
}

object SettingOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    fail: /* res */ js.Any => Callback = null,
    success: /* res */ AuthSetting => Callback = null
  ): SettingOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.weappApi.mod.wx.AuthSetting) => success(t0).runNow()))
    __obj.asInstanceOf[SettingOptions]
  }
}

