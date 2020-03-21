package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBLEConnectionOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[CreateBLEConnectionCompleteCallback] = js.undefined
  /** 用于区分设备的 id */
  var deviceId: String
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[CreateBLEConnectionFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[CreateBLEConnectionSuccessCallback] = js.undefined
  /** 超时时间，单位ms，不填表示不会超时 */
  var timeout: js.UndefOr[Double] = js.undefined
}

object CreateBLEConnectionOption {
  @scala.inline
  def apply(
    deviceId: String,
    complete: /* res */ GeneralCallbackResult => Callback = null,
    fail: /* res */ GeneralCallbackResult => Callback = null,
    success: /* res */ GeneralCallbackResult => Callback = null,
    timeout: Int | Double = null
  ): CreateBLEConnectionOption = {
    val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => success(t0).runNow()))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBLEConnectionOption]
  }
}

