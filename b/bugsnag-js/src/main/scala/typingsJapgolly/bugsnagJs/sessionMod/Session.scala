package typingsJapgolly.bugsnagJs.sessionMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.bugsnagJs.AnonHandled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  var events: AnonHandled
  var id: String
  var startedAt: String
  def trackError(report: typingsJapgolly.bugsnagJs.reportMod.default): Unit
}

object Session {
  @scala.inline
  def apply(
    events: AnonHandled,
    id: String,
    startedAt: String,
    trackError: typingsJapgolly.bugsnagJs.reportMod.default => Callback
  ): Session = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], startedAt = startedAt.asInstanceOf[js.Any])
    __obj.updateDynamic("trackError")(js.Any.fromFunction1((t0: typingsJapgolly.bugsnagJs.reportMod.default) => trackError(t0).runNow()))
    __obj.asInstanceOf[Session]
  }
}

