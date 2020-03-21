package typingsJapgolly.weappApi.mod.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateBackMiniProgramOptions extends CommonCallbackOptions {
  //  需要返回给上一个小程序的数据，上一个小程序可在 App.onShow 中获取到这份数据。
  var extraData: js.Object
}

object NavigateBackMiniProgramOptions {
  @scala.inline
  def apply(
    extraData: js.Object,
    complete: /* res */ js.Any => Callback = null,
    fail: /* res */ js.Any => Callback = null,
    success: /* res */ js.Any => Callback = null
  ): NavigateBackMiniProgramOptions = {
    val __obj = js.Dynamic.literal(extraData = extraData.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* res */ js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[NavigateBackMiniProgramOptions]
  }
}

