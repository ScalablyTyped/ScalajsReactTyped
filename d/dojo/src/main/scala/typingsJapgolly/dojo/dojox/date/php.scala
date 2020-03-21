package typingsJapgolly.dojo.dojox.date

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/date/php.html
  *
  *
  */
trait php extends js.Object {
  /**
    * Format the internal date object
    *
    * @param format
    */
  def DateFormat(format: String): Unit
  /**
    * Get a formatted string for a given date object
    *
    * @param date
    * @param format
    */
  def format(date: js.Date, format: String): Unit
}

object php {
  @scala.inline
  def apply(DateFormat: String => Callback, format: (js.Date, String) => Callback): php = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DateFormat")(js.Any.fromFunction1((t0: java.lang.String) => DateFormat(t0).runNow()))
    __obj.updateDynamic("format")(js.Any.fromFunction2((t0: js.Date, t1: java.lang.String) => format(t0, t1).runNow()))
    __obj.asInstanceOf[php]
  }
}

