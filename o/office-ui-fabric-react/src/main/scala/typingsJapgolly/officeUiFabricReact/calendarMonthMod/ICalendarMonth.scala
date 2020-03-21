package typingsJapgolly.officeUiFabricReact.calendarMonthMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarMonth extends js.Object {
  def focus(): Unit
}

object ICalendarMonth {
  @scala.inline
  def apply(focus: Callback): ICalendarMonth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.asInstanceOf[ICalendarMonth]
  }
}

