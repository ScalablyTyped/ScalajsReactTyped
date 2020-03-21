package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNetworkTypeOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 接口调用成功，返回网络类型 networkType */
  @JSName("success")
  def success_MGetNetworkTypeOptions(res: NetworkTypeData): Unit
}

object GetNetworkTypeOptions {
  @scala.inline
  def apply(
    success: NetworkTypeData => Callback,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null
  ): GetNetworkTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.swan.NetworkTypeData) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[GetNetworkTypeOptions]
  }
}

