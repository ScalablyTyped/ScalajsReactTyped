package typingsJapgolly.gapiClientGames.gapi.client.games

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotListResponse extends js.Object {
  /** The snapshots. */
  var items: js.UndefOr[js.Array[Snapshot]] = js.undefined
  /** Uniquely identifies the type of this resource. Value is always the fixed string games#snapshotListResponse. */
  var kind: js.UndefOr[String] = js.undefined
  /** Token corresponding to the next page of results. If there are no more results, the token is omitted. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object SnapshotListResponse {
  @scala.inline
  def apply(items: js.Array[Snapshot] = null, kind: String = null, nextPageToken: String = null): SnapshotListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotListResponse]
  }
}

