package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComplete extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 要上传文件资源的路径
    */
  var filePath: String
  /**
    * HTTP 请求中其他额外的 form data
    */
  var formData: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * HTTP 请求 Header，Header 中不能设置 Referer
    */
  var header: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * 文件对应的 key，开发者在服务端可以通过这个 key 获取文件的二进制内容
    */
  var name: String
  var success: js.UndefOr[js.Function1[/* res */ AnonDataStatusCode, Unit]] = js.undefined
  /**
    * 开发者服务器地址
    */
  var url: String
}

object AnonComplete {
  @scala.inline
  def apply(
    filePath: String,
    name: String,
    url: String,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: js.UndefOr[Callback] = js.undefined,
    formData: StringDictionary[js.Any] = null,
    header: StringDictionary[String] = null,
    success: /* res */ AnonDataStatusCode => Callback = null
  ): AnonComplete = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    fail.foreach(p => __obj.updateDynamic("fail")(p.toJsFn))
    if (formData != null) __obj.updateDynamic("formData")(formData.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonDataStatusCode) => success(t0).runNow()))
    __obj.asInstanceOf[AnonComplete]
  }
}

