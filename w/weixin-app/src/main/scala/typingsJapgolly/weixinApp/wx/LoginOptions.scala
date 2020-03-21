package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_LoginOptions: js.UndefOr[js.Function1[/* res */ LoginResponse, Unit]] = js.undefined
}

object LoginOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ LoginResponse => Callback = null
  ): LoginOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.weixinApp.wx.LoginResponse) => success(t0).runNow()))
    __obj.asInstanceOf[LoginOptions]
  }
}

