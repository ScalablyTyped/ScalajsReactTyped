package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingOptions extends CommonCallbackOptions {
  //  默认false。是否显示透明蒙层，防止触摸穿透
  var mask: Boolean
  // must，提示的内容
  var title: String
}

object LoadingOptions {
  @scala.inline
  def apply(
    mask: Boolean,
    title: String,
    complete: /* res */ js.Any => Callback = null,
    fail: /* res */ js.Any => Callback = null,
    success: /* res */ js.Any => Callback = null
  ): LoadingOptions = {
    val __obj = js.Dynamic.literal(mask = mask.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[LoadingOptions]
  }
}

