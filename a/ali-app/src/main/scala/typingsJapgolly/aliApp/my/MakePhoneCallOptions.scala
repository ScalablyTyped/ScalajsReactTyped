package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 拨打电话 https://docs.alipay.com/mini/api/macke-call
trait MakePhoneCallOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 需要拨打的电话号码
  		 */
  var number: String
}

object MakePhoneCallOptions {
  @scala.inline
  def apply(
    number: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): MakePhoneCallOptions = {
    val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[MakePhoneCallOptions]
  }
}

