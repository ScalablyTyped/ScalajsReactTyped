package typingsJapgolly.bidirectionalMap.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BiMap[TValue] extends js.Object {
  var size: Double
  def clear(): Unit
  def delete(key: String): Unit
  def deleteValue(value: TValue): Unit
  def entries(): IterableIterator[js.Tuple2[String, TValue]]
  def get(key: String): TValue
  def getKey(value: TValue): String
  def has(key: String): Boolean
  def hasValue(value: TValue): Boolean
  def keys(): IterableIterator[String]
  def set(key: String, value: TValue): Unit
  def values(): IterableIterator[TValue]
}

object BiMap {
  @scala.inline
  def apply[TValue](
    clear: Callback,
    delete: String => Callback,
    deleteValue: TValue => Callback,
    entries: CallbackTo[IterableIterator[js.Tuple2[String, TValue]]],
    get: String => CallbackTo[TValue],
    getKey: TValue => CallbackTo[String],
    has: String => CallbackTo[Boolean],
    hasValue: TValue => CallbackTo[Boolean],
    keys: CallbackTo[IterableIterator[String]],
    set: (String, TValue) => Callback,
    size: Double,
    values: CallbackTo[IterableIterator[TValue]]
  ): BiMap[TValue] = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: java.lang.String) => delete(t0).runNow()))
    __obj.updateDynamic("deleteValue")(js.Any.fromFunction1((t0: TValue) => deleteValue(t0).runNow()))
    __obj.updateDynamic("entries")(entries.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("getKey")(js.Any.fromFunction1((t0: TValue) => getKey(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: java.lang.String) => has(t0).runNow()))
    __obj.updateDynamic("hasValue")(js.Any.fromFunction1((t0: TValue) => hasValue(t0).runNow()))
    __obj.updateDynamic("keys")(keys.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: TValue) => set(t0, t1).runNow()))
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[BiMap[TValue]]
  }
}

