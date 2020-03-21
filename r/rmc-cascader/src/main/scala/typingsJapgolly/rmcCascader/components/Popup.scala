package typingsJapgolly.rmcCascader.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.rmcCascader.cascaderTypesMod.CascaderValue
import typingsJapgolly.rmcCascader.popupMod.IPopupCascaderProps
import typingsJapgolly.rmcCascader.popupMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Popup {
  def apply(
    cascader: VdomElement,
    WrapComponent: js.Any = null,
    actionTextActiveOpacity: Int | Double = null,
    actionTextUnderlayColor: String = null,
    className: String = null,
    content: Element | String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dismissText: String | Element = null,
    maskTransitionName: String = null,
    okText: String | Element = null,
    onChange: /* date */ js.UndefOr[CascaderValue] => Callback = null,
    onDismiss: js.UndefOr[Callback] = js.undefined,
    onOk: /* value */ js.UndefOr[js.Any] => Callback = null,
    onVisibleChange: /* visible */ Boolean => Callback = null,
    picker: js.Any = null,
    pickerValueChangeProp: String = null,
    pickerValueProp: String = null,
    popupTransitionName: String = null,
    prefixCls: String = null,
    style: js.Any = null,
    styles: js.Any = null,
    title: String | Element = null,
    transitionName: String = null,
    triggerType: String = null,
    value: js.Any = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    wrapStyle: CSSProperties = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[IPopupCascaderProps, default, Unit, IPopupCascaderProps] = {
    val __obj = js.Dynamic.literal()
  
      if (cascader != null) __obj.updateDynamic("cascader")(cascader.rawElement.asInstanceOf[js.Any])
    if (WrapComponent != null) __obj.updateDynamic("WrapComponent")(WrapComponent.asInstanceOf[js.Any])
    if (actionTextActiveOpacity != null) __obj.updateDynamic("actionTextActiveOpacity")(actionTextActiveOpacity.asInstanceOf[js.Any])
    if (actionTextUnderlayColor != null) __obj.updateDynamic("actionTextUnderlayColor")(actionTextUnderlayColor.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dismissText != null) __obj.updateDynamic("dismissText")(dismissText.asInstanceOf[js.Any])
    if (maskTransitionName != null) __obj.updateDynamic("maskTransitionName")(maskTransitionName.asInstanceOf[js.Any])
    if (okText != null) __obj.updateDynamic("okText")(okText.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* date */ js.UndefOr[typingsJapgolly.rmcCascader.cascaderTypesMod.CascaderValue]) => onChange(t0).runNow()))
    onDismiss.foreach(p => __obj.updateDynamic("onDismiss")(p.toJsFn))
    if (onOk != null) __obj.updateDynamic("onOk")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[js.Any]) => onOk(t0).runNow()))
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1((t0: /* visible */ scala.Boolean) => onVisibleChange(t0).runNow()))
    if (picker != null) __obj.updateDynamic("picker")(picker.asInstanceOf[js.Any])
    if (pickerValueChangeProp != null) __obj.updateDynamic("pickerValueChangeProp")(pickerValueChangeProp.asInstanceOf[js.Any])
    if (pickerValueProp != null) __obj.updateDynamic("pickerValueProp")(pickerValueProp.asInstanceOf[js.Any])
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
  typingsJapgolly.rmcCascader.popupMod.IPopupCascaderProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.rmcCascader.popupMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rmcCascader.popupMod.IPopupCascaderProps])(children: _*)
  }
  @JSImport("rmc-cascader/lib/Popup", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

