package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.minappEnv.minappEnvStrings.game
import typingsJapgolly.minappEnv.minappEnvStrings.normal
import typingsJapgolly.minappEnv.minappEnvStrings.ui
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartAccelerometerOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartAccelerometerCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartAccelerometerFailCallback] = js.undefined
  /** 监听加速度数据回调函数的执行频率
    *
    * 可选值：
    * - 'game': 适用于更新游戏的回调频率，在 20ms/次 左右;
    * - 'ui': 适用于更新 UI 的回调频率，在 60ms/次 左右;
    * - 'normal': 普通的回调频率，在 200ms/次 左右;
    *
    * 最低基础库： `2.1.0` */
  var interval: js.UndefOr[game | ui | normal] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartAccelerometerSuccessCallback] = js.undefined
}

object StartAccelerometerOption {
  @scala.inline
  def apply(
    complete: /* res */ GeneralCallbackResult => Callback = null,
    fail: /* res */ GeneralCallbackResult => Callback = null,
    interval: game | ui | normal = null,
    success: /* res */ GeneralCallbackResult => Callback = null
  ): StartAccelerometerOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => fail(t0).runNow()))
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => success(t0).runNow()))
    __obj.asInstanceOf[StartAccelerometerOption]
  }
}

