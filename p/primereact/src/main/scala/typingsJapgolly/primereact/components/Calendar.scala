package typingsJapgolly.primereact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.primereact.calendarCalendarMod.CalendarAppendToType
import typingsJapgolly.primereact.calendarCalendarMod.CalendarChangeParams
import typingsJapgolly.primereact.calendarCalendarMod.CalendarDateTemplateParams
import typingsJapgolly.primereact.calendarCalendarMod.CalendarIconPosType
import typingsJapgolly.primereact.calendarCalendarMod.CalendarMonthChangeParams
import typingsJapgolly.primereact.calendarCalendarMod.CalendarMonthNavigatorTemplateParams
import typingsJapgolly.primereact.calendarCalendarMod.CalendarProps
import typingsJapgolly.primereact.calendarCalendarMod.CalendarSelectParams
import typingsJapgolly.primereact.calendarCalendarMod.CalendarViewChangeParams
import typingsJapgolly.primereact.calendarCalendarMod.CalendarVisibleChangeParams
import typingsJapgolly.primereact.calendarCalendarMod.CalendarYearNavigatorTemplateParams
import typingsJapgolly.primereact.tooltipTooltipoptionsMod.TooltipOptions
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Calendar {
  
  @JSImport("primereact", "Calendar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.primereact.mod.Calendar] {
    
    inline def appendTo(value: CalendarAppendToType): this.type = set("appendTo", value.asInstanceOf[js.Any])
    
    inline def appendToNull: this.type = set("appendTo", null)
    
    inline def ariaLabelledBy(value: String): this.type = set("ariaLabelledBy", value.asInstanceOf[js.Any])
    
    inline def autoZIndex(value: Boolean): this.type = set("autoZIndex", value.asInstanceOf[js.Any])
    
    inline def baseZIndex(value: Double): this.type = set("baseZIndex", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def clearButtonClassName(value: String): this.type = set("clearButtonClassName", value.asInstanceOf[js.Any])
    
    inline def dateFormat(value: String): this.type = set("dateFormat", value.asInstanceOf[js.Any])
    
    inline def dateTemplate(value: /* e */ CalendarDateTemplateParams => Node): this.type = set("dateTemplate", js.Any.fromFunction1(value))
    
    inline def decadeTempate(value: /* yearValues */ js.Array[Double] => Node): this.type = set("decadeTempate", js.Any.fromFunction1(value))
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def disabledDates(value: js.Array[js.Date]): this.type = set("disabledDates", value.asInstanceOf[js.Any])
    
    inline def disabledDatesVarargs(value: js.Date*): this.type = set("disabledDates", js.Array(value*))
    
    inline def disabledDays(value: js.Array[Double]): this.type = set("disabledDays", value.asInstanceOf[js.Any])
    
    inline def disabledDaysVarargs(value: Double*): this.type = set("disabledDays", js.Array(value*))
    
    inline def footerTemplate(value: CallbackTo[Node]): this.type = set("footerTemplate", value.toJsFn)
    
    inline def headerTemplate(value: CallbackTo[Node]): this.type = set("headerTemplate", value.toJsFn)
    
    inline def hideOnDateTimeSelect(value: Boolean): this.type = set("hideOnDateTimeSelect", value.asInstanceOf[js.Any])
    
    inline def hourFormat(value: String): this.type = set("hourFormat", value.asInstanceOf[js.Any])
    
    inline def icon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IconType<CalendarProps> */ Any
    ): this.type = set("icon", value.asInstanceOf[js.Any])
    
    inline def iconPos(value: CalendarIconPosType): this.type = set("iconPos", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    inline def inputClassName(value: String): this.type = set("inputClassName", value.asInstanceOf[js.Any])
    
    inline def inputId(value: String): this.type = set("inputId", value.asInstanceOf[js.Any])
    
    inline def inputRef(value: Ref[HTMLInputElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    inline def inputRefFunction1(value: HTMLInputElement | Null => Callback): this.type = set("inputRef", js.Any.fromFunction1((t0: HTMLInputElement | Null) => value(t0).runNow()))
    
    inline def inputRefNull: this.type = set("inputRef", null)
    
    inline def inputStyle(value: js.Object): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    
    inline def keepInvalid(value: Boolean): this.type = set("keepInvalid", value.asInstanceOf[js.Any])
    
    inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def mask(value: String): this.type = set("mask", value.asInstanceOf[js.Any])
    
    inline def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def maxDateCount(value: Double): this.type = set("maxDateCount", value.asInstanceOf[js.Any])
    
    inline def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def monthNavigator(value: Boolean): this.type = set("monthNavigator", value.asInstanceOf[js.Any])
    
    inline def monthNavigatorTemplate(value: /* e */ CalendarMonthNavigatorTemplateParams => Node): this.type = set("monthNavigatorTemplate", js.Any.fromFunction1(value))
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def numberOfMonths(value: Double): this.type = set("numberOfMonths", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: /* event */ ReactFocusEventFrom[HTMLInputElement] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: /* event */ ReactFocusEventFrom[HTMLInputElement]) => value(t0).runNow()))
    
    inline def onChange(value: /* e */ CalendarChangeParams => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* e */ CalendarChangeParams) => value(t0).runNow()))
    
    inline def onClearButtonClick(value: /* event */ ReactMouseEventFrom[HTMLButtonElement] => Callback): this.type = set("onClearButtonClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => value(t0).runNow()))
    
    inline def onFocus(value: /* event */ ReactFocusEventFrom[HTMLInputElement] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* event */ ReactFocusEventFrom[HTMLInputElement]) => value(t0).runNow()))
    
    inline def onHide(value: Callback): this.type = set("onHide", value.toJsFn)
    
    inline def onInput(value: /* event */ ReactEventFrom[HTMLInputElement] => Callback): this.type = set("onInput", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[HTMLInputElement]) => value(t0).runNow()))
    
    inline def onMonthChange(value: /* e */ CalendarMonthChangeParams => Callback): this.type = set("onMonthChange", js.Any.fromFunction1((t0: /* e */ CalendarMonthChangeParams) => value(t0).runNow()))
    
    inline def onSelect(value: /* e */ CalendarSelectParams => Callback): this.type = set("onSelect", js.Any.fromFunction1((t0: /* e */ CalendarSelectParams) => value(t0).runNow()))
    
    inline def onShow(value: Callback): this.type = set("onShow", value.toJsFn)
    
    inline def onTodayButtonClick(value: /* event */ ReactMouseEventFrom[HTMLButtonElement] => Callback): this.type = set("onTodayButtonClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLButtonElement]) => value(t0).runNow()))
    
    inline def onViewDateChange(value: /* e */ CalendarViewChangeParams => Callback): this.type = set("onViewDateChange", js.Any.fromFunction1((t0: /* e */ CalendarViewChangeParams) => value(t0).runNow()))
    
    inline def onVisibleChange(value: /* e */ CalendarVisibleChangeParams => Callback): this.type = set("onVisibleChange", js.Any.fromFunction1((t0: /* e */ CalendarVisibleChangeParams) => value(t0).runNow()))
    
    inline def panelClassName(value: String): this.type = set("panelClassName", value.asInstanceOf[js.Any])
    
    inline def panelStyle(value: js.Object): this.type = set("panelStyle", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def readOnlyInput(value: Boolean): this.type = set("readOnlyInput", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def selectOtherMonths(value: Boolean): this.type = set("selectOtherMonths", value.asInstanceOf[js.Any])
    
    inline def selectionMode(value: String): this.type = set("selectionMode", value.asInstanceOf[js.Any])
    
    inline def shortYearCutoff(value: String): this.type = set("shortYearCutoff", value.asInstanceOf[js.Any])
    
    inline def showButtonBar(value: Boolean): this.type = set("showButtonBar", value.asInstanceOf[js.Any])
    
    inline def showIcon(value: Boolean): this.type = set("showIcon", value.asInstanceOf[js.Any])
    
    inline def showMillisec(value: Boolean): this.type = set("showMillisec", value.asInstanceOf[js.Any])
    
    inline def showMinMaxRange(value: Boolean): this.type = set("showMinMaxRange", value.asInstanceOf[js.Any])
    
    inline def showOnFocus(value: Boolean): this.type = set("showOnFocus", value.asInstanceOf[js.Any])
    
    inline def showOtherMonths(value: Boolean): this.type = set("showOtherMonths", value.asInstanceOf[js.Any])
    
    inline def showSeconds(value: Boolean): this.type = set("showSeconds", value.asInstanceOf[js.Any])
    
    inline def showTime(value: Boolean): this.type = set("showTime", value.asInstanceOf[js.Any])
    
    inline def showWeek(value: Boolean): this.type = set("showWeek", value.asInstanceOf[js.Any])
    
    inline def stepHour(value: Double): this.type = set("stepHour", value.asInstanceOf[js.Any])
    
    inline def stepMillisec(value: Double): this.type = set("stepMillisec", value.asInstanceOf[js.Any])
    
    inline def stepMinute(value: Double): this.type = set("stepMinute", value.asInstanceOf[js.Any])
    
    inline def stepSecond(value: Double): this.type = set("stepSecond", value.asInstanceOf[js.Any])
    
    inline def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def timeOnly(value: Boolean): this.type = set("timeOnly", value.asInstanceOf[js.Any])
    
    inline def todayButtonClassName(value: String): this.type = set("todayButtonClassName", value.asInstanceOf[js.Any])
    
    inline def tooltip(value: String): this.type = set("tooltip", value.asInstanceOf[js.Any])
    
    inline def tooltipOptions(value: TooltipOptions): this.type = set("tooltipOptions", value.asInstanceOf[js.Any])
    
    inline def touchUI(value: Boolean): this.type = set("touchUI", value.asInstanceOf[js.Any])
    
    inline def transitionOptions(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSTransitionProps */ Any
    ): this.type = set("transitionOptions", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Date | js.Array[js.Date]): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def valueVarargs(value: js.Date*): this.type = set("value", js.Array(value*))
    
    inline def view(value: String): this.type = set("view", value.asInstanceOf[js.Any])
    
    inline def viewDate(value: js.Date): this.type = set("viewDate", value.asInstanceOf[js.Any])
    
    inline def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
    
    inline def yearNavigator(value: Boolean): this.type = set("yearNavigator", value.asInstanceOf[js.Any])
    
    inline def yearNavigatorTemplate(value: /* e */ CalendarYearNavigatorTemplateParams => Node): this.type = set("yearNavigatorTemplate", js.Any.fromFunction1(value))
    
    inline def yearRange(value: String): this.type = set("yearRange", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Calendar.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CalendarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
