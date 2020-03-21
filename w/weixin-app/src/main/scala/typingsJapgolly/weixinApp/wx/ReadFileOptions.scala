package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.AnonData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadFileOptions
  extends BaseOptions[js.Any, js.Any] {
   // 要读取的文件的路径
  var encoding: js.UndefOr[String] = js.undefined
  var filePath: String
   // 指定读取文件的字符编码，如果不传 encoding，则以 ArrayBuffer 格式读取文件的二进制内容
  @JSName("success")
  var success_ReadFileOptions: js.UndefOr[js.Function1[/* res */ AnonData, Unit]] = js.undefined
}

object ReadFileOptions {
  @scala.inline
  def apply(
    filePath: String,
    complete: /* res */ js.Any => Callback = null,
    encoding: String = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonData => Callback = null
  ): ReadFileOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.weixinApp.AnonData) => success(t0).runNow()))
    __obj.asInstanceOf[ReadFileOptions]
  }
}

