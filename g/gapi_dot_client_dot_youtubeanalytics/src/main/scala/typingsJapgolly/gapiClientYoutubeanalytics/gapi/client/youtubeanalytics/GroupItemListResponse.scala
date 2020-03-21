package typingsJapgolly.gapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupItemListResponse extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var items: js.UndefOr[js.Array[GroupItem]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object GroupItemListResponse {
  @scala.inline
  def apply(etag: String = null, items: js.Array[GroupItem] = null, kind: String = null): GroupItemListResponse = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupItemListResponse]
  }
}

