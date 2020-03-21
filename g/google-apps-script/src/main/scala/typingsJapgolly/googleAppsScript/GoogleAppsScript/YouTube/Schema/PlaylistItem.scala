package typingsJapgolly.googleAppsScript.GoogleAppsScript.YouTube.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItem extends js.Object {
  var contentDetails: js.UndefOr[PlaylistItemContentDetails] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var snippet: js.UndefOr[PlaylistItemSnippet] = js.undefined
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

