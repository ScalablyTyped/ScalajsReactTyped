package typingsJapgolly.chromeApps.chrome.mediaGalleries

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GalleryWatchResult extends js.Object {
  var galleryId: String
  var success: Boolean
}

object GalleryWatchResult {
  @scala.inline
  def apply(galleryId: String, success: Boolean): GalleryWatchResult = {
    val __obj = js.Dynamic.literal(galleryId = galleryId.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GalleryWatchResult]
  }
}

