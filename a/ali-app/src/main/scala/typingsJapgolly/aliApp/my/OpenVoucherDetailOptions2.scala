package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenVoucherDetailOptions2
  extends BaseOptions[js.Any, js.Any] {
  var partnerId: String
  		// 商户编号，以 2088 为开头（如果传入了passId则不需传入）
  var serialNumber: String
}

object OpenVoucherDetailOptions2 {
  @scala.inline
  def apply(
    partnerId: String,
    serialNumber: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): OpenVoucherDetailOptions2 = {
    val __obj = js.Dynamic.literal(partnerId = partnerId.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[OpenVoucherDetailOptions2]
  }
}

