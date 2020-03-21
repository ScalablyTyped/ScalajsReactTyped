package typingsJapgolly.dojo.dojox.dtl.filter

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/filter/dates.html
  *
  *
  */
trait dates extends js.Object {
  /**
    * Formats a date according to the given format
    *
    * @param value
    * @param arg
    */
  def date(value: js.Any, arg: js.Any): String
  /**
    * Formats a time according to the given format
    *
    * @param value
    * @param arg
    */
  def time(value: js.Any, arg: js.Any): String
  /**
    * Formats a date as the time since that date (i.e. "4 days, 6 hours")
    *
    * @param value
    * @param arg
    */
  def timesince(value: js.Any, arg: js.Any): String
  /**
    * Formats a date as the time until that date (i.e. "4 days, 6 hours")
    *
    * @param value
    * @param arg
    */
  def timeuntil(value: js.Any, arg: js.Any): String
}

object dates {
  @scala.inline
  def apply(
    date: (js.Any, js.Any) => CallbackTo[String],
    time: (js.Any, js.Any) => CallbackTo[String],
    timesince: (js.Any, js.Any) => CallbackTo[String],
    timeuntil: (js.Any, js.Any) => CallbackTo[String]
  ): dates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => date(t0, t1).runNow()))
    __obj.updateDynamic("time")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => time(t0, t1).runNow()))
    __obj.updateDynamic("timesince")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => timesince(t0, t1).runNow()))
    __obj.updateDynamic("timeuntil")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => timeuntil(t0, t1).runNow()))
    __obj.asInstanceOf[dates]
  }
}

