package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.auto
import typingsJapgolly.oracleOraclejet.oracleOraclejetStrings.off
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTooltipDisplayTooltipLabel extends js.Object {
  var tooltipDisplay: js.UndefOr[off | auto] = js.undefined
  var tooltipLabel: js.UndefOr[String] = js.undefined
}

object AnonTooltipDisplayTooltipLabel {
  @scala.inline
  def apply(tooltipDisplay: off | auto = null, tooltipLabel: String = null): AnonTooltipDisplayTooltipLabel = {
    val __obj = js.Dynamic.literal()
    if (tooltipDisplay != null) __obj.updateDynamic("tooltipDisplay")(tooltipDisplay.asInstanceOf[js.Any])
    if (tooltipLabel != null) __obj.updateDynamic("tooltipLabel")(tooltipLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTooltipDisplayTooltipLabel]
  }
}

