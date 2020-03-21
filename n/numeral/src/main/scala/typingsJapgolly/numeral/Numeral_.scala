package typingsJapgolly.numeral

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://numeraljs.com/#use-it
@js.native
trait Numeral_ extends js.Object {
  var isNumeral: Boolean = js.native
  /**
  	 * Object with all loaded locales
  	 */
  var locales: NumeralJSLocales = js.native
  var options: NumeralJSOptions = js.native
  var version: String = js.native
  def apply(): Numeral_ = js.native
  def apply(value: js.Any): Numeral_ = js.native
  def add(value: js.Any): Numeral_ = js.native
  def defaultFormat(format: String): Unit = js.native
  def difference(value: js.Any): Double = js.native
  def divide(value: js.Any): Numeral_ = js.native
  def format(): String = js.native
  def format(inputString: String): String = js.native
  def format(inputString: String, roundingFunction: RoundingFunction): String = js.native
  /**
  	 * This function sets the current locale.  If no arguments are passed in,
  	 * it will simply return the current global locale key.
  	 */
  def locale(): String = js.native
  def locale(key: String): String = js.native
  /**
  	 * This function provides access to the loaded locale data.  If
  	 * no arguments are passed in, it will simply return the current
  	 * global locale object.
  	 *
  	 * @param key Locale key, e.g 'es' for a spanish locale definition
  	 */
  def localeData(): NumeralJSLocale = js.native
  def localeData(key: String): NumeralJSLocale = js.native
  def multiply(value: js.Any): Numeral_ = js.native
  def nullFormat(format: String): Unit = js.native
  /**
  	 * Registers a language definition or a custom format definition.
  	 *
  	 * @param what Allowed values are: either 'format' or 'locale'
  	 * @param key The key of the registerd type, e.g. 'de' for a german locale definition
  	 * @param value The locale definition or the format definitiion
  	 */
  def register(what: RegisterType, key: String, value: NumeralJSLocale): NumeralJSLocale | NumeralJsFormat = js.native
  def register(what: RegisterType, key: String, value: NumeralJsFormat): NumeralJSLocale | NumeralJsFormat = js.native
  def set(value: js.Any): Numeral_ = js.native
  def subtract(value: js.Any): Numeral_ = js.native
  def unformat(inputString: String): Double = js.native
  def validate(value: js.Any, culture: js.Any): Boolean = js.native
  def value(): Double = js.native
  def zeroFormat(format: String): Unit = js.native
}

