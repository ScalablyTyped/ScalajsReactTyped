package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.AnonErrCode
import typingsJapgolly.baiduApp.baiduAppStrings.DELETE
import typingsJapgolly.baiduApp.baiduAppStrings.GET
import typingsJapgolly.baiduApp.baiduAppStrings.HEAD
import typingsJapgolly.baiduApp.baiduAppStrings.OPTIONS
import typingsJapgolly.baiduApp.baiduAppStrings.POST
import typingsJapgolly.baiduApp.baiduAppStrings.PUT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions
  extends BaseOptions[DataResponse, js.Any] {
  /** 请求的参数 */
  var data: js.UndefOr[String | js.Object] = js.undefined
  /** 如果设为json，会尝试对返回的数据做一次 JSON.parse  默认值为json */
  var dataType: js.UndefOr[String] = js.undefined
  @JSName("fail")
  var fail_RequestOptions: js.UndefOr[js.Function1[/* err */ AnonErrCode, Unit]] = js.undefined
  /** 设置请求的 header , header 中不能设置 Referer */
  var header: js.UndefOr[RequestHeader] = js.undefined
  /** 默认为 GET，有效值：OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT */
  var method: js.UndefOr[GET | OPTIONS | HEAD | POST | PUT | DELETE] = js.undefined
  /**
  		 * 设置响应的数据类型。合法值：text、arraybuffer  默认值为text
  		 * @version 1.7.0
  		 */
  var responseType: js.UndefOr[String] = js.undefined
  /** 开发者服务器接口地址 */
  var url: String
}

object RequestOptions {
  @scala.inline
  def apply(
    url: String,
    complete: /* res */ js.Any => Callback = null,
    data: String | js.Object = null,
    dataType: String = null,
    fail: /* err */ AnonErrCode => Callback = null,
    header: RequestHeader = null,
    method: GET | OPTIONS | HEAD | POST | PUT | DELETE = null,
    responseType: String = null,
    success: DataResponse => Callback = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* err */ typingsJapgolly.baiduApp.AnonErrCode) => fail(t0).runNow()))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.swan.DataResponse) => success(t0).runNow()))
    __obj.asInstanceOf[RequestOptions]
  }
}

