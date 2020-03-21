package typingsJapgolly.officeUiFabricReact.calendarMonthMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.officeUiFabricReact.calendarTypesMod.ICalendarFormatDateCallbacks
import typingsJapgolly.officeUiFabricReact.calendarTypesMod.ICalendarIconStrings
import typingsJapgolly.officeUiFabricReact.calendarTypesMod.ICalendarStrings
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICalendarMonthProps extends ClassAttributes[CalendarMonth] {
  var componentRef: js.UndefOr[IRefObject[ICalendarMonth]] = js.undefined
  var dateTimeFormatter: ICalendarFormatDateCallbacks
  var highlightCurrentMonth: Boolean
  var highlightSelectedMonth: Boolean
  var maxDate: js.UndefOr[js.Date] = js.undefined
  var minDate: js.UndefOr[js.Date] = js.undefined
  var navigatedDate: js.Date
  var navigationIcons: ICalendarIconStrings
  var onHeaderSelect: js.UndefOr[js.Function1[/* focus */ Boolean, Unit]] = js.undefined
  var selectedDate: js.Date
  var strings: ICalendarStrings
  var today: js.UndefOr[js.Date] = js.undefined
  var yearPickerHidden: js.UndefOr[Boolean] = js.undefined
  def onNavigateDate(date: js.Date, focusOnNavigatedDay: Boolean): Unit
}

object ICalendarMonthProps {
  @scala.inline
  def apply(
    dateTimeFormatter: ICalendarFormatDateCallbacks,
    highlightCurrentMonth: Boolean,
    highlightSelectedMonth: Boolean,
    navigatedDate: js.Date,
    navigationIcons: ICalendarIconStrings,
    onNavigateDate: (js.Date, Boolean) => Callback,
    selectedDate: js.Date,
    strings: ICalendarStrings,
    componentRef: IRefObject[ICalendarMonth] = null,
    key: Key = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    onHeaderSelect: /* focus */ Boolean => Callback = null,
    ref: LegacyRef[CalendarMonth] = null,
    today: js.Date = null,
    yearPickerHidden: js.UndefOr[Boolean] = js.undefined
  ): ICalendarMonthProps = {
    val __obj = js.Dynamic.literal(dateTimeFormatter = dateTimeFormatter.asInstanceOf[js.Any], highlightCurrentMonth = highlightCurrentMonth.asInstanceOf[js.Any], highlightSelectedMonth = highlightSelectedMonth.asInstanceOf[js.Any], navigatedDate = navigatedDate.asInstanceOf[js.Any], navigationIcons = navigationIcons.asInstanceOf[js.Any], selectedDate = selectedDate.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
    __obj.updateDynamic("onNavigateDate")(js.Any.fromFunction2((t0: js.Date, t1: scala.Boolean) => onNavigateDate(t0, t1).runNow()))
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (onHeaderSelect != null) __obj.updateDynamic("onHeaderSelect")(js.Any.fromFunction1((t0: /* focus */ scala.Boolean) => onHeaderSelect(t0).runNow()))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (today != null) __obj.updateDynamic("today")(today.asInstanceOf[js.Any])
    if (!js.isUndefined(yearPickerHidden)) __obj.updateDynamic("yearPickerHidden")(yearPickerHidden.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarMonthProps]
  }
}

