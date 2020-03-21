package typingsJapgolly.gapiClientPartners.gapi.client.partners

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPartners.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientMessagesResource extends js.Object {
  /**
    * Logs a generic message from the client, such as
    * `Failed to render component`, `Profile page is running slow`,
    * `More than 500 users have accessed this result.`, etc.
    */
  def log(request: AnonAlt): Request_[LogMessageResponse]
}

object ClientMessagesResource {
  @scala.inline
  def apply(log: AnonAlt => CallbackTo[Request_[LogMessageResponse]]): ClientMessagesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPartners.AnonAlt) => log(t0).runNow()))
    __obj.asInstanceOf[ClientMessagesResource]
  }
}

