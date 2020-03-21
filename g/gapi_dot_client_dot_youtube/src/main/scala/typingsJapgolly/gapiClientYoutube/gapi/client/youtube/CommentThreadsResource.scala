package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonAllThreadsRelatedToChannelId
import typingsJapgolly.gapiClientYoutube.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentThreadsResource extends js.Object {
  /** Creates a new top-level comment. To add a reply to an existing comment, use the comments.insert method instead. */
  def insert(request: AnonAlt): Request_[CommentThread]
  /** Returns a list of comment threads that match the API request parameters. */
  def list(request: AnonAllThreadsRelatedToChannelId): Request_[CommentThreadListResponse]
  /** Modifies the top-level comment in a comment thread. */
  def update(request: AnonAlt): Request_[CommentThread]
}

object CommentThreadsResource {
  @scala.inline
  def apply(
    insert: AnonAlt => CallbackTo[Request_[CommentThread]],
    list: AnonAllThreadsRelatedToChannelId => CallbackTo[Request_[CommentThreadListResponse]],
    update: AnonAlt => CallbackTo[Request_[CommentThread]]
  ): CommentThreadsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonAlt) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonAllThreadsRelatedToChannelId) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonAlt) => update(t0).runNow()))
    __obj.asInstanceOf[CommentThreadsResource]
  }
}

