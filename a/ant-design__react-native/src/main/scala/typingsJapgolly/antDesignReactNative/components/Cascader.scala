package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antDesignReactNative.cascaderMod.default
import typingsJapgolly.antDesignReactNative.cascaderTypesMod.CascaderDataItem
import typingsJapgolly.antDesignReactNative.cascaderTypesMod.CascaderProps
import typingsJapgolly.antDesignReactNative.cascaderTypesMod.CascaderValue
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Cascader {
  def apply(
    data: js.Array[CascaderDataItem],
    cols: Int | Double = null,
    defaultValue: CascaderValue = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    indicatorStyle: StyleProp[ViewStyle] = null,
    onChange: /* value */ CascaderValue => Callback = null,
    onScrollChange: /* value */ CascaderValue => Callback = null,
    pickerItemStyle: StyleProp[ViewStyle] = null,
    rootNativeProps: js.Object = null,
    style: StyleProp[ViewStyle] = null,
    value: CascaderValue = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[CascaderProps, default, Unit, CascaderProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
      if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.antDesignReactNative.cascaderTypesMod.CascaderValue) => onChange(t0).runNow()))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.antDesignReactNative.cascaderTypesMod.CascaderValue) => onScrollChange(t0).runNow()))
    if (pickerItemStyle != null) __obj.updateDynamic("pickerItemStyle")(pickerItemStyle.asInstanceOf[js.Any])
    if (rootNativeProps != null) __obj.updateDynamic("rootNativeProps")(rootNativeProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.cascaderTypesMod.CascaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.cascaderMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.cascaderTypesMod.CascaderProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/picker/cascader", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

