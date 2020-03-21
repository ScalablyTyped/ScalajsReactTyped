package typingsJapgolly.chrome.chrome.bookmarks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BookmarkCreateArg extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  /** Optional. Defaults to the Other Bookmarks folder.  */
  var parentId: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object BookmarkCreateArg {
  @scala.inline
  def apply(index: Int | Double = null, parentId: String = null, title: String = null, url: String = null): BookmarkCreateArg = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BookmarkCreateArg]
  }
}

