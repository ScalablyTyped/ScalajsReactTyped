package typingsJapgolly.rxjs.typesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompletionObserver[T] extends PartialObserver[T] {
  var closed: js.UndefOr[Boolean] = js.undefined
  var error: js.UndefOr[js.Function1[/* err */ js.Any, Unit]] = js.undefined
  var next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
  def complete(): Unit
}

object CompletionObserver {
  @scala.inline
  def apply[T](
    complete: Callback,
    closed: js.UndefOr[Boolean] = js.undefined,
    error: /* err */ js.Any => Callback = null,
    next: /* value */ T => Callback = null
  ): CompletionObserver[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* err */ js.Any) => error(t0).runNow()))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1((t0: /* value */ T) => next(t0).runNow()))
    __obj.asInstanceOf[CompletionObserver[T]]
  }
}

