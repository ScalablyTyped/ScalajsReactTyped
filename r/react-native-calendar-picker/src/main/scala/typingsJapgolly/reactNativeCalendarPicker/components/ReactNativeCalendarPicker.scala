package typingsJapgolly.reactNativeCalendarPicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeCalendarPicker.anon.ContainerStyle
import typingsJapgolly.reactNativeCalendarPicker.anon.Style
import typingsJapgolly.reactNativeCalendarPicker.mod.CalendarPickerProps
import typingsJapgolly.reactNativeCalendarPicker.mod.CustomDateStyle
import typingsJapgolly.reactNativeCalendarPicker.mod.CustomDatesStylesFunc
import typingsJapgolly.reactNativeCalendarPicker.mod.CustomDayHeaderStylesFuncDateArg
import typingsJapgolly.reactNativeCalendarPicker.mod.DisabledDatesFunc
import typingsJapgolly.reactNativeCalendarPicker.mod.MaxDurationArrayItem
import typingsJapgolly.reactNativeCalendarPicker.mod.MinDurationArrayItem
import typingsJapgolly.reactNativeCalendarPicker.mod.default
import typingsJapgolly.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.END_DATE
import typingsJapgolly.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.START_DATE
import typingsJapgolly.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.circle
import typingsJapgolly.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeCalendarPicker {
  
  @JSImport("react-native-calendar-picker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def allowBackwardRangeSelect(value: Boolean): this.type = set("allowBackwardRangeSelect", value.asInstanceOf[js.Any])
    
    inline def allowRangeSelection(value: Boolean): this.type = set("allowRangeSelection", value.asInstanceOf[js.Any])
    
    inline def customDatesStyles(value: js.Array[CustomDateStyle] | CustomDatesStylesFunc): this.type = set("customDatesStyles", value.asInstanceOf[js.Any])
    
    inline def customDatesStylesFunction1(value: /* date */ Moment => ContainerStyle): this.type = set("customDatesStyles", js.Any.fromFunction1(value))
    
    inline def customDatesStylesVarargs(value: CustomDateStyle*): this.type = set("customDatesStyles", js.Array(value*))
    
    inline def customDayHeaderStyles(value: /* date */ CustomDayHeaderStylesFuncDateArg => Style): this.type = set("customDayHeaderStyles", js.Any.fromFunction1(value))
    
    inline def dayLabelsWrapper(value: StyleProp[ViewStyle]): this.type = set("dayLabelsWrapper", value.asInstanceOf[js.Any])
    
    inline def dayLabelsWrapperNull: this.type = set("dayLabelsWrapper", null)
    
    inline def dayShape(value: circle | square): this.type = set("dayShape", value.asInstanceOf[js.Any])
    
    inline def disabledDates(value: js.Array[js.Date] | DisabledDatesFunc): this.type = set("disabledDates", value.asInstanceOf[js.Any])
    
    inline def disabledDatesFunction1(value: /* date */ Moment => Boolean): this.type = set("disabledDates", js.Any.fromFunction1(value))
    
    inline def disabledDatesTextStyle(value: StyleProp[TextStyle]): this.type = set("disabledDatesTextStyle", value.asInstanceOf[js.Any])
    
    inline def disabledDatesTextStyleNull: this.type = set("disabledDatesTextStyle", null)
    
    inline def disabledDatesVarargs(value: js.Date*): this.type = set("disabledDates", js.Array(value*))
    
    inline def enableDateChange(value: Boolean): this.type = set("enableDateChange", value.asInstanceOf[js.Any])
    
    inline def headerWrapperStyle(value: StyleProp[ViewStyle]): this.type = set("headerWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def headerWrapperStyleNull: this.type = set("headerWrapperStyle", null)
    
    inline def headingLevel(value: Double): this.type = set("headingLevel", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def horizontal(value: Boolean): this.type = set("horizontal", value.asInstanceOf[js.Any])
    
    inline def initialDate(value: js.Date): this.type = set("initialDate", value.asInstanceOf[js.Any])
    
    inline def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def maxRangeDuration(value: Double | js.Array[MaxDurationArrayItem]): this.type = set("maxRangeDuration", value.asInstanceOf[js.Any])
    
    inline def maxRangeDurationVarargs(value: MaxDurationArrayItem*): this.type = set("maxRangeDuration", js.Array(value*))
    
    inline def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def minRangeDuration(value: Double | js.Array[MinDurationArrayItem]): this.type = set("minRangeDuration", value.asInstanceOf[js.Any])
    
    inline def minRangeDurationVarargs(value: MinDurationArrayItem*): this.type = set("minRangeDuration", js.Array(value*))
    
    inline def monthTitleStyle(value: StyleProp[TextStyle]): this.type = set("monthTitleStyle", value.asInstanceOf[js.Any])
    
    inline def monthTitleStyleNull: this.type = set("monthTitleStyle", null)
    
    inline def monthYearHeaderWrapperStyle(value: StyleProp[ViewStyle]): this.type = set("monthYearHeaderWrapperStyle", value.asInstanceOf[js.Any])
    
    inline def monthYearHeaderWrapperStyleNull: this.type = set("monthYearHeaderWrapperStyle", null)
    
    inline def months(value: js.Array[String]): this.type = set("months", value.asInstanceOf[js.Any])
    
    inline def monthsVarargs(value: String*): this.type = set("months", js.Array(value*))
    
    inline def nextComponent(value: VdomNode): this.type = set("nextComponent", value.rawNode.asInstanceOf[js.Any])
    
    inline def nextComponentNull: this.type = set("nextComponent", null)
    
    inline def nextComponentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("nextComponent", js.Array(value*))
    
    inline def nextComponentVdomElement(value: VdomElement): this.type = set("nextComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def nextTitle(value: String): this.type = set("nextTitle", value.asInstanceOf[js.Any])
    
    inline def nextTitleStyle(value: StyleProp[TextStyle]): this.type = set("nextTitleStyle", value.asInstanceOf[js.Any])
    
    inline def nextTitleStyleNull: this.type = set("nextTitleStyle", null)
    
    inline def onDateChange(value: (/* date */ Moment, /* type */ START_DATE | END_DATE) => Callback): this.type = set("onDateChange", js.Any.fromFunction2((t0: /* date */ Moment, t1: /* type */ START_DATE | END_DATE) => (value(t0, t1)).runNow()))
    
    inline def onMonthChange(value: (/* date */ Moment, /* type */ START_DATE | END_DATE) => Callback): this.type = set("onMonthChange", js.Any.fromFunction2((t0: /* date */ Moment, t1: /* type */ START_DATE | END_DATE) => (value(t0, t1)).runNow()))
    
    inline def previousComponent(value: VdomNode): this.type = set("previousComponent", value.rawNode.asInstanceOf[js.Any])
    
    inline def previousComponentNull: this.type = set("previousComponent", null)
    
    inline def previousComponentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("previousComponent", js.Array(value*))
    
    inline def previousComponentVdomElement(value: VdomElement): this.type = set("previousComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def previousTitle(value: String): this.type = set("previousTitle", value.asInstanceOf[js.Any])
    
    inline def previousTitleStyle(value: StyleProp[TextStyle]): this.type = set("previousTitleStyle", value.asInstanceOf[js.Any])
    
    inline def previousTitleStyleNull: this.type = set("previousTitleStyle", null)
    
    inline def restrictMonthNavigation(value: Boolean): this.type = set("restrictMonthNavigation", value.asInstanceOf[js.Any])
    
    inline def scaleFactor(value: Double): this.type = set("scaleFactor", value.asInstanceOf[js.Any])
    
    inline def scrollable(value: Boolean): this.type = set("scrollable", value.asInstanceOf[js.Any])
    
    inline def selectMonthTitle(value: String): this.type = set("selectMonthTitle", value.asInstanceOf[js.Any])
    
    inline def selectYearTitle(value: String): this.type = set("selectYearTitle", value.asInstanceOf[js.Any])
    
    inline def selectedDayColor(value: String): this.type = set("selectedDayColor", value.asInstanceOf[js.Any])
    
    inline def selectedDayStyle(value: StyleProp[ViewStyle]): this.type = set("selectedDayStyle", value.asInstanceOf[js.Any])
    
    inline def selectedDayStyleNull: this.type = set("selectedDayStyle", null)
    
    inline def selectedDayTextColor(value: String): this.type = set("selectedDayTextColor", value.asInstanceOf[js.Any])
    
    inline def selectedDayTextStyle(value: StyleProp[TextStyle]): this.type = set("selectedDayTextStyle", value.asInstanceOf[js.Any])
    
    inline def selectedDayTextStyleNull: this.type = set("selectedDayTextStyle", null)
    
    inline def selectedDisabledDatesTextStyle(value: StyleProp[TextStyle]): this.type = set("selectedDisabledDatesTextStyle", value.asInstanceOf[js.Any])
    
    inline def selectedDisabledDatesTextStyleNull: this.type = set("selectedDisabledDatesTextStyle", null)
    
    inline def selectedEndDate(value: js.Date): this.type = set("selectedEndDate", value.asInstanceOf[js.Any])
    
    inline def selectedRangeEndStyle(value: StyleProp[ViewStyle]): this.type = set("selectedRangeEndStyle", value.asInstanceOf[js.Any])
    
    inline def selectedRangeEndStyleNull: this.type = set("selectedRangeEndStyle", null)
    
    inline def selectedRangeEndTextStyle(value: StyleProp[TextStyle]): this.type = set("selectedRangeEndTextStyle", value.asInstanceOf[js.Any])
    
    inline def selectedRangeEndTextStyleNull: this.type = set("selectedRangeEndTextStyle", null)
    
    inline def selectedRangeStartStyle(value: StyleProp[ViewStyle]): this.type = set("selectedRangeStartStyle", value.asInstanceOf[js.Any])
    
    inline def selectedRangeStartStyleNull: this.type = set("selectedRangeStartStyle", null)
    
    inline def selectedRangeStartTextStyle(value: StyleProp[TextStyle]): this.type = set("selectedRangeStartTextStyle", value.asInstanceOf[js.Any])
    
    inline def selectedRangeStartTextStyleNull: this.type = set("selectedRangeStartTextStyle", null)
    
    inline def selectedRangeStyle(value: StyleProp[ViewStyle]): this.type = set("selectedRangeStyle", value.asInstanceOf[js.Any])
    
    inline def selectedRangeStyleNull: this.type = set("selectedRangeStyle", null)
    
    inline def selectedStartDate(value: js.Date): this.type = set("selectedStartDate", value.asInstanceOf[js.Any])
    
    inline def showDayStragglers(value: Boolean): this.type = set("showDayStragglers", value.asInstanceOf[js.Any])
    
    inline def startFromMonday(value: Boolean): this.type = set("startFromMonday", value.asInstanceOf[js.Any])
    
    inline def textStyle(value: StyleProp[TextStyle]): this.type = set("textStyle", value.asInstanceOf[js.Any])
    
    inline def textStyleNull: this.type = set("textStyle", null)
    
    inline def todayBackgroundColor(value: String): this.type = set("todayBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def todayTextStyle(value: StyleProp[TextStyle]): this.type = set("todayTextStyle", value.asInstanceOf[js.Any])
    
    inline def todayTextStyleNull: this.type = set("todayTextStyle", null)
    
    inline def weekdays(value: js.Array[String]): this.type = set("weekdays", value.asInstanceOf[js.Any])
    
    inline def weekdaysVarargs(value: String*): this.type = set("weekdays", js.Array(value*))
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
    
    inline def yearTitleStyle(value: StyleProp[TextStyle]): this.type = set("yearTitleStyle", value.asInstanceOf[js.Any])
    
    inline def yearTitleStyleNull: this.type = set("yearTitleStyle", null)
  }
  
  implicit def make(companion: ReactNativeCalendarPicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CalendarPickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
