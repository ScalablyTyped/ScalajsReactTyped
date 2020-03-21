package typingsJapgolly.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DistrictSearchOptions extends js.Object {
  var extensions: js.UndefOr[String] = js.undefined
  var level: String
  var showbiz: js.UndefOr[Boolean] = js.undefined
  var subdistrict: js.UndefOr[Double] = js.undefined
}

object DistrictSearchOptions {
  @scala.inline
  def apply(
    level: String,
    extensions: String = null,
    showbiz: js.UndefOr[Boolean] = js.undefined,
    subdistrict: Int | Double = null
  ): DistrictSearchOptions = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (!js.isUndefined(showbiz)) __obj.updateDynamic("showbiz")(showbiz.asInstanceOf[js.Any])
    if (subdistrict != null) __obj.updateDynamic("subdistrict")(subdistrict.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistrictSearchOptions]
  }
}

