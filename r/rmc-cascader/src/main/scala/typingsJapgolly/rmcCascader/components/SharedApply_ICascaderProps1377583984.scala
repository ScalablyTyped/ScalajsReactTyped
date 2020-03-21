package typingsJapgolly.rmcCascader.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.rmcCascader.cascaderTypesMod.CascaderValue
import typingsJapgolly.rmcCascader.cascaderTypesMod.ICascaderDataItem
import typingsJapgolly.rmcCascader.cascaderTypesMod.ICascaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_ICascaderProps1377583984[ComponentRef] () {
  val componentImport: js.Any
  def apply(
    data: js.Array[ICascaderDataItem],
    className: String = null,
    cols: Int | Double = null,
    defaultValue: CascaderValue = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    indicatorStyle: js.Object = null,
    onChange: /* value */ CascaderValue => Callback = null,
    onScrollChange: /* value */ CascaderValue => Callback = null,
    pickerItemStyle: js.Object = null,
    pickerPrefixCls: String = null,
    prefixCls: String = null,
    rootNativeProps: js.Object = null,
    style: js.Any = null,
    value: CascaderValue = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ICascaderProps, ComponentRef, Unit, ICascaderProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
      if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.rmcCascader.cascaderTypesMod.CascaderValue) => onChange(t0).runNow()))
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.rmcCascader.cascaderTypesMod.CascaderValue) => onScrollChange(t0).runNow()))
    if (pickerItemStyle != null) __obj.updateDynamic("pickerItemStyle")(pickerItemStyle.asInstanceOf[js.Any])
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (rootNativeProps != null) __obj.updateDynamic("rootNativeProps")(rootNativeProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.rmcCascader.cascaderTypesMod.ICascaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  ComponentRef](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rmcCascader.cascaderTypesMod.ICascaderProps])(children: _*)
  }
}

