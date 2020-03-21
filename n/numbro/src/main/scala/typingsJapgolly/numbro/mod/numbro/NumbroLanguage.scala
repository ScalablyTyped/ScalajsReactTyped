package typingsJapgolly.numbro.mod.numbro

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.numbro.AnonBillion
import typingsJapgolly.numbro.AnonCode
import typingsJapgolly.numbro.AnonDecimal
import typingsJapgolly.numbro.AnonFourDigits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumbroLanguage extends js.Object {
  var abbreviations: AnonBillion
  var byteFormat: js.UndefOr[Format] = js.undefined
  var currency: AnonCode
  var currencyFormat: js.UndefOr[Format] = js.undefined
  var defaults: js.UndefOr[Format] = js.undefined
  var delimiters: AnonDecimal
  var formats: AnonFourDigits
  var languageTag: String
  var ordinalFormat: js.UndefOr[Format] = js.undefined
  var percentageFormat: js.UndefOr[Format] = js.undefined
  def ordinal(num: Double): String
}

object NumbroLanguage {
  @scala.inline
  def apply(
    abbreviations: AnonBillion,
    currency: AnonCode,
    delimiters: AnonDecimal,
    formats: AnonFourDigits,
    languageTag: String,
    ordinal: Double => CallbackTo[String],
    byteFormat: Format = null,
    currencyFormat: Format = null,
    defaults: Format = null,
    ordinalFormat: Format = null,
    percentageFormat: Format = null
  ): NumbroLanguage = {
    val __obj = js.Dynamic.literal(abbreviations = abbreviations.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], delimiters = delimiters.asInstanceOf[js.Any], formats = formats.asInstanceOf[js.Any], languageTag = languageTag.asInstanceOf[js.Any])
    __obj.updateDynamic("ordinal")(js.Any.fromFunction1((t0: scala.Double) => ordinal(t0).runNow()))
    if (byteFormat != null) __obj.updateDynamic("byteFormat")(byteFormat.asInstanceOf[js.Any])
    if (currencyFormat != null) __obj.updateDynamic("currencyFormat")(currencyFormat.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (ordinalFormat != null) __obj.updateDynamic("ordinalFormat")(ordinalFormat.asInstanceOf[js.Any])
    if (percentageFormat != null) __obj.updateDynamic("percentageFormat")(percentageFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumbroLanguage]
  }
}

