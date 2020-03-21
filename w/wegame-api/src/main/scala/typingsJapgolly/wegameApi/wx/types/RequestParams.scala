package typingsJapgolly.wegameApi.wx.types

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.wegameApi.AnonHeader
import typingsJapgolly.wegameApi.wegameApiStrings.arraybuffer
import typingsJapgolly.wegameApi.wegameApiStrings.json
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 请求的参数
    */
  var data: js.UndefOr[String | StringDictionary[js.Any]] = js.undefined
  /**
    * 返回的数据格式
    */
  var dataType: js.UndefOr[json | arraybuffer] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 设置请求的 header，header 中不能设置 Referer
    */
  var header: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * HTTP 请求方法
    */
  var method: js.UndefOr[RequestMethod] = js.undefined
  /**
    * res.data usually can be string or ArrayBuffer
    */
  var success: js.UndefOr[js.Function1[/* res */ AnonHeader, Unit]] = js.undefined
  /**
    * 开发者服务器接口地址
    */
  var url: String
}

object RequestParams {
  @scala.inline
  def apply(
    url: String,
    complete: js.UndefOr[Callback] = js.undefined,
    data: String | StringDictionary[js.Any] = null,
    dataType: json | arraybuffer = null,
    fail: js.UndefOr[Callback] = js.undefined,
    header: StringDictionary[String] = null,
    method: RequestMethod = null,
    success: /* res */ AnonHeader => Callback = null
  ): RequestParams = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonHeader) => success(t0).runNow()))
    __obj.asInstanceOf[RequestParams]
  }
}

