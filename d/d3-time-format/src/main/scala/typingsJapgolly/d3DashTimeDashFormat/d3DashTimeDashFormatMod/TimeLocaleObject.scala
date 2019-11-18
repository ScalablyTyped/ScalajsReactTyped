package typingsJapgolly.d3DashTimeDashFormat.d3DashTimeDashFormatMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeLocaleObject extends js.Object {
  /**
    * Returns a new formatter for the given string specifier. The specifier string may contain the following directives:
    * - %a - abbreviated weekday name.*
    * - %A - full weekday name.*
    * - %b - abbreviated month name.*
    * - %B - full month name.*
    * - %c - the locale’s date and time, such as %x, %X.*
    * - %d - zero-padded day of the month as a decimal number [01,31].
    * - %e - space-padded day of the month as a decimal number [ 1,31]; equivalent to %_d.
    * - %f - microseconds as a decimal number [000000, 999999].
    * - %H - hour (24-hour clock) as a decimal number [00,23].
    * - %I - hour (12-hour clock) as a decimal number [01,12].
    * - %j - day of the year as a decimal number [001,366].
    * - %m - month as a decimal number [01,12].
    * - %M - minute as a decimal number [00,59].
    * - %L - milliseconds as a decimal number [000, 999].
    * - %p - either AM or PM.*
    * - %Q - milliseconds since UNIX epoch.
    * - %s - seconds since UNIX epoch.
    * - %S - second as a decimal number [00,61].
    * - %u - Monday-based (ISO) weekday as a decimal number [1,7].
    * - %U - Sunday-based week of the year as a decimal number [00,53].
    * - %V - ISO 8601 week number of the year as a decimal number [01, 53].
    * - %w - Sunday-based weekday as a decimal number [0,6].
    * - %W - Monday-based week of the year as a decimal number [00,53].
    * - %x - the locale’s date, such as %-m/%-d/%Y.*
    * - %X - the locale’s time, such as %-I:%M:%S %p.*
    * - %y - year without century as a decimal number [00,99].
    * - %Y - year with century as a decimal number.
    * - %Z - time zone offset, such as -0700, -07:00, -07, or Z.
    * - %% - a literal percent sign (%).
    *
    * Directives marked with an asterisk (*) may be affected by the locale definition.
    *
    * For %U, all days in a new year preceding the first Sunday are considered to be in week 0.
    * For %W, all days in a new year preceding the first Monday are considered to be in week 0.
    * Week numbers are computed using interval.count. For example, 2015-52 and 2016-00 represent Monday, December 28, 2015, while 2015-53 and 2016-01 represent Monday, January 4, 2016.
    * This differs from the ISO week date specification (%V), which uses a more complicated definition!
    *
    * For %V, per the strftime man page:
    *
    * In this system, weeks start on a Monday, and are numbered from 01, for the first week, up to 52 or 53, for the last week.
    * Week 1 is the first week where four or more days fall within the new year (or, synonymously, week 01 is: the first week of the year that contains a Thursday;
    * or, the week that has 4 January in it).
    *
    * The % sign indicating a directive may be immediately followed by a padding modifier:
    *
    * 1) 0 - zero-padding
    * 2) _ - space-padding
    * 3) - disable padding
    *
    * If no padding modifier is specified, the default is 0 for all directives except %e, which defaults to _.
    * (In some implementations of strftime and strptime, a directive may include an optional field width or precision; this feature is not yet implemented.)
    *
    * The returned function formats a specified date, returning the corresponding string.
    *
    * @param specifier A specifier string for the date format.
    */
  def format(specifier: String): js.Function1[/* date */ js.Date, String]
  /**
    * Returns a new parser for the given string specifier. The specifier string may contain the same directives as locale.format (TimeLocaleObject.format).
    * The %d and %e directives are considered equivalent for parsing.
    *
    * The returned function parses a specified string, returning the corresponding date or null if the string could not be parsed according to this format’s specifier.
    * Parsing is strict: if the specified string does not exactly match the associated specifier, this method returns null.
    *
    * For example, if the associated specifier is %Y-%m-%dT%H:%M:%SZ, then the string "2011-07-01T19:15:28Z" will be parsed as expected,
    * but "2011-07-01T19:15:28", "2011-07-01 19:15:28" and "2011-07-01" will return null. (Note that the literal Z here is different from the time zone offset directive %Z.)
    * If a more flexible parser is desired, try multiple formats sequentially until one returns non-null.
    *
    * @param specifier A specifier string for the date format.
    */
  def parse(specifier: String): js.Function1[/* dateString */ String, js.Date | Null]
  /**
    * Equivalent to locale.format (TimeLocaleObject.format), except all directives are interpreted as Coordinated Universal Time (UTC) rather than local time.
    *
    * @param specifier A specifier string for the date format.
    */
  def utcFormat(specifier: String): js.Function1[/* date */ js.Date, String]
  /**
    * Equivalent to locale.parse (TimeLocaleObject.parse), except all directives are interpreted as Coordinated Universal Time (UTC) rather than local time.
    *
    * @param specifier A specifier string for the date format.
    */
  def utcParse(specifier: String): js.Function1[/* dateString */ String, js.Date | Null]
}

object TimeLocaleObject {
  @scala.inline
  def apply(
    format: String => CallbackTo[js.Function1[/* date */ js.Date, String]],
    parse: String => CallbackTo[js.Function1[/* dateString */ String, js.Date | Null]],
    utcFormat: String => CallbackTo[js.Function1[/* date */ js.Date, String]],
    utcParse: String => CallbackTo[js.Function1[/* dateString */ String, js.Date | Null]]
  ): TimeLocaleObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(js.Any.fromFunction1((t0: java.lang.String) => format(t0).runNow()))
    __obj.updateDynamic("parse")(js.Any.fromFunction1((t0: java.lang.String) => parse(t0).runNow()))
    __obj.updateDynamic("utcFormat")(js.Any.fromFunction1((t0: java.lang.String) => utcFormat(t0).runNow()))
    __obj.updateDynamic("utcParse")(js.Any.fromFunction1((t0: java.lang.String) => utcParse(t0).runNow()))
    __obj.asInstanceOf[TimeLocaleObject]
  }
}

