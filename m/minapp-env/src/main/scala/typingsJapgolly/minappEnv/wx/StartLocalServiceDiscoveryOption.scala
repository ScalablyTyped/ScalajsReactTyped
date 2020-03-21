package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartLocalServiceDiscoveryOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[StartLocalServiceDiscoveryCompleteCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[StartLocalServiceDiscoveryFailCallback] = js.undefined
  /** 要搜索的服务类型 */
  var serviceType: String
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[StartLocalServiceDiscoverySuccessCallback] = js.undefined
}

object StartLocalServiceDiscoveryOption {
  @scala.inline
  def apply(
    serviceType: String,
    complete: /* res */ GeneralCallbackResult => Callback = null,
    fail: /* result */ StartLocalServiceDiscoveryFailCallbackResult => Callback = null,
    success: /* res */ GeneralCallbackResult => Callback = null
  ): StartLocalServiceDiscoveryOption = {
    val __obj = js.Dynamic.literal(serviceType = serviceType.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.minappEnv.wx.StartLocalServiceDiscoveryFailCallbackResult) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.minappEnv.wx.GeneralCallbackResult) => success(t0).runNow()))
    __obj.asInstanceOf[StartLocalServiceDiscoveryOption]
  }
}

