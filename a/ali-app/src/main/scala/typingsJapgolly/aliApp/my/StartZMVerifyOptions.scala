package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.AnonPassed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 芝麻认证 https://docs.alipay.com/mini/api/zm-service
trait StartZMVerifyOptions
  extends BaseOptions[js.Any, js.Any] {
  var bizNo: String
  	// 认证标识
  @JSName("success")
  var success_StartZMVerifyOptions: js.UndefOr[js.Function1[/* res */ AnonPassed, Unit]] = js.undefined
}

object StartZMVerifyOptions {
  @scala.inline
  def apply(
    bizNo: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonPassed => Callback = null
  ): StartZMVerifyOptions = {
    val __obj = js.Dynamic.literal(bizNo = bizNo.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.aliApp.AnonPassed) => success(t0).runNow()))
    __obj.asInstanceOf[StartZMVerifyOptions]
  }
}

