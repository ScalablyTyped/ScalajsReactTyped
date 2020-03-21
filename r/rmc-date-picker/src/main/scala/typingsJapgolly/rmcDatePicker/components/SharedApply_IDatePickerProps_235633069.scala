package typingsJapgolly.rmcDatePicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rmcDatePicker.idatepickerpropsMod.IDatePickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IDatePickerProps_235633069[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    className: String = null,
    date: js.Any = null,
    defaultDate: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    formatDay: (/* day */ Double, /* date */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    formatMonth: (/* month */ Double, /* date */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    itemStyle: js.Any = null,
    locale: js.Any = null,
    maxDate: js.Any = null,
    maxHour: Int | Double = null,
    maxMinute: Int | Double = null,
    minDate: js.Any = null,
    minHour: Int | Double = null,
    minMinute: Int | Double = null,
    minuteStep: Int | Double = null,
    mode: String = null,
    onDateChange: /* date */ js.Any => Callback = null,
    onScrollChange: (/* date */ js.Any, /* vals */ js.Any, /* index */ Double) => Callback = null,
    onValueChange: (/* vals */ js.Any, /* index */ Double) => Callback = null,
    pickerPrefixCls: String = null,
    prefixCls: String = null,
    rootNativeProps: js.Object = null,
    style: js.Any = null,
    use12Hours: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IDatePickerProps, ComponentRef, Unit, IDatePickerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (formatDay != null) __obj.updateDynamic("formatDay")(js.Any.fromFunction2((t0: /* day */ scala.Double, t1: /* date */ js.UndefOr[js.Any]) => formatDay(t0, t1).runNow()))
    if (formatMonth != null) __obj.updateDynamic("formatMonth")(js.Any.fromFunction2((t0: /* month */ scala.Double, t1: /* date */ js.UndefOr[js.Any]) => formatMonth(t0, t1).runNow()))
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (maxHour != null) __obj.updateDynamic("maxHour")(maxHour.asInstanceOf[js.Any])
    if (maxMinute != null) __obj.updateDynamic("maxMinute")(maxMinute.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minHour != null) __obj.updateDynamic("minHour")(minHour.asInstanceOf[js.Any])
    if (minMinute != null) __obj.updateDynamic("minMinute")(minMinute.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onDateChange != null) __obj.updateDynamic("onDateChange")(js.Any.fromFunction1((t0: /* date */ js.Any) => onDateChange(t0).runNow()))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction3((t0: /* date */ js.Any, t1: /* vals */ js.Any, t2: /* index */ scala.Double) => onScrollChange(t0, t1, t2).runNow()))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2((t0: /* vals */ js.Any, t1: /* index */ scala.Double) => onValueChange(t0, t1).runNow()))
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (rootNativeProps != null) __obj.updateDynamic("rootNativeProps")(rootNativeProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rmcDatePicker.idatepickerpropsMod.IDatePickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rmcDatePicker.idatepickerpropsMod.IDatePickerProps])(children: _*)
  }
}

