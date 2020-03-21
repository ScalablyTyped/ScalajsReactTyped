package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyFileOptions
  extends BaseOptions[js.Any, js.Any] {
   // 源文件路径，只可以是普通文件
  var destPath: String
  var srcPath: String
}

object CopyFileOptions {
  @scala.inline
  def apply(
    destPath: String,
    srcPath: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): CopyFileOptions = {
    val __obj = js.Dynamic.literal(destPath = destPath.asInstanceOf[js.Any], srcPath = srcPath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[CopyFileOptions]
  }
}

