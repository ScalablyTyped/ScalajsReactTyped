package typingsJapgolly.webpackBlocksAssets.mod.css

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlOptions extends js.Object {
  var fallback: js.UndefOr[String] = js.undefined
  var limit: js.UndefOr[Double | Boolean | String] = js.undefined
  var mimetype: js.UndefOr[String] = js.undefined
}

object UrlOptions {
  @scala.inline
  def apply(fallback: String = null, limit: Double | Boolean | String = null, mimetype: String = null): UrlOptions = {
    val __obj = js.Dynamic.literal()
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (mimetype != null) __obj.updateDynamic("mimetype")(mimetype.asInstanceOf[js.Any])
    __obj.asInstanceOf[UrlOptions]
  }
}

