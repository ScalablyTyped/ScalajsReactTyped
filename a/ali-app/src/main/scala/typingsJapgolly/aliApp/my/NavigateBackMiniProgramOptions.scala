package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateBackMiniProgramOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 需要传递给目标小程序的数据，目标小程序可在 App.onLaunch()，App.onShow() 中获取到这份数据
  		 */
  var extraData: js.UndefOr[js.Any] = js.undefined
}

object NavigateBackMiniProgramOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    extraData: js.Any = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): NavigateBackMiniProgramOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (extraData != null) __obj.updateDynamic("extraData")(extraData.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[NavigateBackMiniProgramOptions]
  }
}

