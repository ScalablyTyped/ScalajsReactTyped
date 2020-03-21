package typingsJapgolly.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionEndedEvent extends js.Object {
  var cause: String
  var message: js.UndefOr[IncomingResponse] = js.undefined
  var originator: String
}

object SessionEndedEvent {
  @scala.inline
  def apply(cause: String, originator: String, message: IncomingResponse = null): SessionEndedEvent = {
    val __obj = js.Dynamic.literal(cause = cause.asInstanceOf[js.Any], originator = originator.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionEndedEvent]
  }
}

