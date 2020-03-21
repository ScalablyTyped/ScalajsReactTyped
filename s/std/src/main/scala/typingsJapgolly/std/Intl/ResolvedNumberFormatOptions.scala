package typingsJapgolly.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolvedNumberFormatOptions extends js.Object {
  var currency: js.UndefOr[String] = js.undefined
  var currencyDisplay: js.UndefOr[String] = js.undefined
  var locale: String
  var maximumFractionDigits: Double
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  var minimumFractionDigits: Double
  var minimumIntegerDigits: Double
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  var numberingSystem: String
  var style: String
  var useGrouping: Boolean
}

object ResolvedNumberFormatOptions {
  @scala.inline
  def apply(
    locale: String,
    maximumFractionDigits: Double,
    minimumFractionDigits: Double,
    minimumIntegerDigits: Double,
    numberingSystem: String,
    style: String,
    useGrouping: Boolean,
    currency: String = null,
    currencyDisplay: String = null,
    maximumSignificantDigits: Int | Double = null,
    minimumSignificantDigits: Int | Double = null
  ): ResolvedNumberFormatOptions = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], maximumFractionDigits = maximumFractionDigits.asInstanceOf[js.Any], minimumFractionDigits = minimumFractionDigits.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], useGrouping = useGrouping.asInstanceOf[js.Any])
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (currencyDisplay != null) __obj.updateDynamic("currencyDisplay")(currencyDisplay.asInstanceOf[js.Any])
    if (maximumSignificantDigits != null) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.asInstanceOf[js.Any])
    if (minimumSignificantDigits != null) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedNumberFormatOptions]
  }
}

