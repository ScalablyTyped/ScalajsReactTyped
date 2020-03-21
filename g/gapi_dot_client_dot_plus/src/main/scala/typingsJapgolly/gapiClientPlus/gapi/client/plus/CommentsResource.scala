package typingsJapgolly.gapiClientPlus.gapi.client.plus

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPlus.AnonCommentId
import typingsJapgolly.gapiClientPlus.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Get a comment. */
  def get(request: AnonCommentId): Request_[Comment]
  /** List all of the comments for an activity. */
  def list(request: AnonKey): Request_[CommentFeed]
}

object CommentsResource {
  @scala.inline
  def apply(
    get: AnonCommentId => CallbackTo[Request_[Comment]],
    list: AnonKey => CallbackTo[Request_[CommentFeed]]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlus.AnonCommentId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlus.AnonKey) => list(t0).runNow()))
    __obj.asInstanceOf[CommentsResource]
  }
}

