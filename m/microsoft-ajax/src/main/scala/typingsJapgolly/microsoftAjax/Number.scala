package typingsJapgolly.microsoftAjax

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* Extends the base ECMAScript (JavaScript) Number functionality with static and instance methods.
* Number Type Extensions
* @see {@link http://msdn.microsoft.com/en-us/library/bb310835(v=vs.100).aspx}
*/
trait Number extends js.Object {
  /**
    * Formats a number by using the invariant culture.
    */
  def format(format: java.lang.String): java.lang.String
  /**
    * Formats a number by using the current culture.
    */
  def localeFormat(format: java.lang.String): java.lang.String
}

object Number {
  @scala.inline
  def apply(
    format: java.lang.String => CallbackTo[java.lang.String],
    localeFormat: java.lang.String => CallbackTo[java.lang.String]
  ): Number = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(js.Any.fromFunction1((t0: java.lang.String) => format(t0).runNow()))
    __obj.updateDynamic("localeFormat")(js.Any.fromFunction1((t0: java.lang.String) => localeFormat(t0).runNow()))
    __obj.asInstanceOf[Number]
  }
}

