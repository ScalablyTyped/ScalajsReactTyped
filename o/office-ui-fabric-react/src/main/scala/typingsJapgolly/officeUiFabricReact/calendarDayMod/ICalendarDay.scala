package typingsJapgolly.officeUiFabricReact.calendarDayMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarDay extends js.Object {
  def focus(): Unit
}

object ICalendarDay {
  @scala.inline
  def apply(focus: Callback): ICalendarDay = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.asInstanceOf[ICalendarDay]
  }
}

