package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareMenuOptions
  extends BaseOptions[js.Any, js.Any] {
  var withShareTicket: js.UndefOr[Boolean] = js.undefined
}

object ShareMenuOptions {
  @scala.inline
  def apply(
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null,
    withShareTicket: js.UndefOr[Boolean] = js.undefined
  ): ShareMenuOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    if (!js.isUndefined(withShareTicket)) __obj.updateDynamic("withShareTicket")(withShareTicket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareMenuOptions]
  }
}

