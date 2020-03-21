package typingsJapgolly.reactBigCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Culture = java.lang.String
  type DateFormat = java.lang.String | typingsJapgolly.reactBigCalendar.mod.DateFormatFunction
  type DateFormatFunction = js.Function3[
    /* date */ js.Date, 
    /* culture */ js.UndefOr[typingsJapgolly.reactBigCalendar.mod.Culture], 
    /* localizer */ js.UndefOr[typingsJapgolly.reactBigCalendar.mod.DateLocalizer], 
    java.lang.String
  ]
  type DateRangeFormatFunction = js.Function3[
    /* range */ typingsJapgolly.reactBigCalendar.mod.DateRange, 
    /* culture */ js.UndefOr[typingsJapgolly.reactBigCalendar.mod.Culture], 
    /* localizer */ js.UndefOr[typingsJapgolly.reactBigCalendar.mod.DateLocalizer], 
    java.lang.String
  ]
  type DayPropGetter = js.Function2[
    /* date */ js.Date, 
    /* resourceId */ js.UndefOr[scala.Double | java.lang.String], 
    typingsJapgolly.react.mod.HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement]
  ]
  type EventPropGetter[T] = js.Function4[
    /* event */ T, 
    /* start */ typingsJapgolly.reactBigCalendar.mod.stringOrDate, 
    /* end */ typingsJapgolly.reactBigCalendar.mod.stringOrDate, 
    /* isSelected */ scala.Boolean, 
    typingsJapgolly.react.mod.HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement]
  ]
  type FormatInput = scala.Double | java.lang.String | js.Date
  type SlotGroupPropGetter = js.Function0[typingsJapgolly.react.mod.HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement]]
  type SlotPropGetter = js.Function2[
    /* date */ js.Date, 
    /* resourceId */ js.UndefOr[scala.Double | java.lang.String], 
    typingsJapgolly.react.mod.HTMLAttributes[org.scalajs.dom.raw.HTMLDivElement]
  ]
  type ViewsProps = js.Array[typingsJapgolly.reactBigCalendar.mod.View] | typingsJapgolly.reactBigCalendar.AnonAgenda
  type stringOrDate = java.lang.String | js.Date
}
