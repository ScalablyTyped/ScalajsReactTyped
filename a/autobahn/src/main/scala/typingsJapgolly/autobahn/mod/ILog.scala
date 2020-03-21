package typingsJapgolly.autobahn.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILog extends js.Object {
  def debug(args: js.Any*): Unit
}

object ILog {
  @scala.inline
  def apply(debug: /* repeated */ js.Any => Callback): ILog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("debug")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => debug(t0).runNow()))
    __obj.asInstanceOf[ILog]
  }
}

