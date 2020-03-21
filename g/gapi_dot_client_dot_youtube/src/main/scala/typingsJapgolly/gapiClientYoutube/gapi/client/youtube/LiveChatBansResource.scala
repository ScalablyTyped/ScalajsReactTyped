package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonAlt
import typingsJapgolly.gapiClientYoutube.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatBansResource extends js.Object {
  /** Removes a chat ban. */
  def delete(request: AnonQuotaUser): Request_[Unit]
  /** Adds a new ban to the chat. */
  def insert(request: AnonAlt): Request_[LiveChatBan]
}

object LiveChatBansResource {
  @scala.inline
  def apply(
    delete: AnonQuotaUser => CallbackTo[Request_[Unit]],
    insert: AnonAlt => CallbackTo[Request_[LiveChatBan]]
  ): LiveChatBansResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonQuotaUser) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonAlt) => insert(t0).runNow()))
    __obj.asInstanceOf[LiveChatBansResource]
  }
}

