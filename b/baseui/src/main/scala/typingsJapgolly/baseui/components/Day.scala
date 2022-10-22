package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.DateEvent
import typingsJapgolly.baseui.anon.`10`
import typingsJapgolly.baseui.datepickerDayMod.default
import typingsJapgolly.baseui.datepickerTypesMod.DatepickerOverrides
import typingsJapgolly.baseui.datepickerTypesMod.DayProps
import typingsJapgolly.baseui.datepickerTypesMod.Density
import typingsJapgolly.baseui.datepickerTypesMod.InputRole
import typingsJapgolly.baseui.datepickerUtilsTypesMod.DateIOAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Day {
  
  inline def apply[T](
    adapter: DateIOAdapter[T],
    date: T,
    density: Density,
    disabled: Boolean,
    focusedCalendar: Boolean,
    hasLockedBehavior: Boolean,
    highlighted: Boolean,
    onBlur: DateEvent[T] => Any,
    onClick: DateEvent[T] => Any,
    onFocus: DateEvent[T] => Any,
    onMouseLeave: DateEvent[T] => Any,
    onMouseOver: DateEvent[T] => Any,
    onSelect: `10`[T] => Any,
    peekNextMonth: Boolean,
    range: Boolean
  ): Builder[T] = {
    val __props = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], density = density.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], focusedCalendar = focusedCalendar.asInstanceOf[js.Any], hasLockedBehavior = hasLockedBehavior.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1(onBlur), onClick = js.Any.fromFunction1(onClick), onFocus = js.Any.fromFunction1(onFocus), onMouseLeave = js.Any.fromFunction1(onMouseLeave), onMouseOver = js.Any.fromFunction1(onMouseOver), onSelect = js.Any.fromFunction1(onSelect), peekNextMonth = peekNextMonth.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[DayProps[T]]))
  }
  
  @JSImport("baseui/datepicker/day", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[T]] {
    
    inline def dateLabel(value: T => Node): this.type = set("dateLabel", js.Any.fromFunction1(value))
    
    inline def dateLabelNull: this.type = set("dateLabel", null)
    
    inline def filterDate(value: T => Boolean): this.type = set("filterDate", js.Any.fromFunction1(value))
    
    inline def filterDateNull: this.type = set("filterDate", null)
    
    inline def highlightedDate(value: T): this.type = set("highlightedDate", value.asInstanceOf[js.Any])
    
    inline def highlightedDateNull: this.type = set("highlightedDate", null)
    
    inline def includeDates(value: js.Array[T]): this.type = set("includeDates", value.asInstanceOf[js.Any])
    
    inline def includeDatesNull: this.type = set("includeDates", null)
    
    inline def includeDatesVarargs(value: T*): this.type = set("includeDates", js.Array(value*))
    
    inline def locale(value: typingsJapgolly.baseui.datepickerTypesMod.Locale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def localeNull: this.type = set("locale", null)
    
    inline def maxDate(value: T): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def maxDateNull: this.type = set("maxDate", null)
    
    inline def minDate(value: T): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def minDateNull: this.type = set("minDate", null)
    
    inline def month(value: Double): this.type = set("month", value.asInstanceOf[js.Any])
    
    inline def monthNull: this.type = set("month", null)
    
    inline def overrides(value: DatepickerOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def selectedInput(value: InputRole): this.type = set("selectedInput", value.asInstanceOf[js.Any])
    
    inline def selectedInputNull: this.type = set("selectedInput", null)
    
    inline def value(value: T | (js.Array[js.UndefOr[T | Null]])): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueNull: this.type = set("value", null)
    
    inline def valueVarargs(value: (js.UndefOr[T | Null])*): this.type = set("value", js.Array(value*))
  }
  
  def withProps[T](p: DayProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
