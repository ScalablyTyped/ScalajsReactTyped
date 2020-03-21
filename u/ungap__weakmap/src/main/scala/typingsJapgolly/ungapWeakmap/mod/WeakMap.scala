package typingsJapgolly.ungapWeakmap.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeakMap[K /* <: js.Object */, V] extends js.Object {
  def delete(key: K): Boolean
  def get(key: K): js.UndefOr[V]
  def has(key: K): Boolean
  def set(key: K, value: V): this.type
}

object WeakMap {
  @scala.inline
  def apply[K /* <: js.Object */, V](
    delete: K => CallbackTo[Boolean],
    get: K => CallbackTo[js.UndefOr[V]],
    has: K => CallbackTo[Boolean],
    set: (K, V) => CallbackTo[WeakMap[K, V]]
  ): WeakMap[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: K) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: K) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: K) => has(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: K, t1: V) => set(t0, t1).runNow()))
    __obj.asInstanceOf[WeakMap[K, V]]
  }
}

