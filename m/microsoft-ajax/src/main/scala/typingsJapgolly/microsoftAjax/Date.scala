package typingsJapgolly.microsoftAjax

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
* Provides extensions to the base ECMAScript (JavaScript) Date object.
* Date Type Extensions
* @see {@link http://msdn.microsoft.com/en-us/library/bb310850(v=vs.100).aspx}
*/
trait Date extends js.Object {
  /**
    * Formats a date by using the invariant (culture-independent) culture.
    */
  def format(format: java.lang.String): java.lang.String
  /**
    * Formats a date by using the current culture. This function is static and can be invoked without creating an instance of the object.
    */
  def localeFormat(format: java.lang.String): java.lang.String
}

object Date {
  @scala.inline
  def apply(
    format: java.lang.String => CallbackTo[java.lang.String],
    localeFormat: java.lang.String => CallbackTo[java.lang.String]
  ): Date = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("format")(js.Any.fromFunction1((t0: java.lang.String) => format(t0).runNow()))
    __obj.updateDynamic("localeFormat")(js.Any.fromFunction1((t0: java.lang.String) => localeFormat(t0).runNow()))
    __obj.asInstanceOf[Date]
  }
}

