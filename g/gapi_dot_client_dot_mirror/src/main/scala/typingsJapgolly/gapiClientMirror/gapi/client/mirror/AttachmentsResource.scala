package typingsJapgolly.gapiClientMirror.gapi.client.mirror

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientMirror.AnonAttachmentId
import typingsJapgolly.gapiClientMirror.AnonItemId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsResource extends js.Object {
  /** Deletes an attachment from a timeline item. */
  def delete(request: AnonAttachmentId): Request_[Unit]
  /** Retrieves an attachment on a timeline item by item ID and attachment ID. */
  def get(request: AnonAttachmentId): Request_[Attachment]
  /** Adds a new attachment to a timeline item. */
  def insert(request: AnonItemId): Request_[Attachment]
  /** Returns a list of attachments for a timeline item. */
  def list(request: AnonItemId): Request_[AttachmentsListResponse]
}

object AttachmentsResource {
  @scala.inline
  def apply(
    delete: AnonAttachmentId => CallbackTo[Request_[Unit]],
    get: AnonAttachmentId => CallbackTo[Request_[Attachment]],
    insert: AnonItemId => CallbackTo[Request_[Attachment]],
    list: AnonItemId => CallbackTo[Request_[AttachmentsListResponse]]
  ): AttachmentsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonAttachmentId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonAttachmentId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonItemId) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonItemId) => list(t0).runNow()))
    __obj.asInstanceOf[AttachmentsResource]
  }
}

