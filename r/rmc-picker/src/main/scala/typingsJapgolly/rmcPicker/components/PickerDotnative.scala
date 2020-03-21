package typingsJapgolly.rmcPicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rmcPicker.pickerNativeMod.default
import typingsJapgolly.rmcPicker.pickerTypesMod.IPickerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickerDotnative {
  def apply(
    className: String = null,
    defaultSelectedValue: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    indicatorClassName: String = null,
    indicatorStyle: js.Any = null,
    itemStyle: js.Any = null,
    noAnimate: js.UndefOr[Boolean] = js.undefined,
    onScrollChange: /* value */ js.Any => Callback = null,
    onValueChange: /* value */ js.Any => Callback = null,
    prefixCls: String = null,
    selectedValue: js.Any = null,
    style: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IPickerProps, default, Unit, IPickerProps] = {
    val __obj = js.Dynamic.literal()
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultSelectedValue != null) __obj.updateDynamic("defaultSelectedValue")(defaultSelectedValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (indicatorClassName != null) __obj.updateDynamic("indicatorClassName")(indicatorClassName.asInstanceOf[js.Any])
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(noAnimate)) __obj.updateDynamic("noAnimate")(noAnimate.asInstanceOf[js.Any])
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction1((t0: /* value */ js.Any) => onScrollChange(t0).runNow()))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1((t0: /* value */ js.Any) => onValueChange(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rmcPicker.pickerTypesMod.IPickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rmcPicker.pickerNativeMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rmcPicker.pickerTypesMod.IPickerProps])(children: _*)
  }
  @JSImport("rmc-picker/lib/Picker.native", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

