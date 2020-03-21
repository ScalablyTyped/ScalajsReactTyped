package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkTypeOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  /** 接口调用成功，返回网络类型 networkType */
  def success(res: NetworkTypeData): Unit
}

object GetNetworkTypeOptions {
  @scala.inline
  def apply(
    success: NetworkTypeData => Callback,
    complete: /* res */ js.Any => Callback = null,
    fail: /* res */ js.Any => Callback = null
  ): GetNetworkTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.weappApi.mod.wx.NetworkTypeData) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[GetNetworkTypeOptions]
  }
}

