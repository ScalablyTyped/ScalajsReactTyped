package typingsJapgolly.wojtekmajReactDatetimerangePicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.MutableRefObject
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactCalendar.anon.Date
import typingsJapgolly.reactCalendar.mod.CalendarTileProperties
import typingsJapgolly.reactCalendar.mod.CalendarType
import typingsJapgolly.reactCalendar.mod.Detail
import typingsJapgolly.reactCalendar.mod.DrillCallbackProperties
import typingsJapgolly.reactCalendar.mod.ViewCallbackProperties
import typingsJapgolly.wojtekmajReactDatetimerangePicker.mod.DateTimeRangePickerProps
import typingsJapgolly.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.end
import typingsJapgolly.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.hour
import typingsJapgolly.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.minute
import typingsJapgolly.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.range
import typingsJapgolly.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.second
import typingsJapgolly.wojtekmajReactDatetimerangePicker.wojtekmajReactDatetimerangePickerStrings.start
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactDatetimerangePicker {
  
  @JSImport("@wojtekmaj/react-datetimerange-picker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def activeStartDate(value: js.Date): this.type = set("activeStartDate", value.asInstanceOf[js.Any])
    
    inline def allowPartialRange(value: Boolean): this.type = set("allowPartialRange", value.asInstanceOf[js.Any])
    
    inline def amPmAriaLabel(value: String): this.type = set("amPmAriaLabel", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def calendarAriaLabel(value: String): this.type = set("calendarAriaLabel", value.asInstanceOf[js.Any])
    
    inline def calendarClassName(value: String | js.Array[String]): this.type = set("calendarClassName", value.asInstanceOf[js.Any])
    
    inline def calendarClassNameVarargs(value: String*): this.type = set("calendarClassName", js.Array(value*))
    
    inline def calendarIcon(value: String | Element): this.type = set("calendarIcon", value.asInstanceOf[js.Any])
    
    inline def calendarIconVdomElement(value: VdomElement): this.type = set("calendarIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def calendarType(value: CalendarType): this.type = set("calendarType", value.asInstanceOf[js.Any])
    
    inline def className(value: String | js.Array[String]): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classNameVarargs(value: String*): this.type = set("className", js.Array(value*))
    
    inline def clearAriaLabel(value: String): this.type = set("clearAriaLabel", value.asInstanceOf[js.Any])
    
    inline def clearIcon(value: String | Element): this.type = set("clearIcon", value.asInstanceOf[js.Any])
    
    inline def clearIconVdomElement(value: VdomElement): this.type = set("clearIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def clockClassName(value: String | js.Array[String]): this.type = set("clockClassName", value.asInstanceOf[js.Any])
    
    inline def clockClassNameVarargs(value: String*): this.type = set("clockClassName", js.Array(value*))
    
    inline def closeCalendar(value: Boolean): this.type = set("closeCalendar", value.asInstanceOf[js.Any])
    
    inline def closeWidgets(value: Boolean): this.type = set("closeWidgets", value.asInstanceOf[js.Any])
    
    inline def dayAriaLabel(value: String): this.type = set("dayAriaLabel", value.asInstanceOf[js.Any])
    
    inline def dayPlaceholder(value: String): this.type = set("dayPlaceholder", value.asInstanceOf[js.Any])
    
    inline def defaultActiveStartDate(value: js.Date): this.type = set("defaultActiveStartDate", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: js.Date | js.Array[js.Date]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueVarargs(value: js.Date*): this.type = set("defaultValue", js.Array(value*))
    
    inline def defaultView(value: Detail): this.type = set("defaultView", value.asInstanceOf[js.Any])
    
    inline def disableCalendar(value: Boolean): this.type = set("disableCalendar", value.asInstanceOf[js.Any])
    
    inline def disableClock(value: Boolean): this.type = set("disableClock", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
    
    inline def formatDay(value: (/* locale */ String, /* date */ js.Date) => String): this.type = set("formatDay", js.Any.fromFunction2(value))
    
    inline def formatLongDate(value: (/* locale */ String, /* date */ js.Date) => String): this.type = set("formatLongDate", js.Any.fromFunction2(value))
    
    inline def formatMonth(value: (/* locale */ String, /* date */ js.Date) => String): this.type = set("formatMonth", js.Any.fromFunction2(value))
    
    inline def formatMonthYear(value: (/* locale */ String, /* date */ js.Date) => String): this.type = set("formatMonthYear", js.Any.fromFunction2(value))
    
    inline def formatShortWeekday(value: (/* locale */ String, /* date */ js.Date) => String): this.type = set("formatShortWeekday", js.Any.fromFunction2(value))
    
    inline def formatYear(value: (/* locale */ String, /* date */ js.Date) => String): this.type = set("formatYear", js.Any.fromFunction2(value))
    
    inline def goToRangeStartOnSelect(value: Boolean): this.type = set("goToRangeStartOnSelect", value.asInstanceOf[js.Any])
    
    inline def hourAriaLabel(value: String): this.type = set("hourAriaLabel", value.asInstanceOf[js.Any])
    
    inline def hourPlaceholder(value: String): this.type = set("hourPlaceholder", value.asInstanceOf[js.Any])
    
    inline def inputRef(
      value: (js.Function1[/* ref */ HTMLInputElement | Null, Unit]) | RefHandle[HTMLInputElement] | (MutableRefObject[HTMLInputElement | Null])
    ): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    inline def inputRefFunction1(value: /* ref */ HTMLInputElement | Null => Callback): this.type = set("inputRef", js.Any.fromFunction1((t0: /* ref */ HTMLInputElement | Null) => value(t0).runNow()))
    
    inline def isCalendarOpen(value: Boolean): this.type = set("isCalendarOpen", value.asInstanceOf[js.Any])
    
    inline def isClockOpen(value: Boolean): this.type = set("isClockOpen", value.asInstanceOf[js.Any])
    
    inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def maxDetail(value: hour | minute | second): this.type = set("maxDetail", value.asInstanceOf[js.Any])
    
    inline def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def minDetail(value: Detail): this.type = set("minDetail", value.asInstanceOf[js.Any])
    
    inline def minuteAriaLabel(value: String): this.type = set("minuteAriaLabel", value.asInstanceOf[js.Any])
    
    inline def minutePlaceholder(value: String): this.type = set("minutePlaceholder", value.asInstanceOf[js.Any])
    
    inline def monthAriaLabel(value: String): this.type = set("monthAriaLabel", value.asInstanceOf[js.Any])
    
    inline def monthPlaceholder(value: String): this.type = set("monthPlaceholder", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def nativeInputAriaLabel(value: String): this.type = set("nativeInputAriaLabel", value.asInstanceOf[js.Any])
    
    inline def navigationAriaLabel(value: String): this.type = set("navigationAriaLabel", value.asInstanceOf[js.Any])
    
    inline def navigationLabel(value: /* props */ Date => String | Element | Null): this.type = set("navigationLabel", js.Any.fromFunction1(value))
    
    inline def next2AriaLabel(value: String): this.type = set("next2AriaLabel", value.asInstanceOf[js.Any])
    
    inline def next2Label(value: String | Element): this.type = set("next2Label", value.asInstanceOf[js.Any])
    
    inline def next2LabelNull: this.type = set("next2Label", null)
    
    inline def next2LabelVdomElement(value: VdomElement): this.type = set("next2Label", value.rawElement.asInstanceOf[js.Any])
    
    inline def nextAriaLabel(value: String): this.type = set("nextAriaLabel", value.asInstanceOf[js.Any])
    
    inline def nextLabel(value: String | Element): this.type = set("nextLabel", value.asInstanceOf[js.Any])
    
    inline def nextLabelNull: this.type = set("nextLabel", null)
    
    inline def nextLabelVdomElement(value: VdomElement): this.type = set("nextLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def onActiveStartDateChange(value: /* props */ ViewCallbackProperties => Callback): this.type = set("onActiveStartDateChange", js.Any.fromFunction1((t0: /* props */ ViewCallbackProperties) => value(t0).runNow()))
    
    inline def onCalendarClose(value: Callback): this.type = set("onCalendarClose", value.toJsFn)
    
    inline def onCalendarOpen(value: Callback): this.type = set("onCalendarOpen", value.toJsFn)
    
    inline def onChange(value: /* val */ (js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]) | Null => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* val */ (js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]]) | Null) => value(t0).runNow()))
    
    inline def onClickDay(value: (/* value */ js.Date, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback): this.type = set("onClickDay", js.Any.fromFunction2((t0: /* value */ js.Date, t1: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
    
    inline def onClickDecade(value: (/* value */ js.Date, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback): this.type = set("onClickDecade", js.Any.fromFunction2((t0: /* value */ js.Date, t1: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
    
    inline def onClickMonth(value: (/* value */ js.Date, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback): this.type = set("onClickMonth", js.Any.fromFunction2((t0: /* value */ js.Date, t1: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
    
    inline def onClickWeekNumber(
      value: (/* weekNumber */ Double, /* date */ js.Date, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback
    ): this.type = set("onClickWeekNumber", js.Any.fromFunction3((t0: /* weekNumber */ Double, t1: /* date */ js.Date, t2: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1, t2)).runNow()))
    
    inline def onClickYear(value: (/* value */ js.Date, /* event */ ReactMouseEventFrom[HTMLButtonElement]) => Callback): this.type = set("onClickYear", js.Any.fromFunction2((t0: /* value */ js.Date, t1: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => (value(t0, t1)).runNow()))
    
    inline def onClockClose(value: Callback): this.type = set("onClockClose", value.toJsFn)
    
    inline def onClockOpen(value: Callback): this.type = set("onClockOpen", value.toJsFn)
    
    inline def onDrillDown(value: /* props */ DrillCallbackProperties => Callback): this.type = set("onDrillDown", js.Any.fromFunction1((t0: /* props */ DrillCallbackProperties) => value(t0).runNow()))
    
    inline def onDrillUp(value: /* props */ DrillCallbackProperties => Callback): this.type = set("onDrillUp", js.Any.fromFunction1((t0: /* props */ DrillCallbackProperties) => value(t0).runNow()))
    
    inline def onFocus(value: Callback): this.type = set("onFocus", value.toJsFn)
    
    inline def onViewChange(value: /* props */ ViewCallbackProperties => Callback): this.type = set("onViewChange", js.Any.fromFunction1((t0: /* props */ ViewCallbackProperties) => value(t0).runNow()))
    
    inline def prev2AriaLabel(value: String): this.type = set("prev2AriaLabel", value.asInstanceOf[js.Any])
    
    inline def prev2Label(value: String | Element): this.type = set("prev2Label", value.asInstanceOf[js.Any])
    
    inline def prev2LabelNull: this.type = set("prev2Label", null)
    
    inline def prev2LabelVdomElement(value: VdomElement): this.type = set("prev2Label", value.rawElement.asInstanceOf[js.Any])
    
    inline def prevAriaLabel(value: String): this.type = set("prevAriaLabel", value.asInstanceOf[js.Any])
    
    inline def prevLabel(value: String | Element): this.type = set("prevLabel", value.asInstanceOf[js.Any])
    
    inline def prevLabelNull: this.type = set("prevLabel", null)
    
    inline def prevLabelVdomElement(value: VdomElement): this.type = set("prevLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def rangeDivider(value: String | Element): this.type = set("rangeDivider", value.asInstanceOf[js.Any])
    
    inline def rangeDividerVdomElement(value: VdomElement): this.type = set("rangeDivider", value.rawElement.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def returnValue(value: start | end | range): this.type = set("returnValue", value.asInstanceOf[js.Any])
    
    inline def secondAriaLabel(value: String): this.type = set("secondAriaLabel", value.asInstanceOf[js.Any])
    
    inline def secondPlaceholder(value: String): this.type = set("secondPlaceholder", value.asInstanceOf[js.Any])
    
    inline def selectRange(value: Boolean): this.type = set("selectRange", value.asInstanceOf[js.Any])
    
    inline def showDoubleView(value: Boolean): this.type = set("showDoubleView", value.asInstanceOf[js.Any])
    
    inline def showFixedNumberOfWeeks(value: Boolean): this.type = set("showFixedNumberOfWeeks", value.asInstanceOf[js.Any])
    
    inline def showLeadingZeros(value: Boolean): this.type = set("showLeadingZeros", value.asInstanceOf[js.Any])
    
    inline def showNavigation(value: Boolean): this.type = set("showNavigation", value.asInstanceOf[js.Any])
    
    inline def showNeighboringMonth(value: Boolean): this.type = set("showNeighboringMonth", value.asInstanceOf[js.Any])
    
    inline def showWeekNumbers(value: Boolean): this.type = set("showWeekNumbers", value.asInstanceOf[js.Any])
    
    inline def tileClassName(
      value: String | js.Array[String] | (js.Function1[/* props */ CalendarTileProperties, String | js.Array[String] | Null])
    ): this.type = set("tileClassName", value.asInstanceOf[js.Any])
    
    inline def tileClassNameFunction1(value: /* props */ CalendarTileProperties => String | js.Array[String] | Null): this.type = set("tileClassName", js.Any.fromFunction1(value))
    
    inline def tileClassNameVarargs(value: String*): this.type = set("tileClassName", js.Array(value*))
    
    inline def tileContent(value: String | Element | (js.Function1[/* props */ CalendarTileProperties, Element | Null])): this.type = set("tileContent", value.asInstanceOf[js.Any])
    
    inline def tileContentFunction1(value: /* props */ CalendarTileProperties => Element | Null): this.type = set("tileContent", js.Any.fromFunction1(value))
    
    inline def tileContentVdomElement(value: VdomElement): this.type = set("tileContent", value.rawElement.asInstanceOf[js.Any])
    
    inline def tileDisabled(value: /* props */ CalendarTileProperties => Boolean): this.type = set("tileDisabled", js.Any.fromFunction1(value))
    
    inline def value(value: js.Date | (js.Tuple2[js.UndefOr[js.Date], js.UndefOr[js.Date]])): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueNull: this.type = set("value", null)
    
    inline def view(value: Detail): this.type = set("view", value.asInstanceOf[js.Any])
    
    inline def yearAriaLabel(value: String): this.type = set("yearAriaLabel", value.asInstanceOf[js.Any])
    
    inline def yearPlaceholder(value: String): this.type = set("yearPlaceholder", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactDatetimerangePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DateTimeRangePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
