package typingsJapgolly.instagramPrivateApi

import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.CAROUSEL
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.PHOTO
import typingsJapgolly.instagramPrivateApi.instagramPrivateApiStrings.VIDEO
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMediaId extends js.Object {
  var mediaId: String
  var mediaType: js.UndefOr[PHOTO | VIDEO | CAROUSEL] = js.undefined
}

object AnonMediaId {
  @scala.inline
  def apply(mediaId: String, mediaType: PHOTO | VIDEO | CAROUSEL = null): AnonMediaId = {
    val __obj = js.Dynamic.literal(mediaId = mediaId.asInstanceOf[js.Any])
    if (mediaType != null) __obj.updateDynamic("mediaType")(mediaType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMediaId]
  }
}

