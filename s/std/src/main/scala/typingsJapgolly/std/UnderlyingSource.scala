package typingsJapgolly.std

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnderlyingSource[R] extends js.Object {
  var cancel: js.UndefOr[ReadableStreamErrorCallback] = js.undefined
  var pull: js.UndefOr[ReadableStreamDefaultControllerCallback[R]] = js.undefined
  var start: js.UndefOr[ReadableStreamDefaultControllerCallback[R]] = js.undefined
  var `type`: js.UndefOr[scala.Nothing] = js.undefined
}

object UnderlyingSource {
  @scala.inline
  def apply[R](
    cancel: /* reason */ js.Any => CallbackTo[Unit | js.Thenable[Unit]] = null,
    pull: /* controller */ ReadableStreamDefaultController[R] => CallbackTo[Unit | js.Thenable[Unit]] = null,
    start: /* controller */ ReadableStreamDefaultController[R] => CallbackTo[Unit | js.Thenable[Unit]] = null,
    `type`: js.UndefOr[scala.Nothing] = js.undefined
  ): UnderlyingSource[R] = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: /* reason */ js.Any) => cancel(t0).runNow()))
    if (pull != null) __obj.updateDynamic("pull")(js.Any.fromFunction1((t0: /* controller */ typingsJapgolly.std.ReadableStreamDefaultController[R]) => pull(t0).runNow()))
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1((t0: /* controller */ typingsJapgolly.std.ReadableStreamDefaultController[R]) => start(t0).runNow()))
    if (!js.isUndefined(`type`)) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnderlyingSource[R]]
  }
}

