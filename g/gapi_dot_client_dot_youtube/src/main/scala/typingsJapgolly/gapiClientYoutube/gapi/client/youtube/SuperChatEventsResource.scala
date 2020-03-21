package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonPageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuperChatEventsResource extends js.Object {
  /** Lists Super Chat events for a channel. */
  def list(request: AnonPageToken): Request_[SuperChatEventListResponse]
}

object SuperChatEventsResource {
  @scala.inline
  def apply(list: AnonPageToken => CallbackTo[Request_[SuperChatEventListResponse]]): SuperChatEventsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonPageToken) => list(t0).runNow()))
    __obj.asInstanceOf[SuperChatEventsResource]
  }
}

