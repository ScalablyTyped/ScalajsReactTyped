package typingsJapgolly.extjs.Ext.picker

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.extjs.Ext.Array
import typingsJapgolly.extjs.Ext.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDate extends IComponent {
  /** [Config Option] (String) */
  var ariaTitle: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var ariaTitleDateFormat: js.UndefOr[String] = js.undefined
  /** [Config Option] (String[]) */
  var dayNames: js.UndefOr[Array] = js.undefined
  /** [Config Option] (Boolean) */
  var disableAnim: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var disabledCellCls: js.UndefOr[String] = js.undefined
  /** [Config Option] (String[]) */
  var disabledDates: js.UndefOr[Array] = js.undefined
  /** [Config Option] (RegExp) */
  var disabledDatesRE: js.UndefOr[js.RegExp] = js.undefined
  /** [Config Option] (String) */
  var disabledDatesText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Number[]) */
  var disabledDays: js.UndefOr[Array] = js.undefined
  /** [Config Option] (String) */
  var disabledDaysText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var focusOnShow: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var format: js.UndefOr[String] = js.undefined
  /** [Method] Gets a single character to represent the day of the week
  		* @param value Object
  		* @returns String The character
  		*/
  var getDayInitial: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], String]] = js.undefined
  /** [Method] Gets the current selected value of the date field
  		* @returns Date The selected date
  		*/
  var getValue: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.undefined
  /** [Method] Hides the month picker if it s visible
  		* @param animate Boolean Indicates whether to animate this action. If the animate parameter is not specified, the behavior will use disableAnim to determine whether to animate or not.
  		* @returns Ext.picker.Date this
  		*/
  var hideMonthPicker: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Boolean], this.type]] = js.undefined
  /** [Config Option] (Object) */
  var keyNavConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var longDayFormat: js.UndefOr[String] = js.undefined
  /** [Config Option] (Date) */
  var maxDate: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var maxText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Date) */
  var minDate: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var minText: js.UndefOr[String] = js.undefined
  /** [Config Option] (String[]) */
  var monthNames: js.UndefOr[Array] = js.undefined
  /** [Config Option] (String) */
  var monthYearFormat: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var monthYearText: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var nextText: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var prevText: js.UndefOr[String] = js.undefined
  /** [Config Option] (Object) */
  var scope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the current value to today
  		* @returns Ext.picker.Date this
  		*/
  var selectToday: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (String) */
  var selectedCls: js.UndefOr[String] = js.undefined
  /** [Method] Replaces any existing disabled dates with new values and refreshes the DatePicker
  		* @param disabledDates String[]/RegExp An array of date strings (see the disabledDates config for details on supported values), or a JavaScript regular expression used to disable a pattern of dates.
  		* @returns Ext.picker.Date this
  		*/
  var setDisabledDates: js.UndefOr[js.Function1[/* disabledDates */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Replaces any existing disabled days by index 0 6 with new values and refreshes the DatePicker
  		* @param disabledDays Number[] An array of disabled day indexes. See the disabledDays config for details on supported values.
  		* @returns Ext.picker.Date this
  		*/
  var setDisabledDays: js.UndefOr[js.Function1[/* disabledDays */ js.UndefOr[Array], this.type]] = js.undefined
  /** [Method] Replaces any existing maxDate with the new value and refreshes the DatePicker
  		* @param value Date The maximum date that can be selected
  		* @returns Ext.picker.Date this
  		*/
  var setMaxDate: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Replaces any existing minDate with the new value and refreshes the DatePicker
  		* @param value Date The minimum date that can be selected
  		* @returns Ext.picker.Date this
  		*/
  var setMinDate: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Sets the value of the date field
  		* @param value Date The date to set
  		* @returns Ext.picker.Date this
  		*/
  var setValue: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Show the month picker
  		* @param animate Boolean Indicates whether to animate this action. If the animate parameter is not specified, the behavior will use disableAnim to determine whether to animate or not.
  		* @returns Ext.picker.Date this
  		*/
  var showMonthPicker: js.UndefOr[js.Function1[/* animate */ js.UndefOr[Boolean], this.type]] = js.undefined
  /** [Method] Show the next month
  		* @param e Object
  		* @returns Ext.picker.Date this
  		*/
  var showNextMonth: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Show the next year
  		* @returns Ext.picker.Date this
  		*/
  var showNextYear: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Method] Show the previous month
  		* @param e Object
  		* @returns Ext.picker.Date this
  		*/
  var showPrevMonth: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], this.type]] = js.undefined
  /** [Method] Show the previous year
  		* @returns Ext.picker.Date this
  		*/
  var showPrevYear: js.UndefOr[js.Function0[this.type]] = js.undefined
  /** [Config Option] (Boolean) */
  var showToday: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number) */
  var startDay: js.UndefOr[Double] = js.undefined
  /** [Config Option] (String) */
  var todayText: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var todayTip: js.UndefOr[String] = js.undefined
}

