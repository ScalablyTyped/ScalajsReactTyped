package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadFileOptions
  extends BaseOptions[js.Any, js.Any] {
  /** HTTP 请求 Header */
  var header: js.UndefOr[RequestHeader] = js.undefined
  /** 下载成功后以 tempFilePath 的形式传给页面，res = {tempFilePath: '文件的临时路径'} */
  @JSName("success")
  var success_DownloadFileOptions: js.UndefOr[js.Function1[/* res */ TempFileResponse, Unit]] = js.undefined
  /** 下载资源的 url */
  var url: String
}

object DownloadFileOptions {
  @scala.inline
  def apply(
    url: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    header: RequestHeader = null,
    success: /* res */ TempFileResponse => Callback = null
  ): DownloadFileOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.baiduApp.swan.TempFileResponse) => success(t0).runNow()))
    __obj.asInstanceOf[DownloadFileOptions]
  }
}

