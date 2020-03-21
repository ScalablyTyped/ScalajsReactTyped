package typingsJapgolly.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBannerImageUrl extends js.Object {
  var bannerImageUrl: js.UndefOr[String] = js.native
  var imageUrl: js.UndefOr[String] = js.native
  var seriesId: js.UndefOr[String] = js.native
  var seriesType: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
}

object AnonBannerImageUrl {
  @scala.inline
  def apply(
    bannerImageUrl: String = null,
    imageUrl: String = null,
    seriesId: String = null,
    seriesType: String = null,
    title: String = null
  ): AnonBannerImageUrl = {
    val __obj = js.Dynamic.literal()
    if (bannerImageUrl != null) __obj.updateDynamic("bannerImageUrl")(bannerImageUrl.asInstanceOf[js.Any])
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (seriesId != null) __obj.updateDynamic("seriesId")(seriesId.asInstanceOf[js.Any])
    if (seriesType != null) __obj.updateDynamic("seriesType")(seriesType.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBannerImageUrl]
  }
}

