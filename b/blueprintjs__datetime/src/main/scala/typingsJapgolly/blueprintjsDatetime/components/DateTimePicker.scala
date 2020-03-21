package typingsJapgolly.blueprintjsDatetime.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.blueprintjsDatetime.datePickerMod.IDatePickerProps
import typingsJapgolly.blueprintjsDatetime.dateTimePickerMod.IDateTimePickerProps
import typingsJapgolly.blueprintjsDatetime.timePickerMod.ITimePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateTimePicker {
  def apply(
    canClearSelection: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    datePickerProps: IDatePickerProps = null,
    defaultValue: js.Date = null,
    onChange: (/* selectedDate */ js.Date, /* isUserChange */ Boolean) => Callback = null,
    timePickerProps: ITimePickerProps = null,
    value: js.Date = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    IDateTimePickerProps, 
    typingsJapgolly.blueprintjsDatetime.mod.DateTimePicker, 
    Unit, 
    IDateTimePickerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(canClearSelection)) __obj.updateDynamic("canClearSelection")(canClearSelection.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (datePickerProps != null) __obj.updateDynamic("datePickerProps")(datePickerProps.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* selectedDate */ js.Date, t1: /* isUserChange */ scala.Boolean) => onChange(t0, t1).runNow()))
    if (timePickerProps != null) __obj.updateDynamic("timePickerProps")(timePickerProps.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsDatetime.dateTimePickerMod.IDateTimePickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsDatetime.mod.DateTimePicker](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsDatetime.dateTimePickerMod.IDateTimePickerProps])(children: _*)
  }
  @JSImport("@blueprintjs/datetime", "DateTimePicker")
  @js.native
  object componentImport extends js.Object
  
}

