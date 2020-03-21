package typingsJapgolly.dojo.dojox.dtl.filter

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/filter/strings.html
  *
  *
  */
trait strings_ extends js.Object {
  /**
    * Adds slashes - useful for passing strings to JavaScript, for example.
    *
    * @param value
    */
  def addslashes(value: js.Any): js.Any
  /**
    * Capitalizes the first character of the value
    *
    * @param value
    */
  def capfirst(value: js.Any): Double
  /**
    * Centers the value in a field of a given width
    *
    * @param value
    * @param arg
    */
  def center(value: js.Any, arg: js.Any): String
  /**
    * Removes all values of arg from the given string
    *
    * @param value
    * @param arg
    */
  def cut(value: js.Any, arg: js.Any): js.Any
  /**
    * Replaces ampersands with &amp; entities
    *
    * @param value
    */
  def fix_ampersands(value: js.Any): js.Any
  /**
    * Format a number according to arg
    * If called without an argument, displays a floating point
    * number as 34.2 -- but only if there's a point to be displayed.
    * With a positive numeric argument, it displays that many decimal places
    * always.
    * With a negative numeric argument, it will display that many decimal
    * places -- but only if there's places to be displayed.
    *
    * @param value
    * @param arg
    */
  def floatformat(value: js.Any, arg: js.Any): js.Any
  /**
    *
    * @param value
    */
  def iriencode(value: js.Any): js.Any
  /**
    * Displays text with line numbers
    *
    * @param value
    */
  def linenumbers(value: js.Any): js.Any
  /**
    *
    * @param value
    * @param arg
    */
  def ljust(value: js.Any, arg: js.Any): String
  /**
    * Converts a string into all lowercase
    *
    * @param value
    */
  def lower(value: js.Any): js.Any
  /**
    * Returns the value turned into a list. For an integer, it's a list of
    * digits. For a string, it's a list of characters.
    *
    * @param value
    */
  def make_list(value: js.Any): js.Array[_]
  /**
    *
    * @param value
    * @param arg
    */
  def rjust(value: js.Any, arg: js.Any): String
  /**
    * Converts to lowercase, removes
    * non-alpha chars and converts spaces to hyphens
    *
    * @param value
    */
  def slugify(value: js.Any): js.Any
  /**
    * Formats the variable according to the argument, a string formatting specifier.
    * This specifier uses Python string formatting syntax, with the exception that
    * the leading "%" is dropped.
    *
    * @param value
    * @param arg
    */
  def stringformat(value: js.Any, arg: js.Any): js.Any
  /**
    * Converts a string into titlecase
    *
    * @param value
    */
  def title(value: js.Any): String
  /**
    * Truncates a string after a certain number of words
    *
    * @param value
    * @param arg Number of words to truncate after
    */
  def truncatewords(value: js.Any, arg: Double): js.Any
  /**
    *
    * @param value
    * @param arg
    */
  def truncatewords_html(value: js.Any, arg: js.Any): String
  /**
    *
    * @param value
    */
  def upper(value: js.Any): js.Any
  /**
    *
    * @param value
    */
  def urlencode(value: js.Any): js.Any
  /**
    *
    * @param value
    */
  def urlize(value: js.Any): js.Any
  /**
    *
    * @param value
    * @param arg
    */
  def urlizetrunc(value: js.Any, arg: js.Any): js.Any
  /**
    *
    * @param value
    */
  def wordcount(value: js.Any): Double
  /**
    *
    * @param value alias name: 'cent', 'pound' ..
    * @param arg
    */
  def wordwrap(value: String, arg: js.Any): js.Any
}

