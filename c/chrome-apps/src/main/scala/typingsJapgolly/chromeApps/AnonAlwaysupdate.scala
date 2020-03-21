package typingsJapgolly.chromeApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlwaysupdate extends js.Object {
  /**
    * If the key is specified and its value is true, it allows the app to
    * be always updated regardless of whether the underlying platform is
    * compliant or not. If the value is false or the key is not specified,
    * the required platform version is respected and the app update is
    * deferred until the underlying platform becomes compliant.
    */
  var always_update: js.UndefOr[Boolean] = js.undefined
  var required_platform_version: js.UndefOr[String] = js.undefined
}

object AnonAlwaysupdate {
  @scala.inline
  def apply(always_update: js.UndefOr[Boolean] = js.undefined, required_platform_version: String = null): AnonAlwaysupdate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(always_update)) __obj.updateDynamic("always_update")(always_update.asInstanceOf[js.Any])
    if (required_platform_version != null) __obj.updateDynamic("required_platform_version")(required_platform_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlwaysupdate]
  }
}

