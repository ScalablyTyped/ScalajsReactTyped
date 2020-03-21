package typingsJapgolly.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Getting Started
  * chayns
  * interfaces
  */
// chayns.register()
trait RegisterConfig extends js.Object {
  var appName: js.UndefOr[String] = js.undefined
  var autoResize: js.UndefOr[Boolean] = js.undefined
  var callbackPrefix: js.UndefOr[String] = js.undefined
  var cssPrefix: js.UndefOr[String] = js.undefined
  var initialHeight: js.UndefOr[Double] = js.undefined
  var strictMode: js.UndefOr[Boolean] = js.undefined
}

object RegisterConfig {
  @scala.inline
  def apply(
    appName: String = null,
    autoResize: js.UndefOr[Boolean] = js.undefined,
    callbackPrefix: String = null,
    cssPrefix: String = null,
    initialHeight: Int | Double = null,
    strictMode: js.UndefOr[Boolean] = js.undefined
  ): RegisterConfig = {
    val __obj = js.Dynamic.literal()
    if (appName != null) __obj.updateDynamic("appName")(appName.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize.asInstanceOf[js.Any])
    if (callbackPrefix != null) __obj.updateDynamic("callbackPrefix")(callbackPrefix.asInstanceOf[js.Any])
    if (cssPrefix != null) __obj.updateDynamic("cssPrefix")(cssPrefix.asInstanceOf[js.Any])
    if (initialHeight != null) __obj.updateDynamic("initialHeight")(initialHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(strictMode)) __obj.updateDynamic("strictMode")(strictMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterConfig]
  }
}

