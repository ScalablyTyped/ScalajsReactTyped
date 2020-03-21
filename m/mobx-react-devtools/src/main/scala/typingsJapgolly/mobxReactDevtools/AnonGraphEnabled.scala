package typingsJapgolly.mobxReactDevtools

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGraphEnabled extends js.Object {
  var graphEnabled: js.UndefOr[Boolean] = js.undefined
  var logEnabled: js.UndefOr[Boolean] = js.undefined
  var logFilter: js.UndefOr[js.Function1[/* p */ js.Any, Boolean]] = js.undefined
  var updatesEnabled: js.UndefOr[Boolean] = js.undefined
}

object AnonGraphEnabled {
  @scala.inline
  def apply(
    graphEnabled: js.UndefOr[Boolean] = js.undefined,
    logEnabled: js.UndefOr[Boolean] = js.undefined,
    logFilter: /* p */ js.Any => CallbackTo[Boolean] = null,
    updatesEnabled: js.UndefOr[Boolean] = js.undefined
  ): AnonGraphEnabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(graphEnabled)) __obj.updateDynamic("graphEnabled")(graphEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(logEnabled)) __obj.updateDynamic("logEnabled")(logEnabled.asInstanceOf[js.Any])
    if (logFilter != null) __obj.updateDynamic("logFilter")(js.Any.fromFunction1((t0: /* p */ js.Any) => logFilter(t0).runNow()))
    if (!js.isUndefined(updatesEnabled)) __obj.updateDynamic("updatesEnabled")(updatesEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGraphEnabled]
  }
}

