package typingsJapgolly.firefoxWebextBrowser

import typingsJapgolly.firefoxWebextBrowser.browser.manifest.ThemeTypeAdditionalBackgroundsAlignment
import typingsJapgolly.firefoxWebextBrowser.browser.manifest.ThemeTypeAdditionalBackgroundsTiling
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAdditionalbackgroundsalignment extends js.Object {
  var additional_backgrounds_alignment: js.UndefOr[js.Array[ThemeTypeAdditionalBackgroundsAlignment]] = js.undefined
  var additional_backgrounds_tiling: js.UndefOr[js.Array[ThemeTypeAdditionalBackgroundsTiling]] = js.undefined
}

object AnonAdditionalbackgroundsalignment {
  @scala.inline
  def apply(
    additional_backgrounds_alignment: js.Array[ThemeTypeAdditionalBackgroundsAlignment] = null,
    additional_backgrounds_tiling: js.Array[ThemeTypeAdditionalBackgroundsTiling] = null
  ): AnonAdditionalbackgroundsalignment = {
    val __obj = js.Dynamic.literal()
    if (additional_backgrounds_alignment != null) __obj.updateDynamic("additional_backgrounds_alignment")(additional_backgrounds_alignment.asInstanceOf[js.Any])
    if (additional_backgrounds_tiling != null) __obj.updateDynamic("additional_backgrounds_tiling")(additional_backgrounds_tiling.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdditionalbackgroundsalignment]
  }
}

