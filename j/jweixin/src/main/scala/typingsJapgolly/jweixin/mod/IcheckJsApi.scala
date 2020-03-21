package typingsJapgolly.jweixin.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.jweixin.AnonCheckResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IcheckJsApi extends BaseParams {
  var jsApiList: typingsJapgolly.jweixin.mod.jsApiList
   // 需要检测的JS接口列表，所有JS接口列表见附录2,
  // 以键值对的形式返回，可用的api值true，不可用为false
  // 如：{"checkResult":{"chooseImage":true},"errMsg":"checkJsApi:ok"}
  @JSName("success")
  def success_MIcheckJsApi(res: AnonCheckResult): Unit
}

object IcheckJsApi {
  @scala.inline
  def apply(
    jsApiList: jsApiList,
    success: AnonCheckResult => Callback,
    complete: /* repeated */ js.Any => Callback = null,
    fail: /* repeated */ js.Any => Callback = null
  ): IcheckJsApi = {
    val __obj = js.Dynamic.literal(jsApiList = jsApiList.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.jweixin.AnonCheckResult) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[IcheckJsApi]
  }
}

