package typingsJapgolly.gapiClientDrive.gapi.client.drive

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDrive.AnonCommentId
import typingsJapgolly.gapiClientDrive.AnonFileId
import typingsJapgolly.gapiClientDrive.AnonIncludeDeleted
import typingsJapgolly.gapiClientDrive.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsResource extends js.Object {
  /** Creates a new comment on a file. */
  def create(request: AnonFileId): Request_[Comment]
  /** Deletes a comment. */
  def delete(request: AnonCommentId): Request_[Unit]
  /** Gets a comment by ID. */
  def get(request: AnonIncludeDeleted): Request_[Comment]
  /** Lists a file's comments. */
  def list(request: AnonKey): Request_[CommentList]
  /** Updates a comment with patch semantics. */
  def update(request: AnonCommentId): Request_[Comment]
}

object CommentsResource {
  @scala.inline
  def apply(
    create: AnonFileId => CallbackTo[Request_[Comment]],
    delete: AnonCommentId => CallbackTo[Request_[Unit]],
    get: AnonIncludeDeleted => CallbackTo[Request_[Comment]],
    list: AnonKey => CallbackTo[Request_[CommentList]],
    update: AnonCommentId => CallbackTo[Request_[Comment]]
  ): CommentsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonFileId) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonCommentId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonIncludeDeleted) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonCommentId) => update(t0).runNow()))
    __obj.asInstanceOf[CommentsResource]
  }
}

