package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.abstractPickerMod.AbstractPickerProps
import typingsJapgolly.antdMobile.pickerMod.default
import typingsJapgolly.antdMobile.pickerPropsTypeMod.PickerData
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.rmcCascader.cascaderTypesMod.CascaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Picker {
  def apply(
    data: js.Array[js.Array[PickerData] | PickerData],
    WrapComponent: js.Any = null,
    actionTextActiveOpacity: Int | Double = null,
    actionTextUnderlayColor: String = null,
    cascade: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    cols: Int | Double = null,
    content: Element | String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dismissText: String | Element = null,
    extra: String = null,
    format: /* values */ js.Array[Node] => CallbackTo[String | js.Array[Node]] = null,
    indicatorStyle: js.Any = null,
    itemStyle: js.Any = null,
    maskTransitionName: String = null,
    okText: String | Element = null,
    onChange: /* date */ js.UndefOr[CascaderValue] => Callback = null,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    onOk: /* value */ js.UndefOr[js.Any] => Callback = null,
    onPickerChange: /* value */ CascaderValue => Callback = null,
    onVisibleChange: /* visible */ Boolean => Callback = null,
    picker: js.Any = null,
    pickerPrefixCls: String = null,
    pickerValueChangeProp: String = null,
    pickerValueProp: String = null,
    popupPrefixCls: String = null,
    popupTransitionName: String = null,
    prefixCls: String = null,
    style: js.Any = null,
    styles: js.Any = null,
    title: String | Element = null,
    transitionName: String = null,
    triggerType: String = null,
    value: js.Array[String | Double] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    wrapStyle: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[AbstractPickerProps, default, Unit, AbstractPickerProps] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
      if (WrapComponent != null) __obj.updateDynamic("WrapComponent")(WrapComponent.asInstanceOf[js.Any])
    if (actionTextActiveOpacity != null) __obj.updateDynamic("actionTextActiveOpacity")(actionTextActiveOpacity.asInstanceOf[js.Any])
    if (actionTextUnderlayColor != null) __obj.updateDynamic("actionTextUnderlayColor")(actionTextUnderlayColor.asInstanceOf[js.Any])
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dismissText != null) __obj.updateDynamic("dismissText")(dismissText.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1((t0: /* values */ js.Array[japgolly.scalajs.react.raw.React.Node]) => format(t0).runNow()))
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* date */ js.UndefOr[typingsJapgolly.rmcCascader.cascaderTypesMod.CascaderValue]) => onChange(t0).runNow()))
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => onOk(t0).runNow()))
    if (onPickerChange != null) __obj.updateDynamic("onPickerChange")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.rmcCascader.cascaderTypesMod.CascaderValue) => onPickerChange(t0).runNow()))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onVisibleChange(t0).runNow()))
    if (picker != null) __obj.updateDynamic("picker")(picker.asInstanceOf[js.Any])
    if (pickerPrefixCls != null) __obj.updateDynamic("pickerPrefixCls")(pickerPrefixCls.asInstanceOf[js.Any])
    if (pickerValueChangeProp != null) __obj.updateDynamic("pickerValueChangeProp")(pickerValueChangeProp.asInstanceOf[js.Any])
    if (pickerValueProp != null) __obj.updateDynamic("pickerValueProp")(pickerValueProp.asInstanceOf[js.Any])
    if (popupPrefixCls != null) __obj.updateDynamic("popupPrefixCls")(popupPrefixCls.asInstanceOf[js.Any])
    if (popupTransitionName != null) __obj.updateDynamic("popupTransitionName")(popupTransitionName.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName.asInstanceOf[js.Any])
    if (triggerType != null) __obj.updateDynamic("triggerType")(triggerType.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (wrapStyle != null) __obj.updateDynamic("wrapStyle")(wrapStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.abstractPickerMod.AbstractPickerProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.pickerMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.abstractPickerMod.AbstractPickerProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/picker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

