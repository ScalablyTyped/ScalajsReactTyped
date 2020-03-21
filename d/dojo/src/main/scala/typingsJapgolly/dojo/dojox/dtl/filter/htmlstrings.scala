package typingsJapgolly.dojo.dojox.dtl.filter

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/filter/htmlstrings.html
  *
  *
  */
trait htmlstrings extends js.Object {
  /**
    * Converts newlines into <p> and <br />s
    *
    * @param value
    */
  def linebreaks(value: js.Any): js.Any
  /**
    * Converts newlines into <br />s
    *
    * @param value
    */
  def linebreaksbr(value: js.Any): js.Any
  /**
    * Removes a space separated list of [X]HTML tags from the output"
    *
    * @param value
    * @param arg
    */
  def removetags(value: js.Any, arg: js.Any): js.Any
  /**
    * Strips all [X]HTML tags
    *
    * @param value
    */
  def striptags(value: js.Any): js.Any
}

object htmlstrings {
  @scala.inline
  def apply(
    linebreaks: js.Any => CallbackTo[js.Any],
    linebreaksbr: js.Any => CallbackTo[js.Any],
    removetags: (js.Any, js.Any) => CallbackTo[js.Any],
    striptags: js.Any => CallbackTo[js.Any]
  ): htmlstrings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("linebreaks")(js.Any.fromFunction1((t0: js.Any) => linebreaks(t0).runNow()))
    __obj.updateDynamic("linebreaksbr")(js.Any.fromFunction1((t0: js.Any) => linebreaksbr(t0).runNow()))
    __obj.updateDynamic("removetags")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => removetags(t0, t1).runNow()))
    __obj.updateDynamic("striptags")(js.Any.fromFunction1((t0: js.Any) => striptags(t0).runNow()))
    __obj.asInstanceOf[htmlstrings]
  }
}

