package typingsJapgolly.googleapis.bloggerV2Mod.bloggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaCommentList extends js.Object {
  /**
    * The List of Comments for a Post.
    */
  var items: js.UndefOr[js.Array[SchemaComment]] = js.native
  /**
    * The kind of this entry. Always blogger#commentList
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Pagination token to fetch the next page, if one exists.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * Pagination token to fetch the previous page, if one exists.
    */
  var prevPageToken: js.UndefOr[String] = js.native
}

object SchemaCommentList {
  @scala.inline
  def apply(
    items: js.Array[SchemaComment] = null,
    kind: String = null,
    nextPageToken: String = null,
    prevPageToken: String = null
  ): SchemaCommentList = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (prevPageToken != null) __obj.updateDynamic("prevPageToken")(prevPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCommentList]
  }
}

