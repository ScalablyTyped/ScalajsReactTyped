package typingsJapgolly.atlaskitFeedbackCollector.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedbackFlagProps extends js.Object {
  var isDismissAllowed: js.UndefOr[Boolean] = js.undefined
  var onDismissed: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
}

object FeedbackFlagProps {
  @scala.inline
  def apply(
    isDismissAllowed: js.UndefOr[Boolean] = js.undefined,
    onDismissed: /* repeated */ js.Any => CallbackTo[js.Any] = null
  ): FeedbackFlagProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isDismissAllowed)) __obj.updateDynamic("isDismissAllowed")(isDismissAllowed.asInstanceOf[js.Any])
    if (onDismissed != null) __obj.updateDynamic("onDismissed")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => onDismissed(t0).runNow()))
    __obj.asInstanceOf[FeedbackFlagProps]
  }
}

