package typingsJapgolly.memjs

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLog extends js.Object {
  def log(args: js.Any*): Unit
}

object AnonLog {
  @scala.inline
  def apply(log: /* repeated */ js.Any => Callback): AnonLog = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => log(t0).runNow()))
    __obj.asInstanceOf[AnonLog]
  }
}

