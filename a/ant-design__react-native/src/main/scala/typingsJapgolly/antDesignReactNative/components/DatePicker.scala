package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.AnonDatePickerLocale
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.date
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.datetime
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.month
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.time
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.year
import typingsJapgolly.antDesignReactNative.datePickerMod.DatePickerProps
import typingsJapgolly.antDesignReactNative.datePickerMod.default
import typingsJapgolly.antDesignReactNative.pickerStyleMod.PickerStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePicker {
  def apply(
    date: js.Any = null,
    defaultDate: js.Date = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dismissText: VdomNode = null,
    extra: String = null,
    format: String | (js.Function1[/* value */ js.Date, String]) = null,
    formatDay: (/* day */ Double, /* date */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    formatMonth: (/* month */ Double, /* date */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    itemStyle: StyleProp[ViewStyle] = null,
    locale: AnonDatePickerLocale = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    minuteStep: Int | Double = null,
    mode: datetime | date | year | month | time = null,
    okText: VdomNode = null,
    onChange: /* value */ js.Date => Callback = null,
    onDateChange: /* date */ js.Any => Callback = null,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    onScrollChange: (/* date */ js.Any, /* vals */ js.Any, /* index */ Double) => Callback = null,
    onValueChange: (/* vals */ js.Any, /* index */ Double) => Callback = null,
    rootNativeProps: js.Object = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[PickerStyle] = null,
    title: VdomNode = null,
    triggerTypes: String = null,
    use12Hours: js.UndefOr[Boolean] = js.undefined,
    value: js.Date = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DatePickerProps, default, Unit, DatePickerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dismissText != null) __obj.updateDynamic("dismissText")(dismissText.rawNode.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatDay != null) __obj.updateDynamic("formatDay")(js.Any.fromFunction2((t0: /* day */ scala.Double, t1: /* date */ js.UndefOr[js.Any]) => formatDay(t0, t1).runNow()))
    if (formatMonth != null) __obj.updateDynamic("formatMonth")(js.Any.fromFunction2((t0: /* month */ scala.Double, t1: /* date */ js.UndefOr[js.Any]) => formatMonth(t0, t1).runNow()))
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.rawNode.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.Date) => onChange(t0).runNow()))
    if (onDateChange != null) __obj.updateDynamic("onDateChange")(js.Any.fromFunction1((t0: /* date */ js.Any) => onDateChange(t0).runNow()))
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction3((t0: /* date */ js.Any, t1: /* vals */ js.Any, t2: /* index */ scala.Double) => onScrollChange(t0, t1, t2).runNow()))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2((t0: /* vals */ js.Any, t1: /* index */ scala.Double) => onValueChange(t0, t1).runNow()))
    if (rootNativeProps != null) __obj.updateDynamic("rootNativeProps")(rootNativeProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (triggerTypes != null) __obj.updateDynamic("triggerTypes")(triggerTypes.asInstanceOf[js.Any])
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.datePickerMod.DatePickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.datePickerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.datePickerMod.DatePickerProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/date-picker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

object Datepicker {
  def apply(
    date: js.Any = null,
    defaultDate: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    formatDay: (/* day */ Double, /* date */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    formatMonth: (/* month */ Double, /* date */ js.UndefOr[js.Any]) => CallbackTo[js.Any] = null,
    itemStyle: StyleProp[ViewStyle] = null,
    locale: js.Any = null,
    maxDate: js.Any = null,
    minDate: js.Any = null,
    minuteStep: Int | Double = null,
    mode: String = null,
    onDateChange: /* date */ js.Any => Callback = null,
    onScrollChange: (/* date */ js.Any, /* vals */ js.Any, /* index */ Double) => Callback = null,
    onValueChange: (/* vals */ js.Any, /* index */ Double) => Callback = null,
    rootNativeProps: js.Object = null,
    style: StyleProp[ViewStyle] = null,
    use12Hours: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    typingsJapgolly.antDesignReactNative.datePickerPropsMod.DatePickerProps, 
    typingsJapgolly.antDesignReactNative.datePickerDatepickerMod.default, 
    Unit, 
    typingsJapgolly.antDesignReactNative.datePickerPropsMod.DatePickerProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (defaultDate != null) __obj.updateDynamic("defaultDate")(defaultDate.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (formatDay != null) __obj.updateDynamic("formatDay")(js.Any.fromFunction2((t0: /* day */ scala.Double, t1: /* date */ js.UndefOr[js.Any]) => formatDay(t0, t1).runNow()))
    if (formatMonth != null) __obj.updateDynamic("formatMonth")(js.Any.fromFunction2((t0: /* month */ scala.Double, t1: /* date */ js.UndefOr[js.Any]) => formatMonth(t0, t1).runNow()))
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onDateChange != null) __obj.updateDynamic("onDateChange")(js.Any.fromFunction1((t0: /* date */ js.Any) => onDateChange(t0).runNow()))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction3((t0: /* date */ js.Any, t1: /* vals */ js.Any, t2: /* index */ scala.Double) => onScrollChange(t0, t1, t2).runNow()))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2((t0: /* vals */ js.Any, t1: /* index */ scala.Double) => onValueChange(t0, t1).runNow()))
    if (rootNativeProps != null) __obj.updateDynamic("rootNativeProps")(rootNativeProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(use12Hours)) __obj.updateDynamic("use12Hours")(use12Hours.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.datePickerPropsMod.DatePickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.datePickerDatepickerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.datePickerPropsMod.DatePickerProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/date-picker/datepicker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

