package typingsJapgolly.flatpickr.mod.flatpickr

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLInputElement
import org.scalajs.dom.raw.HTMLSelectElement
import org.scalajs.dom.raw.HTMLSpanElement
import org.scalajs.dom.raw.Node
import typingsJapgolly.flatpickr.AnonElement
import typingsJapgolly.flatpickr.AnonGetDaysInMonth
import typingsJapgolly.flatpickr.formattingMod.Formats_
import typingsJapgolly.flatpickr.formattingMod.RevFormat_
import typingsJapgolly.flatpickr.formattingMod.TokenRegex_
import typingsJapgolly.flatpickr.globalsMod._Global_.Date
import typingsJapgolly.flatpickr.globalsMod._Global_.HTMLElement
import typingsJapgolly.flatpickr.instanceMod.DayElement
import typingsJapgolly.flatpickr.kinkeyofOptionsOptionsk
import typingsJapgolly.flatpickr.optionsMod.DateOption
import typingsJapgolly.flatpickr.optionsMod.ParsedOptions
import typingsJapgolly.std.FocusEvent
import typingsJapgolly.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined flatpickr.flatpickr/dist/types/instance.Instance */
@js.native
trait Instance extends js.Object {
  var __hideNextMonthArrow: Boolean = js.native
  var __hidePrevMonthArrow: Boolean = js.native
  var _handlers: js.Array[AnonElement] = js.native
  var _hideNextMonthArrow: Boolean = js.native
  var _hidePrevMonthArrow: Boolean = js.native
  var _initialDate: Date = js.native
  var _input: HTMLInputElement = js.native
  var _positionElement: HTMLElement = js.native
  var _selectedDateObj: js.UndefOr[Date] = js.native
  var _showTimeInput: Boolean = js.native
  var altInput: js.UndefOr[HTMLInputElement] = js.native
  var amPM: js.UndefOr[HTMLSpanElement] = js.native
  var calendarContainer: HTMLDivElement = js.native
  var config: ParsedOptions = js.native
  var currentMonth: Double = js.native
  var currentMonthElement: HTMLSpanElement = js.native
  var currentYear: Double = js.native
  var currentYearElement: HTMLInputElement = js.native
  var days: HTMLDivElement = js.native
  var daysContainer: js.UndefOr[HTMLDivElement] = js.native
  var element: HTMLElement = js.native
  var formats: Formats_ = js.native
  var hourElement: js.UndefOr[HTMLInputElement] = js.native
  var innerContainer: js.UndefOr[HTMLDivElement] = js.native
  var input: HTMLInputElement = js.native
  var isMobile: Boolean = js.native
  var isOpen: Boolean = js.native
  var l10n: typingsJapgolly.flatpickr.localeMod.Locale = js.native
  var latestSelectedDateObj: js.UndefOr[Date] = js.native
  var loadedPlugins: js.Array[String] = js.native
  var maxDateHasTime: Boolean = js.native
  var maxRangeDate: js.UndefOr[Date] = js.native
  var minDateHasTime: Boolean = js.native
  var minRangeDate: js.UndefOr[Date] = js.native
  var minuteElement: js.UndefOr[HTMLInputElement] = js.native
  var mobileFormatStr: js.UndefOr[String] = js.native
  var mobileInput: js.UndefOr[HTMLInputElement] = js.native
  var monthElements: js.Array[HTMLSpanElement] = js.native
  var monthNav: HTMLDivElement = js.native
  var monthsDropdownContainer: HTMLSelectElement = js.native
  var nextMonthNav: HTMLElement = js.native
  var now: Date = js.native
  var pluginElements: js.Array[Node] = js.native
  var prevMonthNav: HTMLElement = js.native
  var rContainer: js.UndefOr[HTMLDivElement] = js.native
  var revFormat: RevFormat_ = js.native
  var secondElement: js.UndefOr[HTMLInputElement] = js.native
  var selectedDateElem: js.UndefOr[DayElement] = js.native
  var selectedDates: js.Array[Date] = js.native
  var showTimeInput: Boolean = js.native
  var timeContainer: js.UndefOr[HTMLDivElement] = js.native
  var todayDateElem: js.UndefOr[DayElement] = js.native
  var tokenRegex: TokenRegex_ = js.native
  var utils: AnonGetDaysInMonth = js.native
  var weekNumbers: js.UndefOr[HTMLDivElement] = js.native
  var weekWrapper: js.UndefOr[HTMLDivElement] = js.native
  var weekdayContainer: HTMLDivElement = js.native
  var yearElements: js.Array[HTMLInputElement] = js.native
  def _bind[E /* <: Element */](element: E, event: String, handler: js.Function1[/* e */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def _bind[E /* <: Element */](element: E, event: js.Array[String], handler: js.Function1[/* e */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def _bind[E /* <: Element */](element: js.Array[E], event: String, handler: js.Function1[/* e */ js.UndefOr[js.Any], Unit]): Unit = js.native
  def _bind[E /* <: Element */](
    element: js.Array[E],
    event: js.Array[String],
    handler: js.Function1[/* e */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  def _createElement[E /* <: HTMLElement */](
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any,
    className: String
  ): E = js.native
  def _createElement[E /* <: HTMLElement */](
    tag: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 119 */ js.Any,
    className: String,
    content: String
  ): E = js.native
  def _debouncedChange(): Unit = js.native
  def _positionCalendar(): Unit = js.native
  def _positionCalendar(customPositionElement: HTMLElement): Unit = js.native
  def _setHoursFromDate(date: Date): Unit = js.native
  def changeMonth(value: Double): Unit = js.native
  def changeMonth(value: Double, isOffset: Boolean): Unit = js.native
  def changeMonth(value: Double, isOffset: Boolean, fromKeyboard: Boolean): Unit = js.native
  def changeYear(year: Double): Unit = js.native
  def clear(): Unit = js.native
  def clear(emitChangeEvent: Boolean): Unit = js.native
  def clear(emitChangeEvent: Boolean, toInitial: Boolean): Unit = js.native
  def close(): Unit = js.native
  def destroy(): Unit = js.native
  def formatDate(dateObj: Date, frmt: String): String = js.native
  def isEnabled(date: DateOption): Boolean = js.native
  def isEnabled(date: DateOption, timeless: Boolean): Boolean = js.native
  def jumpToDate(): Unit = js.native
  def jumpToDate(date: DateOption): Unit = js.native
  def jumpToDate(date: DateOption, triggerChange: Boolean): Unit = js.native
  def open(): Unit = js.native
  def open(e: FocusEvent): Unit = js.native
  def open(e: FocusEvent, positionElement: HTMLElement): Unit = js.native
  def open(e: MouseEvent): Unit = js.native
  def open(e: MouseEvent, positionElement: HTMLElement): Unit = js.native
  def pad(num: String): String = js.native
  def pad(num: Double): String = js.native
  def parseDate(date: String): js.UndefOr[Date] = js.native
  def parseDate(date: String, givenFormat: String): js.UndefOr[Date] = js.native
  def parseDate(date: String, givenFormat: String, timeless: Boolean): js.UndefOr[Date] = js.native
  def parseDate(date: Double): js.UndefOr[Date] = js.native
  def parseDate(date: Double, givenFormat: String): js.UndefOr[Date] = js.native
  def parseDate(date: Double, givenFormat: String, timeless: Boolean): js.UndefOr[Date] = js.native
  def parseDate(date: Date): js.UndefOr[Date] = js.native
  def parseDate(date: Date, givenFormat: String): js.UndefOr[Date] = js.native
  def parseDate(date: Date, givenFormat: String, timeless: Boolean): js.UndefOr[Date] = js.native
  def redraw(): Unit = js.native
  def set(option: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 60 */ js.Any): Unit = js.native
  def set(
    option: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 60 */ js.Any,
    value: js.Any
  ): Unit = js.native
  def set(option: kinkeyofOptionsOptionsk): Unit = js.native
  def set(option: kinkeyofOptionsOptionsk, value: js.Any): Unit = js.native
  def setDate(date: js.Array[DateOption]): Unit = js.native
  def setDate(date: js.Array[DateOption], triggerChange: Boolean): Unit = js.native
  def setDate(date: js.Array[DateOption], triggerChange: Boolean, format: String): Unit = js.native
  def setDate(date: DateOption): Unit = js.native
  def setDate(date: DateOption, triggerChange: Boolean): Unit = js.native
  def setDate(date: DateOption, triggerChange: Boolean, format: String): Unit = js.native
  def toggle(): Unit = js.native
}

