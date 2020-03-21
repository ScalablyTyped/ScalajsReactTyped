package typingsJapgolly.wxJsSdkDt.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * openAddress的调用参数
  */
trait OpenAddressConfig extends WxBaseRequestConfig {
  /**
    * 成功回调
    */
  @JSName("success")
  var success_OpenAddressConfig: js.UndefOr[js.Function1[/* res */ OpenAddressResponse, Unit]] = js.undefined
}

object OpenAddressConfig {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Callback] = js.undefined,
    complete: /* res */ js.UndefOr[js.Any] => Callback = null,
    fail: /* error */ js.UndefOr[js.Any] => Callback = null,
    success: /* res */ OpenAddressResponse => Callback = null
  ): OpenAddressConfig = {
    val __obj = js.Dynamic.literal()
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Any]) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wxJsSdkDt.wx.OpenAddressResponse) => success(t0).runNow()))
    __obj.asInstanceOf[OpenAddressConfig]
  }
}

