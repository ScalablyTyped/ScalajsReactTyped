package typingsJapgolly.valerie.Valerie_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// A helper for parsing and formatting numeric values.
trait NumericHelper extends js.Object {
  // Adds thousands separators to the given numeric string.
  def addThousandsSeparator(numericString: String): String
  // Formats the given numeric value as a string.
  def format(value: Double, format: String): String
  // Initialises the helper
  def init(
    decimalSeparator: String,
    thousandsSeparator: String,
    currencySign: String,
    currencyMinorUnitPlaces: Double
  ): NumericHelper
  // Informs whether the given numeric string represents a currency value with major units only.
  def isCurrencyMajor(numericString: String): Boolean
  // Informs whether the given numeric string represents a currency value with major units and optionally minor units.
  def isCurrencyMajorMinor(numericString: String): Boolean
  // Informs whether the given numeric string represents a non-integer numeric value.
  def isFloat(numericString: String): Boolean
  // Informs whether the given numeric string represents an integer value.
  def isInteger(numericString: String): Boolean
  // Attempts to parse the given numeric string as a number value. The string is unformatted first.
  def parse(numericString: String): Double
  // Unformats a numeric string; removes currency signs, thousands separators and normalises decimal separators.
  def unformat(numericString: String): String
}

object NumericHelper {
  @scala.inline
  def apply(
    addThousandsSeparator: String => CallbackTo[String],
    format: (Double, String) => CallbackTo[String],
    init: (String, String, String, Double) => CallbackTo[NumericHelper],
    isCurrencyMajor: String => CallbackTo[Boolean],
    isCurrencyMajorMinor: String => CallbackTo[Boolean],
    isFloat: String => CallbackTo[Boolean],
    isInteger: String => CallbackTo[Boolean],
    parse: String => CallbackTo[Double],
    unformat: String => CallbackTo[String]
  ): NumericHelper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addThousandsSeparator")(js.Any.fromFunction1((t0: java.lang.String) => addThousandsSeparator(t0).runNow()))
    __obj.updateDynamic("format")(js.Any.fromFunction2((t0: scala.Double, t1: java.lang.String) => format(t0, t1).runNow()))
    __obj.updateDynamic("init")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: java.lang.String, t3: scala.Double) => init(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("isCurrencyMajor")(js.Any.fromFunction1((t0: java.lang.String) => isCurrencyMajor(t0).runNow()))
    __obj.updateDynamic("isCurrencyMajorMinor")(js.Any.fromFunction1((t0: java.lang.String) => isCurrencyMajorMinor(t0).runNow()))
    __obj.updateDynamic("isFloat")(js.Any.fromFunction1((t0: java.lang.String) => isFloat(t0).runNow()))
    __obj.updateDynamic("isInteger")(js.Any.fromFunction1((t0: java.lang.String) => isInteger(t0).runNow()))
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.updateDynamic("unformat")(js.Any.fromFunction1((t0: java.lang.String) => unformat(t0).runNow()))
    __obj.asInstanceOf[NumericHelper]
  }
}

