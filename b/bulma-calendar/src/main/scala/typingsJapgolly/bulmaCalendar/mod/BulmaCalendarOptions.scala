package typingsJapgolly.bulmaCalendar.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.bulmaCalendar.AnonDate
import typingsJapgolly.bulmaCalendar.bulmaCalendarStrings.`inline`
import typingsJapgolly.bulmaCalendar.bulmaCalendarStrings.bottom
import typingsJapgolly.bulmaCalendar.bulmaCalendarStrings.date
import typingsJapgolly.bulmaCalendar.bulmaCalendarStrings.datetime
import typingsJapgolly.bulmaCalendar.bulmaCalendarStrings.dialog
import typingsJapgolly.bulmaCalendar.bulmaCalendarStrings.time
import typingsJapgolly.bulmaCalendar.bulmaCalendarStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BulmaCalendarOptions extends js.Object {
  /**
    * Possibility to select same date as start and end date in range mode
    *
    * @default true
    */
  var allowSameDayRange: js.UndefOr[Boolean] = js.undefined
  /**
    * Cancel button label
    *
    * @default 'Cancel'
    */
  var cancelLabel: js.UndefOr[String] = js.undefined
  /**
    * Clear button label
    *
    * @default 'Clear'
    */
  var clearLabel: js.UndefOr[String] = js.undefined
  /**
    * Close picker on overlay click (only for dialog display style)
    *
    * @default true
    */
  var closeOnOverlayClick: js.UndefOr[Boolean] = js.undefined
  /**
    * Automatically close the datePicker when date selected (or range date selected) - not available
    * for inline display style. If set to False then a validate button will be displayed into the
    * footer section.
    *
    * @default true
    */
  var closeOnSelect: js.UndefOr[Boolean] = js.undefined
  /**
    * Picker dominant color
    *
    * @default 'primary'
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Date format pattern
    *
    * @default 'MM/DD/YYYY'
    */
  var dateFormat: js.UndefOr[String] = js.undefined
  /**
    * List of disabled dates
    */
  var disabledDates: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * List of disabled week days
    */
  var disabledWeekDays: js.UndefOr[String | js.Array[_]] = js.undefined
  /**
    * Display mode
    *
    * @default 'default'
    */
  var displayMode: js.UndefOr[typingsJapgolly.bulmaCalendar.bulmaCalendarStrings.default | dialog | `inline`] = js.undefined
  /**
    * Enable/disable month switch
    *
    * @default true
    */
  var enableMonthSwitch: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable/disable year switch
    *
    * @default true
    */
  var enableYearSwitch: js.UndefOr[Boolean] = js.undefined
  /**
    * Pre-selected end date
    */
  var endDate: js.UndefOr[js.Date] = js.undefined
  /**
    * Pre-selected end time
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  /**
    * Header block position
    *
    * @default 'top'
    */
  var headerPosition: js.UndefOr[top | bottom] = js.undefined
  var icons: js.UndefOr[AnonDate] = js.undefined
  /**
    * Range capability (start and end date/time selection
    *
    * @default false
    */
  var isRange: js.UndefOr[Boolean] = js.undefined
  /**
    * From label
    */
  var labelFrom: js.UndefOr[String] = js.undefined
  /**
    * To label
    */
  var labelTo: js.UndefOr[String] = js.undefined
  /**
    * Display lang (from language supported by date-fns)
    *
    * @default navigator.language.substring(0, 2) || "en"
    */
  var lang: js.UndefOr[String] = js.undefined
  /**
    * Maximum date allowed
    */
  var maxDate: js.UndefOr[js.Date] = js.undefined
  /**
    * Minimum date allowed
    */
  var minDate: js.UndefOr[js.Date] = js.undefined
  /**
    * Steps for minutes selector
    *
    * @default 5
    */
  var minuteSteps: js.UndefOr[Double] = js.undefined
  /**
    * Now button label
    *
    * @default 'Now'
    */
  var nowLabel: js.UndefOr[String] = js.undefined
  /**
    * Callback to trigger once picker initiated
    */
  var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * @default 'auto'
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * Show/Hide buttons
    *
    * @default true
    */
  var showButtons: js.UndefOr[Boolean] = js.undefined
  /**
    * Show/Hide Clear Button
    *
    * @default true
    */
  var showClearButton: js.UndefOr[Boolean] = js.undefined
  /**
    * Show/Hide footer block
    *
    * @default true
    */
  var showFooter: js.UndefOr[Boolean] = js.undefined
  /**
    * Show/Hide header block (with current selection)
    *
    * @default true
    */
  var showHeader: js.UndefOr[Boolean] = js.undefined
  /**
    * Show/Hide Today Button
    *
    * @default true
    */
  var showTodayButton: js.UndefOr[Boolean] = js.undefined
  /**
    * Pre-selected start date
    */
  var startDate: js.UndefOr[js.Date] = js.undefined
  /**
    * Pre-selected start time
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  /**
    * Time format pattern
    *
    * @default 'HH:mm'
    */
  var timeFormat: js.UndefOr[String] = js.undefined
  /**
    * Today button label
    *
    * @default 'Today'
    */
  var todayLabel: js.UndefOr[String] = js.undefined
  /**
    * Automatically open datepicker when click into input element
    *
    * @default true
    */
  var toggleOnInputClick: js.UndefOr[Boolean] = js.undefined
  /**
    * Component type
    *
    * @default 'datetime'
    */
  var `type`: js.UndefOr[date | time | datetime] = js.undefined
  /**
    * Validate button label
    *
    * @default 'Validate'
    */
  var validateLabel: js.UndefOr[String] = js.undefined
  /**
    * Default weekstart day number
    *
    * @default 0 // sunday
    */
  var weekStart: js.UndefOr[Double] = js.undefined
}

