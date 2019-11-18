package typingsJapgolly.typescript.typescriptMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnderscoreEscapedMap[T] extends ReadonlyUnderscoreEscapedMap[T] {
  def clear(): Unit
  def delete(key: __String): Boolean
  def set(key: __String, value: T): this.type
}

object UnderscoreEscapedMap {
  @scala.inline
  def apply[T](
    clear: Callback,
    delete: __String => CallbackTo[Boolean],
    entries: CallbackTo[Iterator[js.Tuple2[__String, T]]],
    forEach: js.Function2[T, /* key */ __String, Unit] => Callback,
    get: __String => CallbackTo[js.UndefOr[T]],
    has: __String => CallbackTo[Boolean],
    keys: CallbackTo[Iterator[__String]],
    set: (__String, T) => CallbackTo[UnderscoreEscapedMap[T]],
    size: Double,
    values: CallbackTo[Iterator[T]]
  ): UnderscoreEscapedMap[T] = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.typescriptMod.__String) => delete(t0).runNow()))
    __obj.updateDynamic("entries")(entries.toJsFn)
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function2[T, /* key */ typingsJapgolly.typescript.typescriptMod.__String, scala.Unit]) => forEach(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.typescriptMod.__String) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.typescriptMod.__String) => has(t0).runNow()))
    __obj.updateDynamic("keys")(keys.toJsFn)
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: typingsJapgolly.typescript.typescriptMod.__String, t1: T) => set(t0, t1).runNow()))
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[UnderscoreEscapedMap[T]]
  }
}

