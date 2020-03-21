package typingsJapgolly.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFeaturedPlaylistsOptions
  extends PaginationOptions
     with LocaleOptions {
  var timestamp: js.UndefOr[String] = js.undefined
}

object GetFeaturedPlaylistsOptions {
  @scala.inline
  def apply(
    country: String = null,
    limit: Int | Double = null,
    locale: String = null,
    offset: Int | Double = null,
    timestamp: String = null
  ): GetFeaturedPlaylistsOptions = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFeaturedPlaylistsOptions]
  }
}

