package typingsJapgolly.reactRelay.lrucacheMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache[T] extends js.Object {
  def capacity(): Double
  def clear(): Unit
  def delete(key: String): Unit
  def get(key: String): T | Null
  def has(key: String): Boolean
  def set(key: String, value: T): Unit
  def size(): Double
}

object Cache {
  @scala.inline
  def apply[T](
    capacity: CallbackTo[Double],
    clear: Callback,
    delete: String => Callback,
    get: String => CallbackTo[T | Null],
    has: String => CallbackTo[Boolean],
    set: (String, T) => Callback,
    size: CallbackTo[Double]
  ): Cache[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("capacity")(capacity.toJsFn)
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: java.lang.String) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: java.lang.String) => has(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: T) => set(t0, t1).runNow()))
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.asInstanceOf[Cache[T]]
  }
}

