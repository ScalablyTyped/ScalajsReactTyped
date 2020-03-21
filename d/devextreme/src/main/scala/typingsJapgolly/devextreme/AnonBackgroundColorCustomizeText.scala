package typingsJapgolly.devextreme

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.mod.DevExpress.ui.format
import typingsJapgolly.devextreme.mod.DevExpress.viz.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackgroundColorCustomizeText extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.undefined
  var customizeText: js.UndefOr[js.Function1[/* info */ AnonPoint, String]] = js.undefined
  var font: js.UndefOr[Font] = js.undefined
  var format: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.ui.format] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AnonBackgroundColorCustomizeText {
  @scala.inline
  def apply(
    backgroundColor: String = null,
    customizeText: /* info */ AnonPoint => CallbackTo[String] = null,
    font: Font = null,
    format: format = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): AnonBackgroundColorCustomizeText = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.devextreme.AnonPoint) => customizeText(t0).runNow()))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBackgroundColorCustomizeText]
  }
}

