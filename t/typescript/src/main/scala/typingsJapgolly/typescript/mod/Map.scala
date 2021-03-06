package typingsJapgolly.typescript.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ES6 Map interface. */
trait Map[T] extends ReadonlyMap[T] {
  def clear(): Unit
  def delete(key: java.lang.String): Boolean
  def set(key: java.lang.String, value: T): this.type
}

object Map {
  @scala.inline
  def apply[T](
    clear: Callback,
    delete: java.lang.String => CallbackTo[Boolean],
    entries: CallbackTo[Iterator[js.Tuple2[java.lang.String, T]]],
    forEach: js.Function2[T, /* key */ java.lang.String, Unit] => Callback,
    get: java.lang.String => CallbackTo[js.UndefOr[T]],
    has: java.lang.String => CallbackTo[Boolean],
    keys: CallbackTo[Iterator[java.lang.String]],
    set: (java.lang.String, T) => CallbackTo[Map[T]],
    size: Double,
    values: CallbackTo[Iterator[T]]
  ): Map[T] = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: java.lang.String) => delete(t0).runNow()))
    __obj.updateDynamic("entries")(entries.toJsFn)
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function2[T, /* key */ java.lang.String, scala.Unit]) => forEach(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: java.lang.String) => has(t0).runNow()))
    __obj.updateDynamic("keys")(keys.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: T) => set(t0, t1).runNow()))
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[Map[T]]
  }
}

