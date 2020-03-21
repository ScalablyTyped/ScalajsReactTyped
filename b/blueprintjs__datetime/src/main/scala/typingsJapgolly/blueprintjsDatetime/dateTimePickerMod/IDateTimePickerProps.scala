package typingsJapgolly.blueprintjsDatetime.dateTimePickerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.blueprintjsCore.propsMod.IProps
import typingsJapgolly.blueprintjsDatetime.datePickerMod.IDatePickerProps
import typingsJapgolly.blueprintjsDatetime.timePickerMod.ITimePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDateTimePickerProps extends IProps {
  /**
    * Allows the user to clear the selection by clicking the currently selected day.
    * @default true
    */
  var canClearSelection: js.UndefOr[Boolean] = js.undefined
  /**
    * Any props to be passed on to the `DatePicker` other than the `value` and `onChange` props as they come directly
    * from the `DateTimePicker` props.
    */
  var datePickerProps: js.UndefOr[IDatePickerProps] = js.undefined
  /**
    * The initial date and time value that will be set.
    * This will be ignored if `value` is set.
    * @default Date.now()
    */
  var defaultValue: js.UndefOr[js.Date] = js.undefined
  /**
    * Callback invoked when the user changes the date or time.
    */
  var onChange: js.UndefOr[js.Function2[/* selectedDate */ js.Date, /* isUserChange */ Boolean, Unit]] = js.undefined
  /**
    * Any props to be passed on to the `TimePicker` other than the `value` and `onChange` props as they come directly
    * from the `DateTimePicker` props.
    */
  var timePickerProps: js.UndefOr[ITimePickerProps] = js.undefined
  /**
    * The currently set date and time. If this prop is provided, the component acts in a controlled manner.
    */
  var value: js.UndefOr[js.Date] = js.undefined
}

object IDateTimePickerProps {
  @scala.inline
  def apply(
    canClearSelection: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    datePickerProps: IDatePickerProps = null,
    defaultValue: js.Date = null,
    onChange: (/* selectedDate */ js.Date, /* isUserChange */ Boolean) => Callback = null,
    timePickerProps: ITimePickerProps = null,
    value: js.Date = null
  ): IDateTimePickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canClearSelection)) __obj.updateDynamic("canClearSelection")(canClearSelection.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (datePickerProps != null) __obj.updateDynamic("datePickerProps")(datePickerProps.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* selectedDate */ js.Date, t1: /* isUserChange */ scala.Boolean) => onChange(t0, t1).runNow()))
    if (timePickerProps != null) __obj.updateDynamic("timePickerProps")(timePickerProps.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateTimePickerProps]
  }
}

