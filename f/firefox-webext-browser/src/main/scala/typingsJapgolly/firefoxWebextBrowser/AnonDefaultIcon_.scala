package typingsJapgolly.firefoxWebextBrowser

import typingsJapgolly.firefoxWebextBrowser.browser.manifest.IconPath
import typingsJapgolly.firefoxWebextBrowser.browser.manifest.ThemeIcons
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultIcon_ extends js.Object {
  /** Specifies the default icon to use in the contextual tip. */
  var defaultIcon: String | IconPath
  /**
    * Specifies icons to use for dark and light themes. Each item in the array is for a specified icon size.
    */
  var themeIcons: js.UndefOr[js.Array[ThemeIcons]] = js.undefined
}

object AnonDefaultIcon_ {
  @scala.inline
  def apply(defaultIcon: String | IconPath, themeIcons: js.Array[ThemeIcons] = null): AnonDefaultIcon_ = {
    val __obj = js.Dynamic.literal(defaultIcon = defaultIcon.asInstanceOf[js.Any])
    if (themeIcons != null) __obj.updateDynamic("themeIcons")(themeIcons.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultIcon_]
  }
}

