package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import typingsJapgolly.aliApp.aliAppStrings.GET
import typingsJapgolly.aliApp.aliAppStrings.POST
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectSocketOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 请求的参数 */
  var data: js.UndefOr[js.Any] = js.undefined
  /** 设置请求的头部 */
  var header: js.UndefOr[RequestHeader] = js.undefined
  var method: js.UndefOr[GET | POST] = js.undefined
  /** 目标服务器url */
  var url: String
}

object ConnectSocketOptions {
  @scala.inline
  def apply(
    url: String,
    complete: /* res */ js.Any => Callback = null,
    data: js.Any = null,
    fail: js.Any => Callback = null,
    header: RequestHeader = null,
    method: GET | POST = null,
    success: js.Any => Callback = null
  ): ConnectSocketOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[ConnectSocketOptions]
  }
}

