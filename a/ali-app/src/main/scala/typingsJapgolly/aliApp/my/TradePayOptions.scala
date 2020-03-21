package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.AnonResultCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 小程序唤起支付 https://docs.alipay.com/mini/api/openapi-pay
trait TradePayOptions
  extends BaseOptions[js.Any, js.Any] {
  	// 接入小程序支付时传入此参数。此参数为支付宝交易号
  @JSName("success")
  var success_TradePayOptions: js.UndefOr[js.Function1[/* res */ AnonResultCode, Unit]] = js.undefined
  var tradeNO: js.UndefOr[String] = js.undefined
}

object TradePayOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonResultCode => Callback = null,
    tradeNO: String = null
  ): TradePayOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.aliApp.AnonResultCode) => success(t0).runNow()))
    if (tradeNO != null) __obj.updateDynamic("tradeNO")(tradeNO.asInstanceOf[js.Any])
    __obj.asInstanceOf[TradePayOptions]
  }
}

