package typingsJapgolly.reactBigCalendar

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.reactBigCalendar.mod.DayPropGetter
import typingsJapgolly.reactBigCalendar.mod.EventPropGetter
import typingsJapgolly.reactBigCalendar.mod.SlotPropGetter
import typingsJapgolly.reactBigCalendar.mod.stringOrDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDayProp[TEvent /* <: js.Object */] extends js.Object {
  var dayProp: js.UndefOr[DayPropGetter] = js.undefined
  var eventProp: js.UndefOr[EventPropGetter[TEvent]] = js.undefined
  var slotProp: js.UndefOr[SlotPropGetter] = js.undefined
}

object AnonDayProp {
  @scala.inline
  def apply[TEvent /* <: js.Object */](
    dayProp: (/* date */ js.Date, /* resourceId */ js.UndefOr[Double | String]) => CallbackTo[HTMLAttributes[HTMLDivElement]] = null,
    eventProp: (TEvent, /* start */ stringOrDate, /* end */ stringOrDate, /* isSelected */ Boolean) => CallbackTo[HTMLAttributes[HTMLDivElement]] = null,
    slotProp: (/* date */ js.Date, /* resourceId */ js.UndefOr[Double | String]) => CallbackTo[HTMLAttributes[HTMLDivElement]] = null
  ): AnonDayProp[TEvent] = {
    val __obj = js.Dynamic.literal()
    if (dayProp != null) __obj.updateDynamic("dayProp")(js.Any.fromFunction2((t0: /* date */ js.Date, t1: /* resourceId */ js.UndefOr[scala.Double | java.lang.String]) => dayProp(t0, t1).runNow()))
    if (eventProp != null) __obj.updateDynamic("eventProp")(js.Any.fromFunction4((t0: TEvent, t1: /* start */ typingsJapgolly.reactBigCalendar.mod.stringOrDate, t2: /* end */ typingsJapgolly.reactBigCalendar.mod.stringOrDate, t3: /* isSelected */ scala.Boolean) => eventProp(t0, t1, t2, t3).runNow()))
    if (slotProp != null) __obj.updateDynamic("slotProp")(js.Any.fromFunction2((t0: /* date */ js.Date, t1: /* resourceId */ js.UndefOr[scala.Double | java.lang.String]) => slotProp(t0, t1).runNow()))
    __obj.asInstanceOf[AnonDayProp[TEvent]]
  }
}

