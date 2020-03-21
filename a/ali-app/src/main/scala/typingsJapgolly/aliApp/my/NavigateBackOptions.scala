package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateBackOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 返回的页面数，如果 delta 大于现有打开的页面数，则返回到首页 */
  var delta: Double
}

object NavigateBackOptions {
  @scala.inline
  def apply(
    delta: Double,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): NavigateBackOptions = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[NavigateBackOptions]
  }
}

