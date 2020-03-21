package typingsJapgolly.blueprintjsDatetime.timePickerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimePickerProps extends IProps {
  /**
    * Initial time the `TimePicker` will display.
    * This should not be set if `value` is set.
    */
  var defaultValue: js.UndefOr[js.Date] = js.undefined
  /**
    * Whether the time picker is non-interactive.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The latest time the user can select. The year, month, and day parts of the `Date` object are ignored.
    * While the `maxTime` will be later than the `minTime` in the basic case,
    * it is also allowed to be earlier than the `minTime`.
    * This is useful, for example, to express a time range that extends before and after midnight.
    * If the `maxTime` and `minTime` are equal, then the valid time range is constrained to only that one value.
    */
  var maxTime: js.UndefOr[js.Date] = js.undefined
  /**
    * The earliest time the user can select. The year, month, and day parts of the `Date` object are ignored.
    * While the `minTime` will be earlier than the `maxTime` in the basic case,
    * it is also allowed to be later than the `maxTime`.
    * This is useful, for example, to express a time range that extends before and after midnight.
    * If the `maxTime` and `minTime` are equal, then the valid time range is constrained to only that one value.
    */
  var minTime: js.UndefOr[js.Date] = js.undefined
  /**
    * Callback invoked when the user changes the time.
    */
  var onChange: js.UndefOr[js.Function1[/* newTime */ js.Date, Unit]] = js.undefined
  /**
    * The precision of time the user can set.
    * @default TimePrecision.MINUTE
    */
  var precision: js.UndefOr[TimePrecision] = js.undefined
  /**
    * Whether all the text in each input should be selected on focus.
    * @default false
    */
  var selectAllOnFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to show arrows buttons for changing the time.
    * @default false
    */
  var showArrowButtons: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to use a 12 hour format with an AM/PM dropdown.
    * @default false
    */
  var useAmPm: js.UndefOr[Boolean] = js.undefined
  /**
    * The currently set time.
    * If this prop is provided, the component acts in a controlled manner.
    */
  var value: js.UndefOr[js.Date] = js.undefined
}

object ITimePickerProps {
  @scala.inline
  def apply(
    className: String = null,
    defaultValue: js.Date = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    maxTime: js.Date = null,
    minTime: js.Date = null,
    onChange: /* newTime */ js.Date => Callback = null,
    precision: TimePrecision = null,
    selectAllOnFocus: js.UndefOr[Boolean] = js.undefined,
    showArrowButtons: js.UndefOr[Boolean] = js.undefined,
    useAmPm: js.UndefOr[Boolean] = js.undefined,
    value: js.Date = null
  ): ITimePickerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (maxTime != null) __obj.updateDynamic("maxTime")(maxTime.asInstanceOf[js.Any])
    if (minTime != null) __obj.updateDynamic("minTime")(minTime.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* newTime */ js.Date) => onChange(t0).runNow()))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(selectAllOnFocus)) __obj.updateDynamic("selectAllOnFocus")(selectAllOnFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(showArrowButtons)) __obj.updateDynamic("showArrowButtons")(showArrowButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(useAmPm)) __obj.updateDynamic("useAmPm")(useAmPm.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimePickerProps]
  }
}

