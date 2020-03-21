package typingsJapgolly.linq.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.linq.AnonValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDictionary[TKey, TValue] extends js.Object {
  def add(key: TKey, value: TValue): Unit
  def clear(): Unit
  def contains(key: TKey): Boolean
  def count(): Double
  def get(key: TKey): TValue
  def remove(key: TKey): Unit
  def set(key: TKey, value: TValue): Boolean
  def toEnumerable(): IEnumerable[AnonValue[TKey, TValue]]
}

object IDictionary {
  @scala.inline
  def apply[TKey, TValue](
    add: (TKey, TValue) => Callback,
    clear: Callback,
    contains: TKey => CallbackTo[Boolean],
    count: CallbackTo[Double],
    get: TKey => CallbackTo[TValue],
    remove: TKey => Callback,
    set: (TKey, TValue) => CallbackTo[Boolean],
    toEnumerable: CallbackTo[IEnumerable[AnonValue[TKey, TValue]]]
  ): IDictionary[TKey, TValue] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: TKey, t1: TValue) => add(t0, t1).runNow()))
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("contains")(js.Any.fromFunction1((t0: TKey) => contains(t0).runNow()))
    __obj.updateDynamic("count")(count.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: TKey) => get(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: TKey) => remove(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: TKey, t1: TValue) => set(t0, t1).runNow()))
    __obj.updateDynamic("toEnumerable")(toEnumerable.toJsFn)
    __obj.asInstanceOf[IDictionary[TKey, TValue]]
  }
}

