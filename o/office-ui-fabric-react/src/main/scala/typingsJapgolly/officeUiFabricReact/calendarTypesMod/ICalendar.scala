package typingsJapgolly.officeUiFabricReact.calendarTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendar extends js.Object {
  /** Sets focus to the selected date. */
  def focus(): Unit
}

object ICalendar {
  @scala.inline
  def apply(focus: Callback): ICalendar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.asInstanceOf[ICalendar]
  }
}

