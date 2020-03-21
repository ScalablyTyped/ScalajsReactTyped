package typingsJapgolly.gapiClientGames.gapi.client.games

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientGames.AnonPageToken
import typingsJapgolly.gapiClientGames.AnonSnapshotId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotsResource extends js.Object {
  /** Retrieves the metadata for a given snapshot ID. */
  def get(request: AnonSnapshotId): Request_[Snapshot]
  /** Retrieves a list of snapshots created by your application for the player corresponding to the player ID. */
  def list(request: AnonPageToken): Request_[SnapshotListResponse]
}

object SnapshotsResource {
  @scala.inline
  def apply(
    get: AnonSnapshotId => CallbackTo[Request_[Snapshot]],
    list: AnonPageToken => CallbackTo[Request_[SnapshotListResponse]]
  ): SnapshotsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonSnapshotId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientGames.AnonPageToken) => list(t0).runNow()))
    __obj.asInstanceOf[SnapshotsResource]
  }
}

