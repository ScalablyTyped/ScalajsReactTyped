package typingsJapgolly.blueprintjsTimezone.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsCore.inputGroupMod.IInputGroupProps
import typingsJapgolly.blueprintjsCore.propsMod.HTMLInputProps
import typingsJapgolly.blueprintjsTimezone.PartialIButtonProps
import typingsJapgolly.blueprintjsTimezone.PartialIPopoverProps
import typingsJapgolly.blueprintjsTimezone.timezoneDisplayFormatMod.TimezoneDisplayFormat
import typingsJapgolly.blueprintjsTimezone.timezonePickerMod.ITimezonePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimezonePicker {
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
    valueDisplayFormat: TimezoneDisplayFormat = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ITimezonePickerProps, 
    typingsJapgolly.blueprintjsTimezone.mod.TimezonePicker, 
    Unit, 
    ITimezonePickerProps
  ] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsTimezone.timezonePickerMod.ITimezonePickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsTimezone.mod.TimezonePicker](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsTimezone.timezonePickerMod.ITimezonePickerProps])(children: _*)
  }
  @JSImport("@blueprintjs/timezone", "TimezonePicker")
  @js.native
  object componentImport extends js.Object
  
}

