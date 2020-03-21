package typingsJapgolly.microsoftAjax

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait String extends js.Object {
  //#region Extensions
  /**
    * Formats a number by using the invariant culture.
    * @returns true if the end of the String object matches suffix; otherwise, false.
    */
  def endsWith(suffix: java.lang.String): Boolean
  /**
    * Removes leading and trailing white-space characters from a String object.
    * @returns A copy of the string with all white-space characters removed from the start and end of the string.
    */
  def trim(): java.lang.String
  /**
    * Removes trailing white-space characters from a String object.
    * @returns A copy of the string with all white-space characters removed from the end of the string.
    */
  def trimEnd(): java.lang.String
  /**
    * Removes leading white-space characters from a String object.
    * @returns A copy of the string with all white-space characters removed from the start of the string.
    */
  def trimStart(): java.lang.String
}

object String {
  @scala.inline
  def apply(
    endsWith: java.lang.String => CallbackTo[Boolean],
    trim: CallbackTo[java.lang.String],
    trimEnd: CallbackTo[java.lang.String],
    trimStart: CallbackTo[java.lang.String]
  ): String = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endsWith")(js.Any.fromFunction1((t0: java.lang.String) => endsWith(t0).runNow()))
    __obj.updateDynamic("trim")(trim.toJsFn)
    __obj.updateDynamic("trimEnd")(trimEnd.toJsFn)
    __obj.updateDynamic("trimStart")(trimStart.toJsFn)
    __obj.asInstanceOf[String]
  }
}

