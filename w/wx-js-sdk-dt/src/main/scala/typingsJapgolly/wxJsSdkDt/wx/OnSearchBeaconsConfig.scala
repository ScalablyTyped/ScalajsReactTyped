package typingsJapgolly.wxJsSdkDt.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSearchBeaconsConfig extends WxBaseRequestConfig {
  @JSName("complete")
  def complete_MOnSearchBeaconsConfig(argv: js.Any): Unit
}

object OnSearchBeaconsConfig {
  @scala.inline
  def apply(
    complete: js.Any => Callback,
    cancel: js.UndefOr[Callback] = js.undefined,
    fail: /* error */ js.UndefOr[js.Any] => Callback = null,
    success: /* res */ js.UndefOr[js.Any] => Callback = null
  ): OnSearchBeaconsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: js.Any) => complete(t0).runNow()))
    cancel.foreach(p => __obj.updateDynamic("cancel")(p.toJsFn))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: /* error */ js.UndefOr[js.Any]) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: /* res */ js.UndefOr[js.Any]) => success(t0).runNow()))
    __obj.asInstanceOf[OnSearchBeaconsConfig]
  }
}

