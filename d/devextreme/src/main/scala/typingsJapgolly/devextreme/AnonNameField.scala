package typingsJapgolly.devextreme

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devextreme.mod.DevExpress.viz.PieChartSeries
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNameField extends js.Object {
  var customizeSeries: js.UndefOr[js.Function1[/* seriesName */ js.Any, PieChartSeries]] = js.undefined
  var nameField: js.UndefOr[String] = js.undefined
}

object AnonNameField {
  @scala.inline
  def apply(
    customizeSeries: /* seriesName */ js.Any => CallbackTo[PieChartSeries] = null,
    nameField: String = null
  ): AnonNameField = {
    val __obj = js.Dynamic.literal()
    if (customizeSeries != null) __obj.updateDynamic("customizeSeries")(js.Any.fromFunction1((t0: /* seriesName */ js.Any) => customizeSeries(t0).runNow()))
    if (nameField != null) __obj.updateDynamic("nameField")(nameField.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNameField]
  }
}

