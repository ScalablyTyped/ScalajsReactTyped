package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobileRn.AnonDatePickerLocale
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.date
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.datetime
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.month
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.time
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.year
import typingsJapgolly.antdMobileRn.datePickerIndexNativeMod.DatePickerNativeProps
import typingsJapgolly.antdMobileRn.pickerStyleIndexNativeMod.IPickerStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DatePicker {
  def apply(
    disabled: js.UndefOr[Boolean] = js.undefined,
    dismissText: VdomNode = null,
    extra: String = null,
    format: String | (js.Function1[/* value */ js.Date, String]) = null,
    locale: AnonDatePickerLocale = null,
    maxDate: js.Date = null,
    minDate: js.Date = null,
    minuteStep: Int | Double = null,
    mode: datetime | date | year | month | time = null,
    okText: VdomNode = null,
    onChange: /* value */ js.Date => Callback = null,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    onValueChange: (/* vals */ js.Any, /* index */ Double) => Callback = null,
    styles: IPickerStyle = null,
    title: VdomNode = null,
    triggerTypes: String = null,
    value: js.Date = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[
    DatePickerNativeProps, 
    typingsJapgolly.antdMobileRn.mod.DatePicker, 
    Unit, 
    DatePickerNativeProps
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dismissText != null) __obj.updateDynamic("dismissText")(dismissText.rawNode.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (minuteStep != null) __obj.updateDynamic("minuteStep")(minuteStep.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.rawNode.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.Date) => onChange(t0).runNow()))
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction2((t0: /* vals */ js.Any, t1: /* index */ scala.Double) => onValueChange(t0, t1).runNow()))
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    if (triggerTypes != null) __obj.updateDynamic("triggerTypes")(triggerTypes.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobileRn.datePickerIndexNativeMod.DatePickerNativeProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobileRn.mod.DatePicker](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobileRn.datePickerIndexNativeMod.DatePickerNativeProps])(children: _*)
  }
  @JSImport("antd-mobile-rn", "DatePicker")
  @js.native
  object componentImport extends js.Object
  
}

