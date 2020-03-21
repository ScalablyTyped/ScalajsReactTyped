package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoListResponse extends js.Object {
  /** Etag of this resource. */
  var etag: js.UndefOr[String] = js.undefined
  /** Serialized EventId of the request which produced this response. */
  var eventId: js.UndefOr[String] = js.undefined
  /** A list of videos that match the request criteria. */
  var items: js.UndefOr[js.Array[Video]] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "youtube#videoListResponse". */
  var kind: js.UndefOr[String] = js.undefined
  /** The token that can be used as the value of the pageToken parameter to retrieve the next page in the result set. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
  /** The token that can be used as the value of the pageToken parameter to retrieve the previous page in the result set. */
  var prevPageToken: js.UndefOr[String] = js.undefined
  var tokenPagination: js.UndefOr[js.Any] = js.undefined
  /** The visitorId identifies the visitor. */
  var visitorId: js.UndefOr[String] = js.undefined
}

object VideoListResponse {
  @scala.inline
  def apply(
    etag: String = null,
    eventId: String = null,
    items: js.Array[Video] = null,
    kind: String = null,
    nextPageToken: String = null,
    pageInfo: PageInfo = null,
    prevPageToken: String = null,
    tokenPagination: js.Any = null,
    visitorId: String = null
  ): VideoListResponse = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (eventId != null) __obj.updateDynamic("eventId")(eventId.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo.asInstanceOf[js.Any])
    if (prevPageToken != null) __obj.updateDynamic("prevPageToken")(prevPageToken.asInstanceOf[js.Any])
    if (tokenPagination != null) __obj.updateDynamic("tokenPagination")(tokenPagination.asInstanceOf[js.Any])
    if (visitorId != null) __obj.updateDynamic("visitorId")(visitorId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoListResponse]
  }
}

