package typingsJapgolly.gapiClientBlogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDisplayName extends js.Object {
  /** The display name. */
  var displayName: js.UndefOr[String] = js.undefined
  /** The identifier of the Post creator. */
  var id: js.UndefOr[String] = js.undefined
  /** The Post author's avatar. */
  var image: js.UndefOr[AnonUrl] = js.undefined
  /** The URL of the Post creator's Profile page. */
  var url: js.UndefOr[String] = js.undefined
}

object AnonDisplayName {
  @scala.inline
  def apply(displayName: String = null, id: String = null, image: AnonUrl = null, url: String = null): AnonDisplayName = {
    val __obj = js.Dynamic.literal()
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisplayName]
  }
}

