package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonValueValueText
import typingsJapgolly.devextreme.devextremeStrings.hide
import typingsJapgolly.devextreme.devextremeStrings.none
import typingsJapgolly.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxPolarChartValueAxisLabel extends dxPolarChartCommonAxisSettingsLabel {
  /** Specifies the text for a hint that appears when a user hovers the mouse pointer over a label on the value axis. */
  var customizeHint: js.UndefOr[js.Function1[/* axisValue */ AnonValueValueText, String]] = js.undefined
  /** Specifies a callback function that returns the text to be displayed in value axis labels. */
  var customizeText: js.UndefOr[js.Function1[/* axisValue */ AnonValueValueText, String]] = js.undefined
  /** Formats a value before it is displayed in an axis label. */
  var format: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.ui.format] = js.undefined
}

object dxPolarChartValueAxisLabel {
  @scala.inline
  def apply(
    customizeHint: /* axisValue */ AnonValueValueText => CallbackTo[String] = null,
    customizeText: /* axisValue */ AnonValueValueText => CallbackTo[String] = null,
    font: Font = null,
    format: format = null,
    indentFromAxis: Int | Double = null,
    overlappingBehavior: none | hide = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxPolarChartValueAxisLabel = {
    val __obj = js.Dynamic.literal()
    if (customizeHint != null) __obj.updateDynamic("customizeHint")(js.Any.fromFunction1((t0: /* axisValue */ typingsJapgolly.devextreme.AnonValueValueText) => customizeHint(t0).runNow()))
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1((t0: /* axisValue */ typingsJapgolly.devextreme.AnonValueValueText) => customizeText(t0).runNow()))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (indentFromAxis != null) __obj.updateDynamic("indentFromAxis")(indentFromAxis.asInstanceOf[js.Any])
    if (overlappingBehavior != null) __obj.updateDynamic("overlappingBehavior")(overlappingBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxPolarChartValueAxisLabel]
  }
}

