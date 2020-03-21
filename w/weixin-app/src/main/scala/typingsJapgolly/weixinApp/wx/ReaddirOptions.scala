package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.AnonFiles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReaddirOptions
  extends BaseOptions[js.Any, js.Any] {
  var dirPath: String
   // 要读取的目录路径
  @JSName("success")
  var success_ReaddirOptions: js.UndefOr[js.Function1[/* res */ AnonFiles, Unit]] = js.undefined
}

object ReaddirOptions {
  @scala.inline
  def apply(
    dirPath: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonFiles => Callback = null
  ): ReaddirOptions = {
    val __obj = js.Dynamic.literal(dirPath = dirPath.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.weixinApp.AnonFiles) => success(t0).runNow()))
    __obj.asInstanceOf[ReaddirOptions]
  }
}

