package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopLocalServiceDiscoveryOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StopLocalServiceDiscoveryCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StopLocalServiceDiscoveryFailCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StopLocalServiceDiscoverySuccessCallback] = js.undefined
}

object StopLocalServiceDiscoveryOption {
  @scala.inline
  def apply(
    complete: /* res */ GeneralCallbackResult => Callback = null,
    fail: /* result */ StopLocalServiceDiscoveryFailCallbackResult => Callback = null,
    success: /* res */ GeneralCallbackResult => Callback = null
  ): StopLocalServiceDiscoveryOption = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.minappEnv.wx.StopLocalServiceDiscoveryFailCallbackResult) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => success(t0).runNow()))
    __obj.asInstanceOf[StopLocalServiceDiscoveryOption]
  }
}

