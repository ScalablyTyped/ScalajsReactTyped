package typingsJapgolly.fastMemoize.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache[K, V] extends js.Object {
  def get(key: K): V
  def has(key: K): Boolean
  def set(key: K, value: V): Unit
}

object Cache {
  @scala.inline
  def apply[K, V](get: K => CallbackTo[V], has: K => CallbackTo[Boolean], set: (K, V) => Callback): Cache[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: K) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: K) => has(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: K, t1: V) => set(t0, t1).runNow()))
    __obj.asInstanceOf[Cache[K, V]]
  }
}

