package typingsJapgolly.itPushable.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var onEnd: js.UndefOr[js.Function1[/* err */ js.UndefOr[js.Error], _]] = js.undefined
  var writev: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    onEnd: /* err */ js.UndefOr[js.Error] => CallbackTo[js.Any] = null,
    writev: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (onEnd != null) __obj.updateDynamic("onEnd")(js.Any.fromFunction1((t0: /* err */ js.UndefOr[js.Error]) => onEnd(t0).runNow()))
    if (!js.isUndefined(writev)) __obj.updateDynamic("writev")(writev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

