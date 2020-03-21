package typingsJapgolly.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsResponse extends js.Object {
  var nextPageToken: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[js.Array[Tag]] = js.undefined
}

object ListTagsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, tag: js.Array[Tag] = null): ListTagsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsResponse]
  }
}

