package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.AnonNetworkAvailable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 网络状态 https://docs.alipay.com/mini/api/network-status
trait GetNetworkTypeOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_GetNetworkTypeOptions: js.UndefOr[js.Function1[/* res */ AnonNetworkAvailable, Unit]] = js.undefined
}

object GetNetworkTypeOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonNetworkAvailable => Callback = null
  ): GetNetworkTypeOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.aliApp.AnonNetworkAvailable) => success(t0).runNow()))
    __obj.asInstanceOf[GetNetworkTypeOptions]
  }
}

