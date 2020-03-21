package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.AnonSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FsGetFileInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  var filePath: String
   // 要读取的文件路径
  @JSName("success")
  var success_FsGetFileInfoOptions: js.UndefOr[js.Function1[/* res */ AnonSize, Unit]] = js.undefined
}

object FsGetFileInfoOptions {
  @scala.inline
  def apply(
    filePath: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonSize => Callback = null
  ): FsGetFileInfoOptions = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.weixinApp.AnonSize) => success(t0).runNow()))
    __obj.asInstanceOf[FsGetFileInfoOptions]
  }
}

