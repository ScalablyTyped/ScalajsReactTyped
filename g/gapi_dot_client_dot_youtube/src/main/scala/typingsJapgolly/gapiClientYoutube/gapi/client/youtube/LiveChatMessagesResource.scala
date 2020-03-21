package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonAlt
import typingsJapgolly.gapiClientYoutube.AnonLiveChatId
import typingsJapgolly.gapiClientYoutube.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatMessagesResource extends js.Object {
  /** Deletes a chat message. */
  def delete(request: AnonQuotaUser): Request_[Unit]
  /** Adds a message to a live chat. */
  def insert(request: AnonAlt): Request_[LiveChatMessage]
  /** Lists live chat messages for a specific chat. */
  def list(request: AnonLiveChatId): Request_[LiveChatMessageListResponse]
}

object LiveChatMessagesResource {
  @scala.inline
  def apply(
    delete: AnonQuotaUser => CallbackTo[Request_[Unit]],
    insert: AnonAlt => CallbackTo[Request_[LiveChatMessage]],
    list: AnonLiveChatId => CallbackTo[Request_[LiveChatMessageListResponse]]
  ): LiveChatMessagesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonQuotaUser) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonAlt) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonLiveChatId) => list(t0).runNow()))
    __obj.asInstanceOf[LiveChatMessagesResource]
  }
}

