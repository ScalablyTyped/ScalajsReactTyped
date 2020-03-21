package typingsJapgolly.fabric.fabricImplMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUtilString extends js.Object {
  /**
  	 * Camelizes a string
  	 * @param string String to camelize
  	 */
  def camelize(string: String): String
  /**
  	 * Capitalizes a string
  	 * @param string String to capitalize
  	 * @param [firstLetterOnly] If true only first letter is capitalized
  	 * and other letters stay untouched, if false first letter is capitalized
  	 * and other letters are converted to lowercase.
  	 */
  def capitalize(string: String, firstLetterOnly: Boolean): String
  /**
  	 * Escapes XML in a string
  	 * @param string String to escape
  	 */
  def escapeXml(string: String): String
  /**
  	 * Divide a string in the user perceived single units
  	 * @param {String} textstring String to escape
  	 * @return {Array} array containing the graphemes
  	 */
  def graphemeSplit(string: String): js.Array[String]
}

object IUtilString {
  @scala.inline
  def apply(
    camelize: String => CallbackTo[String],
    capitalize: (String, Boolean) => CallbackTo[String],
    escapeXml: String => CallbackTo[String],
    graphemeSplit: String => CallbackTo[js.Array[String]]
  ): IUtilString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("camelize")(js.Any.fromFunction1((t0: java.lang.String) => camelize(t0).runNow()))
    __obj.updateDynamic("capitalize")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => capitalize(t0, t1).runNow()))
    __obj.updateDynamic("escapeXml")(js.Any.fromFunction1((t0: java.lang.String) => escapeXml(t0).runNow()))
    __obj.updateDynamic("graphemeSplit")(js.Any.fromFunction1((t0: java.lang.String) => graphemeSplit(t0).runNow()))
    __obj.asInstanceOf[IUtilString]
  }
}

