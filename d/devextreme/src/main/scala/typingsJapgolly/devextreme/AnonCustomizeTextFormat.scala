package typingsJapgolly.devextreme

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.mod.DevExpress.ui.format
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCustomizeTextFormat extends js.Object {
  var customizeText: js.UndefOr[js.Function1[/* markerValue */ AnonValueTextString, String]] = js.undefined
  var format: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.ui.format] = js.undefined
}

object AnonCustomizeTextFormat {
  @scala.inline
  def apply(
    customizeText: /* markerValue */ AnonValueTextString => CallbackTo[String] = null,
    format: format = null
  ): AnonCustomizeTextFormat = {
    val __obj = js.Dynamic.literal()
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1((t0: /* markerValue */ typingsJapgolly.devextreme.AnonValueTextString) => customizeText(t0).runNow()))
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCustomizeTextFormat]
  }
}

