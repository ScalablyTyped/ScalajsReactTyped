package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItem extends js.Object {
  /**
    * The contentDetails object is included in the resource if the included item is a YouTube video. The object contains additional information about the
    * video.
    */
  var contentDetails: js.UndefOr[PlaylistItemContentDetails] = js.undefined
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** The ID that YouTube uses to uniquely identify the playlist item. */
  var id: js.UndefOr[String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#playlistItem". */
  var kind: js.UndefOr[String] = js.undefined
  /** The snippet object contains basic details about the playlist item, such as its title and position in the playlist. */
  var snippet: js.UndefOr[PlaylistItemSnippet] = js.undefined
  /** The status object contains information about the playlist item's privacy status. */
  var status: js.UndefOr[PlaylistItemStatus] = js.undefined
}

object PlaylistItem {
  @scala.inline
  def apply(
    contentDetails: PlaylistItemContentDetails = null,
    etag: String = null,
    id: String = null,
    kind: String = null,
    snippet: PlaylistItemSnippet = null,
    status: PlaylistItemStatus = null
  ): PlaylistItem = {
    val __obj = js.Dynamic.literal()
    if (contentDetails != null) __obj.updateDynamic("contentDetails")(contentDetails.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (snippet != null) __obj.updateDynamic("snippet")(snippet.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistItem]
  }
}

