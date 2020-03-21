package typingsJapgolly.playmusic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItem extends js.Object {
  var absolutePosition: js.UndefOr[String] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
  var creationTimestamp: js.UndefOr[String] = js.undefined
  var deleted: js.UndefOr[Boolean] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var lastModifiedTimestamp: js.UndefOr[String] = js.undefined
  var playlistId: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var track: js.UndefOr[PlaylistTrack] = js.undefined
  var trackId: js.UndefOr[String] = js.undefined
}

object PlaylistItem {
  @scala.inline
  def apply(
    absolutePosition: String = null,
    clientId: String = null,
    creationTimestamp: String = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    kind: String = null,
    lastModifiedTimestamp: String = null,
    playlistId: String = null,
    source: String = null,
    track: PlaylistTrack = null,
    trackId: String = null
  ): PlaylistItem = {
    val __obj = js.Dynamic.literal()
    if (absolutePosition != null) __obj.updateDynamic("absolutePosition")(absolutePosition.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (creationTimestamp != null) __obj.updateDynamic("creationTimestamp")(creationTimestamp.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastModifiedTimestamp != null) __obj.updateDynamic("lastModifiedTimestamp")(lastModifiedTimestamp.asInstanceOf[js.Any])
    if (playlistId != null) __obj.updateDynamic("playlistId")(playlistId.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (track != null) __obj.updateDynamic("track")(track.asInstanceOf[js.Any])
    if (trackId != null) __obj.updateDynamic("trackId")(trackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistItem]
  }
}