object BulmaCalendarOptions {
  @scala.inline
  def apply(
    allowSameDayRange: js.UndefOr[Boolean] = js.undefined,
    cancelLabel: String = null,
    clearLabel: String = null,
    closeOnOverlayClick: js.UndefOr[Boolean] = js.undefined,
    closeOnSelect: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    dateFormat: String = null,
    disabledDates: js.Array[_] = null,
    disabledWeekDays: String | js.Array[_] = null,
    displayMode: typingsJapgolly.bulmaCalendar.bulmaCalendarStrings.default | dialog | `inline` = null,
    enableMonthSwitch: js.UndefOr[Boolean] = js.undefined,
    enableYearSwitch: js.UndefOr[Boolean] = js.undefined,
    endDate: js.Date = null,
    endTime: js.Date = null,
    headerPosition: top | bottom = null,
    icons: AnonDate = null,
    isRange: js.UndefOr[Boolean] = js.undefined,
    labelFrom: String = null,
    labelTo: String = null,
    lang: String = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    minuteSteps: Int | Double = null,
    nowLabel: String = null,
    onReady: js.UndefOr[Callback] = js.undefined,
    position: String = null,
    showButtons: js.UndefOr[Boolean] = js.undefined,
    showClearButton: js.UndefOr[Boolean] = js.undefined,
    showFooter: js.UndefOr[Boolean] = js.undefined,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    showTodayButton: js.UndefOr[Boolean] = js.undefined,
    startDate: js.Date = null,
    startTime: js.Date = null,
    timeFormat: String = null,
    todayLabel: String = null,
    toggleOnInputClick: js.UndefOr[Boolean] = js.undefined,
    `type`: date | time | datetime = null,
    validateLabel: String = null,
    weekStart: Int | Double = null
  ): BulmaCalendarOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSameDayRange)) __obj.updateDynamic("allowSameDayRange")(allowSameDayRange.asInstanceOf[js.Any])
    if (cancelLabel != null) __obj.updateDynamic("cancelLabel")(cancelLabel.asInstanceOf[js.Any])
    if (clearLabel != null) __obj.updateDynamic("clearLabel")(clearLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnOverlayClick)) __obj.updateDynamic("closeOnOverlayClick")(closeOnOverlayClick.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnSelect)) __obj.updateDynamic("closeOnSelect")(closeOnSelect.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (disabledWeekDays != null) __obj.updateDynamic("disabledWeekDays")(disabledWeekDays.asInstanceOf[js.Any])
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (!js.isUndefined(enableMonthSwitch)) __obj.updateDynamic("enableMonthSwitch")(enableMonthSwitch.asInstanceOf[js.Any])
    if (!js.isUndefined(enableYearSwitch)) __obj.updateDynamic("enableYearSwitch")(enableYearSwitch.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (headerPosition != null) __obj.updateDynamic("headerPosition")(headerPosition.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (!js.isUndefined(isRange)) __obj.updateDynamic("isRange")(isRange.asInstanceOf[js.Any])
    if (labelFrom != null) __obj.updateDynamic("labelFrom")(labelFrom.asInstanceOf[js.Any])
    if (labelTo != null) __obj.updateDynamic("labelTo")(labelTo.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minuteSteps != null) __obj.updateDynamic("minuteSteps")(minuteSteps.asInstanceOf[js.Any])
    if (nowLabel != null) __obj.updateDynamic("nowLabel")(nowLabel.asInstanceOf[js.Any])
    onReady.foreach(p => __obj.updateDynamic("onReady")(p.toJsFn))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showButtons)) __obj.updateDynamic("showButtons")(showButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(showClearButton)) __obj.updateDynamic("showClearButton")(showClearButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showFooter)) __obj.updateDynamic("showFooter")(showFooter.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(showTodayButton)) __obj.updateDynamic("showTodayButton")(showTodayButton.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (timeFormat != null) __obj.updateDynamic("timeFormat")(timeFormat.asInstanceOf[js.Any])
    if (todayLabel != null) __obj.updateDynamic("todayLabel")(todayLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(toggleOnInputClick)) __obj.updateDynamic("toggleOnInputClick")(toggleOnInputClick.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (validateLabel != null) __obj.updateDynamic("validateLabel")(validateLabel.asInstanceOf[js.Any])
    if (weekStart != null) __obj.updateDynamic("weekStart")(weekStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulmaCalendarOptions]
  }
}

