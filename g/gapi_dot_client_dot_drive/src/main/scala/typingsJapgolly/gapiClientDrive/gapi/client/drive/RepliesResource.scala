package typingsJapgolly.gapiClientDrive.gapi.client.drive

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDrive.AnonCommentId
import typingsJapgolly.gapiClientDrive.AnonPageToken
import typingsJapgolly.gapiClientDrive.AnonReplyId
import typingsJapgolly.gapiClientDrive.AnonUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RepliesResource extends js.Object {
  /** Creates a new reply to a comment. */
  def create(request: AnonCommentId): Request_[Reply]
  /** Deletes a reply. */
  def delete(request: AnonReplyId): Request_[Unit]
  /** Gets a reply by ID. */
  def get(request: AnonUserIp): Request_[Reply]
  /** Lists a comment's replies. */
  def list(request: AnonPageToken): Request_[ReplyList]
  /** Updates a reply with patch semantics. */
  def update(request: AnonReplyId): Request_[Reply]
}

object RepliesResource {
  @scala.inline
  def apply(
    create: AnonCommentId => CallbackTo[Request_[Reply]],
    delete: AnonReplyId => CallbackTo[Request_[Unit]],
    get: AnonUserIp => CallbackTo[Request_[Reply]],
    list: AnonPageToken => CallbackTo[Request_[ReplyList]],
    update: AnonReplyId => CallbackTo[Request_[Reply]]
  ): RepliesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonCommentId) => create(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonReplyId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonUserIp) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonPageToken) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonReplyId) => update(t0).runNow()))
    __obj.asInstanceOf[RepliesResource]
  }
}

