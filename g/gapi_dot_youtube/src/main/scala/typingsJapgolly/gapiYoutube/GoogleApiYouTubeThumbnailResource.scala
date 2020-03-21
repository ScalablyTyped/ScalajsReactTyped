package typingsJapgolly.gapiYoutube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleApiYouTubeThumbnailResource extends js.Object {
  /**
    * The default thumbnail image. The default thumbnail for a video – or a resource that refers to a video, such as a playlist item or search result – is 120px wide and 90px tall. The default thumbnail for a channel is 88px wide and 88px tall.
    */
  var default: GoogleApiYouTubeThumbnailItemResource
  /**
    * A high resolution version of the thumbnail image. For a video (or a resource that refers to a video), this image is 480px wide and 360px tall. For a channel, this image is 800px wide and 800px tall.
    */
  var high: GoogleApiYouTubeThumbnailItemResource
  /**
    * A very high resolution version of the thumbnail image. For a video (or a resource that refers to a video), this image is 480px wide and 360px tall. For a channel, this image is 800px wide and 800px tall.
    */
  var maxres: js.UndefOr[GoogleApiYouTubeThumbnailItemResource] = js.undefined
  /**
    * A higher resolution version of the thumbnail image. For a video (or a resource that refers to a video), this image is 320px wide and 180px tall. For a channel, this image is 240px wide and 240px tall.
    */
  var medium: GoogleApiYouTubeThumbnailItemResource
  /**
    * A standard resolution version of the thumbnail image. For a video (or a resource that refers to a video), this image is 480px wide and 360px tall. For a channel, this image is 800px wide and 800px tall.
    */
  var standard: js.UndefOr[GoogleApiYouTubeThumbnailItemResource] = js.undefined
}

object GoogleApiYouTubeThumbnailResource {
  @scala.inline
  def apply(
    default: GoogleApiYouTubeThumbnailItemResource,
    high: GoogleApiYouTubeThumbnailItemResource,
    medium: GoogleApiYouTubeThumbnailItemResource,
    maxres: GoogleApiYouTubeThumbnailItemResource = null,
    standard: GoogleApiYouTubeThumbnailItemResource = null
  ): GoogleApiYouTubeThumbnailResource = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], high = high.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any])
    if (maxres != null) __obj.updateDynamic("maxres")(maxres.asInstanceOf[js.Any])
    if (standard != null) __obj.updateDynamic("standard")(standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeThumbnailResource]
  }
}

