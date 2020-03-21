package typingsJapgolly.dataloader.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheMap[K, V] extends js.Object {
  def clear(): js.Any
  def delete(key: K): js.Any
  def get(key: K): V | Unit
  def set(key: K, value: V): js.Any
}

object CacheMap {
  @scala.inline
  def apply[K, V](
    clear: CallbackTo[js.Any],
    delete: K => CallbackTo[js.Any],
    get: K => CallbackTo[V | Unit],
    set: (K, V) => CallbackTo[js.Any]
  ): CacheMap[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: K) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: K) => get(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: K, t1: V) => set(t0, t1).runNow()))
    __obj.asInstanceOf[CacheMap[K, V]]
  }
}

