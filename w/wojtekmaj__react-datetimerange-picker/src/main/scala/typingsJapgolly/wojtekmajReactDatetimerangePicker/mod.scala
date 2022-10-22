package typingsJapgolly.wojtekmajReactDatetimerangePicker

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactCalendar.anon.Date
import typingsJapgolly.reactCalendar.mod.CalendarTileProperties
import typingsJapgolly.reactCalendar.mod.CalendarType
import typingsJapgolly.reactCalendar.mod.ClickWeekNumberCallback
import typingsJapgolly.reactCalendar.mod.DateCallback
import typingsJapgolly.reactCalendar.mod.Detail
import typingsJapgolly.reactCalendar.mod.DrillCallback
import typingsJapgolly.reactCalendar.mod.DrillCallbackProperties
import typingsJapgolly.reactCalendar.mod.FormatterCallback
import typingsJapgolly.reactCalendar.mod.ViewCallback
import typingsJapgolly.reactCalendar.mod.ViewCallbackProperties
import typingsJapgolly.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.end
import typingsJapgolly.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.hour
import typingsJapgolly.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.minute
import typingsJapgolly.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.range
import typingsJapgolly.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.second
import typingsJapgolly.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wojtekmaj/react-datetimerange-picker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: DateTimeRangePickerProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Inlined std.Omit<react-calendar.react-calendar.CalendarProps, 'maxDetail' | 'onChange' | 'value'> */
  trait DateTimeRangePickerCalendarProps extends StObject {
    
    var activeStartDate: js.UndefOr[js.Date] = js.undefined
    
    var allowPartialRange: js.UndefOr[Boolean] = js.undefined
    
    var calendarType: js.UndefOr[CalendarType] = js.undefined
    
    var className: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var closeCalendar: js.UndefOr[Boolean] = js.undefined
    
    var defaultActiveStartDate: js.UndefOr[js.Date] = js.undefined
    
    var defaultValue: js.UndefOr[js.Date | js.Array[js.Date]] = js.undefined
    
    var defaultView: js.UndefOr[Detail] = js.undefined
    
    var formatDay: js.UndefOr[FormatterCallback] = js.undefined
    
    var formatLongDate: js.UndefOr[FormatterCallback] = js.undefined
    
    var formatMonth: js.UndefOr[FormatterCallback] = js.undefined
    
    var formatMonthYear: js.UndefOr[FormatterCallback] = js.undefined
    
    var formatShortWeekday: js.UndefOr[FormatterCallback] = js.undefined
    
    var formatYear: js.UndefOr[FormatterCallback] = js.undefined
    
    var goToRangeStartOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var inputRef: js.UndefOr[
        (js.Function1[/* ref */ HTMLInputElement | Null, Unit]) | RefHandle[HTMLInputElement] | (MutableRefObject[HTMLInputElement | Null])
      ] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var maxDate: js.UndefOr[js.Date] = js.undefined
    
    var minDate: js.UndefOr[js.Date] = js.undefined
    
    var minDetail: js.UndefOr[Detail] = js.undefined
    
    var navigationAriaLabel: js.UndefOr[String] = js.undefined
    
    var navigationLabel: js.UndefOr[js.Function1[/* props */ Date, String | Element | Null]] = js.undefined
    
    var next2AriaLabel: js.UndefOr[String] = js.undefined
    
    var next2Label: js.UndefOr[String | Element | Null] = js.undefined
    
    var nextAriaLabel: js.UndefOr[String] = js.undefined
    
    var nextLabel: js.UndefOr[String | Element | Null] = js.undefined
    
    var onActiveStartDateChange: js.UndefOr[ViewCallback] = js.undefined
    
    var onClickDay: js.UndefOr[DateCallback] = js.undefined
    
    var onClickDecade: js.UndefOr[DateCallback] = js.undefined
    
    var onClickMonth: js.UndefOr[DateCallback] = js.undefined
    
    var onClickWeekNumber: js.UndefOr[ClickWeekNumberCallback] = js.undefined
    
    var onClickYear: js.UndefOr[DateCallback] = js.undefined
    
    var onDrillDown: js.UndefOr[DrillCallback] = js.undefined
    
    var onDrillUp: js.UndefOr[DrillCallback] = js.undefined
    
    var onViewChange: js.UndefOr[ViewCallback] = js.undefined
    
    var prev2AriaLabel: js.UndefOr[String] = js.undefined
    
    var prev2Label: js.UndefOr[String | Element | Null] = js.undefined
    
    var prevAriaLabel: js.UndefOr[String] = js.undefined
    
    var prevLabel: js.UndefOr[String | Element | Null] = js.undefined
    
    var returnValue: js.UndefOr[start | end | range] = js.undefined
    
    var selectRange: js.UndefOr[Boolean] = js.undefined
    
    var showDoubleView: js.UndefOr[Boolean] = js.undefined
    
    var showFixedNumberOfWeeks: js.UndefOr[Boolean] = js.undefined
    
    var showNavigation: js.UndefOr[Boolean] = js.undefined
    
    var showNeighboringMonth: js.UndefOr[Boolean] = js.undefined
    
    var showWeekNumbers: js.UndefOr[Boolean] = js.undefined
    
    var tileClassName: js.UndefOr[
        String | js.Array[String] | (js.Function1[/* props */ CalendarTileProperties, String | js.Array[String] | Null])
      ] = js.undefined
    
    var tileContent: js.UndefOr[
        String | Element | (js.Function1[/* props */ CalendarTileProperties, Element | Null])
      ] = js.undefined
    
    var tileDisabled: js.UndefOr[js.Function1[/* props */ CalendarTileProperties, Boolean]] = js.undefined
    
    var view: js.UndefOr[Detail] = js.undefined
  }
  object DateTimeRangePickerCalendarProps {
    
    inline def apply(): DateTimeRangePickerCalendarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTimeRangePickerCalendarProps]
    }
    
    extension [Self <: DateTimeRangePickerCalendarProps](x: Self) {
      
      inline def setActiveStartDate(value: js.Date): Self = StObject.set(x, "activeStartDate", value.asInstanceOf[js.Any])
      
      inline def setActiveStartDateUndefined: Self = StObject.set(x, "activeStartDate", js.undefined)
      
      inline def setAllowPartialRange(value: Boolean): Self = StObject.set(x, "allowPartialRange", value.asInstanceOf[js.Any])
      
      inline def setAllowPartialRangeUndefined: Self = StObject.set(x, "allowPartialRange", js.undefined)
      
      inline def setCalendarType(value: CalendarType): Self = StObject.set(x, "calendarType", value.asInstanceOf[js.Any])
      
      inline def setCalendarTypeUndefined: Self = StObject.set(x, "calendarType", js.undefined)
      
      inline def setClassName(value: String | js.Array[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassNameVarargs(value: String*): Self = StObject.set(x, "className", js.Array(value*))
      
      inline def setCloseCalendar(value: Boolean): Self = StObject.set(x, "closeCalendar", value.asInstanceOf[js.Any])
      
      inline def setCloseCalendarUndefined: Self = StObject.set(x, "closeCalendar", js.undefined)
      
      inline def setDefaultActiveStartDate(value: js.Date): Self = StObject.set(x, "defaultActiveStartDate", value.asInstanceOf[js.Any])
      
      inline def setDefaultActiveStartDateUndefined: Self = StObject.set(x, "defaultActiveStartDate", js.undefined)
      
      inline def setDefaultValue(value: js.Date | js.Array[js.Date]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: js.Date*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setDefaultView(value: Detail): Self = StObject.set(x, "defaultView", value.asInstanceOf[js.Any])
      
      inline def setDefaultViewUndefined: Self = StObject.set(x, "defaultView", js.undefined)
      
      inline def setFormatDay(value: (/* locale */ String, /* date */ js.Date) => String): Self = StObject.set(x, "formatDay", js.Any.fromFunction2(value))
      
      inline def setFormatDayUndefined: Self = StObject.set(x, "formatDay", js.undefined)
      
      inline def setFormatLongDate(value: (/* locale */ String, /* date */ js.Date) => String): Self = StObject.set(x, "formatLongDate", js.Any.fromFunction2(value))
      
      inline def setFormatLongDateUndefined: Self = StObject.set(x, "formatLongDate", js.undefined)
      
      inline def setFormatMonth(value: (/* locale */ String, /* date */ js.Date) => String): Self = StObject.set(x, "formatMonth", js.Any.fromFunction2(value))
      
      inline def setFormatMonthUndefined: Self = StObject.set(x, "formatMonth", js.undefined)
      
      inline def setFormatMonthYear(value: (/* locale */ String, /* date */ js.Date) => String): Self = StObject.set(x, "formatMonthYear", js.Any.fromFunction2(value))
      
      inline def setFormatMonthYearUndefined: Self = StObject.set(x, "formatMonthYear", js.undefined)
      
      inline def setFormatShortWeekday(value: (/* locale */ String, /* date */ js.Date) => String): Self = StObject.set(x, "formatShortWeekday", js.Any.fromFunction2(value))
      
      inline def setFormatShortWeekdayUndefined: Self = StObject.set(x, "formatShortWeekday", js.undefined)
      
      inline def setFormatYear(value: (/* locale */ String, /* date */ js.Date) => String): Self = StObject.set(x, "formatYear", js.Any.fromFunction2(value))
      
      inline def setFormatYearUndefined: Self = StObject.set(x, "formatYear", js.undefined)
      
      inline def setGoToRangeStartOnSelect(value: Boolean): Self = StObject.set(x, "goToRangeStartOnSelect", value.asInstanceOf[js.Any])
      
      inline def setGoToRangeStartOnSelectUndefined: Self = StObject.set(x, "goToRangeStartOnSelect", js.undefined)
      
      inline def setInputRef(
        value: (js.Function1[/* ref */ HTMLInputElement | Null, Unit]) | RefHandle[HTMLInputElement] | (MutableRefObject[HTMLInputElement | Null])
      ): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
      
      inline def setInputRefFunction1(value: /* ref */ HTMLInputElement | Null => Callback): Self = StObject.set(x, "inputRef", js.Any.fromFunction1((t0: /* ref */ HTMLInputElement | Null) => value(t0).runNow()))
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMaxDate(value: js.Date): Self = StObject.set(x, "maxDate", value.asInstanceOf[js.Any])
      
      inline def setMaxDateUndefined: Self = StObject.set(x, "maxDate", js.undefined)
      
      inline def setMinDate(value: js.Date): Self = StObject.set(x, "minDate", value.asInstanceOf[js.Any])
      
      inline def setMinDateUndefined: Self = StObject.set(x, "minDate", js.undefined)
      
      inline def setMinDetail(value: Detail): Self = StObject.set(x, "minDetail", value.asInstanceOf[js.Any])
      
      inline def setMinDetailUndefined: Self = StObject.set(x, "minDetail", js.undefined)
      
      inline def setNavigationAriaLabel(value: String): Self = StObject.set(x, "navigationAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNavigationAriaLabelUndefined: Self = StObject.set(x, "navigationAriaLabel", js.undefined)
      
      inline def setNavigationLabel(value: /* props */ Date => String | Element | Null): Self = StObject.set(x, "navigationLabel", js.Any.fromFunction1(value))
      
      inline def setNavigationLabelUndefined: Self = StObject.set(x, "navigationLabel", js.undefined)
      
      inline def setNext2AriaLabel(value: String): Self = StObject.set(x, "next2AriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNext2AriaLabelUndefined: Self = StObject.set(x, "next2AriaLabel", js.undefined)
      
      inline def setNext2Label(value: String | Element): Self = StObject.set(x, "next2Label", value.asInstanceOf[js.Any])
      
      inline def setNext2LabelNull: Self = StObject.set(x, "next2Label", null)
      
      inline def setNext2LabelUndefined: Self = StObject.set(x, "next2Label", js.undefined)
      
      inline def setNext2LabelVdomElement(value: VdomElement): Self = StObject.set(x, "next2Label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setNextAriaLabel(value: String): Self = StObject.set(x, "nextAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNextAriaLabelUndefined: Self = StObject.set(x, "nextAriaLabel", js.undefined)
      
      inline def setNextLabel(value: String | Element): Self = StObject.set(x, "nextLabel", value.asInstanceOf[js.Any])
      
      inline def setNextLabelNull: Self = StObject.set(x, "nextLabel", null)
      
      inline def setNextLabelUndefined: Self = StObject.set(x, "nextLabel", js.undefined)
      
      inline def setNextLabelVdomElement(value: VdomElement): Self = StObject.set(x, "nextLabel", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnActiveStartDateChange(value: /* props */ ViewCallbackProperties => Callback): Self = StObject.set(x, "onActiveStartDateChange", js.Any.fromFunction1((t0: /* props */ ViewCallbackProperties) => value(t0).runNow()))
      
      inline def setOnActiveStartDateChangeUndefined: Self = StObject.set(x, "onActiveStartDateChange", js.undefined)
      
      inline def setOnClickDay(value: (/* value */ js.Date, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback): Self = StObject.set(x, "onClickDay", js.Any.fromFunction2((t0: /* value */ js.Date, t1: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnClickDayUndefined: Self = StObject.set(x, "onClickDay", js.undefined)
      
      inline def setOnClickDecade(value: (/* value */ js.Date, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback): Self = StObject.set(x, "onClickDecade", js.Any.fromFunction2((t0: /* value */ js.Date, t1: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnClickDecadeUndefined: Self = StObject.set(x, "onClickDecade", js.undefined)
      
      inline def setOnClickMonth(value: (/* value */ js.Date, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback): Self = StObject.set(x, "onClickMonth", js.Any.fromFunction2((t0: /* value */ js.Date, t1: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnClickMonthUndefined: Self = StObject.set(x, "onClickMonth", js.undefined)
      
      inline def setOnClickWeekNumber(
        value: (/* weekNumber */ Double, /* date */ js.Date, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback
      ): Self = StObject.set(x, "onClickWeekNumber", js.Any.fromFunction3((t0: /* weekNumber */ Double, t1: /* date */ js.Date, t2: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1, t2)).runNow()))
      
      inline def setOnClickWeekNumberUndefined: Self = StObject.set(x, "onClickWeekNumber", js.undefined)
      
      inline def setOnClickYear(value: (/* value */ js.Date, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback): Self = StObject.set(x, "onClickYear", js.Any.fromFunction2((t0: /* value */ js.Date, t1: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
      
      inline def setOnClickYearUndefined: Self = StObject.set(x, "onClickYear", js.undefined)
      
      inline def setOnDrillDown(value: /* props */ DrillCallbackProperties => Callback): Self = StObject.set(x, "onDrillDown", js.Any.fromFunction1((t0: /* props */ DrillCallbackProperties) => value(t0).runNow()))
      
      inline def setOnDrillDownUndefined: Self = StObject.set(x, "onDrillDown", js.undefined)
      
      inline def setOnDrillUp(value: /* props */ DrillCallbackProperties => Callback): Self = StObject.set(x, "onDrillUp", js.Any.fromFunction1((t0: /* props */ DrillCallbackProperties) => value(t0).runNow()))
      
      inline def setOnDrillUpUndefined: Self = StObject.set(x, "onDrillUp", js.undefined)
      
      inline def setOnViewChange(value: /* props */ ViewCallbackProperties => Callback): Self = StObject.set(x, "onViewChange", js.Any.fromFunction1((t0: /* props */ ViewCallbackProperties) => value(t0).runNow()))
      
      inline def setOnViewChangeUndefined: Self = StObject.set(x, "onViewChange", js.undefined)
      
      inline def setPrev2AriaLabel(value: String): Self = StObject.set(x, "prev2AriaLabel", value.asInstanceOf[js.Any])
      
      inline def setPrev2AriaLabelUndefined: Self = StObject.set(x, "prev2AriaLabel", js.undefined)
      
      inline def setPrev2Label(value: String | Element): Self = StObject.set(x, "prev2Label", value.asInstanceOf[js.Any])
      
      inline def setPrev2LabelNull: Self = StObject.set(x, "prev2Label", null)
      
      inline def setPrev2LabelUndefined: Self = StObject.set(x, "prev2Label", js.undefined)
      
      inline def setPrev2LabelVdomElement(value: VdomElement): Self = StObject.set(x, "prev2Label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setPrevAriaLabel(value: String): Self = StObject.set(x, "prevAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setPrevAriaLabelUndefined: Self = StObject.set(x, "prevAriaLabel", js.undefined)
      
      inline def setPrevLabel(value: String | Element): Self = StObject.set(x, "prevLabel", value.asInstanceOf[js.Any])
      
      inline def setPrevLabelNull: Self = StObject.set(x, "prevLabel", null)
      
      inline def setPrevLabelUndefined: Self = StObject.set(x, "prevLabel", js.undefined)
      
      inline def setPrevLabelVdomElement(value: VdomElement): Self = StObject.set(x, "prevLabel", value.rawElement.asInstanceOf[js.Any])
      
      inline def setReturnValue(value: start | end | range): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      inline def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
      
      inline def setSelectRange(value: Boolean): Self = StObject.set(x, "selectRange", value.asInstanceOf[js.Any])
      
      inline def setSelectRangeUndefined: Self = StObject.set(x, "selectRange", js.undefined)
      
      inline def setShowDoubleView(value: Boolean): Self = StObject.set(x, "showDoubleView", value.asInstanceOf[js.Any])
      
      inline def setShowDoubleViewUndefined: Self = StObject.set(x, "showDoubleView", js.undefined)
      
      inline def setShowFixedNumberOfWeeks(value: Boolean): Self = StObject.set(x, "showFixedNumberOfWeeks", value.asInstanceOf[js.Any])
      
      inline def setShowFixedNumberOfWeeksUndefined: Self = StObject.set(x, "showFixedNumberOfWeeks", js.undefined)
      
      inline def setShowNavigation(value: Boolean): Self = StObject.set(x, "showNavigation", value.asInstanceOf[js.Any])
      
      inline def setShowNavigationUndefined: Self = StObject.set(x, "showNavigation", js.undefined)
      
      inline def setShowNeighboringMonth(value: Boolean): Self = StObject.set(x, "showNeighboringMonth", value.asInstanceOf[js.Any])
      
      inline def setShowNeighboringMonthUndefined: Self = StObject.set(x, "showNeighboringMonth", js.undefined)
      
      inline def setShowWeekNumbers(value: Boolean): Self = StObject.set(x, "showWeekNumbers", value.asInstanceOf[js.Any])
      
      inline def setShowWeekNumbersUndefined: Self = StObject.set(x, "showWeekNumbers", js.undefined)
      
      inline def setTileClassName(
        value: String | js.Array[String] | (js.Function1[/* props */ CalendarTileProperties, String | js.Array[String] | Null])
      ): Self = StObject.set(x, "tileClassName", value.asInstanceOf[js.Any])
      
      inline def setTileClassNameFunction1(value: /* props */ CalendarTileProperties => String | js.Array[String] | Null): Self = StObject.set(x, "tileClassName", js.Any.fromFunction1(value))
      
      inline def setTileClassNameUndefined: Self = StObject.set(x, "tileClassName", js.undefined)
      
      inline def setTileClassNameVarargs(value: String*): Self = StObject.set(x, "tileClassName", js.Array(value*))
      
      inline def setTileContent(value: String | Element | (js.Function1[/* props */ CalendarTileProperties, Element | Null])): Self = StObject.set(x, "tileContent", value.asInstanceOf[js.Any])
      
      inline def setTileContentFunction1(value: /* props */ CalendarTileProperties => Element | Null): Self = StObject.set(x, "tileContent", js.Any.fromFunction1(value))
      
      inline def setTileContentUndefined: Self = StObject.set(x, "tileContent", js.undefined)
      
      inline def setTileContentVdomElement(value: VdomElement): Self = StObject.set(x, "tileContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTileDisabled(value: /* props */ CalendarTileProperties => Boolean): Self = StObject.set(x, "tileDisabled", js.Any.fromFunction1(value))
      
      inline def setTileDisabledUndefined: Self = StObject.set(x, "tileDisabled", js.undefined)
      
      inline def setView(value: Detail): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  trait DateTimeRangePickerProps
    extends StObject
       with DateTimeRangePickerCalendarProps {
    
    var amPmAriaLabel: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var calendarAriaLabel: js.UndefOr[String] = js.undefined
    
    var calendarClassName: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var calendarIcon: js.UndefOr[String | Element] = js.undefined
    
    var clearAriaLabel: js.UndefOr[String] = js.undefined
    
    var clearIcon: js.UndefOr[String | Element] = js.undefined
    
    var clockClassName: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var closeWidgets: js.UndefOr[Boolean] = js.undefined
    
    var dayAriaLabel: js.UndefOr[String] = js.undefined
    
    var dayPlaceholder: js.UndefOr[String] = js.undefined
    
    var disableCalendar: js.UndefOr[Boolean] = js.undefined
    
    var disableClock: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var hourAriaLabel: js.UndefOr[String] = js.undefined
    
    var hourPlaceholder: js.UndefOr[String] = js.undefined
    
    var isCalendarOpen: js.UndefOr[Boolean] = js.undefined
    
    var isClockOpen: js.UndefOr[Boolean] = js.undefined
    
    var maxDetail: js.UndefOr[hour | minute | second] = js.undefined
    
    var minuteAriaLabel: js.UndefOr[String] = js.undefined
    
    var minutePlaceholder: js.UndefOr[String] = js.undefined
    
    var monthAriaLabel: js.UndefOr[String] = js.undefined
    
    var monthPlaceholder: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var nativeInputAriaLabel: js.UndefOr[String] = js.undefined
    
    var onCalendarClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onCalendarOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function1[/* val */ (js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]) | Null, Unit]
      ] = js.undefined
    
    var onClockClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onClockOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var rangeDivider: js.UndefOr[String | Element] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var secondAriaLabel: js.UndefOr[String] = js.undefined
    
    var secondPlaceholder: js.UndefOr[String] = js.undefined
    
    var showLeadingZeros: js.UndefOr[Boolean] = js.undefined
    
    var value: js.UndefOr[js.Date | (js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]) | Null] = js.undefined
    
    var yearAriaLabel: js.UndefOr[String] = js.undefined
    
    var yearPlaceholder: js.UndefOr[String] = js.undefined
  }
  object DateTimeRangePickerProps {
    
    inline def apply(): DateTimeRangePickerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateTimeRangePickerProps]
    }
    
    extension [Self <: DateTimeRangePickerProps](x: Self) {
      
      inline def setAmPmAriaLabel(value: String): Self = StObject.set(x, "amPmAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setAmPmAriaLabelUndefined: Self = StObject.set(x, "amPmAriaLabel", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setCalendarAriaLabel(value: String): Self = StObject.set(x, "calendarAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setCalendarAriaLabelUndefined: Self = StObject.set(x, "calendarAriaLabel", js.undefined)
      
      inline def setCalendarClassName(value: String | js.Array[String]): Self = StObject.set(x, "calendarClassName", value.asInstanceOf[js.Any])
      
      inline def setCalendarClassNameUndefined: Self = StObject.set(x, "calendarClassName", js.undefined)
      
      inline def setCalendarClassNameVarargs(value: String*): Self = StObject.set(x, "calendarClassName", js.Array(value*))
      
      inline def setCalendarIcon(value: String | Element): Self = StObject.set(x, "calendarIcon", value.asInstanceOf[js.Any])
      
      inline def setCalendarIconUndefined: Self = StObject.set(x, "calendarIcon", js.undefined)
      
      inline def setCalendarIconVdomElement(value: VdomElement): Self = StObject.set(x, "calendarIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClearAriaLabel(value: String): Self = StObject.set(x, "clearAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setClearAriaLabelUndefined: Self = StObject.set(x, "clearAriaLabel", js.undefined)
      
      inline def setClearIcon(value: String | Element): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
      
      inline def setClearIconUndefined: Self = StObject.set(x, "clearIcon", js.undefined)
      
      inline def setClearIconVdomElement(value: VdomElement): Self = StObject.set(x, "clearIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClockClassName(value: String | js.Array[String]): Self = StObject.set(x, "clockClassName", value.asInstanceOf[js.Any])
      
      inline def setClockClassNameUndefined: Self = StObject.set(x, "clockClassName", js.undefined)
      
      inline def setClockClassNameVarargs(value: String*): Self = StObject.set(x, "clockClassName", js.Array(value*))
      
      inline def setCloseWidgets(value: Boolean): Self = StObject.set(x, "closeWidgets", value.asInstanceOf[js.Any])
      
      inline def setCloseWidgetsUndefined: Self = StObject.set(x, "closeWidgets", js.undefined)
      
      inline def setDayAriaLabel(value: String): Self = StObject.set(x, "dayAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setDayAriaLabelUndefined: Self = StObject.set(x, "dayAriaLabel", js.undefined)
      
      inline def setDayPlaceholder(value: String): Self = StObject.set(x, "dayPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setDayPlaceholderUndefined: Self = StObject.set(x, "dayPlaceholder", js.undefined)
      
      inline def setDisableCalendar(value: Boolean): Self = StObject.set(x, "disableCalendar", value.asInstanceOf[js.Any])
      
      inline def setDisableCalendarUndefined: Self = StObject.set(x, "disableCalendar", js.undefined)
      
      inline def setDisableClock(value: Boolean): Self = StObject.set(x, "disableClock", value.asInstanceOf[js.Any])
      
      inline def setDisableClockUndefined: Self = StObject.set(x, "disableClock", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHourAriaLabel(value: String): Self = StObject.set(x, "hourAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setHourAriaLabelUndefined: Self = StObject.set(x, "hourAriaLabel", js.undefined)
      
      inline def setHourPlaceholder(value: String): Self = StObject.set(x, "hourPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setHourPlaceholderUndefined: Self = StObject.set(x, "hourPlaceholder", js.undefined)
      
      inline def setIsCalendarOpen(value: Boolean): Self = StObject.set(x, "isCalendarOpen", value.asInstanceOf[js.Any])
      
      inline def setIsCalendarOpenUndefined: Self = StObject.set(x, "isCalendarOpen", js.undefined)
      
      inline def setIsClockOpen(value: Boolean): Self = StObject.set(x, "isClockOpen", value.asInstanceOf[js.Any])
      
      inline def setIsClockOpenUndefined: Self = StObject.set(x, "isClockOpen", js.undefined)
      
      inline def setMaxDetail(value: hour | minute | second): Self = StObject.set(x, "maxDetail", value.asInstanceOf[js.Any])
      
      inline def setMaxDetailUndefined: Self = StObject.set(x, "maxDetail", js.undefined)
      
      inline def setMinuteAriaLabel(value: String): Self = StObject.set(x, "minuteAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMinuteAriaLabelUndefined: Self = StObject.set(x, "minuteAriaLabel", js.undefined)
      
      inline def setMinutePlaceholder(value: String): Self = StObject.set(x, "minutePlaceholder", value.asInstanceOf[js.Any])
      
      inline def setMinutePlaceholderUndefined: Self = StObject.set(x, "minutePlaceholder", js.undefined)
      
      inline def setMonthAriaLabel(value: String): Self = StObject.set(x, "monthAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setMonthAriaLabelUndefined: Self = StObject.set(x, "monthAriaLabel", js.undefined)
      
      inline def setMonthPlaceholder(value: String): Self = StObject.set(x, "monthPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setMonthPlaceholderUndefined: Self = StObject.set(x, "monthPlaceholder", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNativeInputAriaLabel(value: String): Self = StObject.set(x, "nativeInputAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setNativeInputAriaLabelUndefined: Self = StObject.set(x, "nativeInputAriaLabel", js.undefined)
      
      inline def setOnCalendarClose(value: Callback): Self = StObject.set(x, "onCalendarClose", value.toJsFn)
      
      inline def setOnCalendarCloseUndefined: Self = StObject.set(x, "onCalendarClose", js.undefined)
      
      inline def setOnCalendarOpen(value: Callback): Self = StObject.set(x, "onCalendarOpen", value.toJsFn)
      
      inline def setOnCalendarOpenUndefined: Self = StObject.set(x, "onCalendarOpen", js.undefined)
      
      inline def setOnChange(value: /* val */ (js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]) | Null => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* val */ (js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]) | Null) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClockClose(value: Callback): Self = StObject.set(x, "onClockClose", value.toJsFn)
      
      inline def setOnClockCloseUndefined: Self = StObject.set(x, "onClockClose", js.undefined)
      
      inline def setOnClockOpen(value: Callback): Self = StObject.set(x, "onClockOpen", value.toJsFn)
      
      inline def setOnClockOpenUndefined: Self = StObject.set(x, "onClockOpen", js.undefined)
      
      inline def setOnFocus(value: Callback): Self = StObject.set(x, "onFocus", value.toJsFn)
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setRangeDivider(value: String | Element): Self = StObject.set(x, "rangeDivider", value.asInstanceOf[js.Any])
      
      inline def setRangeDividerUndefined: Self = StObject.set(x, "rangeDivider", js.undefined)
      
      inline def setRangeDividerVdomElement(value: VdomElement): Self = StObject.set(x, "rangeDivider", value.rawElement.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSecondAriaLabel(value: String): Self = StObject.set(x, "secondAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setSecondAriaLabelUndefined: Self = StObject.set(x, "secondAriaLabel", js.undefined)
      
      inline def setSecondPlaceholder(value: String): Self = StObject.set(x, "secondPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setSecondPlaceholderUndefined: Self = StObject.set(x, "secondPlaceholder", js.undefined)
      
      inline def setShowLeadingZeros(value: Boolean): Self = StObject.set(x, "showLeadingZeros", value.asInstanceOf[js.Any])
      
      inline def setShowLeadingZerosUndefined: Self = StObject.set(x, "showLeadingZeros", js.undefined)
      
      inline def setValue(value: js.Date | (js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]])): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setYearAriaLabel(value: String): Self = StObject.set(x, "yearAriaLabel", value.asInstanceOf[js.Any])
      
      inline def setYearAriaLabelUndefined: Self = StObject.set(x, "yearAriaLabel", js.undefined)
      
      inline def setYearPlaceholder(value: String): Self = StObject.set(x, "yearPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setYearPlaceholderUndefined: Self = StObject.set(x, "yearPlaceholder", js.undefined)
    }
  }
}
