package typingsJapgolly.bintrees.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeBase[T] extends js.Object {
  var size: Double
  def clear(): Unit
  def each(cb: Callback[T]): Unit
  def find(data: T): T
  def findIter(data: T): Iterator[T]
  def iterator(): Iterator[T]
  def lowerBound(item: T): Iterator[T]
  def max(): T
  def min(): T
  def reach(cb: Callback[T]): Unit
  def upperBound(item: T): Iterator[T]
}

object TreeBase {
  @scala.inline
  def apply[T](
    clear: japgolly.scalajs.react.Callback,
    each: Callback[T] => japgolly.scalajs.react.Callback,
    find: T => CallbackTo[T],
    findIter: T => CallbackTo[Iterator[T]],
    iterator: CallbackTo[Iterator[T]],
    lowerBound: T => CallbackTo[Iterator[T]],
    max: CallbackTo[T],
    min: CallbackTo[T],
    reach: Callback[T] => japgolly.scalajs.react.Callback,
    size: Double,
    upperBound: T => CallbackTo[Iterator[T]]
  ): TreeBase[T] = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("each")(js.Any.fromFunction1((t0: typingsJapgolly.bintrees.mod.Callback[T]) => each(t0).runNow()))
    __obj.updateDynamic("find")(js.Any.fromFunction1((t0: T) => find(t0).runNow()))
    __obj.updateDynamic("findIter")(js.Any.fromFunction1((t0: T) => findIter(t0).runNow()))
    __obj.updateDynamic("iterator")(iterator.toJsFn)
    __obj.updateDynamic("lowerBound")(js.Any.fromFunction1((t0: T) => lowerBound(t0).runNow()))
    __obj.updateDynamic("max")(max.toJsFn)
    __obj.updateDynamic("min")(min.toJsFn)
    __obj.updateDynamic("reach")(js.Any.fromFunction1((t0: typingsJapgolly.bintrees.mod.Callback[T]) => reach(t0).runNow()))
    __obj.updateDynamic("upperBound")(js.Any.fromFunction1((t0: T) => upperBound(t0).runNow()))
    __obj.asInstanceOf[TreeBase[T]]
  }
}

