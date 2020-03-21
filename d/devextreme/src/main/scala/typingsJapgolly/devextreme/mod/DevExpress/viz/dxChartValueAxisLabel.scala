package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonValueValueText
import typingsJapgolly.devextreme.devextremeStrings.breakWord
import typingsJapgolly.devextreme.devextremeStrings.center
import typingsJapgolly.devextreme.devextremeStrings.ellipsis
import typingsJapgolly.devextreme.devextremeStrings.hide
import typingsJapgolly.devextreme.devextremeStrings.left
import typingsJapgolly.devextreme.devextremeStrings.none
import typingsJapgolly.devextreme.devextremeStrings.normal
import typingsJapgolly.devextreme.devextremeStrings.right
import typingsJapgolly.devextreme.devextremeStrings.rotate
import typingsJapgolly.devextreme.devextremeStrings.stagger
import typingsJapgolly.devextreme.devextremeStrings.standard
import typingsJapgolly.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxChartValueAxisLabel extends dxChartCommonAxisSettingsLabel {
  /** Specifies the hint that appears when a user points to an axis label. */
  var customizeHint: js.UndefOr[js.Function1[/* axisValue */ AnonValueValueText, String]] = js.undefined
  /** Customizes the text displayed by axis labels. */
  var customizeText: js.UndefOr[js.Function1[/* axisValue */ AnonValueValueText, String]] = js.undefined
  /** Formats a value before it is displayed in an axis label. */
  var format: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.ui.format] = js.undefined
}

object dxChartValueAxisLabel {
  @scala.inline
  def apply(
    alignment: center | left | right = null,
    customizeHint: /* axisValue */ AnonValueValueText => CallbackTo[String] = null,
    customizeText: /* axisValue */ AnonValueValueText => CallbackTo[String] = null,
    displayMode: rotate | stagger | standard = null,
    font: Font = null,
    format: format = null,
    indentFromAxis: Int | Double = null,
    overlappingBehavior: rotate | stagger | none | hide = null,
    rotationAngle: Int | Double = null,
    staggeringSpacing: Int | Double = null,
    textOverflow: ellipsis | hide | none = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    wordWrap: normal | breakWord | none = null
  ): dxChartValueAxisLabel = {
    val __obj = js.Dynamic.literal()
    if (alignment != null) __obj.updateDynamic("alignment")(alignment.asInstanceOf[js.Any])
    if (customizeHint != null) __obj.updateDynamic("customizeHint")(js.Any.fromFunction1((t0: /* axisValue */ typingsJapgolly.devextreme.AnonValueValueText) => customizeHint(t0).runNow()))
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1((t0: /* axisValue */ typingsJapgolly.devextreme.AnonValueValueText) => customizeText(t0).runNow()))
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (indentFromAxis != null) __obj.updateDynamic("indentFromAxis")(indentFromAxis.asInstanceOf[js.Any])
    if (overlappingBehavior != null) __obj.updateDynamic("overlappingBehavior")(overlappingBehavior.asInstanceOf[js.Any])
    if (rotationAngle != null) __obj.updateDynamic("rotationAngle")(rotationAngle.asInstanceOf[js.Any])
    if (staggeringSpacing != null) __obj.updateDynamic("staggeringSpacing")(staggeringSpacing.asInstanceOf[js.Any])
    if (textOverflow != null) __obj.updateDynamic("textOverflow")(textOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (wordWrap != null) __obj.updateDynamic("wordWrap")(wordWrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxChartValueAxisLabel]
  }
}

