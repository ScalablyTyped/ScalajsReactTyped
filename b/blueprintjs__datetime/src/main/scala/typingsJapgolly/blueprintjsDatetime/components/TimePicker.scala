package typingsJapgolly.blueprintjsDatetime.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsDatetime.timePickerMod.ITimePickerProps
import typingsJapgolly.blueprintjsDatetime.timePickerMod.TimePrecision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimePicker {
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
    value: js.Date = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    ITimePickerProps, 
    typingsJapgolly.blueprintjsDatetime.mod.TimePicker, 
    Unit, 
    ITimePickerProps
  ] = {
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
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsDatetime.timePickerMod.ITimePickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsDatetime.mod.TimePicker](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsDatetime.timePickerMod.ITimePickerProps])(children: _*)
  }
  @JSImport("@blueprintjs/datetime", "TimePicker")
  @js.native
  object componentImport extends js.Object
  
}

