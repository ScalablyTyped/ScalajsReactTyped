package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import typingsJapgolly.weixinApp.AnonStats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatOptions
  extends BaseOptions[js.Any, js.Any] {
  var path: String
   // 文件/目录路径
  var recursive: js.UndefOr[Boolean] = js.undefined
   // 是否递归,默认false
  @JSName("success")
  var success_StatOptions: js.UndefOr[js.Function1[/* res */ AnonStats, Unit]] = js.undefined
}

object StatOptions {
  @scala.inline
  def apply(
    path: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    recursive: js.UndefOr[Boolean] = js.undefined,
    success: /* res */ AnonStats => Callback = null
  ): StatOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.weixinApp.AnonStats) => success(t0).runNow()))
    __obj.asInstanceOf[StatOptions]
  }
}

