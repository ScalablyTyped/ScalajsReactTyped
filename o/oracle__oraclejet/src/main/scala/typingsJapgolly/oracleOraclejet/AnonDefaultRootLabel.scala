package typingsJapgolly.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultRootLabel extends js.Object {
  var defaultRootLabel: js.UndefOr[String] = js.undefined
  var hierMenuBtnLabel: js.UndefOr[String] = js.undefined
  var previousIcon: js.UndefOr[String] = js.undefined
}

object AnonDefaultRootLabel {
  @scala.inline
  def apply(defaultRootLabel: String = null, hierMenuBtnLabel: String = null, previousIcon: String = null): AnonDefaultRootLabel = {
    val __obj = js.Dynamic.literal()
    if (defaultRootLabel != null) __obj.updateDynamic("defaultRootLabel")(defaultRootLabel.asInstanceOf[js.Any])
    if (hierMenuBtnLabel != null) __obj.updateDynamic("hierMenuBtnLabel")(hierMenuBtnLabel.asInstanceOf[js.Any])
    if (previousIcon != null) __obj.updateDynamic("previousIcon")(previousIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefaultRootLabel]
  }
}

