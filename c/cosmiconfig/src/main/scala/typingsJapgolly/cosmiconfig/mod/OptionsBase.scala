package typingsJapgolly.cosmiconfig.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsBase extends js.Object {
  var cache: js.UndefOr[Boolean] = js.undefined
  var ignoreEmptySearchPlaces: js.UndefOr[Boolean] = js.undefined
  var packageProp: js.UndefOr[String] = js.undefined
  var searchPlaces: js.UndefOr[js.Array[String]] = js.undefined
  var stopDir: js.UndefOr[String] = js.undefined
}

object OptionsBase {
  @scala.inline
  def apply(
    cache: js.UndefOr[Boolean] = js.undefined,
    ignoreEmptySearchPlaces: js.UndefOr[Boolean] = js.undefined,
    packageProp: String = null,
    searchPlaces: js.Array[String] = null,
    stopDir: String = null
  ): OptionsBase = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreEmptySearchPlaces)) __obj.updateDynamic("ignoreEmptySearchPlaces")(ignoreEmptySearchPlaces.asInstanceOf[js.Any])
    if (packageProp != null) __obj.updateDynamic("packageProp")(packageProp.asInstanceOf[js.Any])
    if (searchPlaces != null) __obj.updateDynamic("searchPlaces")(searchPlaces.asInstanceOf[js.Any])
    if (stopDir != null) __obj.updateDynamic("stopDir")(stopDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsBase]
  }
}

