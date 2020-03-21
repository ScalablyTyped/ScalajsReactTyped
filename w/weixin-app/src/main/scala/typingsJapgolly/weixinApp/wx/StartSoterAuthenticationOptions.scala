package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.AnonAuthMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSoterAuthenticationOptions
  extends BaseOptions[js.Any, js.Any] {
   // 挑战因子。挑战因子为调用者为此次生物鉴权准备的用于签名的字符串关键是别信息，将作为result_json的一部分，供调用者识别本次请求。例如：如果场景为请求用户对某订单进行授权确认，则可以将订单号填入此参数。
  var authContent: js.UndefOr[String] = js.undefined
   // 请求使用的可接受的生物认证方式
  var challenge: String
  var requestAuthModes: js.Array[AuthModes]
   // 验证描述，即识别过程中显示在界面上的对话框提示内容
  @JSName("success")
  var success_StartSoterAuthenticationOptions: js.UndefOr[js.Function1[/* res */ AnonAuthMode, Unit]] = js.undefined
}

object StartSoterAuthenticationOptions {
  @scala.inline
  def apply(
    challenge: String,
    requestAuthModes: js.Array[AuthModes],
    authContent: String = null,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonAuthMode => Callback = null
  ): StartSoterAuthenticationOptions = {
    val __obj = js.Dynamic.literal(challenge = challenge.asInstanceOf[js.Any], requestAuthModes = requestAuthModes.asInstanceOf[js.Any])
    if (authContent != null) __obj.updateDynamic("authContent")(authContent.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.weixinApp.AnonAuthMode) => success(t0).runNow()))
    __obj.asInstanceOf[StartSoterAuthenticationOptions]
  }
}

