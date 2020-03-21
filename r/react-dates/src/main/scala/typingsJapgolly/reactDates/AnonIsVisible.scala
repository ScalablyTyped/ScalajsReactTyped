package typingsJapgolly.reactDates

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactDates.mod.momentPropTypes.momentObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIsVisible extends js.Object {
  var isVisible: Boolean
  var month: momentObj
  def onMonthSelect(currentMonth: momentObj, newMonthVal: String): Unit
  def onYearSelect(currentMonth: momentObj, newYearVal: String): Unit
}

object AnonIsVisible {
  @scala.inline
  def apply(
    isVisible: Boolean,
    month: momentObj,
    onMonthSelect: (momentObj, String) => Callback,
    onYearSelect: (momentObj, String) => Callback
  ): AnonIsVisible = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any])
    __obj.updateDynamic("onMonthSelect")(js.Any.fromFunction2((t0: typingsJapgolly.reactDates.mod.momentPropTypes.momentObj, t1: java.lang.String) => onMonthSelect(t0, t1).runNow()))
    __obj.updateDynamic("onYearSelect")(js.Any.fromFunction2((t0: typingsJapgolly.reactDates.mod.momentPropTypes.momentObj, t1: java.lang.String) => onYearSelect(t0, t1).runNow()))
    __obj.asInstanceOf[AnonIsVisible]
  }
}

