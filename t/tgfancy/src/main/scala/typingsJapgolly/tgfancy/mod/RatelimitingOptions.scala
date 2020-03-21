package typingsJapgolly.tgfancy.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RatelimitingOptions extends js.Object {
  var maxBackoff: js.UndefOr[Double] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
  @JSName("notify")
  var notify_FRatelimitingOptions: js.UndefOr[js.Function2[/* methodName */ String, /* repeated */ js.Any, Unit]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object RatelimitingOptions {
  @scala.inline
  def apply(
    maxBackoff: Int | Double = null,
    maxRetries: Int | Double = null,
    notify: (/* methodName */ String, /* repeated */ js.Any) => Callback = null,
    timeout: Int | Double = null
  ): RatelimitingOptions = {
    val __obj = js.Dynamic.literal()
    if (maxBackoff != null) __obj.updateDynamic("maxBackoff")(maxBackoff.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (notify != null) __obj.updateDynamic("notify")(js.Any.fromFunction2((t0: /* methodName */ java.lang.String, t1: /* repeated */ js.Any) => notify(t0, t1).runNow()))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RatelimitingOptions]
  }
}

