package typingsJapgolly.globalize.dateMod.globalizeDistGlobalizeAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Shared extends js.Object {
  /**
  		 * .dateFormatter( options )
  		 * @param {DateFormatterOptions} options see date/expand_pattern for more info.
  		 * @returns {Function} Return a function that formats a date according to the given `options` and the default/instance locale.
  		 */
  def dateFormatter(): js.Function1[/* value */ js.Date, String] = js.native
  def dateFormatter(options: DateFormatterOptions): js.Function1[/* value */ js.Date, String] = js.native
  //Return a function that parses a string representing a date into a JavaScript Date object according to the given options. The default parsing assumes numeric year, month, and day (i.e., { skeleton: "yMd" }).
  def dateParser(): js.Function1[/* value */ String, js.Date] = js.native
  def dateParser(options: DateFormatterOptions): js.Function1[/* value */ String, js.Date] = js.native
  //Alias for .dateFormatter( [options] )( value ).
  def formatDate(value: js.Date): String = js.native
  def formatDate(value: js.Date, options: DateFormatterOptions): String = js.native
  /**
  		 * Alias for .dateParser( [options] )( value ).
  		 * @param {string} value The object whose module id you wish to determine.
  		 * @param {DateFormatterOptions} options The object whose module id you wish to determine.
  		 * @returns {Date} Return the value as a Date.
  		 */
  def parseDate(value: String): js.Date = js.native
  def parseDate(value: String, options: DateFormatterOptions): js.Date = js.native
}

