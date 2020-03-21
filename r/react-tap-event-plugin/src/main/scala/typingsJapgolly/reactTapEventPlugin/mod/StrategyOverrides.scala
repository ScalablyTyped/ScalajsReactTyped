package typingsJapgolly.reactTapEventPlugin.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOverrides extends js.Object {
  var shouldRejectClick: js.UndefOr[
    js.Function2[/* lastTouchEventTimestamp */ js.Date, /* clickEventTimestamp */ js.Date, Boolean]
  ] = js.undefined
}

object StrategyOverrides {
  @scala.inline
  def apply(
    shouldRejectClick: (/* lastTouchEventTimestamp */ js.Date, /* clickEventTimestamp */ js.Date) => CallbackTo[Boolean] = null
  ): StrategyOverrides = {
    val __obj = js.Dynamic.literal()
    if (shouldRejectClick != null) __obj.updateDynamic("shouldRejectClick")(js.Any.fromFunction2((t0: /* lastTouchEventTimestamp */ js.Date, t1: /* clickEventTimestamp */ js.Date) => shouldRejectClick(t0, t1).runNow()))
    __obj.asInstanceOf[StrategyOverrides]
  }
}

