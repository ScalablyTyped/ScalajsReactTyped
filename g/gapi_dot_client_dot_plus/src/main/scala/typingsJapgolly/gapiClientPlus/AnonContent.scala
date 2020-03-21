package typingsJapgolly.gapiClientPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  /** If the attachment is an article, this property contains a snippet of text from the article. It can also include descriptions for other types. */
  var content: js.UndefOr[String] = js.undefined
  /** The title of the attachment, such as a photo caption or an article title. */
  var displayName: js.UndefOr[String] = js.undefined
  /** If the attachment is a video, the embeddable link. */
  var embed: js.UndefOr[AnonType] = js.undefined
  /** The full image URL for photo attachments. */
  var fullImage: js.UndefOr[AnonHeight] = js.undefined
  /** The ID of the attachment. */
  var id: js.UndefOr[String] = js.undefined
  /** The preview image for photos or videos. */
  var image: js.UndefOr[AnonHeight] = js.undefined
  /**
    * The type of media object. Possible values include, but are not limited to, the following values:
    * - "photo" - A photo.
    * - "album" - A photo album.
    * - "video" - A video.
    * - "article" - An article, specified by a link.
    */
  var objectType: js.UndefOr[String] = js.undefined
  /** If the attachment is an album, this property is a list of potential additional thumbnails from the album. */
  var thumbnails: js.UndefOr[js.Array[AnonDescription]] = js.undefined
  /** The link to the attachment, which should be of type text/html. */
  var url: js.UndefOr[String] = js.undefined
}

object AnonContent {
  @scala.inline
  def apply(
    content: String = null,
    displayName: String = null,
    embed: AnonType = null,
    fullImage: AnonHeight = null,
    id: String = null,
    image: AnonHeight = null,
    objectType: String = null,
    thumbnails: js.Array[AnonDescription] = null,
    url: String = null
  ): AnonContent = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (embed != null) __obj.updateDynamic("embed")(embed.asInstanceOf[js.Any])
    if (fullImage != null) __obj.updateDynamic("fullImage")(fullImage.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (objectType != null) __obj.updateDynamic("objectType")(objectType.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}

