package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MkdirOptions
  extends BaseOptions[js.Any, js.Any] {
  var dirPath: String
   // 创建的目录路径
  var recursive: js.UndefOr[Boolean] = js.undefined
}

object MkdirOptions {
  @scala.inline
  def apply(
    dirPath: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    recursive: js.UndefOr[Boolean] = js.undefined,
    success: js.Any => Callback = null
  ): MkdirOptions = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[MkdirOptions]
  }
}

