package typingsJapgolly.entriaRelayExperimental

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnComplete extends js.Object {
  var onComplete: js.UndefOr[js.Function1[/* arg */ js.Error | Null, Unit]] = js.undefined
}

object AnonOnComplete {
  @scala.inline
  def apply(onComplete: /* arg */ js.Error | Null => Callback = null): AnonOnComplete = {
    val __obj = js.Dynamic.literal()
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1((t0: /* arg */ js.Error | scala.Null) => onComplete(t0).runNow()))
    __obj.asInstanceOf[AnonOnComplete]
  }
}

