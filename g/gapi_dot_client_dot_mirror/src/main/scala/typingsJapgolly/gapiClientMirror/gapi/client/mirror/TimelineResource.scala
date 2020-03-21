package typingsJapgolly.gapiClientMirror.gapi.client.mirror

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientMirror.AnonAlt
import typingsJapgolly.gapiClientMirror.AnonBundleId
import typingsJapgolly.gapiClientMirror.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineResource extends js.Object {
  var attachments: AttachmentsResource
  /** Deletes a timeline item. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Gets a single timeline item by ID. */
  def get(request: AnonAlt): Request_[TimelineItem]
  /** Inserts a new item into the timeline. */
  def insert(request: AnonFields): Request_[TimelineItem]
  /** Retrieves a list of timeline items for the authenticated user. */
  def list(request: AnonBundleId): Request_[TimelineListResponse]
  /** Updates a timeline item in place. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[TimelineItem]
  /** Updates a timeline item in place. */
  def update(request: AnonAlt): Request_[TimelineItem]
}

object TimelineResource {
  @scala.inline
  def apply(
    attachments: AttachmentsResource,
    delete: AnonAlt => CallbackTo[Request_[Unit]],
    get: AnonAlt => CallbackTo[Request_[TimelineItem]],
    insert: AnonFields => CallbackTo[Request_[TimelineItem]],
    list: AnonBundleId => CallbackTo[Request_[TimelineListResponse]],
    patch: AnonAlt => CallbackTo[Request_[TimelineItem]],
    update: AnonAlt => CallbackTo[Request_[TimelineItem]]
  ): TimelineResource = {
    val __obj = js.Dynamic.literal(attachments = attachments.asInstanceOf[js.Any])
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonFields) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonBundleId) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonAlt) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientMirror.AnonAlt) => update(t0).runNow()))
    __obj.asInstanceOf[TimelineResource]
  }
}

