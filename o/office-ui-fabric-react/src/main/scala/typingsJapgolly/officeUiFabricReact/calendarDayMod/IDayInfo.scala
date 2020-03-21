package typingsJapgolly.officeUiFabricReact.calendarDayMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDayInfo extends js.Object {
  var date: String
  var isInBounds: Boolean
  var isInMonth: Boolean
  var isSelected: Boolean
  var isToday: Boolean
  var key: String
  var originalDate: js.Date
  def onSelected(ev: ReactEventFrom[HTMLElement]): Unit
}

object IDayInfo {
  @scala.inline
  def apply(
    date: String,
    isInBounds: Boolean,
    isInMonth: Boolean,
    isSelected: Boolean,
    isToday: Boolean,
    key: String,
    onSelected: ReactEventFrom[HTMLElement] => Callback,
    originalDate: js.Date
  ): IDayInfo = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], isInBounds = isInBounds.asInstanceOf[js.Any], isInMonth = isInMonth.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], isToday = isToday.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], originalDate = originalDate.asInstanceOf[js.Any])
    __obj.updateDynamic("onSelected")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[org.scalajs.dom.raw.HTMLElement]) => onSelected(t0).runNow()))
    __obj.asInstanceOf[IDayInfo]
  }
}

