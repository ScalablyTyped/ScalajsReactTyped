package typingsJapgolly.reactDashBigDashCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashBigDashCalendarMod {
  import typingsJapgolly.reactDashBigDashCalendar.Anon_Agenda
  import typingsJapgolly.reactDashBigDashCalendar.Anon_ClassName

  type Culture = String | js.Array[String]
  type DateFormat = String | DateFormatFunction
  type DateFormatFunction = js.Function3[
    /* date */ js.Date, 
    /* culture */ js.UndefOr[String], 
    /* localizer */ js.UndefOr[js.Object], 
    String
  ]
  type DateRangeFormatFunction = js.Function3[
    /* range */ DateRange, 
    /* culture */ js.UndefOr[String], 
    /* localizer */ js.UndefOr[js.Object], 
    String
  ]
  type DayPropGetter = js.Function1[/* date */ js.Date, Anon_ClassName]
  type EventPropGetter[T] = js.Function4[
    /* event */ T, 
    /* start */ stringOrDate, 
    /* end */ stringOrDate, 
    /* isSelected */ Boolean, 
    Anon_ClassName
  ]
  type FormatInput = Double | String | js.Date
  type SlotPropGetter = js.Function1[/* date */ js.Date, Anon_ClassName]
  type ViewsProps = js.Array[View] | Anon_Agenda
  type stringOrDate = String | js.Date
}
