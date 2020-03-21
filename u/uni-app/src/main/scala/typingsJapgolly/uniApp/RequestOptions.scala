package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import typingsJapgolly.uniApp.uniAppStrings.CONNECT
import typingsJapgolly.uniApp.uniAppStrings.DELETE
import typingsJapgolly.uniApp.uniAppStrings.GET
import typingsJapgolly.uniApp.uniAppStrings.HEAD
import typingsJapgolly.uniApp.uniAppStrings.OPTIONS
import typingsJapgolly.uniApp.uniAppStrings.POST
import typingsJapgolly.uniApp.uniAppStrings.PUT
import typingsJapgolly.uniApp.uniAppStrings.TRACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  /**
    * 结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, Unit]] = js.undefined
  /**
    * 请求的参数
    */
  var data: js.UndefOr[String | js.Object | scala.scalajs.js.typedarray.ArrayBuffer] = js.undefined
  /**
    * 如果设为json，会尝试对返回的数据做一次 JSON.parse
    */
  var dataType: js.UndefOr[String] = js.undefined
  /**
    * 失败的回调函数
    */
  var fail: js.UndefOr[js.Function1[/* result */ GeneralCallbackResult, Unit]] = js.undefined
  /**
    * 设置请求的 header，header 中不能设置 Referer。
    */
  var header: js.UndefOr[js.Any] = js.undefined
  /**
    * 默认为 GET
    * 可以是：OPTIONS，GET，HEAD，POST，PUT，DELETE，TRACE，CONNECT
    */
  var method: js.UndefOr[OPTIONS | GET | HEAD | POST | PUT | DELETE | TRACE | CONNECT] = js.undefined
  /**
    * 设置响应的数据类型。合法值：text、arraybuffer
    */
  var responseType: js.UndefOr[String] = js.undefined
  /**
    * 成功返回的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ RequestSuccessCallbackResult, Unit]] = js.undefined
  /**
    * 资源url
    */
  var url: js.UndefOr[String] = js.undefined
}

object RequestOptions {
  @scala.inline
  def apply(
    complete: /* result */ GeneralCallbackResult => Callback = null,
    data: String | js.Object | scala.scalajs.js.typedarray.ArrayBuffer = null,
    dataType: String = null,
    fail: /* result */ GeneralCallbackResult => Callback = null,
    header: js.Any = null,
    method: OPTIONS | GET | HEAD | POST | PUT | DELETE | TRACE | CONNECT = null,
    responseType: String = null,
    success: /* result */ RequestSuccessCallbackResult => Callback = null,
    url: String = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.GeneralCallbackResult) => complete(t0).runNow()))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.GeneralCallbackResult) => fail(t0).runNow()))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* result */ typingsJapgolly.uniApp.RequestSuccessCallbackResult) => success(t0).runNow()))
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