object IDate {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    ariaTitle: String = null,
    ariaTitleDateFormat: String = null,
    dayNames: Array = null,
    disableAnim: js.UndefOr[Boolean] = js.undefined,
    disabledCellCls: String = null,
    disabledDates: Array = null,
    disabledDatesRE: js.RegExp = null,
    disabledDatesText: String = null,
    disabledDays: Array = null,
    disabledDaysText: String = null,
    focusOnShow: js.UndefOr[Boolean] = js.undefined,
    format: String = null,
    getDayInitial: /* value */ js.UndefOr[js.Any] => CallbackTo[String] = null,
    getValue: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    handler: js.Any = null,
    hideMonthPicker: /* animate */ js.UndefOr[Boolean] => CallbackTo[IDate] = null,
    keyNavConfig: js.Any = null,
    longDayFormat: String = null,
    maxDate: js.Any = null,
    maxText: String = null,
    minDate: js.Any = null,
    minText: String = null,
    monthNames: Array = null,
    monthYearFormat: String = null,
    monthYearText: String = null,
    nextText: String = null,
    prevText: String = null,
    scope: js.Any = null,
    selectToday: js.UndefOr[CallbackTo[IDate]] = js.undefined,
    selectedCls: String = null,
    setDisabledDates: /* disabledDates */ js.UndefOr[js.Any] => CallbackTo[IDate] = null,
    setDisabledDays: /* disabledDays */ js.UndefOr[Array] => CallbackTo[IDate] = null,
    setMaxDate: /* value */ js.UndefOr[js.Any] => CallbackTo[IDate] = null,
    setMinDate: /* value */ js.UndefOr[js.Any] => CallbackTo[IDate] = null,
    setValue: /* value */ js.UndefOr[js.Any] => CallbackTo[IDate] = null,
    showMonthPicker: /* animate */ js.UndefOr[Boolean] => CallbackTo[IDate] = null,
    showNextMonth: /* e */ js.UndefOr[js.Any] => CallbackTo[IDate] = null,
    showNextYear: js.UndefOr[CallbackTo[IDate]] = js.undefined,
    showPrevMonth: /* e */ js.UndefOr[js.Any] => CallbackTo[IDate] = null,
    showPrevYear: js.UndefOr[CallbackTo[IDate]] = js.undefined,
    showToday: js.UndefOr[Boolean] = js.undefined,
    startDay: Int | Double = null,
    todayText: String = null,
    todayTip: String = null
  ): IDate = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (ariaTitle != null) __obj.updateDynamic("ariaTitle")(ariaTitle.asInstanceOf[js.Any])
    if (ariaTitleDateFormat != null) __obj.updateDynamic("ariaTitleDateFormat")(ariaTitleDateFormat.asInstanceOf[js.Any])
    if (dayNames != null) __obj.updateDynamic("dayNames")(dayNames.asInstanceOf[js.Any])
    if (!js.isUndefined(disableAnim)) __obj.updateDynamic("disableAnim")(disableAnim.asInstanceOf[js.Any])
    if (disabledCellCls != null) __obj.updateDynamic("disabledCellCls")(disabledCellCls.asInstanceOf[js.Any])
    if (disabledDates != null) __obj.updateDynamic("disabledDates")(disabledDates.asInstanceOf[js.Any])
    if (disabledDatesRE != null) __obj.updateDynamic("disabledDatesRE")(disabledDatesRE.asInstanceOf[js.Any])
    if (disabledDatesText != null) __obj.updateDynamic("disabledDatesText")(disabledDatesText.asInstanceOf[js.Any])
    if (disabledDays != null) __obj.updateDynamic("disabledDays")(disabledDays.asInstanceOf[js.Any])
    if (disabledDaysText != null) __obj.updateDynamic("disabledDaysText")(disabledDaysText.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnShow)) __obj.updateDynamic("focusOnShow")(focusOnShow.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (getDayInitial != null) __obj.updateDynamic("getDayInitial")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => getDayInitial(t0).runNow()))
    getValue.foreach(p => __obj.updateDynamic("getValue")(p.toJsFn))
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (hideMonthPicker != null) __obj.updateDynamic("hideMonthPicker")(js.Any.fromFunction1((t0: /* animate */ js.UndefOr[scala.Boolean]) => hideMonthPicker(t0).runNow()))
    if (keyNavConfig != null) __obj.updateDynamic("keyNavConfig")(keyNavConfig.asInstanceOf[js.Any])
    if (longDayFormat != null) __obj.updateDynamic("longDayFormat")(longDayFormat.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxText != null) __obj.updateDynamic("maxText")(maxText.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minText != null) __obj.updateDynamic("minText")(minText.asInstanceOf[js.Any])
    if (monthNames != null) __obj.updateDynamic("monthNames")(monthNames.asInstanceOf[js.Any])
    if (monthYearFormat != null) __obj.updateDynamic("monthYearFormat")(monthYearFormat.asInstanceOf[js.Any])
    if (monthYearText != null) __obj.updateDynamic("monthYearText")(monthYearText.asInstanceOf[js.Any])
    if (nextText != null) __obj.updateDynamic("nextText")(nextText.asInstanceOf[js.Any])
    if (prevText != null) __obj.updateDynamic("prevText")(prevText.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    selectToday.foreach(p => __obj.updateDynamic("selectToday")(p.toJsFn))
    if (selectedCls != null) __obj.updateDynamic("selectedCls")(selectedCls.asInstanceOf[js.Any])
    if (setDisabledDates != null) __obj.updateDynamic("setDisabledDates")(js.Any.fromFunction1((t0: /* disabledDates */ js.UndefOr[js.Any]) => setDisabledDates(t0).runNow()))
    if (setDisabledDays != null) __obj.updateDynamic("setDisabledDays")(js.Any.fromFunction1((t0: /* disabledDays */ js.UndefOr[typingsJapgolly.extjs.Ext.Array]) => setDisabledDays(t0).runNow()))
    if (setMaxDate != null) __obj.updateDynamic("setMaxDate")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => setMaxDate(t0).runNow()))
    if (setMinDate != null) __obj.updateDynamic("setMinDate")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => setMinDate(t0).runNow()))
    if (setValue != null) __obj.updateDynamic("setValue")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => setValue(t0).runNow()))
    if (showMonthPicker != null) __obj.updateDynamic("showMonthPicker")(js.Any.fromFunction1((t0: /* animate */ js.UndefOr[scala.Boolean]) => showMonthPicker(t0).runNow()))
    if (showNextMonth != null) __obj.updateDynamic("showNextMonth")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[js.Any]) => showNextMonth(t0).runNow()))
    showNextYear.foreach(p => __obj.updateDynamic("showNextYear")(p.toJsFn))
    if (showPrevMonth != null) __obj.updateDynamic("showPrevMonth")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[js.Any]) => showPrevMonth(t0).runNow()))
    showPrevYear.foreach(p => __obj.updateDynamic("showPrevYear")(p.toJsFn))
    if (!js.isUndefined(showToday)) __obj.updateDynamic("showToday")(showToday.asInstanceOf[js.Any])
    if (startDay != null) __obj.updateDynamic("startDay")(startDay.asInstanceOf[js.Any])
    if (todayText != null) __obj.updateDynamic("todayText")(todayText.asInstanceOf[js.Any])
    if (todayTip != null) __obj.updateDynamic("todayTip")(todayTip.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDate]
  }
}

