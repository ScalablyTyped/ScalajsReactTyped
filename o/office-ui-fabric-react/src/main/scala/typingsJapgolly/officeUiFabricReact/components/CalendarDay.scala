package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.calendarDayMod.ICalendarDay
import typingsJapgolly.officeUiFabricReact.calendarDayMod.ICalendarDayProps
import typingsJapgolly.officeUiFabricReact.calendarTypesMod.ICalendarFormatDateCallbacks
import typingsJapgolly.officeUiFabricReact.calendarTypesMod.ICalendarIconStrings
import typingsJapgolly.officeUiFabricReact.calendarTypesMod.ICalendarStrings
import typingsJapgolly.officeUiFabricReact.dateValuesMod.DateRangeType
import typingsJapgolly.officeUiFabricReact.dateValuesMod.DayOfWeek
import typingsJapgolly.officeUiFabricReact.dateValuesMod.FirstWeekOfYear
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CalendarDay {
  def apply(
    autoNavigateOnSelection: Boolean,
    dateRangeType: DateRangeType,
    dateTimeFormatter: ICalendarFormatDateCallbacks,
    firstDayOfWeek: DayOfWeek,
    firstWeekOfYear: FirstWeekOfYear,
    navigatedDate: js.Date,
    navigationIcons: ICalendarIconStrings,
    selectedDate: js.Date,
    strings: ICalendarStrings,
    onNavigateDate: (js.Date, Boolean) => Callback,
    onSelectDate: (js.Date, js.UndefOr[js.Array[js.Date]]) => Callback,
    allFocusable: js.UndefOr[Boolean] = js.undefined,
    componentRef: IRefObject[ICalendarDay] = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    onHeaderSelect: /* focus */ Boolean => Callback = null,
    restrictedDates: js.Array[js.Date] = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    showSixWeeksByDefault: js.UndefOr[Boolean] = js.undefined,
    showWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    today: js.Date = null,
    workWeekDays: js.Array[DayOfWeek] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ICalendarDayProps, 
    typingsJapgolly.officeUiFabricReact.calendarDayMod.CalendarDay, 
    Unit, 
    ICalendarDayProps
  ] = {
    val __obj = js.Dynamic.literal(autoNavigateOnSelection = autoNavigateOnSelection.asInstanceOf[js.Any], dateRangeType = dateRangeType.asInstanceOf[js.Any], dateTimeFormatter = dateTimeFormatter.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], firstWeekOfYear = firstWeekOfYear.asInstanceOf[js.Any], navigatedDate = navigatedDate.asInstanceOf[js.Any], navigationIcons = navigationIcons.asInstanceOf[js.Any], selectedDate = selectedDate.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onNavigateDate")(js.Any.fromFunction2((t0: js.Date, t1: scala.Boolean) => onNavigateDate(t0, t1).runNow()))
    __obj.updateDynamic("onSelectDate")(js.Any.fromFunction2((t0: js.Date, t1: js.UndefOr[js.Array[js.Date]]) => onSelectDate(t0, t1).runNow()))
    if (!js.isUndefined(allFocusable)) __obj.updateDynamic("allFocusable")(allFocusable.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    if (onHeaderSelect != null) __obj.updateDynamic("onHeaderSelect")(js.Any.fromFunction1((t0: /* focus */ scala.Boolean) => onHeaderSelect(t0).runNow()))
    if (restrictedDates != null) __obj.updateDynamic("restrictedDates")(restrictedDates.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showSixWeeksByDefault)) __obj.updateDynamic("showSixWeeksByDefault")(showSixWeeksByDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers.asInstanceOf[js.Any])
    if (today != null) __obj.updateDynamic("today")(today.asInstanceOf[js.Any])
    if (workWeekDays != null) __obj.updateDynamic("workWeekDays")(workWeekDays.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.calendarDayMod.ICalendarDayProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.calendarDayMod.CalendarDay](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.calendarDayMod.ICalendarDayProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react/lib/components/Calendar/CalendarDay", "CalendarDay")
  @js.native
  object componentImport extends js.Object
  
}

