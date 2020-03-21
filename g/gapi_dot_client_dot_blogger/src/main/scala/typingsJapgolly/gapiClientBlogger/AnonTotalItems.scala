package typingsJapgolly.gapiClientBlogger

import typingsJapgolly.gapiClientBlogger.gapi.client.blogger.Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTotalItems extends js.Object {
  /** The List of Comments for this Post. */
  var items: js.UndefOr[js.Array[Comment]] = js.undefined
  /** The URL of the comments on this post. */
  var selfLink: js.UndefOr[String] = js.undefined
  /** The count of comments on this post. */
  var totalItems: js.UndefOr[String] = js.undefined
}

object AnonTotalItems {
  @scala.inline
  def apply(items: js.Array[Comment] = null, selfLink: String = null, totalItems: String = null): AnonTotalItems = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (selfLink != null) __obj.updateDynamic("selfLink")(selfLink.asInstanceOf[js.Any])
    if (totalItems != null) __obj.updateDynamic("totalItems")(totalItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTotalItems]
  }
}

