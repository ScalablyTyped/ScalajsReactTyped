package typingsJapgolly.d3Format.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.d3Format.AnonValueOf
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatLocaleObject extends js.Object {
  /**
    * Returns a new format function for the given string specifier. The returned function
    * takes a number as the only argument, and returns a string representing the formatted number.
    *
    * @param specifier A Specifier string.
    * @throws Error on invalid format specifier.
    */
  def format(specifier: String): js.Function1[/* n */ Double | AnonValueOf, String]
  /**
    * Returns a new format function for the given string specifier. The returned function
    * takes a number as the only argument, and returns a string representing the formatted number.
    * The returned function will convert values to the units of the appropriate SI prefix for the
    * specified numeric reference value before formatting in fixed point notation.
    *
    * @param specifier A Specifier string.
    * @param value The reference value to determine the appropriate SI prefix.
    * @throws Error on invalid format specifier.
    */
  def formatPrefix(specifier: String, value: Double): js.Function1[/* n */ Double | AnonValueOf, String]
}

object FormatLocaleObject {
  @scala.inline
  def apply(
    format: String => CallbackTo[js.Function1[/* n */ Double | AnonValueOf, String]],
    formatPrefix: (String, Double) => CallbackTo[js.Function1[/* n */ Double | AnonValueOf, String]]
  ): FormatLocaleObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(js.Any.fromFunction1((t0: java.lang.String) => format(t0).runNow()))
    __obj.updateDynamic("formatPrefix")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => formatPrefix(t0, t1).runNow()))
    __obj.asInstanceOf[FormatLocaleObject]
  }
}

