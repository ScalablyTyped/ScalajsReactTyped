package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SiteCompanionSetting extends js.Object {
  var companionsDisabled: js.UndefOr[Boolean] = js.undefined
  var enabledSizes: js.UndefOr[js.Array[Size]] = js.undefined
  var imageOnly: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object SiteCompanionSetting {
  @scala.inline
  def apply(
    companionsDisabled: js.UndefOr[Boolean] = js.undefined,
    enabledSizes: js.Array[Size] = null,
    imageOnly: js.UndefOr[Boolean] = js.undefined,
    kind: String = null
  ): SiteCompanionSetting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(companionsDisabled)) __obj.updateDynamic("companionsDisabled")(companionsDisabled.asInstanceOf[js.Any])
    if (enabledSizes != null) __obj.updateDynamic("enabledSizes")(enabledSizes.asInstanceOf[js.Any])
    if (!js.isUndefined(imageOnly)) __obj.updateDynamic("imageOnly")(imageOnly.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiteCompanionSetting]
  }
}

