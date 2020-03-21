package typingsJapgolly.ably.mod.Types

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogInfo extends js.Object {
  /**
  		 * A function to handle each line of log output. If handler is not specified, console.log is used.
  		 **/
  var handler: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  /**
  		 * A number controlling the verbosity of the output. Valid values are: 0 (no logs), 1 (errors only),
  		 * 2 (errors plus connection and channel state changes), 3 (high-level debug output), and 4 (full debug output).
  		 **/
  var level: js.UndefOr[Double] = js.undefined
}

object LogInfo {
  @scala.inline
  def apply(handler: /* msg */ String => Callback = null, level: Int | Double = null): LogInfo = {
    val __obj = js.Dynamic.literal()
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction1((t0: /* msg */ java.lang.String) => handler(t0).runNow()))
    if (level != null) __obj.updateDynamic("level")(level.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogInfo]
  }
}

