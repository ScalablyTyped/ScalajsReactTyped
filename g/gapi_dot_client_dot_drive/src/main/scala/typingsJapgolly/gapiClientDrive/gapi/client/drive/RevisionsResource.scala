package typingsJapgolly.gapiClientDrive.gapi.client.drive

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDrive.AnonAcknowledgeAbuseAlt
import typingsJapgolly.gapiClientDrive.AnonAltFields
import typingsJapgolly.gapiClientDrive.AnonRevisionId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevisionsResource extends js.Object {
  /** Permanently deletes a revision. This method is only applicable to files with binary content in Drive. */
  def delete(request: AnonRevisionId): Request_[Unit]
  /** Gets a revision's metadata or content by ID. */
  def get(request: AnonAcknowledgeAbuseAlt): Request_[Revision]
  /** Lists a file's revisions. */
  def list(request: AnonAltFields): Request_[RevisionList]
  /** Updates a revision with patch semantics. */
  def update(request: AnonRevisionId): Request_[Revision]
}

object RevisionsResource {
  @scala.inline
  def apply(
    delete: AnonRevisionId => CallbackTo[Request_[Unit]],
    get: AnonAcknowledgeAbuseAlt => CallbackTo[Request_[Revision]],
    list: AnonAltFields => CallbackTo[Request_[RevisionList]],
    update: AnonRevisionId => CallbackTo[Request_[Revision]]
  ): RevisionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonRevisionId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonAcknowledgeAbuseAlt) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonAltFields) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDrive.AnonRevisionId) => update(t0).runNow()))
    __obj.asInstanceOf[RevisionsResource]
  }
}

