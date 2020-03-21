package typingsJapgolly.chromeApps.chrome.runtime

import typingsJapgolly.chromeApps.chromeAppsStrings.allAutoDetected
import typingsJapgolly.chromeApps.chromeAppsStrings.read_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaGalleriesPermission extends Permission {
  var mediaGalleries: js.Array[read_ | allAutoDetected]
}

object MediaGalleriesPermission {
  @scala.inline
  def apply(mediaGalleries: js.Array[read_ | allAutoDetected]): MediaGalleriesPermission = {
    val __obj = js.Dynamic.literal(mediaGalleries = mediaGalleries.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MediaGalleriesPermission]
  }
}

