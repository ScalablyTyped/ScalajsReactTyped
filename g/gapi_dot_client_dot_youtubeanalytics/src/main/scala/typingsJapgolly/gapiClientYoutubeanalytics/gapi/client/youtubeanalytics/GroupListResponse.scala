package typingsJapgolly.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupListResponse extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[Group]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object GroupListResponse {
  @scala.inline
  def apply(
    etag: String = null,
    items: js.Array[Group] = null,
    kind: String = null,
    nextPageToken: String = null
  ): GroupListResponse = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupListResponse]
  }
}

