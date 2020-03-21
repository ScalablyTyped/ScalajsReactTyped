package typingsJapgolly.gapiClientBlogger.gapi.client.blogger

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientBlogger.AnonCommentId
import typingsJapgolly.gapiClientBlogger.AnonEndDate
import typingsJapgolly.gapiClientBlogger.AnonFetchBodies
import typingsJapgolly.gapiClientBlogger.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Marks a comment as not spam. */
  def approve(request: AnonCommentId): Request_[Comment]
  /** Delete a comment by ID. */
  def delete(request: AnonCommentId): Request_[Unit]
  /** Gets one comment by ID. */
  def get(request: AnonKey): Request_[Comment]
  /** Retrieves the comments for a post, possibly filtered. */
  def list(request: AnonEndDate): Request_[CommentList]
  /** Retrieves the comments for a blog, across all posts, possibly filtered. */
  def listByBlog(request: AnonFetchBodies): Request_[CommentList]
  /** Marks a comment as spam. */
  def markAsSpam(request: AnonCommentId): Request_[Comment]
  /** Removes the content of a comment. */
  def removeContent(request: AnonCommentId): Request_[Comment]
}

object CommentsResource {
  @scala.inline
  def apply(
    approve: AnonCommentId => CallbackTo[Request_[Comment]],
    delete: AnonCommentId => CallbackTo[Request_[Unit]],
    get: AnonKey => CallbackTo[Request_[Comment]],
    list: AnonEndDate => CallbackTo[Request_[CommentList]],
    listByBlog: AnonFetchBodies => CallbackTo[Request_[CommentList]],
    markAsSpam: AnonCommentId => CallbackTo[Request_[Comment]],
    removeContent: AnonCommentId => CallbackTo[Request_[Comment]]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("approve")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonCommentId) => approve(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonCommentId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonKey) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonEndDate) => list(t0).runNow()))
    __obj.updateDynamic("listByBlog")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonFetchBodies) => listByBlog(t0).runNow()))
    __obj.updateDynamic("markAsSpam")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonCommentId) => markAsSpam(t0).runNow()))
    __obj.updateDynamic("removeContent")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientBlogger.AnonCommentId) => removeContent(t0).runNow()))
    __obj.asInstanceOf[CommentsResource]
  }
}

