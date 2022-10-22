package typingsJapgolly.reactDatetimePicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactDatetimePicker.mod.DateTimePickerProps
import typingsJapgolly.reactDatetimePicker.reactDatetimePickerStrings.century
import typingsJapgolly.reactDatetimePicker.reactDatetimePickerStrings.decade
import typingsJapgolly.reactDatetimePicker.reactDatetimePickerStrings.end
import typingsJapgolly.reactDatetimePicker.reactDatetimePickerStrings.hour
import typingsJapgolly.reactDatetimePicker.reactDatetimePickerStrings.minute
import typingsJapgolly.reactDatetimePicker.reactDatetimePickerStrings.month
import typingsJapgolly.reactDatetimePicker.reactDatetimePickerStrings.range
import typingsJapgolly.reactDatetimePicker.reactDatetimePickerStrings.second
import typingsJapgolly.reactDatetimePicker.reactDatetimePickerStrings.start
import typingsJapgolly.reactDatetimePicker.reactDatetimePickerStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactDatetimePicker {
  
  @JSImport("react-datetime-picker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def amPmAriaLabel(value: String): this.type = set("amPmAriaLabel", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def calendarAriaLabel(value: String): this.type = set("calendarAriaLabel", value.asInstanceOf[js.Any])
    
    inline def calendarClassName(value: String | js.Array[String]): this.type = set("calendarClassName", value.asInstanceOf[js.Any])
    
    inline def calendarClassNameVarargs(value: String*): this.type = set("calendarClassName", js.Array(value*))
    
    inline def calendarIcon(value: VdomElement): this.type = set("calendarIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def calendarIconNull: this.type = set("calendarIcon", null)
    
    inline def className(value: String | js.Array[String]): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classNameVarargs(value: String*): this.type = set("className", js.Array(value*))
    
    inline def clearAriaLabel(value: String): this.type = set("clearAriaLabel", value.asInstanceOf[js.Any])
    
    inline def clearIcon(value: VdomElement): this.type = set("clearIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def clearIconNull: this.type = set("clearIcon", null)
    
    inline def clockClassName(value: String | js.Array[String]): this.type = set("clockClassName", value.asInstanceOf[js.Any])
    
    inline def clockClassNameVarargs(value: String*): this.type = set("clockClassName", js.Array(value*))
    
    inline def closeWidgets(value: Boolean): this.type = set("closeWidgets", value.asInstanceOf[js.Any])
    
    inline def dayAriaLabel(value: String): this.type = set("dayAriaLabel", value.asInstanceOf[js.Any])
    
    inline def dayPlaceholder(value: String): this.type = set("dayPlaceholder", value.asInstanceOf[js.Any])
    
    inline def disableCalendar(value: Boolean): this.type = set("disableCalendar", value.asInstanceOf[js.Any])
    
    inline def disableClock(value: Boolean): this.type = set("disableClock", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
    
    inline def hourAriaLabel(value: String): this.type = set("hourAriaLabel", value.asInstanceOf[js.Any])
    
    inline def hourPlaceholder(value: String): this.type = set("hourPlaceholder", value.asInstanceOf[js.Any])
    
    inline def isCalendarOpen(value: Boolean): this.type = set("isCalendarOpen", value.asInstanceOf[js.Any])
    
    inline def isClockOpen(value: Boolean): this.type = set("isClockOpen", value.asInstanceOf[js.Any])
    
    inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def maxDetail(value: hour | minute | second): this.type = set("maxDetail", value.asInstanceOf[js.Any])
    
    inline def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def minDetail(value: month | year | decade | century): this.type = set("minDetail", value.asInstanceOf[js.Any])
    
    inline def minuteAriaLabel(value: String): this.type = set("minuteAriaLabel", value.asInstanceOf[js.Any])
    
    inline def minutePlaceholder(value: String): this.type = set("minutePlaceholder", value.asInstanceOf[js.Any])
    
    inline def monthAriaLabel(value: String): this.type = set("monthAriaLabel", value.asInstanceOf[js.Any])
    
    inline def monthPlaceholder(value: String): this.type = set("monthPlaceholder", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def nativeInputAriaLabel(value: String): this.type = set("nativeInputAriaLabel", value.asInstanceOf[js.Any])
    
    inline def onCalendarClose(value: Callback): this.type = set("onCalendarClose", value.toJsFn)
    
    inline def onCalendarOpen(value: Callback): this.type = set("onCalendarOpen", value.toJsFn)
    
    inline def onChange(value: /* value */ js.Date => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* value */ js.Date) => value(t0).runNow()))
    
    inline def onClockClose(value: Callback): this.type = set("onClockClose", value.toJsFn)
    
    inline def onClockOpen(value: Callback): this.type = set("onClockOpen", value.toJsFn)
    
    inline def openWidgetsOnFocus(value: Boolean): this.type = set("openWidgetsOnFocus", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def returnValue(value: start | end | range): this.type = set("returnValue", value.asInstanceOf[js.Any])
    
    inline def secondAriaLabel(value: String): this.type = set("secondAriaLabel", value.asInstanceOf[js.Any])
    
    inline def secondPlaceholder(value: String): this.type = set("secondPlaceholder", value.asInstanceOf[js.Any])
    
    inline def showLeadingZeros(value: Boolean): this.type = set("showLeadingZeros", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Date | (js.Tuple2[js.Date, js.Date])): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def yearAriaLabel(value: String): this.type = set("yearAriaLabel", value.asInstanceOf[js.Any])
    
    inline def yearPlaceholder(value: String): this.type = set("yearPlaceholder", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactDatetimePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DateTimePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
