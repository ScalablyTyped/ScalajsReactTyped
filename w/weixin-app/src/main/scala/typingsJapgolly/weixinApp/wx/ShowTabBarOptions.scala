package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowTabBarOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 是否需要动画效果，默认无 */
  var aniamtion: js.UndefOr[Boolean] = js.undefined
}

object ShowTabBarOptions {
  @scala.inline
  def apply(
    aniamtion: js.UndefOr[Boolean] = js.undefined,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): ShowTabBarOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(aniamtion)) __obj.updateDynamic("aniamtion")(aniamtion.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[ShowTabBarOptions]
  }
}

