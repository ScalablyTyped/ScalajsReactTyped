package typingsJapgolly.ixJs.Ix

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lookup[TKey, TValue] extends js.Object {
  def get(key: TKey): Enumerable[TValue]
  def has(key: TKey): Boolean
  def length(): Double
  def toEnumerable(): Enumerable[Grouping[TKey, TValue]]
}

object Lookup {
  @scala.inline
  def apply[TKey, TValue](
    get: TKey => CallbackTo[Enumerable[TValue]],
    has: TKey => CallbackTo[Boolean],
    length: CallbackTo[Double],
    toEnumerable: CallbackTo[Enumerable[Grouping[TKey, TValue]]]
  ): Lookup[TKey, TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: TKey) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: TKey) => has(t0).runNow()))
    __obj.updateDynamic("length")(length.toJsFn)
    __obj.updateDynamic("toEnumerable")(toEnumerable.toJsFn)
    __obj.asInstanceOf[Lookup[TKey, TValue]]
  }
}

