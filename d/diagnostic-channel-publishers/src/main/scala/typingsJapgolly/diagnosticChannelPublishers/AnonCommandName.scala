package typingsJapgolly.diagnosticChannelPublishers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommandName extends js.Object {
  var commandName: js.UndefOr[String] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var failure: js.UndefOr[String] = js.undefined
  var reply: js.UndefOr[js.Any] = js.undefined
}

object AnonCommandName {
  @scala.inline
  def apply(
    commandName: String = null,
    duration: Int | Double = null,
    failure: String = null,
    reply: js.Any = null
  ): AnonCommandName = {
    val __obj = js.Dynamic.literal()
    if (commandName != null) __obj.updateDynamic("commandName")(commandName.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (failure != null) __obj.updateDynamic("failure")(failure.asInstanceOf[js.Any])
    if (reply != null) __obj.updateDynamic("reply")(reply.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommandName]
  }
}

