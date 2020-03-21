package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadingOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 是否显示透明蒙层，防止触摸穿透，默认：false
  		 */
  var mask: js.UndefOr[Boolean] = js.undefined
  /**
  		 * 提示的内容
  		 */
  var title: String
}

object LoadingOptions {
  @scala.inline
  def apply(
    title: String,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    mask: js.UndefOr[Boolean] = js.undefined,
    success: js.Any => Callback = null
  ): LoadingOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[LoadingOptions]
  }
}

