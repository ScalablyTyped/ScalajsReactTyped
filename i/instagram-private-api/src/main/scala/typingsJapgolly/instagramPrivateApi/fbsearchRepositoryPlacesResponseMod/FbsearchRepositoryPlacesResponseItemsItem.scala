package typingsJapgolly.instagramPrivateApi.fbsearchRepositoryPlacesResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FbsearchRepositoryPlacesResponseItemsItem extends js.Object {
  var header_media: FbsearchRepositoryPlacesResponseHeaderMedia
  var location: FbsearchRepositoryPlacesResponseLocation
  var media_bundles: js.Array[_]
  var subtitle: String
  var title: String
}

object FbsearchRepositoryPlacesResponseItemsItem {
  @scala.inline
  def apply(
    header_media: FbsearchRepositoryPlacesResponseHeaderMedia,
    location: FbsearchRepositoryPlacesResponseLocation,
    media_bundles: js.Array[_],
    subtitle: String,
    title: String
  ): FbsearchRepositoryPlacesResponseItemsItem = {
    val __obj = js.Dynamic.literal(header_media = header_media.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], media_bundles = media_bundles.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FbsearchRepositoryPlacesResponseItemsItem]
  }
}

