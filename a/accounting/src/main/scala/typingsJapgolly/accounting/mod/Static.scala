package typingsJapgolly.accounting.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Static extends js.Object {
  // settings object that controls default parameters for library methods
  var settings: Settings = js.native
  // format a list of values for column-display
  def formatColumn(numbers: js.Array[js.Array[Double] | Double]): js.Array[String] = js.native
  def formatColumn(numbers: js.Array[js.Array[Double] | Double], options: CurrencySettings[CurrencyFormat | String]): js.Array[String] = js.native
  def formatColumn(numbers: js.Array[js.Array[Double] | Double], symbol: String): js.Array[String] = js.native
  def formatColumn(numbers: js.Array[js.Array[Double] | Double], symbol: String, precision: Double): js.Array[String] = js.native
  def formatColumn(numbers: js.Array[js.Array[Double] | Double], symbol: String, precision: Double, thousand: String): js.Array[String] = js.native
  def formatColumn(
    numbers: js.Array[js.Array[Double] | Double],
    symbol: String,
    precision: Double,
    thousand: String,
    decimal: String
  ): js.Array[String] = js.native
  def formatColumn(
    numbers: js.Array[js.Array[Double] | Double],
    symbol: String,
    precision: Double,
    thousand: String,
    decimal: String,
    format: String
  ): js.Array[String] = js.native
  def formatMoney(number: String): String = js.native
  def formatMoney(number: String, options: CurrencySettings[CurrencyFormat | String]): String = js.native
  def formatMoney(number: String, symbol: String): String = js.native
  def formatMoney(number: String, symbol: String, precision: Double): String = js.native
  def formatMoney(number: String, symbol: String, precision: Double, thousand: String): String = js.native
  def formatMoney(number: String, symbol: String, precision: Double, thousand: String, decimal: String): String = js.native
  def formatMoney(
    number: String,
    symbol: String,
    precision: Double,
    thousand: String,
    decimal: String,
    format: String
  ): String = js.native
  // format any number or stringified number into currency
  def formatMoney(number: Double): String = js.native
  def formatMoney(number: Double, options: CurrencySettings[CurrencyFormat | String]): String = js.native
  def formatMoney(number: Double, symbol: String): String = js.native
  def formatMoney(number: Double, symbol: String, precision: Double): String = js.native
  def formatMoney(number: Double, symbol: String, precision: Double, thousand: String): String = js.native
  def formatMoney(number: Double, symbol: String, precision: Double, thousand: String, decimal: String): String = js.native
  def formatMoney(
    number: Double,
    symbol: String,
    precision: Double,
    thousand: String,
    decimal: String,
    format: String
  ): String = js.native
  // generic case (any array of numbers)
  def formatMoney(numbers: js.Array[_ | Double]): js.Array[String] = js.native
  def formatMoney(numbers: js.Array[_ | Double], options: CurrencySettings[CurrencyFormat | String]): js.Array[String] = js.native
  def formatMoney(numbers: js.Array[_ | Double], symbol: String): js.Array[String] = js.native
  def formatMoney(numbers: js.Array[_ | Double], symbol: String, precision: Double): js.Array[String] = js.native
  def formatMoney(numbers: js.Array[_ | Double], symbol: String, precision: Double, thousand: String): js.Array[String] = js.native
  def formatMoney(
    numbers: js.Array[_ | Double],
    symbol: String,
    precision: Double,
    thousand: String,
    decimal: String
  ): js.Array[String] = js.native
  def formatMoney(
    numbers: js.Array[_ | Double],
    symbol: String,
    precision: Double,
    thousand: String,
    decimal: String,
    format: String
  ): js.Array[String] = js.native
  def formatNumber(number: js.Array[_ | Double]): js.Array[String] = js.native
  def formatNumber(number: js.Array[_ | Double], options: NumberSettings): js.Array[String] = js.native
  def formatNumber(number: js.Array[_ | Double], precision: Double): js.Array[String] = js.native
  def formatNumber(number: js.Array[_ | Double], precision: Double, thousand: String): js.Array[String] = js.native
  def formatNumber(number: js.Array[_ | Double], precision: Double, thousand: String, decimal: String): js.Array[String] = js.native
  // format a number with custom precision and localisation
  def formatNumber(number: Double): String = js.native
  def formatNumber(number: Double, options: NumberSettings): String = js.native
  def formatNumber(number: Double, precision: Double): String = js.native
  def formatNumber(number: Double, precision: Double, thousand: String): String = js.native
  def formatNumber(number: Double, precision: Double, thousand: String, decimal: String): String = js.native
  // better rounding for floating point numbers
  def toFixed(number: Double): String = js.native
  def toFixed(number: Double, precision: Double): String = js.native
  // get a value from any formatted number/currency string
  def unformat(string: String): Double = js.native
  def unformat(string: String, decimal: String): Double = js.native
}

