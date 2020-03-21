package typingsJapgolly.devextreme

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.mod.DevExpress.ui.format
import typingsJapgolly.devextreme.mod.DevExpress.viz.Font
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndent extends js.Object {
  var customizeText: js.UndefOr[js.Function1[/* indicatedValue */ AnonValueText, String]] = js.undefined
  var font: js.UndefOr[Font] = js.undefined
  var format: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.ui.format] = js.undefined
  var indent: js.UndefOr[Double] = js.undefined
}

object AnonIndent {
  @scala.inline
  def apply(
    customizeText: /* indicatedValue */ AnonValueText => CallbackTo[String] = null,
    font: Font = null,
    format: format = null,
    indent: Int | Double = null
  ): AnonIndent = {
    val __obj = js.Dynamic.literal()
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1((t0: /* indicatedValue */ typingsJapgolly.devextreme.AnonValueText) => customizeText(t0).runNow()))
    if (font != null) __obj.updateDynamic("font")(font.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndent]
  }
}

