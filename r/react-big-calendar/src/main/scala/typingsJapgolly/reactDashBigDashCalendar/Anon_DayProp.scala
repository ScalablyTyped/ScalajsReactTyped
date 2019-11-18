package typingsJapgolly.reactDashBigDashCalendar

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarMod.DayPropGetter
import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarMod.EventPropGetter
import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarMod.SlotPropGetter
import typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarMod.stringOrDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DayProp[TEvent /* <: js.Object */] extends js.Object {
  var dayProp: js.UndefOr[DayPropGetter] = js.undefined
  var eventProp: js.UndefOr[EventPropGetter[TEvent]] = js.undefined
  var slotProp: js.UndefOr[SlotPropGetter] = js.undefined
}

object Anon_DayProp {
  @scala.inline
  def apply[TEvent /* <: js.Object */](
    dayProp: /* date */ js.Date => CallbackTo[Anon_ClassName] = null,
    eventProp: (TEvent, /* start */ stringOrDate, /* end */ stringOrDate, /* isSelected */ Boolean) => CallbackTo[Anon_ClassName] = null,
    slotProp: /* date */ js.Date => CallbackTo[Anon_ClassName] = null
  ): Anon_DayProp[TEvent] = {
    val __obj = js.Dynamic.literal()
    if (dayProp != null) __obj.updateDynamic("dayProp")(js.Any.fromFunction1((t0: /* date */ js.Date) => dayProp(t0).runNow()))
    if (eventProp != null) __obj.updateDynamic("eventProp")(js.Any.fromFunction4((t0: TEvent, t1: /* start */ typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarMod.stringOrDate, t2: /* end */ typingsJapgolly.reactDashBigDashCalendar.reactDashBigDashCalendarMod.stringOrDate, t3: /* isSelected */ scala.Boolean) => eventProp(t0, t1, t2, t3).runNow()))
    if (slotProp != null) __obj.updateDynamic("slotProp")(js.Any.fromFunction1((t0: /* date */ js.Date) => slotProp(t0).runNow()))
    __obj.asInstanceOf[Anon_DayProp[TEvent]]
  }
}

