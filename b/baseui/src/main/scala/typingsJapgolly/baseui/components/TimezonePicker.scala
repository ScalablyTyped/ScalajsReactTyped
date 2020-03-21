package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.baseui.AnonId
import typingsJapgolly.baseui.AnonSelect
import typingsJapgolly.baseui.datepickerMod.TimezonePickerProps
import typingsJapgolly.baseui.selectMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TimezonePicker {
  def apply(
    date: js.Date = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    mapLabels: /* args */ Option => CallbackTo[Node] = null,
    onChange: /* value */ AnonId => CallbackTo[js.Any] = null,
    overrides: AnonSelect = null,
    positive: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    TimezonePickerProps, 
    typingsJapgolly.baseui.datepickerMod.TimezonePicker, 
    Unit, 
    TimezonePickerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (mapLabels != null) __obj.updateDynamic("mapLabels")(js.Any.fromFunction1((t0: /* args */ typingsJapgolly.baseui.selectMod.Option) => mapLabels(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.baseui.AnonId) => onChange(t0).runNow()))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(positive)) __obj.updateDynamic("positive")(positive.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.baseui.datepickerMod.TimezonePickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.baseui.datepickerMod.TimezonePicker](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.baseui.datepickerMod.TimezonePickerProps])(children: _*)
  }
  @JSImport("baseui/datepicker", "TimezonePicker")
  @js.native
  object componentImport extends js.Object
  
}

