package typingsJapgolly.typescript.typescriptMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadonlyUnderscoreEscapedMap[T] extends js.Object {
  val size: Double
  def entries(): Iterator[js.Tuple2[__String, T]]
  def forEach(action: js.Function2[/* value */ T, /* key */ __String, Unit]): Unit
  def get(key: __String): js.UndefOr[T]
  def has(key: __String): Boolean
  def keys(): Iterator[__String]
  def values(): Iterator[T]
}

object ReadonlyUnderscoreEscapedMap {
  @scala.inline
  def apply[T](
    entries: CallbackTo[Iterator[js.Tuple2[__String, T]]],
    forEach: js.Function2[/* value */ T, /* key */ __String, Unit] => Callback,
    get: __String => CallbackTo[js.UndefOr[T]],
    has: __String => CallbackTo[Boolean],
    keys: CallbackTo[Iterator[__String]],
    size: Double,
    values: CallbackTo[Iterator[T]]
  ): ReadonlyUnderscoreEscapedMap[T] = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("entries")(entries.toJsFn)
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function2[
  /* value */ T, 
  /* key */ typingsJapgolly.typescript.typescriptMod.__String, 
  scala.Unit]) => forEach(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.typescriptMod.__String) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: typingsJapgolly.typescript.typescriptMod.__String) => has(t0).runNow()))
    __obj.updateDynamic("keys")(keys.toJsFn)
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[ReadonlyUnderscoreEscapedMap[T]]
  }
}

