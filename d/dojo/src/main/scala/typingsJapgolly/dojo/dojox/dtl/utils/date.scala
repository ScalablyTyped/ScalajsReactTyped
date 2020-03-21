package typingsJapgolly.dojo.dojox.dtl.utils

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/utils/date.html
  *
  *
  */
trait date extends js.Object {
  /**
    * Format the internal date object
    *
    * @param format
    */
  def DateFormat(format: String): Unit
}

object date {
  @scala.inline
  def apply(DateFormat: String => Callback): date = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DateFormat")(js.Any.fromFunction1((t0: java.lang.String) => DateFormat(t0).runNow()))
    __obj.asInstanceOf[date]
  }
}

