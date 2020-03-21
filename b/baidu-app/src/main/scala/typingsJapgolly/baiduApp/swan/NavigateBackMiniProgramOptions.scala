package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.AnonErrMsg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigateBackMiniProgramOptions
  extends BaseOptions[js.Any, js.Any] {
  var extraData: js.UndefOr[js.Any] = js.undefined
   // 需要返回给上一个小程序的数据，上一个小程序可在 App.onShow() 中获取到这份数据。详情
  @JSName("success")
  var success_NavigateBackMiniProgramOptions: js.UndefOr[js.Function1[/* res */ AnonErrMsg, Unit]] = js.undefined
}

object NavigateBackMiniProgramOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    extraData: js.Any = null,
    fail: js.Any => Callback = null,
    success: /* res */ AnonErrMsg => Callback = null
  ): NavigateBackMiniProgramOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (extraData != null) __obj.updateDynamic("extraData")(extraData.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ typingsJapgolly.baiduApp.AnonErrMsg) => success(t0).runNow()))
    __obj.asInstanceOf[NavigateBackMiniProgramOptions]
  }
}

