package typingsJapgolly.sauronjs.cacheMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  def clear(): Unit
  def exists(key: String): Boolean
  def forEach(fn: js.Function2[/* key */ String, /* value */ js.Any, Unit]): Unit
  def get(key: String): js.Any
  def keys(): js.Array[String]
  def set(key: String, value: js.Any): Unit
  def size(): Double
}

object Cache {
  @scala.inline
  def apply(
    clear: Callback,
    exists: String => CallbackTo[Boolean],
    forEach: js.Function2[/* key */ String, /* value */ js.Any, Unit] => Callback,
    get: String => CallbackTo[js.Any],
    keys: CallbackTo[js.Array[String]],
    set: (String, js.Any) => Callback,
    size: CallbackTo[Double]
  ): Cache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("exists")(js.Any.fromFunction1((t0: java.lang.String) => exists(t0).runNow()))
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function2[/* key */ java.lang.String, /* value */ js.Any, scala.Unit]) => forEach(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("keys")(keys.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => set(t0, t1).runNow()))
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.asInstanceOf[Cache]
  }
}

