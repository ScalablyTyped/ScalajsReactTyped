package typingsJapgolly.handlebarsHelpers.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils_ extends js.Object {
  /**
    * Change casing on the given `string`, optionally
    * passing a delimiter to use between words in the
    * returned string.
    *
    * ```handlebars
    * utils.changecase('fooBarBaz');
    * //=> 'foo bar baz'
    *
    * utils.changecase('fooBarBaz' '-');
    * //=> 'foo-bar-baz'
    * ```
    */
  def changecase(str: String, fn: js.Function1[/* str */ String, String]): String
  /**
    * Remove leading and trailing whitespace and non-word
    * characters from the given string.
    */
  def chop(str: String): String
  /**
    * Returns true if the given value contains the given
    * `object`, optionally passing a starting index.
    */
  def contains[T](`val`: js.Array[T], obj: T, start: Double): Boolean
}

object Utils_ {
  @scala.inline
  def apply(
    changecase: (String, js.Function1[/* str */ String, String]) => CallbackTo[String],
    chop: String => CallbackTo[String],
    contains: (js.Array[js.Any], js.Any, Double) => CallbackTo[Boolean]
  ): Utils_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changecase")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* str */ java.lang.String, java.lang.String]) => changecase(t0, t1).runNow()))
    __obj.updateDynamic("chop")(js.Any.fromFunction1((t0: java.lang.String) => chop(t0).runNow()))
    __obj.updateDynamic("contains")(js.Any.fromFunction3((t0: js.Array[js.Any], t1: js.Any, t2: scala.Double) => contains(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Utils_]
  }
}

