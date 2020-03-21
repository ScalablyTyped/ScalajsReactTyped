package typingsJapgolly.blueprintjsDatetime.datePickerCoreMod

import typingsJapgolly.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typingsJapgolly.blueprintjsDatetime.timePickerMod.TimePrecision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePickerBaseProps extends js.Object {
  /**
    * The initial month the calendar displays.
    */
  var initialMonth: js.UndefOr[js.Date] = js.undefined
  /**
    * The locale name, which is passed to the functions in `localeUtils`
    * (and `formatDate` and `parseDate` if supported).
    */
  var locale: js.UndefOr[String] = js.undefined
  /**
    * Collection of functions that provide internationalization support.
    */
  var localeUtils: js.UndefOr[
    /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any
  ] = js.undefined
  /**
    * The latest date the user can select.
    * @default Dec. 31st of this year.
    */
  var maxDate: js.UndefOr[js.Date] = js.undefined
  /**
    * The earliest date the user can select.
    * @default Jan. 1st, 20 years in the past.
    */
  var minDate: js.UndefOr[js.Date] = js.undefined
  /**
    * Collection of functions that determine which modifier classes get applied to which days.
    * Each function should accept a `Date` and return a boolean.
    * See the [**react-day-picker** documentation](http://react-day-picker.js.org/api/ModifiersUtils) to learn more.
    */
  var modifiers: js.UndefOr[IDatePickerModifiers] = js.undefined
  /**
    * If `true`, the month menu will appear to the left of the year menu.
    * Otherwise, the month menu will apear to the right of the year menu.
    * @default false
    */
  var reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined
  /**
    * Further configure the `TimePicker` that appears beneath the calendar.
    * `onChange` and `value` are ignored in favor of the corresponding
    * top-level props on this component.
    *
    * Passing any defined value to this prop (even `{}`) will cause the
    * `TimePicker` to appear.
    */
  var timePickerProps: js.UndefOr[ITimePickerProps] = js.undefined
  /**
    * The precision of time selection that accompanies the calendar. Passing a
    * `TimePrecision` value (or providing `timePickerProps`) shows a
    * `TimePicker` below the calendar. Time is preserved across date changes.
    *
    * This is shorthand for `timePickerProps.precision` and is a quick way to
    * enable time selection.
    */
  var timePrecision: js.UndefOr[TimePrecision] = js.undefined
}

object IDatePickerBaseProps {
  @scala.inline
  def apply(
    initialMonth: js.Date = null,
    locale: String = null,
    localeUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    modifiers: IDatePickerModifiers = null,
    reverseMonthAndYearMenus: js.UndefOr[Boolean] = js.undefined,
    timePickerProps: ITimePickerProps = null,
    timePrecision: TimePrecision = null
  ): IDatePickerBaseProps = {
    val __obj = js.Dynamic.literal()
    if (initialMonth != null) __obj.updateDynamic("initialMonth")(initialMonth.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localeUtils != null) __obj.updateDynamic("localeUtils")(localeUtils.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (modifiers != null) __obj.updateDynamic("modifiers")(modifiers.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseMonthAndYearMenus)) __obj.updateDynamic("reverseMonthAndYearMenus")(reverseMonthAndYearMenus.asInstanceOf[js.Any])
    if (timePickerProps != null) __obj.updateDynamic("timePickerProps")(timePickerProps.asInstanceOf[js.Any])
    if (timePrecision != null) __obj.updateDynamic("timePrecision")(timePrecision.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDatePickerBaseProps]
  }
}

