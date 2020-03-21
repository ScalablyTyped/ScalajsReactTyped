package typingsJapgolly.ably.mod.Types

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginatedResult[T] extends js.Object {
  var items: js.Array[T]
  def current(results: paginatedResultCallback[T]): Unit
  def first(results: paginatedResultCallback[T]): Unit
  def hasNext(): Boolean
  def isLast(): Boolean
  def next(results: paginatedResultCallback[T]): Unit
}

object PaginatedResult {
  @scala.inline
  def apply[T](
    current: paginatedResultCallback[T] => Callback,
    first: paginatedResultCallback[T] => Callback,
    hasNext: CallbackTo[Boolean],
    isLast: CallbackTo[Boolean],
    items: js.Array[T],
    next: paginatedResultCallback[T] => Callback
  ): PaginatedResult[T] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("current")(js.Any.fromFunction1((t0: typingsJapgolly.ably.mod.Types.paginatedResultCallback[T]) => current(t0).runNow()))
    __obj.updateDynamic("first")(js.Any.fromFunction1((t0: typingsJapgolly.ably.mod.Types.paginatedResultCallback[T]) => first(t0).runNow()))
    __obj.updateDynamic("hasNext")(hasNext.toJsFn)
    __obj.updateDynamic("isLast")(isLast.toJsFn)
    __obj.updateDynamic("next")(js.Any.fromFunction1((t0: typingsJapgolly.ably.mod.Types.paginatedResultCallback[T]) => next(t0).runNow()))
    __obj.asInstanceOf[PaginatedResult[T]]
  }
}

