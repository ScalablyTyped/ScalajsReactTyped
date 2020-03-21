package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonAlt
import typingsJapgolly.gapiClientYoutube.AnonFieldsKey
import typingsJapgolly.gapiClientYoutube.AnonQuotaUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveChatModeratorsResource extends js.Object {
  /** Removes a chat moderator. */
  def delete(request: AnonQuotaUser): Request_[Unit]
  /** Adds a new moderator for the chat. */
  def insert(request: AnonAlt): Request_[LiveChatModerator]
  /** Lists moderators for a live chat. */
  def list(request: AnonFieldsKey): Request_[LiveChatModeratorListResponse]
}

object LiveChatModeratorsResource {
  @scala.inline
  def apply(
    delete: AnonQuotaUser => CallbackTo[Request_[Unit]],
    insert: AnonAlt => CallbackTo[Request_[LiveChatModerator]],
    list: AnonFieldsKey => CallbackTo[Request_[LiveChatModeratorListResponse]]
  ): LiveChatModeratorsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonQuotaUser) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonAlt) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonFieldsKey) => list(t0).runNow()))
    __obj.asInstanceOf[LiveChatModeratorsResource]
  }
}

