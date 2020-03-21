package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationBarTitleOptions extends CommonCallbackOptions {
  //  动态设置当前页面的标题
  var title: String
}

object NavigationBarTitleOptions {
  @scala.inline
  def apply(
    title: String,
    complete: /* res */ js.Any => Callback = null,
    fail: /* res */ js.Any => Callback = null,
    success: /* res */ js.Any => Callback = null
  ): NavigationBarTitleOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[NavigationBarTitleOptions]
  }
}

