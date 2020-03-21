package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.minappEnv.Function
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TranslateMarkerOption extends js.Object {
  /** 动画结束回调函数 */
  var animationEnd: js.UndefOr[Function] = js.undefined
  /** 移动过程中是否自动旋转 marker */
  var autoRotate: Boolean
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[TranslateMarkerCompleteCallback] = js.undefined
  /** 指定 marker 移动到的目标点 */
  var destination: DestinationOption
  /** 动画持续时长，平移与旋转分别计算 */
  var duration: js.UndefOr[Double] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[TranslateMarkerFailCallback] = js.undefined
  /** 指定 marker */
  var markerId: Double
  /** marker 的旋转角度 */
  var rotate: Double
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[TranslateMarkerSuccessCallback] = js.undefined
}

object TranslateMarkerOption {
  @scala.inline
  def apply(
    autoRotate: Boolean,
    destination: DestinationOption,
    markerId: Double,
    rotate: Double,
    animationEnd: Function = null,
    complete: /* res */ GeneralCallbackResult => Callback = null,
    duration: Int | Double = null,
    fail: /* res */ GeneralCallbackResult => Callback = null,
    success: /* res */ GeneralCallbackResult => Callback = null
  ): TranslateMarkerOption = {
    val __obj = js.Dynamic.literal(autoRotate = autoRotate.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], markerId = markerId.asInstanceOf[js.Any], rotate = rotate.asInstanceOf[js.Any])
    if (animationEnd != null) __obj.updateDynamic("animationEnd")(animationEnd.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => complete(t0).runNow()))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => success(t0).runNow()))
    __obj.asInstanceOf[TranslateMarkerOption]
  }
}

