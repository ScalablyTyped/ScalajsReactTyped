package typingsJapgolly.rxjs.internalTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rxjs.internalTypesMod.NextObserver[T]
  - typings.rxjs.internalTypesMod.ErrorObserver[T]
  - typings.rxjs.internalTypesMod.CompletionObserver[T]
*/
trait PartialObserver[T] extends js.Object

object PartialObserver {
  @scala.inline
  def NextObserver[T](
    next: T => Callback,
    closed: js.UndefOr[Boolean] = js.undefined,
    complete: js.UndefOr[Callback] = js.undefined,
    error: /* err */ js.Any => Callback = null
  ): PartialObserver[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("next")(js.Any.fromFunction1((t0: T) => next(t0).runNow()))
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* err */ js.Any) => error(t0).runNow()))
    __obj.asInstanceOf[PartialObserver[T]]
  }
  @scala.inline
  def ErrorObserver[T](
    error: js.Any => Callback,
    closed: js.UndefOr[Boolean] = js.undefined,
    complete: js.UndefOr[Callback] = js.undefined,
    next: T => Callback = null
  ): PartialObserver[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: js.Any) => error(t0).runNow()))
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1((t0: T) => next(t0).runNow()))
    __obj.asInstanceOf[PartialObserver[T]]
  }
  @scala.inline
  def CompletionObserver[T](
    complete: Callback,
    closed: js.UndefOr[Boolean] = js.undefined,
    error: /* err */ js.Any => Callback = null,
    next: T => Callback = null
  ): PartialObserver[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    if (!js.isUndefined(closed)) __obj.updateDynamic("closed")(closed.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* err */ js.Any) => error(t0).runNow()))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1((t0: T) => next(t0).runNow()))
    __obj.asInstanceOf[PartialObserver[T]]
  }
}

