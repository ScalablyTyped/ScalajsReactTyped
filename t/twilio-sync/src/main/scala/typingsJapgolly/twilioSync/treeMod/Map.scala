package typingsJapgolly.twilioSync.treeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Map[K, V] extends js.Object {
  def get(key: K): V
  def set(key: K, value: V): Unit
}

object Map {
  @scala.inline
  def apply[K, V](get: K => CallbackTo[V], set: (K, V) => Callback): Map[K, V] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: K) => get(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: K, t1: V) => set(t0, t1).runNow()))
    __obj.asInstanceOf[Map[K, V]]
  }
}

