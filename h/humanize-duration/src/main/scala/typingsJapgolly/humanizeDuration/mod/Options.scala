package typingsJapgolly.humanizeDuration.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * String to include before the final unit. You can also set serialComma to false to eliminate the final comma.
    */
  var conjunction: js.UndefOr[String] = js.undefined
  /**
    * String to substitute for the decimal point in a decimal fraction.
    */
  var decimal: js.UndefOr[String] = js.undefined
  /**
    * String to display between the previous unit and the next value.
    */
  var delimiter: js.UndefOr[String] = js.undefined
  /**
    * Fallback languages if the provided language cannot be found (accepts an ISO 639-1 code from one of the supported languages). It works from left to right.
    */
  var fallbacks: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Language for unit display (accepts an ISO 639-1 code from one of the supported languages).
    */
  var language: js.UndefOr[String] = js.undefined
  /**
    * Number representing the maximum number of units to display for the duration.
    */
  var largest: js.UndefOr[Double] = js.undefined
  /**
    * Number that defines a maximal decimal points for float values.
    */
  var maxDecimalPoints: js.UndefOr[Double] = js.undefined
  /**
    * Boolean value. Use true to round the smallest unit displayed (can be combined with largest and units).
    */
  var round: js.UndefOr[Boolean] = js.undefined
  var serialComma: js.UndefOr[Boolean] = js.undefined
  /**
    * String to display between each value and unit.
    */
  var spacer: js.UndefOr[String] = js.undefined
  /**
    * Customize the value used to calculate each unit of time.
    */
  var unitMeasures: js.UndefOr[UnitMeasuresOptions] = js.undefined
  /**
    * Array of strings to define which units are used to display the duration (if needed).
    */
  var units: js.UndefOr[js.Array[Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    conjunction: String = null,
    decimal: String = null,
    delimiter: String = null,
    fallbacks: js.Array[String] = null,
    language: String = null,
    largest: Int | Double = null,
    maxDecimalPoints: Int | Double = null,
    round: js.UndefOr[Boolean] = js.undefined,
    serialComma: js.UndefOr[Boolean] = js.undefined,
    spacer: String = null,
    unitMeasures: UnitMeasuresOptions = null,
    units: js.Array[Unit] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (conjunction != null) __obj.updateDynamic("conjunction")(conjunction.asInstanceOf[js.Any])
    if (decimal != null) __obj.updateDynamic("decimal")(decimal.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (fallbacks != null) __obj.updateDynamic("fallbacks")(fallbacks.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (largest != null) __obj.updateDynamic("largest")(largest.asInstanceOf[js.Any])
    if (maxDecimalPoints != null) __obj.updateDynamic("maxDecimalPoints")(maxDecimalPoints.asInstanceOf[js.Any])
    if (!js.isUndefined(round)) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (!js.isUndefined(serialComma)) __obj.updateDynamic("serialComma")(serialComma.asInstanceOf[js.Any])
    if (spacer != null) __obj.updateDynamic("spacer")(spacer.asInstanceOf[js.Any])
    if (unitMeasures != null) __obj.updateDynamic("unitMeasures")(unitMeasures.asInstanceOf[js.Any])
    if (units != null) __obj.updateDynamic("units")(units.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

