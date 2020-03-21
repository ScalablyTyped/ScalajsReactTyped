package typingsJapgolly.devextreme

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.devextremeStrings.hide
import typingsJapgolly.devextreme.devextremeStrings.none
import typingsJapgolly.devextreme.mod.DevExpress.ui.format
import typingsJapgolly.devextreme.mod.DevExpress.viz.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOverlappingBehavior extends js.Object {
  var customizeText: js.UndefOr[js.Function1[/* scaleValue */ AnonValueValueText, String]] = js.undefined
  var font: js.UndefOr[Font] = js.undefined
  var format: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.ui.format] = js.undefined
  var overlappingBehavior: js.UndefOr[hide | none] = js.undefined
  var topIndent: js.UndefOr[Double] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonOverlappingBehavior {
  @scala.inline
  def apply(
    customizeText: /* scaleValue */ AnonValueValueText => CallbackTo[String] = null,
    font: Font = null,
    format: format = null,
    overlappingBehavior: hide | none = null,
    topIndent: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonOverlappingBehavior = {
    val __obj = js.Dynamic.literal()
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1((t0: /* scaleValue */ typingsJapgolly.devextreme.AnonValueValueText) => customizeText(t0).runNow()))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (overlappingBehavior != null) __obj.updateDynamic("overlappingBehavior")(overlappingBehavior.asInstanceOf[js.Any])
    if (topIndent != null) __obj.updateDynamic("topIndent")(topIndent.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOverlappingBehavior]
  }
}

