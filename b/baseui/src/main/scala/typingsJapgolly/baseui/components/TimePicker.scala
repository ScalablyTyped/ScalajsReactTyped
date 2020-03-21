package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonSelect
import typingsJapgolly.baseui.baseuiStrings.`12`
import typingsJapgolly.baseui.baseuiStrings.`24`
import typingsJapgolly.baseui.baseuiStrings.compact
import typingsJapgolly.baseui.baseuiStrings.default_
import typingsJapgolly.baseui.baseuiStrings.large_
import typingsJapgolly.baseui.timepickerMod.TimePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimePicker {
  def apply(
    creatable: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    format: `12` | `24` = null,
    nullable: js.UndefOr[Boolean] = js.undefined,
    onChange: /* args */ js.Date => CallbackTo[js.Any] = null,
    overrides: AnonSelect = null,
    placeholder: String = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    size: default_ | compact | large_ = null,
    step: Int | Double = null,
    value: js.Date = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    TimePickerProps, 
    typingsJapgolly.baseui.timepickerMod.TimePicker, 
    Unit, 
    TimePickerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(creatable)) __obj.updateDynamic("creatable")(creatable.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(nullable)) __obj.updateDynamic("nullable")(nullable.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* args */ js.Date) => onChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.timepickerMod.TimePickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.timepickerMod.TimePicker](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.timepickerMod.TimePickerProps])(children: _*)
  }
  @JSImport("baseui/timepicker", "TimePicker")
  @js.native
  object componentImport extends js.Object
  
}

