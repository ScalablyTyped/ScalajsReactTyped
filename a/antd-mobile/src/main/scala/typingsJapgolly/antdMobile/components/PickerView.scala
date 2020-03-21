package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.pickerPropsTypeMod.PickerData
import typingsJapgolly.antdMobile.pickerViewMod.default
import typingsJapgolly.antdMobile.pickerViewPickerViewMod.IPickerView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object PickerView {
  def apply(
    cascade: js.UndefOr[Boolean] = js.undefined,
    cols: Int | Double = null,
    data: js.Array[js.Array[PickerData] | PickerData] = null,
    indicatorStyle: js.Any = null,
    itemStyle: js.Any = null,
    onChange: /* value */ js.UndefOr[js.Any] => Callback = null,
    onScrollChange: /* value */ js.UndefOr[js.Any] => Callback = null,
    pickerPrefixCls: String = null,
    prefixCls: String = null,
    value: js.Array[_] = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IPickerView, default, Unit, IPickerView] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => onChange(t0).runNow()))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => onScrollChange(t0).runNow()))
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.pickerViewPickerViewMod.IPickerView, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.pickerViewMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.pickerViewPickerViewMod.IPickerView])(children: _*)
  }
  @JSImport("antd-mobile/lib/picker-view", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

