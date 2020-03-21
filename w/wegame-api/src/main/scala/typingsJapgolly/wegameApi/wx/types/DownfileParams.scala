package typingsJapgolly.wegameApi.wx.types

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.wegameApi.AnonErrMsg
import typingsJapgolly.wegameApi.AnonStatusCode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownfileParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fail: js.UndefOr[js.Function1[/* res */ AnonErrMsg, Unit]] = js.undefined
  /**
    * 在指定filePath之后success回调中将不会有res.tempFilePath路径值，下载的文件会直接写入filePath指定的路径（有写入权限的情况下，根目录请使用wx.env.USER_DATA_PATH，路径文件夹必须存在，否则写入失败）
    */
  var filePath: js.UndefOr[String] = js.undefined
  /**
    * 	HTTP 请求的 Header，Header 中不能设置 Referer
    */
  var header: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * res.tempFilePath 临时文件路径。如果没传入 filePath 指定文件存储路径，则下载后的文件会存储到一个临时文件
    * res.statusCode 开发者服务器返回的 HTTP 状态码
    */
  var success: js.UndefOr[js.Function1[/* res */ AnonStatusCode, Unit]] = js.undefined
  var url: String
}

object DownfileParams {
  @scala.inline
  def apply(
    url: String,
    complete: js.UndefOr[Callback] = js.undefined,
    fail: /* res */ AnonErrMsg => Callback = null,
    filePath: String = null,
    header: StringDictionary[String] = null,
    success: /* res */ AnonStatusCode => Callback = null
  ): DownfileParams = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonErrMsg) => fail(t0).runNow()))
    if (filePath != null) __obj.updateDynamic("filePath")(filePath.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.wegameApi.AnonStatusCode) => success(t0).runNow()))
    __obj.asInstanceOf[DownfileParams]
  }
}

