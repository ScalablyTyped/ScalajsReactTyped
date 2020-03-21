package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.AnonNickName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region 客户端获取会员信息 https://docs.alipay.com/mini/api/userinfo
trait GetAuthUserInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_GetAuthUserInfoOptions: js.UndefOr[js.Function1[/* res */ AnonNickName, Unit]] = js.undefined
}

object GetAuthUserInfoOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonNickName => Callback = null
  ): GetAuthUserInfoOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.aliApp.AnonNickName) => success(t0).runNow()))
    __obj.asInstanceOf[GetAuthUserInfoOptions]
  }
}

