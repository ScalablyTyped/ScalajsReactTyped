package typingsJapgolly.blueprintjsTimezone.timezonePickerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.blueprintjsCore.inputGroupMod.IInputGroupProps
import typingsJapgolly.blueprintjsCore.propsMod.HTMLInputProps
import typingsJapgolly.blueprintjsCore.propsMod.IProps
import typingsJapgolly.blueprintjsTimezone.PartialIButtonProps
import typingsJapgolly.blueprintjsTimezone.PartialIPopoverProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimezonePickerProps extends IProps {
  /**
    * Props to spread to the target `Button`.
    * This prop will be ignored if `children` is provided.
    */
  var buttonProps: js.UndefOr[PartialIButtonProps] = js.undefined
  /**
    * The date to use when formatting timezone offsets.
    * An offset date is necessary to account for DST, but typically the default value of `now` will be sufficient.
    * @default now
    */
  var date: js.UndefOr[js.Date] = js.undefined
  /**
    * Whether this component is non-interactive.
    * This prop will be ignored if `children` is provided.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Props to spread to the filter `InputGroup`.
    * All props are supported except `ref` (use `inputRef` instead).
    * If you want to control the filter input, you can pass `value` and `onChange` here
    * to override `Select`'s own behavior.
    */
  var inputProps: js.UndefOr[IInputGroupProps with HTMLInputProps] = js.undefined
  /**
    * Text to show when no timezone has been selected (`value === undefined`).
    * This prop will be ignored if `children` is provided.
    * @default "Select timezone..."
    */
  var placeholder: js.UndefOr[String] = js.undefined
  /** Props to spread to `Popover`. Note that `content` cannot be changed. */
  var popoverProps: js.UndefOr[PartialIPopoverProps] = js.undefined
  /**
    * Whether to show the local timezone at the top of the list of initial timezone suggestions.
    * @default true
    */
  var showLocalTimezone: js.UndefOr[Boolean] = js.undefined
  /**
    * The currently selected timezone UTC identifier, e.g. "Pacific/Honolulu".
    * See https://www.iana.org/time-zones for more information.
    */
  var value: js.UndefOr[String] = js.undefined
  /**
    * Format to use when displaying the selected (or default) timezone within the target element.
    * This prop will be ignored if `children` is provided.
    * @default TimezoneDisplayFormat.OFFSET
    */
  var valueDisplayFormat: js.UndefOr[
    typingsJapgolly.blueprintjsTimezone.timezoneDisplayFormatMod.TimezoneDisplayFormat
  ] = js.undefined
  /**
    * Callback invoked when the user selects a timezone.
    */
  def onChange(timezone: String): Unit
}

object ITimezonePickerProps {
  @scala.inline
  def apply(
    onChange: String => Callback,
    buttonProps: PartialIButtonProps = null,
    className: String = null,
    date: js.Date = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    inputProps: IInputGroupProps with HTMLInputProps = null,
    placeholder: String = null,
    popoverProps: PartialIPopoverProps = null,
    showLocalTimezone: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    valueDisplayFormat: typingsJapgolly.blueprintjsTimezone.timezoneDisplayFormatMod.TimezoneDisplayFormat = null
  ): ITimezonePickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: java.lang.String) => onChange(t0).runNow()))
    if (buttonProps != null) __obj.updateDynamic("buttonProps")(buttonProps.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (popoverProps != null) __obj.updateDynamic("popoverProps")(popoverProps.asInstanceOf[js.Any])
    if (!js.isUndefined(showLocalTimezone)) __obj.updateDynamic("showLocalTimezone")(showLocalTimezone.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueDisplayFormat != null) __obj.updateDynamic("valueDisplayFormat")(valueDisplayFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimezonePickerProps]
  }
}

