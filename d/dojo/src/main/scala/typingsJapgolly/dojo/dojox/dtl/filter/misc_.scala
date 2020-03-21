package typingsJapgolly.dojo.dojox.dtl.filter

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/filter/misc.html
  *
  *
  */
trait misc_ extends js.Object {
  /**
    * Format the value like a 'human-readable' file size (i.e. 13 KB, 4.1 MB, 102bytes, etc).
    *
    * @param value
    */
  def filesizeformat(value: js.Any): String
  /**
    * Takes a phone number and converts it in to its numerical equivalent
    *
    * @param value
    */
  def phone2numeric(value: js.Any): String
  /**
    * Returns a plural suffix if the value is not 1, for '1 vote' vs. '2 votes'
    * By default, 's' is used as a suffix; if an argument is provided, that string
    * is used instead. If the provided argument contains a comma, the text before
    * the comma is used for the singular case.
    *
    * @param value
    * @param arg
    */
  def pluralize(value: js.Any, arg: js.Any): String
  /**
    * A wrapper around toJson unless something better comes along
    *
    * @param value
    */
  def pprint(value: js.Any): js.Any
}

object misc_ {
  @scala.inline
  def apply(
    filesizeformat: js.Any => CallbackTo[String],
    phone2numeric: js.Any => CallbackTo[String],
    pluralize: (js.Any, js.Any) => CallbackTo[String],
    pprint: js.Any => CallbackTo[js.Any]
  ): misc_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filesizeformat")(js.Any.fromFunction1((t0: js.Any) => filesizeformat(t0).runNow()))
    __obj.updateDynamic("phone2numeric")(js.Any.fromFunction1((t0: js.Any) => phone2numeric(t0).runNow()))
    __obj.updateDynamic("pluralize")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => pluralize(t0, t1).runNow()))
    __obj.updateDynamic("pprint")(js.Any.fromFunction1((t0: js.Any) => pprint(t0).runNow()))
    __obj.asInstanceOf[misc_]
  }
}

