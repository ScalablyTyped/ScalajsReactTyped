package typingsJapgolly.reactInfiniteCalendar.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactInfiniteCalendar.anon.AccentColor
import typingsJapgolly.reactInfiniteCalendar.anon.Blank
import typingsJapgolly.reactInfiniteCalendar.anon.End
import typingsJapgolly.reactInfiniteCalendar.anon.HideYearsOnSelect
import typingsJapgolly.reactInfiniteCalendar.mod.DateType
import typingsJapgolly.reactInfiniteCalendar.mod.RangedSelection
import typingsJapgolly.reactInfiniteCalendar.mod.ReactInfiniteCalendarProps
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarBooleans.`false`
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarInts.`0`
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarInts.`1`
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarInts.`2`
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarInts.`3`
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarInts.`4`
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarInts.`5`
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarInts.`6`
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarStrings.`100Percentsign`
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarStrings.auto
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarStrings.days
import typingsJapgolly.reactInfiniteCalendar.reactInfiniteCalendarStrings.years
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_ReactInfiniteCalendarProps_510301624[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def Component(value: ComponentClassP[ReactInfiniteCalendarProps & js.Object]): this.type = set("Component", value.asInstanceOf[js.Any])
  
  inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def disabledDates(value: js.Array[DateType]): this.type = set("disabledDates", value.asInstanceOf[js.Any])
  
  inline def disabledDatesVarargs(value: DateType*): this.type = set("disabledDates", js.Array(value*))
  
  inline def disabledDays(value: js.Array[`0` | `1` | `2` | `3` | `4` | `5` | `6`]): this.type = set("disabledDays", value.asInstanceOf[js.Any])
  
  inline def disabledDaysVarargs(value: (`0` | `1` | `2` | `3` | `4` | `5` | `6`)*): this.type = set("disabledDays", js.Array(value*))
  
  inline def display(value: days | years): this.type = set("display", value.asInstanceOf[js.Any])
  
  inline def displayOptions(value: HideYearsOnSelect): this.type = set("displayOptions", value.asInstanceOf[js.Any])
  
  inline def height(value: Double | auto): this.type = set("height", value.asInstanceOf[js.Any])
  
  inline def interpolateSelection(value: (/* date */ js.Date, /* selected */ js.Array[js.Date]) => js.Array[js.Date]): this.type = set("interpolateSelection", js.Any.fromFunction2(value))
  
  inline def locale(value: Blank): this.type = set("locale", value.asInstanceOf[js.Any])
  
  inline def max(value: DateType): this.type = set("max", value.asInstanceOf[js.Any])
  
  inline def maxDate(value: DateType): this.type = set("maxDate", value.asInstanceOf[js.Any])
  
  inline def min(value: DateType): this.type = set("min", value.asInstanceOf[js.Any])
  
  inline def minDate(value: DateType): this.type = set("minDate", value.asInstanceOf[js.Any])
  
  inline def onScroll(value: /* scrollTop */ Double => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: /* scrollTop */ Double) => value(t0).runNow()))
  
  inline def onScrollEnd(value: /* scrollTop */ Double => Callback): this.type = set("onScrollEnd", js.Any.fromFunction1((t0: /* scrollTop */ Double) => value(t0).runNow()))
  
  inline def onSelect(value: (/* date */ js.Date) | (/* rangedDate */ RangedSelection) => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: (/* date */ js.Date) | (/* rangedDate */ RangedSelection)) => value(t0).runNow()))
  
  inline def rowHeight(value: Double): this.type = set("rowHeight", value.asInstanceOf[js.Any])
  
  inline def selected(value: DateType | `false` | End | js.Array[DateType]): this.type = set("selected", value.asInstanceOf[js.Any])
  
  inline def selectedVarargs(value: DateType*): this.type = set("selected", js.Array(value*))
  
  inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  
  inline def theme(value: AccentColor): this.type = set("theme", value.asInstanceOf[js.Any])
  
  inline def width(value: Double | auto | `100Percentsign`): this.type = set("width", value.asInstanceOf[js.Any])
}
