package typingsJapgolly.gapiClientPlusdomains.gapi.client.plusdomains

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientPlusdomains.AnonActivityId
import typingsJapgolly.gapiClientPlusdomains.AnonCommentId
import typingsJapgolly.gapiClientPlusdomains.AnonMaxResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Get a comment. */
  def get(request: AnonCommentId): Request_[Comment]
  /** Create a new comment in reply to an activity. */
  def insert(request: AnonActivityId): Request_[Comment]
  /** List all of the comments for an activity. */
  def list(request: AnonMaxResults): Request_[CommentFeed]
}

object CommentsResource {
  @scala.inline
  def apply(
    get: AnonCommentId => CallbackTo[Request_[Comment]],
    insert: AnonActivityId => CallbackTo[Request_[Comment]],
    list: AnonMaxResults => CallbackTo[Request_[CommentFeed]]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlusdomains.AnonCommentId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlusdomains.AnonActivityId) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientPlusdomains.AnonMaxResults) => list(t0).runNow()))
    __obj.asInstanceOf[CommentsResource]
  }
}

