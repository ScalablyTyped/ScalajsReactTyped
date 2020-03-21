package typingsJapgolly.officeUiFabricReact.components

import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.officeUiFabricReact.calendarInlineExampleMod.ICalendarInlineExampleProps
import typingsJapgolly.officeUiFabricReact.dateValuesMod.DateRangeType
import typingsJapgolly.officeUiFabricReact.dateValuesMod.DayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CalendarInlineExample {
  def apply(
    autoNavigateOnSelection: Boolean,
    dateRangeType: DateRangeType,
    showGoToToday: Boolean,
    firstDayOfWeek: DayOfWeek = null,
    highlightCurrentMonth: js.UndefOr[Boolean] = js.undefined,
    highlightSelectedMonth: js.UndefOr[Boolean] = js.undefined,
    isDayPickerVisible: js.UndefOr[Boolean] = js.undefined,
    isMonthPickerVisible: js.UndefOr[Boolean] = js.undefined,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    restrictedDates: js.Array[js.Date] = null,
    showMonthPickerAsOverlay: js.UndefOr[Boolean] = js.undefined,
    showNavigateButtons: js.UndefOr[Boolean] = js.undefined,
    showSixWeeksByDefault: js.UndefOr[Boolean] = js.undefined,
    showWeekNumbers: js.UndefOr[Boolean] = js.undefined,
    workWeekDays: js.Array[DayOfWeek] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ICalendarInlineExampleProps, 
    typingsJapgolly.officeUiFabricReact.calendarInlineExampleMod.CalendarInlineExample, 
    Unit, 
    ICalendarInlineExampleProps
  ] = {
    val __obj = js.Dynamic.literal(autoNavigateOnSelection = autoNavigateOnSelection.asInstanceOf[js.Any], dateRangeType = dateRangeType.asInstanceOf[js.Any], showGoToToday = showGoToToday.asInstanceOf[js.Any])
  
      if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightCurrentMonth)) __obj.updateDynamic("highlightCurrentMonth")(highlightCurrentMonth.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightSelectedMonth)) __obj.updateDynamic("highlightSelectedMonth")(highlightSelectedMonth.asInstanceOf[js.Any])
    if (!js.isUndefined(isDayPickerVisible)) __obj.updateDynamic("isDayPickerVisible")(isDayPickerVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isMonthPickerVisible)) __obj.updateDynamic("isMonthPickerVisible")(isMonthPickerVisible.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (restrictedDates != null) __obj.updateDynamic("restrictedDates")(restrictedDates.asInstanceOf[js.Any])
    if (!js.isUndefined(showMonthPickerAsOverlay)) __obj.updateDynamic("showMonthPickerAsOverlay")(showMonthPickerAsOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(showNavigateButtons)) __obj.updateDynamic("showNavigateButtons")(showNavigateButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(showSixWeeksByDefault)) __obj.updateDynamic("showSixWeeksByDefault")(showSixWeeksByDefault.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekNumbers)) __obj.updateDynamic("showWeekNumbers")(showWeekNumbers.asInstanceOf[js.Any])
    if (workWeekDays != null) __obj.updateDynamic("workWeekDays")(workWeekDays.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.officeUiFabricReact.calendarInlineExampleMod.ICalendarInlineExampleProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.officeUiFabricReact.calendarInlineExampleMod.CalendarInlineExample](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.officeUiFabricReact.calendarInlineExampleMod.ICalendarInlineExampleProps])(children: _*)
  }
  @JSImport("office-ui-fabric-react/lib/components/Calendar/examples/Calendar.Inline.Example", "CalendarInlineExample")
  @js.native
  object componentImport extends js.Object
  
}

