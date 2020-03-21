package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 支付代扣签约 https://docs.alipay.com/mini/api/pay-sign
trait PaySignCenterOptions
  extends BaseOptions[js.Any, js.Any] {
  var signStr: String
}

object PaySignCenterOptions {
  @scala.inline
  def apply(
    signStr: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): PaySignCenterOptions = {
    val __obj = js.Dynamic.literal(signStr = signStr.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[PaySignCenterOptions]
  }
}

