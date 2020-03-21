package typingsJapgolly.devextreme.mod.DevExpress.viz

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.AnonValueText
import typingsJapgolly.devextreme.devextremeStrings.first
import typingsJapgolly.devextreme.devextremeStrings.hide
import typingsJapgolly.devextreme.devextremeStrings.last
import typingsJapgolly.devextreme.devextremeStrings.none
import typingsJapgolly.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxCircularGaugeScaleLabel extends BaseGaugeScaleLabel {
  /** Specifies which label to hide in case of overlapping. */
  var hideFirstOrLast: js.UndefOr[first | last] = js.undefined
  /** Specifies the spacing between scale labels and ticks. */
  var indentFromTick: js.UndefOr[Double] = js.undefined
}

object dxCircularGaugeScaleLabel {
  @scala.inline
  def apply(
    customizeText: /* scaleValue */ AnonValueText => CallbackTo[String] = null,
    font: Font = null,
    format: format = null,
    hideFirstOrLast: first | last = null,
    indentFromTick: Int | Double = null,
    overlappingBehavior: hide | none = null,
    useRangeColors: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): dxCircularGaugeScaleLabel = {
    val __obj = js.Dynamic.literal()
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1((t0: /* scaleValue */ typingsJapgolly.devextreme.AnonValueText) => customizeText(t0).runNow()))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (hideFirstOrLast != null) __obj.updateDynamic("hideFirstOrLast")(hideFirstOrLast.asInstanceOf[js.Any])
    if (indentFromTick != null) __obj.updateDynamic("indentFromTick")(indentFromTick.asInstanceOf[js.Any])
    if (overlappingBehavior != null) __obj.updateDynamic("overlappingBehavior")(overlappingBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(useRangeColors)) __obj.updateDynamic("useRangeColors")(useRangeColors.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxCircularGaugeScaleLabel]
  }
}

