package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.AnonTime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 获取服务器时间 https://docs.alipay.com/mini/api/get-server-time
trait GetServerTimeOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_GetServerTimeOptions: js.UndefOr[js.Function1[/* res */ AnonTime, Unit]] = js.undefined
}

object GetServerTimeOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonTime => Callback = null
  ): GetServerTimeOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.aliApp.AnonTime) => success(t0).runNow()))
    __obj.asInstanceOf[GetServerTimeOptions]
  }
}

