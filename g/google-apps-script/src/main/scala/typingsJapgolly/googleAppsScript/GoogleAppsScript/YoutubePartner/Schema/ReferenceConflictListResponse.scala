package typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReferenceConflictListResponse extends js.Object {
  var items: js.UndefOr[js.Array[ReferenceConflict]] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
  var pageInfo: js.UndefOr[PageInfo] = js.undefined
}

object ReferenceConflictListResponse {
  @scala.inline
  def apply(
    items: js.Array[ReferenceConflict] = null,
    kind: String = null,
    nextPageToken: String = null,
    pageInfo: PageInfo = null
  ): ReferenceConflictListResponse = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (pageInfo != null) __obj.updateDynamic("pageInfo")(pageInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReferenceConflictListResponse]
  }
}

