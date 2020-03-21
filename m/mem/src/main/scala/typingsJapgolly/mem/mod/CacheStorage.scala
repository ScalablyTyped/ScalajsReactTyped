package typingsJapgolly.mem.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheStorage[KeyType, ValueType] extends js.Object {
  var clear: js.UndefOr[js.Function0[Unit]] = js.undefined
  def delete(key: KeyType): Unit
  def get(key: KeyType): js.UndefOr[ValueType]
  def has(key: KeyType): Boolean
  def set(key: KeyType, value: ValueType): Unit
}

object CacheStorage {
  @scala.inline
  def apply[KeyType, ValueType](
    delete: KeyType => Callback,
    get: KeyType => CallbackTo[js.UndefOr[ValueType]],
    has: KeyType => CallbackTo[Boolean],
    set: (KeyType, ValueType) => Callback,
    clear: js.UndefOr[Callback] = js.undefined
  ): CacheStorage[KeyType, ValueType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: KeyType) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: KeyType) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: KeyType) => has(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: KeyType, t1: ValueType) => set(t0, t1).runNow()))
    clear.foreach(p => __obj.updateDynamic("clear")(p.toJsFn))
    __obj.asInstanceOf[CacheStorage[KeyType, ValueType]]
  }
}

