package typingsJapgolly.reactInfiniteCalendar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CalendarClass = japgolly.scalajs.react.raw.React.ComponentClassP[
    typingsJapgolly.reactInfiniteCalendar.mod.ReactInfiniteCalendarProps with js.Object
  ]
  type DateSelectFunction = js.Function1[/* date */ js.Date, scala.Unit]
  type DateType = js.Date | java.lang.String | scala.Double
  type RangedSelectFunction = js.Function1[
    /* rangedDate */ typingsJapgolly.reactInfiniteCalendar.mod.RangedSelection, 
    scala.Unit
  ]
  type ReactInfiniteCalendar = japgolly.scalajs.react.raw.React.Component[
    typingsJapgolly.reactInfiniteCalendar.mod.ReactInfiniteCalendarProps with js.Object, 
    js.Object
  ]
}
