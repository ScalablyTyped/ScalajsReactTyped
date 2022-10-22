package typingsJapgolly.reactInfiniteCalendar

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactInfiniteCalendar.anon.AccentColor
import typingsJapgolly.reactInfiniteCalendar.anon.Blank
import typingsJapgolly.reactInfiniteCalendar.anon.End
import typingsJapgolly.reactInfiniteCalendar.anon.HideYearsOnSelect
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

object mod {
  
  @JSImport("react-infinite-calendar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-infinite-calendar", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ReactInfiniteCalendarProps, js.Object, Any]
  
  @JSImport("react-infinite-calendar", "Calendar")
  @js.native
  open class Calendar protected ()
    extends Component[ReactInfiniteCalendarProps, js.Object, Any] {
    def this(props: ReactInfiniteCalendarProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ReactInfiniteCalendarProps, context: Any) = this()
  }
  
  @js.native
  sealed trait EVENT_TYPE extends StObject
  @JSImport("react-infinite-calendar", "EVENT_TYPE")
  @js.native
  object EVENT_TYPE extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EVENT_TYPE & Double] = js.native
    
    @js.native
    sealed trait END
      extends StObject
         with EVENT_TYPE
    /* 1 */ val END: typingsJapgolly.reactInfiniteCalendar.mod.EVENT_TYPE.END & Double = js.native
    
    @js.native
    sealed trait HOVER
      extends StObject
         with EVENT_TYPE
    /* 0 */ val HOVER: typingsJapgolly.reactInfiniteCalendar.mod.EVENT_TYPE.HOVER & Double = js.native
    
    @js.native
    sealed trait START
      extends StObject
         with EVENT_TYPE
    /* 1 */ val START: typingsJapgolly.reactInfiniteCalendar.mod.EVENT_TYPE.START & Double = js.native
  }
  
  inline def defaultMultipleDateInterpolation(component: ComponentClassP[ReactInfiniteCalendarProps & js.Object]): ComponentClassP[ReactInfiniteCalendarProps & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultMultipleDateInterpolation")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[ReactInfiniteCalendarProps & js.Object]]
  
  inline def withDateSelection(component: ComponentClassP[ReactInfiniteCalendarProps & js.Object]): ComponentClassP[ReactInfiniteCalendarProps & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("withDateSelection")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[ReactInfiniteCalendarProps & js.Object]]
  
  inline def withKeyboardSupport(component: ComponentClassP[ReactInfiniteCalendarProps & js.Object]): ComponentClassP[ReactInfiniteCalendarProps & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("withKeyboardSupport")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[ReactInfiniteCalendarProps & js.Object]]
  
  inline def withMultipleDates(component: ComponentClassP[ReactInfiniteCalendarProps & js.Object]): ComponentClassP[ReactInfiniteCalendarProps & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("withMultipleDates")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[ReactInfiniteCalendarProps & js.Object]]
  
  inline def withRange(component: ComponentClassP[ReactInfiniteCalendarProps & js.Object]): ComponentClassP[ReactInfiniteCalendarProps & js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("withRange")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentClassP[ReactInfiniteCalendarProps & js.Object]]
  
  type CalendarClass = ComponentClassP[ReactInfiniteCalendarProps & js.Object]
  
  type DateSelectFunction = js.Function1[/* date */ js.Date, Unit]
  
  type DateType = js.Date | String | Double
  
  type RangedSelectFunction = js.Function1[/* rangedDate */ RangedSelection, Unit]
  
  trait RangedSelection extends StObject {
    
    var end: js.Date
    
    var eventType: EVENT_TYPE
    
    var start: js.Date
  }
  object RangedSelection {
    
    inline def apply(end: js.Date, eventType: EVENT_TYPE, start: js.Date): RangedSelection = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangedSelection]
    }
    
    extension [Self <: RangedSelection](x: Self) {
      
      inline def setEnd(value: js.Date): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEventType(value: EVENT_TYPE): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      inline def setStart(value: js.Date): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  type ReactInfiniteCalendar = japgolly.scalajs.react.facade.React.Component[ReactInfiniteCalendarProps & js.Object, js.Object]
  
  trait ReactInfiniteCalendarProps extends StObject {
    
    var Component: js.UndefOr[ComponentClassP[ReactInfiniteCalendarProps & js.Object]] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabledDates: js.UndefOr[js.Array[DateType]] = js.undefined
    
    var disabledDays: js.UndefOr[js.Array[`0` | `1` | `2` | `3` | `4` | `5` | `6`]] = js.undefined
    
    var display: js.UndefOr[days | years] = js.undefined
    
    var displayOptions: js.UndefOr[HideYearsOnSelect] = js.undefined
    
    var height: js.UndefOr[Double | auto] = js.undefined
    
    var interpolateSelection: js.UndefOr[
        js.Function2[/* date */ js.Date, /* selected */ js.Array[js.Date], js.Array[js.Date]]
      ] = js.undefined
    
    var locale: js.UndefOr[Blank] = js.undefined
    
    var max: js.UndefOr[DateType] = js.undefined
    
    var maxDate: js.UndefOr[DateType] = js.undefined
    
    var min: js.UndefOr[DateType] = js.undefined
    
    var minDate: js.UndefOr[DateType] = js.undefined
    
    var onScroll: js.UndefOr[js.Function1[/* scrollTop */ Double, Unit]] = js.undefined
    
    var onScrollEnd: js.UndefOr[js.Function1[/* scrollTop */ Double, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[DateSelectFunction | RangedSelectFunction] = js.undefined
    
    var rowHeight: js.UndefOr[Double] = js.undefined
    
    var selected: js.UndefOr[DateType | `false` | End | js.Array[DateType]] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var theme: js.UndefOr[AccentColor] = js.undefined
    
    var width: js.UndefOr[Double | auto | `100Percentsign`] = js.undefined
  }
  object ReactInfiniteCalendarProps {
    
    inline def apply(): ReactInfiniteCalendarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactInfiniteCalendarProps]
    }
    
    extension [Self <: ReactInfiniteCalendarProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponent(value: ComponentClassP[ReactInfiniteCalendarProps & js.Object]): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
      
      inline def setDisabledDates(value: js.Array[DateType]): Self = StObject.set(x, "disabledDates", value.asInstanceOf[js.Any])
      
      inline def setDisabledDatesUndefined: Self = StObject.set(x, "disabledDates", js.undefined)
      
      inline def setDisabledDatesVarargs(value: DateType*): Self = StObject.set(x, "disabledDates", js.Array(value*))
      
      inline def setDisabledDays(value: js.Array[`0` | `1` | `2` | `3` | `4` | `5` | `6`]): Self = StObject.set(x, "disabledDays", value.asInstanceOf[js.Any])
      
      inline def setDisabledDaysUndefined: Self = StObject.set(x, "disabledDays", js.undefined)
      
      inline def setDisabledDaysVarargs(value: (`0` | `1` | `2` | `3` | `4` | `5` | `6`)*): Self = StObject.set(x, "disabledDays", js.Array(value*))
      
      inline def setDisplay(value: days | years): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayOptions(value: HideYearsOnSelect): Self = StObject.set(x, "displayOptions", value.asInstanceOf[js.Any])
      
      inline def setDisplayOptionsUndefined: Self = StObject.set(x, "displayOptions", js.undefined)
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setHeight(value: Double | auto): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInterpolateSelection(value: (/* date */ js.Date, /* selected */ js.Array[js.Date]) => js.Array[js.Date]): Self = StObject.set(x, "interpolateSelection", js.Any.fromFunction2(value))
      
      inline def setInterpolateSelectionUndefined: Self = StObject.set(x, "interpolateSelection", js.undefined)
      
      inline def setLocale(value: Blank): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMax(value: DateType): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxDate(value: DateType): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: DateType): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinDate(value: DateType): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setOnScroll(value: /* scrollTop */ Double => Callback): Self = StObject.set(x, "onScroll", js.Any.fromFunction1((t0: /* scrollTop */ Double) => value(t0).runNow()))
      
      inline def setOnScrollEnd(value: /* scrollTop */ Double => Callback): Self = StObject.set(x, "onScrollEnd", js.Any.fromFunction1((t0: /* scrollTop */ Double) => value(t0).runNow()))
      
      inline def setOnScrollEndUndefined: Self = StObject.set(x, "onScrollEnd", js.undefined)
      
      inline def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      inline def setOnSelect(value: (/* date */ js.Date) | (/* rangedDate */ RangedSelection) => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: (/* date */ js.Date) | (/* rangedDate */ RangedSelection)) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      inline def setSelected(value: DateType | `false` | End | js.Array[DateType]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSelectedVarargs(value: DateType*): Self = StObject.set(x, "selected", js.Array(value*))
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTheme(value: AccentColor): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setWidth(value: Double | auto | `100Percentsign`): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
