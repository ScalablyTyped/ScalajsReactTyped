package typingsJapgolly.officeUiFabricReact.calendarYearMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarYear extends js.Object {
  def focus(): Unit
}

object ICalendarYear {
  @scala.inline
  def apply(focus: Callback): ICalendarYear = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.asInstanceOf[ICalendarYear]
  }
}

