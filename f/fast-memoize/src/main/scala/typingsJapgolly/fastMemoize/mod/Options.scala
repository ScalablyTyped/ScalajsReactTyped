package typingsJapgolly.fastMemoize.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[F /* <: Func */] extends js.Object {
  var cache: js.UndefOr[Cache[String, ReturnType[F]]] = js.undefined
  var serializer: js.UndefOr[Serializer] = js.undefined
  var strategy: js.UndefOr[MemoizeFunc] = js.undefined
}

object Options {
  @scala.inline
  def apply[F /* <: Func */](
    cache: Cache[String, ReturnType[F]] = null,
    serializer: /* args */ js.Array[js.Any] => CallbackTo[String] = null,
    strategy: (/* fn */ Func, /* options */ js.UndefOr[Options[Func]]) => CallbackTo[Func] = null
  ): Options[F] = {
    val __obj = js.Dynamic.literal()
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (serializer != null) __obj.updateDynamic("serializer")(js.Any.fromFunction1((t0: /* args */ js.Array[js.Any]) => serializer(t0).runNow()))
    if (strategy != null) __obj.updateDynamic("strategy")(js.Any.fromFunction2((t0: /* fn */ typingsJapgolly.fastMemoize.mod.Func, t1: /* options */ js.UndefOr[typingsJapgolly.fastMemoize.mod.Options[typingsJapgolly.fastMemoize.mod.Func]]) => strategy(t0, t1).runNow()))
    __obj.asInstanceOf[Options[F]]
  }
}

