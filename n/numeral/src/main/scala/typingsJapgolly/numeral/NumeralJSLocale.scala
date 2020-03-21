package typingsJapgolly.numeral

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumeralJSLocale extends js.Object {
  var abbreviations: AnonBillion
  var currency: AnonSymbol
  var delimiters: AnonDecimal
  def ordinal(num: Double): String
}

object NumeralJSLocale {
  @scala.inline
  def apply(
    abbreviations: AnonBillion,
    currency: AnonSymbol,
    delimiters: AnonDecimal,
    ordinal: Double => CallbackTo[String]
  ): NumeralJSLocale = {
    val __obj = js.Dynamic.literal(abbreviations = abbreviations.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], delimiters = delimiters.asInstanceOf[js.Any])
    __obj.updateDynamic("ordinal")(js.Any.fromFunction1((t0: scala.Double) => ordinal(t0).runNow()))
    __obj.asInstanceOf[NumeralJSLocale]
  }
}

