package typingsJapgolly.gapiClientPartners.gapi.client.partners

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPartners.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserEventsResource extends js.Object {
  /** Logs a user event. */
  def log(request: AnonAlt): Request_[LogUserEventResponse]
}

object UserEventsResource {
  @scala.inline
  def apply(log: AnonAlt => CallbackTo[Request_[LogUserEventResponse]]): UserEventsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPartners.AnonAlt) => log(t0).runNow()))
    __obj.asInstanceOf[UserEventsResource]
  }
}

