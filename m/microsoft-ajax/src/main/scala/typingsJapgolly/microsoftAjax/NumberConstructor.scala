package typingsJapgolly.microsoftAjax

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberConstructor extends js.Object {
  /**
    * Returns a numeric value from a string representation of a number. This function is static and can be called without creating an instance of the object.
    */
  def parseInvariant(format: java.lang.String): Double
  /**
    * Creates a numeric value from a locale-specific string.
    */
  def parseLocale(format: java.lang.String): Double
}

object NumberConstructor {
  @scala.inline
  def apply(
    parseInvariant: java.lang.String => CallbackTo[Double],
    parseLocale: java.lang.String => CallbackTo[Double]
  ): NumberConstructor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("parseInvariant")(js.Any.fromFunction1((t0: java.lang.String) => parseInvariant(t0).runNow()))
    __obj.updateDynamic("parseLocale")(js.Any.fromFunction1((t0: java.lang.String) => parseLocale(t0).runNow()))
    __obj.asInstanceOf[NumberConstructor]
  }
}

