package typingsJapgolly.jqrangeslider

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQNumericRangeSliderOptions extends JQRangeSliderOptions {
  var bounds: js.UndefOr[JQRangeSliderNumericRange] = js.undefined
   // min and max values of the slider
  var defaultValues: js.UndefOr[JQRangeSliderNumericRange] = js.undefined
   // values selected by default on construction
  var formatter: js.UndefOr[js.Function1[/* int */ Double, String]] = js.undefined
   // customize displayed label text
  var step: js.UndefOr[Double] = js.undefined
}

object JQNumericRangeSliderOptions {
  @scala.inline
  def apply(
    arrows: js.UndefOr[Boolean] = js.undefined,
    bounds: JQRangeSliderNumericRange = null,
    defaultValues: JQRangeSliderNumericRange = null,
    delayOut: Int | Double = null,
    durationIn: Int | Double = null,
    durationOut: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    formatter: /* int */ Double => CallbackTo[String] = null,
    range: Boolean | JQRangeSliderRangeLength = null,
    scales: js.Array[jQRangeSliderScale] = null,
    step: Int | Double = null,
    symmetricPositionning: js.UndefOr[Boolean] = js.undefined,
    valueLabels: String = null,
    wheelMode: String = null,
    wheelSpeed: Int | Double = null
  ): JQNumericRangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrows)) __obj.updateDynamic("arrows")(arrows.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (defaultValues != null) __obj.updateDynamic("defaultValues")(defaultValues.asInstanceOf[js.Any])
    if (delayOut != null) __obj.updateDynamic("delayOut")(delayOut.asInstanceOf[js.Any])
    if (durationIn != null) __obj.updateDynamic("durationIn")(durationIn.asInstanceOf[js.Any])
    if (durationOut != null) __obj.updateDynamic("durationOut")(durationOut.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1((t0: /* int */ scala.Double) => formatter(t0).runNow()))
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (scales != null) __obj.updateDynamic("scales")(scales.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(symmetricPositionning)) __obj.updateDynamic("symmetricPositionning")(symmetricPositionning.asInstanceOf[js.Any])
    if (valueLabels != null) __obj.updateDynamic("valueLabels")(valueLabels.asInstanceOf[js.Any])
    if (wheelMode != null) __obj.updateDynamic("wheelMode")(wheelMode.asInstanceOf[js.Any])
    if (wheelSpeed != null) __obj.updateDynamic("wheelSpeed")(wheelSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQNumericRangeSliderOptions]
  }
}

