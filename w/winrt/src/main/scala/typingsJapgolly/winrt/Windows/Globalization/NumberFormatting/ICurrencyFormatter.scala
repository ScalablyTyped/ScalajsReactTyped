package typingsJapgolly.winrt.Windows.Globalization.NumberFormatting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICurrencyFormatter
  extends INumberFormatterOptions
     with INumberFormatter
     with INumberFormatter2
     with INumberParser {
  var currency: String
}

object ICurrencyFormatter {
  @scala.inline
  def apply(
    currency: String,
    format: Double => CallbackTo[String],
    formatDouble: Double => CallbackTo[String],
    formatInt: Double => CallbackTo[String],
    formatUInt: Double => CallbackTo[String],
    fractionDigits: Double,
    geographicRegion: String,
    integerDigits: Double,
    isDecimalPointAlwaysDisplayed: Boolean,
    isGrouped: Boolean,
    languages: IVectorView[String],
    numeralSystem: String,
    parseDouble: String => CallbackTo[Double],
    parseInt: String => CallbackTo[Double],
    parseUInt: String => CallbackTo[Double],
    resolvedGeographicRegion: String,
    resolvedLanguage: String
  ): ICurrencyFormatter = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], fractionDigits = fractionDigits.asInstanceOf[js.Any], geographicRegion = geographicRegion.asInstanceOf[js.Any], integerDigits = integerDigits.asInstanceOf[js.Any], isDecimalPointAlwaysDisplayed = isDecimalPointAlwaysDisplayed.asInstanceOf[js.Any], isGrouped = isGrouped.asInstanceOf[js.Any], languages = languages.asInstanceOf[js.Any], numeralSystem = numeralSystem.asInstanceOf[js.Any], resolvedGeographicRegion = resolvedGeographicRegion.asInstanceOf[js.Any], resolvedLanguage = resolvedLanguage.asInstanceOf[js.Any])
    __obj.updateDynamic("format")(js.Any.fromFunction1((t0: scala.Double) => format(t0).runNow()))
    __obj.updateDynamic("formatDouble")(js.Any.fromFunction1((t0: scala.Double) => formatDouble(t0).runNow()))
    __obj.updateDynamic("formatInt")(js.Any.fromFunction1((t0: scala.Double) => formatInt(t0).runNow()))
    __obj.updateDynamic("formatUInt")(js.Any.fromFunction1((t0: scala.Double) => formatUInt(t0).runNow()))
    __obj.updateDynamic("parseDouble")(js.Any.fromFunction1((t0: java.lang.String) => parseDouble(t0).runNow()))
    __obj.updateDynamic("parseInt")(js.Any.fromFunction1((t0: java.lang.String) => parseInt(t0).runNow()))
    __obj.updateDynamic("parseUInt")(js.Any.fromFunction1((t0: java.lang.String) => parseUInt(t0).runNow()))
    __obj.asInstanceOf[ICurrencyFormatter]
  }
}

