package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.calendarMonthMod.ICalendarMonth
import typingsJapgolly.officeUiFabricReact.calendarMonthMod.ICalendarMonthProps
import typingsJapgolly.officeUiFabricReact.calendarTypesMod.ICalendarFormatDateCallbacks
import typingsJapgolly.officeUiFabricReact.calendarTypesMod.ICalendarIconStrings
import typingsJapgolly.officeUiFabricReact.calendarTypesMod.ICalendarStrings
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CalendarMonth {
  def apply(
    dateTimeFormatter: ICalendarFormatDateCallbacks,
    highlightCurrentMonth: Boolean,
    highlightSelectedMonth: Boolean,
    navigatedDate: js.Date,
    navigationIcons: ICalendarIconStrings,
    selectedDate: js.Date,
    strings: ICalendarStrings,
    onNavigateDate: (js.Date, Boolean) => Callback,
    componentRef: IRefObject[ICalendarMonth] = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    onHeaderSelect: /* focus */ Boolean => Callback = null,
    today: js.Date = null,
    yearPickerHidden: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ICalendarMonthProps, 
    typingsJapgolly.officeUiFabricReact.calendarMonthMod.CalendarMonth, 
    Unit, 
    ICalendarMonthProps
  ] = {
    val __obj = js.Dynamic.literal(dateTimeFormatter = dateTimeFormatter.asInstanceOf[js.Any], highlightCurrentMonth = highlightCurrentMonth.asInstanceOf[js.Any], highlightSelectedMonth = highlightSelectedMonth.asInstanceOf[js.Any], navigatedDate = navigatedDate.asInstanceOf[js.Any], navigationIcons = navigationIcons.asInstanceOf[js.Any], selectedDate = selectedDate.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onNavigateDate")(js.Any.fromFunction2((t0: js.Date, t1: scala.Boolean) => onNavigateDate(t0, t1).runNow()))
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onHeaderSelect != null) __obj.updateDynamic("onHeaderSelect")(js.Any.fromFunction1((t0: /* focus */ scala.Boolean) => onHeaderSelect(t0).runNow()))
    if (today != null) __obj.updateDynamic("today")(today.asInstanceOf[js.Any])
    if (!js.isUndefined(yearPickerHidden)) __obj.updateDynamic("yearPickerHidden")(yearPickerHidden.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.calendarMonthMod.ICalendarMonthProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.calendarMonthMod.CalendarMonth](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.calendarMonthMod.ICalendarMonthProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react/lib/components/Calendar/CalendarMonth", "CalendarMonth")
  @js.native
  object componentImport extends js.Object
  
}

