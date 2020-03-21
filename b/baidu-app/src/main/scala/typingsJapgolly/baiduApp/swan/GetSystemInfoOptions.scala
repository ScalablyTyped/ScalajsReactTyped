package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSystemInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 成功获取系统信息的回调 */
  @JSName("success")
  def success_MGetSystemInfoOptions(res: SystemInfo): Unit
}

object GetSystemInfoOptions {
  @scala.inline
  def apply(
    success: SystemInfo => Callback,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null
  ): GetSystemInfoOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("success")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.swan.SystemInfo) => success(t0).runNow()))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    __obj.asInstanceOf[GetSystemInfoOptions]
  }
}

