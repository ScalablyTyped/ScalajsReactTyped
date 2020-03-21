package typingsJapgolly.antdMobile.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.antdMobile.searchBarMod.SearchBarProps
import typingsJapgolly.antdMobile.searchBarMod.default
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchBar {
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    cancelText: String = null,
    className: String = null,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    maxLength: Int | Double = null,
    onBlur: js.UndefOr[Callback] = js.undefined,
    onCancel: /* value */ String => Callback = null,
    onChange: /* value */ String => Callback = null,
    onClear: /* value */ String => Callback = null,
    onFocus: js.UndefOr[Callback] = js.undefined,
    onSubmit: /* value */ String => Callback = null,
    placeholder: String = null,
    prefixCls: String = null,
    showCancelButton: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SearchBarProps, default, Unit, SearchBarProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    onBlur.foreach(p => __obj.updateDynamic("onBlur")(p.toJsFn))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onCancel(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onChange(t0).runNow()))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onClear(t0).runNow()))
    onFocus.foreach(p => __obj.updateDynamic("onFocus")(p.toJsFn))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onSubmit(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(showCancelButton)) __obj.updateDynamic("showCancelButton")(showCancelButton.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antdMobile.searchBarMod.SearchBarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antdMobile.searchBarMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antdMobile.searchBarMod.SearchBarProps])(children: _*)
  }
  @JSImport("antd-mobile/lib/search-bar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

