package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetBackgroundColorOption extends js.Object {
  /** 窗口的背景色，必须为十六进制颜色值 */
  var backgroundColor: js.UndefOr[String] = js.undefined
  /** 底部窗口的背景色，必须为十六进制颜色值，仅 iOS 支持 */
  var backgroundColorBottom: js.UndefOr[String] = js.undefined
  /** 顶部窗口的背景色，必须为十六进制颜色值，仅 iOS 支持 */
  var backgroundColorTop: js.UndefOr[String] = js.undefined
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[SetBackgroundColorCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[SetBackgroundColorFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[SetBackgroundColorSuccessCallback] = js.undefined
}

object SetBackgroundColorOption {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    backgroundColorBottom: String = null,
    backgroundColorTop: String = null,
    complete: /* res */ GeneralCallbackResult => Callback = null,
    fail: /* res */ GeneralCallbackResult => Callback = null,
    success: /* res */ GeneralCallbackResult => Callback = null
  ): SetBackgroundColorOption = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (backgroundColorBottom != null) __obj.updateDynamic("backgroundColorBottom")(backgroundColorBottom.asInstanceOf[js.Any])
    if (backgroundColorTop != null) __obj.updateDynamic("backgroundColorTop")(backgroundColorTop.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => success(t0).runNow()))
    __obj.asInstanceOf[SetBackgroundColorOption]
  }
}