object strings_ {
  @scala.inline
  def apply(
    addslashes: js.Any => CallbackTo[js.Any],
    capfirst: js.Any => CallbackTo[Double],
    center: (js.Any, js.Any) => CallbackTo[String],
    cut: (js.Any, js.Any) => CallbackTo[js.Any],
    fix_ampersands: js.Any => CallbackTo[js.Any],
    floatformat: (js.Any, js.Any) => CallbackTo[js.Any],
    iriencode: js.Any => CallbackTo[js.Any],
    linenumbers: js.Any => CallbackTo[js.Any],
    ljust: (js.Any, js.Any) => CallbackTo[String],
    lower: js.Any => CallbackTo[js.Any],
    make_list: js.Any => CallbackTo[js.Array[js.Any]],
    rjust: (js.Any, js.Any) => CallbackTo[String],
    slugify: js.Any => CallbackTo[js.Any],
    stringformat: (js.Any, js.Any) => CallbackTo[js.Any],
    title: js.Any => CallbackTo[String],
    truncatewords: (js.Any, Double) => CallbackTo[js.Any],
    truncatewords_html: (js.Any, js.Any) => CallbackTo[String],
    upper: js.Any => CallbackTo[js.Any],
    urlencode: js.Any => CallbackTo[js.Any],
    urlize: js.Any => CallbackTo[js.Any],
    urlizetrunc: (js.Any, js.Any) => CallbackTo[js.Any],
    wordcount: js.Any => CallbackTo[Double],
    wordwrap: (String, js.Any) => CallbackTo[js.Any]
  ): strings_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addslashes")(js.Any.fromFunction1((t0: js.Any) => addslashes(t0).runNow()))
    __obj.updateDynamic("capfirst")(js.Any.fromFunction1((t0: js.Any) => capfirst(t0).runNow()))
    __obj.updateDynamic("center")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => center(t0, t1).runNow()))
    __obj.updateDynamic("cut")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => cut(t0, t1).runNow()))
    __obj.updateDynamic("fix_ampersands")(js.Any.fromFunction1((t0: js.Any) => fix_ampersands(t0).runNow()))
    __obj.updateDynamic("floatformat")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => floatformat(t0, t1).runNow()))
    __obj.updateDynamic("iriencode")(js.Any.fromFunction1((t0: js.Any) => iriencode(t0).runNow()))
    __obj.updateDynamic("linenumbers")(js.Any.fromFunction1((t0: js.Any) => linenumbers(t0).runNow()))
    __obj.updateDynamic("ljust")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => ljust(t0, t1).runNow()))
    __obj.updateDynamic("lower")(js.Any.fromFunction1((t0: js.Any) => lower(t0).runNow()))
    __obj.updateDynamic("make_list")(js.Any.fromFunction1((t0: js.Any) => make_list(t0).runNow()))
    __obj.updateDynamic("rjust")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => rjust(t0, t1).runNow()))
    __obj.updateDynamic("slugify")(js.Any.fromFunction1((t0: js.Any) => slugify(t0).runNow()))
    __obj.updateDynamic("stringformat")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => stringformat(t0, t1).runNow()))
    __obj.updateDynamic("title")(js.Any.fromFunction1((t0: js.Any) => title(t0).runNow()))
    __obj.updateDynamic("truncatewords")(js.Any.fromFunction2((t0: js.Any, t1: scala.Double) => truncatewords(t0, t1).runNow()))
    __obj.updateDynamic("truncatewords_html")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => truncatewords_html(t0, t1).runNow()))
    __obj.updateDynamic("upper")(js.Any.fromFunction1((t0: js.Any) => upper(t0).runNow()))
    __obj.updateDynamic("urlencode")(js.Any.fromFunction1((t0: js.Any) => urlencode(t0).runNow()))
    __obj.updateDynamic("urlize")(js.Any.fromFunction1((t0: js.Any) => urlize(t0).runNow()))
    __obj.updateDynamic("urlizetrunc")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => urlizetrunc(t0, t1).runNow()))
    __obj.updateDynamic("wordcount")(js.Any.fromFunction1((t0: js.Any) => wordcount(t0).runNow()))
    __obj.updateDynamic("wordwrap")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => wordwrap(t0, t1).runNow()))
    __obj.asInstanceOf[strings_]
  }
}

