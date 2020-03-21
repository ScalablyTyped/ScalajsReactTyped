package typingsJapgolly.flatpickr.minMaxTimePluginMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.flatpickr.globalsMod._Global_.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var defaults: MinMaxTime
  var tableDateFormat: String
  def formatDate(date: Date, f: String): String
}

object State {
  @scala.inline
  def apply(defaults: MinMaxTime, formatDate: (Date, String) => CallbackTo[String], tableDateFormat: String): State = {
    val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any], tableDateFormat = tableDateFormat.asInstanceOf[js.Any])
    __obj.updateDynamic("formatDate")(js.Any.fromFunction2((t0: typingsJapgolly.flatpickr.globalsMod._Global_.Date, t1: java.lang.String) => formatDate(t0, t1).runNow()))
    __obj.asInstanceOf[State]
  }
}

