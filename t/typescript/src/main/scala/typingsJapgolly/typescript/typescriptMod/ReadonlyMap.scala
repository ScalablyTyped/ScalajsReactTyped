package typingsJapgolly.typescript.typescriptMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** ES6 Map interface, only read methods included. */
trait ReadonlyMap[T] extends js.Object {
  val size: Double
  def entries(): Iterator[js.Tuple2[String, T]]
  def forEach(action: js.Function2[/* value */ T, /* key */ String, Unit]): Unit
  def get(key: String): js.UndefOr[T]
  def has(key: String): Boolean
  def keys(): Iterator[String]
  def values(): Iterator[T]
}

object ReadonlyMap {
  @scala.inline
  def apply[T](
    entries: CallbackTo[Iterator[js.Tuple2[String, T]]],
    forEach: js.Function2[/* value */ T, /* key */ String, Unit] => Callback,
    get: String => CallbackTo[js.UndefOr[T]],
    has: String => CallbackTo[Boolean],
    keys: CallbackTo[Iterator[String]],
    size: Double,
    values: CallbackTo[Iterator[T]]
  ): ReadonlyMap[T] = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("entries")(entries.toJsFn)
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function2[/* value */ T, /* key */ java.lang.String, scala.Unit]) => forEach(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: java.lang.String) => has(t0).runNow()))
    __obj.updateDynamic("keys")(keys.toJsFn)
    __obj.updateDynamic("values")(values.toJsFn)
    __obj.asInstanceOf[ReadonlyMap[T]]
  }
}

