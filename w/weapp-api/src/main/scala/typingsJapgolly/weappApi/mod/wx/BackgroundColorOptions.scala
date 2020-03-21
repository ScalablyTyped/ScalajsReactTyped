package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundColorOptions extends CommonCallbackOptions {
  // 窗口的背景色，必须为十六进制颜色值
  var backgroundColor: js.UndefOr[String] = js.undefined
  //  底部窗口的背景色，必须为十六进制颜色值，仅 iOS 支持
  var backgroundColorBottom: js.UndefOr[String] = js.undefined
  // 顶部窗口的背景色，必须为十六进制颜色值，仅 iOS 支持
  var backgroundColorTop: js.UndefOr[String] = js.undefined
}

object BackgroundColorOptions {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    backgroundColorBottom: String = null,
    backgroundColorTop: String = null,
    complete: /* res */ js.Any => Callback = null,
    fail: /* res */ js.Any => Callback = null,
    success: /* res */ js.Any => Callback = null
  ): BackgroundColorOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundColorBottom != null) __obj.updateDynamic("backgroundColorBottom")(backgroundColorBottom.asInstanceOf[js.Any])
    if (backgroundColorTop != null) __obj.updateDynamic("backgroundColorTop")(backgroundColorTop.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[BackgroundColorOptions]
  }
}

