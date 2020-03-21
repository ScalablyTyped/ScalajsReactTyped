package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveVideoOptions
  extends BaseOptions[js.Any, js.Any] {
  var filePath: String
   // 视频文件路径，可以是临时文件路径也可以是永久文件路径
  @JSName("success")
  def success_MSaveVideoOptions(errMsg: String): Unit
}

object SaveVideoOptions {
  @scala.inline
  def apply(
    filePath: String,
    success: String => Callback,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null
  ): SaveVideoOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: java.lang.String) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[SaveVideoOptions]
  }
}

