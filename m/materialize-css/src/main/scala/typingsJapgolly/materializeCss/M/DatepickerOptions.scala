package typingsJapgolly.materializeCss.M

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.materializeCss.PartialInternationalizati
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatepickerOptions extends js.Object {
  /**
    * Automatically close picker when date is selected
    * @default false
    */
  var autoClose: Boolean
  /**
    * Specify a DOM element to render the calendar in, by default it will be placed before the input
    * @default null
    */
  var container: Element
  /**
    * The initial date to view when first opened.
    */
  var defaultDate: js.Date
  /**
    * Prevent selection of any date on the weekend.
    * @default false
    */
  var disableWeekends: Boolean
  /**
    * An array of string returned by `Date.toDateString()`, indicating there are events in the specified days.
    * @default []
    */
  var events: js.Array[String]
  /**
    * First day of week (0: Sunday, 1: Monday etc).
    * @default 0
    */
  var firstDay: Double
  /**
    * The date output format for the input field value.
    * @default 'mmm dd, yyyy'
    */
  var format: String
  /**
    * Internationalization options
    */
  var i18n: PartialInternationalizati
  /**
    * Changes Datepicker to RTL.
    * @default false
    */
  var isRTL: Boolean
  /**
    * The latest date that can be selected.
    */
  var maxDate: js.Date
  /**
    * The earliest date that can be selected.
    */
  var minDate: js.Date
  /**
    * Make the `defaultDate` the initial selected value
    * @default false
    */
  var setDefaultDate: Boolean
  /**
    * Show the clear button in the datepicker
    * @default false
    */
  var showClearBtn: Boolean
  /**
    * Render days of the calendar grid that fall in the next or previous month.
    * @default false
    */
  var showDaysInNextAndPreviousMonths: Boolean
  /**
    * Show month after year in Datepicker title.
    * @default false
    */
  var showMonthAfterYear: Boolean
  /**
    * Number of years either side, or array of upper/lower range.
    * @default 10
    */
  var yearRange: Double | js.Array[Double]
  /**
    * Custom function to disable certain days.
    */
  def disableDayFn(day: js.Date): Boolean
  /**
    * Callback function when Datepicker is closed
    */
  def onClose(): Unit
  /**
    * Callback function when Datepicker HTML is refreshed
    */
  def onDraw(): Unit
  /**
    * Callback function when Datepicker is opened
    */
  def onOpen(): Unit
  /**
    * Callback function when date is selected, first parameter is the newly selected date.
    */
  def onSelect(selectedDate: js.Date): Unit
  /**
    * Used to create date object from current input string.
    */
  def parse(value: String, format: String): js.Date
}

object DatepickerOptions {
  @scala.inline
  def apply(
    autoClose: Boolean,
    container: Element,
    defaultDate: js.Date,
    disableDayFn: js.Date => CallbackTo[Boolean],
    disableWeekends: Boolean,
    events: js.Array[String],
    firstDay: Double,
    format: String,
    i18n: PartialInternationalizati,
    isRTL: Boolean,
    maxDate: js.Date,
    minDate: js.Date,
    onClose: Callback,
    onDraw: Callback,
    onOpen: Callback,
    onSelect: js.Date => Callback,
    parse: (String, String) => CallbackTo[js.Date],
    setDefaultDate: Boolean,
    showClearBtn: Boolean,
    showDaysInNextAndPreviousMonths: Boolean,
    showMonthAfterYear: Boolean,
    yearRange: Double | js.Array[Double]
  ): DatepickerOptions = {
    val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], defaultDate = defaultDate.asInstanceOf[js.Any], disableWeekends = disableWeekends.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], firstDay = firstDay.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], i18n = i18n.asInstanceOf[js.Any], isRTL = isRTL.asInstanceOf[js.Any], maxDate = maxDate.asInstanceOf[js.Any], minDate = minDate.asInstanceOf[js.Any], setDefaultDate = setDefaultDate.asInstanceOf[js.Any], showClearBtn = showClearBtn.asInstanceOf[js.Any], showDaysInNextAndPreviousMonths = showDaysInNextAndPreviousMonths.asInstanceOf[js.Any], showMonthAfterYear = showMonthAfterYear.asInstanceOf[js.Any], yearRange = yearRange.asInstanceOf[js.Any])
    __obj.updateDynamic("disableDayFn")(js.Any.fromFunction1((t0: js.Date) => disableDayFn(t0).runNow()))
    __obj.updateDynamic("onClose")(onClose.toJsFn)
    __obj.updateDynamic("onDraw")(onDraw.toJsFn)
    __obj.updateDynamic("onOpen")(onOpen.toJsFn)
    __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: js.Date) => onSelect(t0).runNow()))
    __obj.updateDynamic("parse")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => parse(t0, t1).runNow()))
    __obj.asInstanceOf[DatepickerOptions]
  }
}

