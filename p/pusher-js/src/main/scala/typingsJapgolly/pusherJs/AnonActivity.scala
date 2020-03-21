package typingsJapgolly.pusherJs

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActivity extends js.Object {
  def activity(): Unit
  def closed(): Unit
  def error(error: js.Any): Unit
  def message(message: String): Unit
  def ping(): Unit
}

object AnonActivity {
  @scala.inline
  def apply(
    activity: Callback,
    closed: Callback,
    error: js.Any => Callback,
    message: String => Callback,
    ping: Callback
  ): AnonActivity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activity")(activity.toJsFn)
    __obj.updateDynamic("closed")(closed.toJsFn)
    __obj.updateDynamic("error")(js.Any.fromFunction1((t0: js.Any) => error(t0).runNow()))
    __obj.updateDynamic("message")(js.Any.fromFunction1((t0: java.lang.String) => message(t0).runNow()))
    __obj.updateDynamic("ping")(ping.toJsFn)
    __obj.asInstanceOf[AnonActivity]
  }
}

