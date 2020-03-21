package typingsJapgolly.winrtUwp.Windows.Globalization.NumberFormatting

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IIterable
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Formats and parses currencies. */
@JSGlobal("Windows.Globalization.NumberFormatting.CurrencyFormatter")
@js.native
class CurrencyFormatter protected () extends js.Object {
  /**
    * Creates a CurrencyFormatter object that is initialized with a currency identifier.
    * @param currencyCode The currency identifier to use when formatting and parsing currency values.
    */
  def this(currencyCode: String) = this()
  /**
    * Creates a CurrencyFormatter object initialized with a currency identifier, language list, and geographic region.
    * @param currencyCode The currency identifier to use when formatting and parsing currency values.
    * @param languages The list of language identifiers, in priority order, representing the choice of languages. See Remarks.
    * @param geographicRegion The identifier for the geographic region.
    */
  def this(currencyCode: String, languages: IIterable[String], geographicRegion: String) = this()
  /** Gets the identifier for the currency to be used for formatting and parsing currency values. */
  var currency: String = js.native
  /** Gets or sets the minimum number of digits to display for the fraction part of the currency value. */
  var fractionDigits: Double = js.native
  /** Gets the region that is used when formatting and parsing currency values. */
  var geographicRegion: String = js.native
  /** Gets or sets the minimum number of digits to display for the integer part of the currency value. */
  var integerDigits: Double = js.native
  /** Gets or sets whether the decimal point of the currency value should always be displayed. */
  var isDecimalPointAlwaysDisplayed: Boolean = js.native
  /** Gets or sets whether the integer part of the currency value should be grouped. */
  var isGrouped: Boolean = js.native
  /** Gets or sets whether -0 is formatted using the conventions for negative numbers or for positive numbers. (In the Latin numeral system, the choice is "-0" or "0".) */
  var isZeroSigned: Boolean = js.native
  /** Gets the priority list of language identifiers that is used when formatting and parsing currency values. */
  var languages: IVectorView[String] = js.native
  /** Gets or sets whether the currency is formatted with the currency symbol or currency code. */
  var mode: CurrencyFormatterMode = js.native
  /** Gets or sets the current rounding strategy to be used when formatting currency amounts. */
  var numberRounder: INumberRounder = js.native
  /** Gets or sets the numbering system that is used to format and parse currency values. */
  var numeralSystem: String = js.native
  /** Gets the geographic region that was most recently used to format or parse currency values. */
  var resolvedGeographicRegion: String = js.native
  /** Gets the language that was most recently used to format or parse currency values. */
  var resolvedLanguage: String = js.native
  /** Gets or sets the current padding to significant digits when a currency amount is formatted. */
  var significantDigits: Double = js.native
  /**
    * Prepares the CurrencyFormatter object to format currency values with a specified rounding algorithm.
    * @param roundingAlgorithm The desired rounding algorithm for the currency. This must be one of the members of RoundingAlgorithm , excluding None.
    */
  def applyRoundingForCurrency(roundingAlgorithm: RoundingAlgorithm): Unit = js.native
  /**
    * Returns a string representation of a UInt64 currency value.
    * @param value The UInt64 currency value to be formatted.
    * @return A string that represents the value.
    */
  def format(value: Double): String = js.native
  /**
    * Returns a string representation of a Double currency value.
    * @param value The Double currency value to be formatted.
    * @return A string that represents the value.
    */
  def formatDouble(value: Double): String = js.native
  /**
    * Returns a string representation of an Int64 currency value.
    * @param value The Int64 currency value to be formatted.
    * @return A string that represents the value.
    */
  def formatInt(value: Double): String = js.native
  /**
    * Returns a string representation of a UInt64 currency value.
    * @param value The UInt64 currency value to be formatted.
    * @return The UInt64 currency value to be formatted.
    */
  def formatUInt(value: Double): String = js.native
  /**
    * Attempts to parse a string representation of a Double currency value.
    * @param text The text to be parsed.
    * @return If successful, a Double that corresponds to the string representation, and otherwise null.
    */
  def parseDouble(text: String): Double = js.native
  /**
    * Attempts to parse a string representation of an integer currency value.
    * @param text The text to be parsed.
    * @return If successful, an Int64 that corresponds to the string representation, and otherwise null.
    */
  def parseInt(text: String): Double = js.native
  /**
    * Attempts to parse a string representation of an unsigned integer currency value.
    * @param text The text to be parsed.
    * @return If successful, a UInt64 that corresponds to the string representation, and otherwise null.
    */
  def parseUInt(text: String): Double = js.native
}

