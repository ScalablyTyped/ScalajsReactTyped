package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddCardAuthOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_AddCardAuthOptions: js.UndefOr[js.Function1[/* res */ AddCardAuthResult, Unit]] = js.undefined
  /**
  		 * 开卡授权的页面地址，从alipay.marketing.card.activateurl.apply接口获取
  		 */
  var url: String
}

object AddCardAuthOptions {
  @scala.inline
  def apply(
    url: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ AddCardAuthResult => Callback = null
  ): AddCardAuthOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.aliApp.my.AddCardAuthResult) => success(t0).runNow()))
    __obj.asInstanceOf[AddCardAuthOptions]
  }
}

