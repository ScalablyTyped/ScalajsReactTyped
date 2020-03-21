package typingsJapgolly.dynogels.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Log_ extends js.Object {
  def info(args: js.Any*): Unit
  def warn(args: js.Any*): Unit
}

object Log_ {
  @scala.inline
  def apply(info: /* repeated */ js.Any => Callback, warn: /* repeated */ js.Any => Callback): Log_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("info")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => info(t0).runNow()))
    __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => warn(t0).runNow()))
    __obj.asInstanceOf[Log_]
  }
}

