package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonKeyOauthtoken
import typingsJapgolly.gapiClientCompute.AnonQuotaUserSnapshot
import typingsJapgolly.gapiClientCompute.AnonSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotsResource extends js.Object {
  /**
    * Deletes the specified Snapshot resource. Keep in mind that deleting a single snapshot might not necessarily delete all the data on that snapshot. If
    * any data on the snapshot that is marked for deletion is needed for subsequent snapshots, the data will be moved to the next corresponding snapshot.
    *
    * For more information, see Deleting snaphots.
    */
  def delete(request: AnonSnapshot): Request_[Operation]
  /** Returns the specified Snapshot resource. Get a list of available snapshots by making a list() request. */
  def get(request: AnonQuotaUserSnapshot): Request_[Snapshot]
  /** Retrieves the list of Snapshot resources contained within the specified project. */
  def list(request: AnonAlt): Request_[SnapshotList]
  /** Sets the labels on a snapshot. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: AnonKeyOauthtoken): Request_[Operation]
}

object SnapshotsResource {
  @scala.inline
  def apply(
    delete: AnonSnapshot => CallbackTo[Request_[Operation]],
    get: AnonQuotaUserSnapshot => CallbackTo[Request_[Snapshot]],
    list: AnonAlt => CallbackTo[Request_[SnapshotList]],
    setLabels: AnonKeyOauthtoken => CallbackTo[Request_[Operation]]
  ): SnapshotsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonSnapshot) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonQuotaUserSnapshot) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => list(t0).runNow()))
    __obj.updateDynamic("setLabels")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonKeyOauthtoken) => setLabels(t0).runNow()))
    __obj.asInstanceOf[SnapshotsResource]
  }
}

