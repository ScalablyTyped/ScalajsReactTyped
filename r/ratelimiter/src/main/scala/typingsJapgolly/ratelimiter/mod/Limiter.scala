package typingsJapgolly.ratelimiter.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Limiter extends js.Object {
  def get(fn: js.Function2[/* err */ js.Any, /* info */ LimiterInfo, Unit]): Unit
  def inspect(): String
}

object Limiter {
  @scala.inline
  def apply(
    get: js.Function2[/* err */ js.Any, /* info */ LimiterInfo, Unit] => Callback,
    inspect: CallbackTo[String]
  ): Limiter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: js.Function2[/* err */ js.Any, /* info */ typingsJapgolly.ratelimiter.mod.LimiterInfo, scala.Unit]) => get(t0).runNow()))
    __obj.updateDynamic("inspect")(inspect.toJsFn)
    __obj.asInstanceOf[Limiter]
  }
}

