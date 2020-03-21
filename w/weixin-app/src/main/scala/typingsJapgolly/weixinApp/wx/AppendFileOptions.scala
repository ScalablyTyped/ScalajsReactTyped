package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendFileOptions
  extends BaseOptions[js.Any, js.Any] {
   // 要追加内容的文件路径
  var data: String | scala.scalajs.js.typedarray.ArrayBuffer
   // 要追加的文本或二进制数据
  var encoding: js.UndefOr[String] = js.undefined
  var filePath: String
}

object AppendFileOptions {
  @scala.inline
  def apply(
    data: String | scala.scalajs.js.typedarray.ArrayBuffer,
    filePath: String,
    complete: /* res */ js.Any => Callback = null,
    encoding: String = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): AppendFileOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[AppendFileOptions]
  }
}

