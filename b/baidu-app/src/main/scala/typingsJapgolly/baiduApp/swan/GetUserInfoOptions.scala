package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserInfoOptions
  extends BaseOptions[js.Any, js.Any] {
   // 是否带上登录态信息
  var lang: js.UndefOr[String] = js.undefined
   // 指定返回用户信息的语言，zh_CN 简体中文，zh_TW 繁体中文，en 英文。默认为en。
  /** 接口调用成功的回调函数 */
  @JSName("success")
  var success_GetUserInfoOptions: js.UndefOr[js.Function1[/* res */ UserInfoResponse, Unit]] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object GetUserInfoOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    lang: String = null,
    success: /* res */ UserInfoResponse => Callback = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): GetUserInfoOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.baiduApp.swan.UserInfoResponse) => success(t0).runNow()))
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUserInfoOptions]
  }
}

