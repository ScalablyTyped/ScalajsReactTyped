package typingsJapgolly.linq.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILookup[TKey, TElement] extends js.Object {
  def contains(key: TKey): Boolean
  def count(): Double
  def get(key: TKey): IEnumerable[TElement]
  def toEnumerable(): IEnumerable[IGrouping[TKey, TElement]]
}

object ILookup {
  @scala.inline
  def apply[TKey, TElement](
    contains: TKey => CallbackTo[Boolean],
    count: CallbackTo[Double],
    get: TKey => CallbackTo[IEnumerable[TElement]],
    toEnumerable: CallbackTo[IEnumerable[IGrouping[TKey, TElement]]]
  ): ILookup[TKey, TElement] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: TKey) => contains(t0).runNow()))
    __obj.updateDynamic("count")(count.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: TKey) => get(t0).runNow()))
    __obj.updateDynamic("toEnumerable")(toEnumerable.toJsFn)
    __obj.asInstanceOf[ILookup[TKey, TElement]]
  }
}

