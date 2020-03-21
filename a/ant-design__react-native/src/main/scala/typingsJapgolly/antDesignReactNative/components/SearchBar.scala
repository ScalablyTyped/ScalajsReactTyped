package typingsJapgolly.antDesignReactNative.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsJapgolly.antDesignReactNative.AnonNativeEvent
import typingsJapgolly.antDesignReactNative.searchBarMod.SearchBarProps
import typingsJapgolly.antDesignReactNative.searchBarMod.default
import typingsJapgolly.antDesignReactNative.searchBarStyleMod.SearchBarStyle
import typingsJapgolly.reactNative.mod.NodeHandle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SearchBar {
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    cancelText: String = null,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    maxLength: Int | Double = null,
    onBlur: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onCancel: /* value */ String => Callback = null,
    onChange: /* value */ String => Callback = null,
    onChangeText: /* text */ String => Callback = null,
    onClear: /* value */ String => Callback = null,
    onFocus: ReactEventFrom[NodeHandle with Element] => Callback = null,
    onSubmit: /* value */ String => Callback = null,
    onSubmitEditing: /* event */ AnonNativeEvent => Callback = null,
    placeholder: String = null,
    showCancelButton: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[TextStyle] = null,
    styles: Partial[SearchBarStyle] = null,
    value: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[SearchBarProps, default, Unit, SearchBarProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onCancel(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onChange(t0).runNow()))
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => onChangeText(t0).runNow()))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onClear(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactEventFrom[typingsJapgolly.reactNative.mod.NodeHandle with org.scalajs.dom.raw.Element]) => onFocus(t0).runNow()))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onSubmit(t0).runNow()))
    if (onSubmitEditing != null) __obj.updateDynamic("onSubmitEditing")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.antDesignReactNative.AnonNativeEvent) => onSubmitEditing(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(showCancelButton)) __obj.updateDynamic("showCancelButton")(showCancelButton.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antDesignReactNative.searchBarMod.SearchBarProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antDesignReactNative.searchBarMod.default](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignReactNative.searchBarMod.SearchBarProps])(children: _*)
  }
  @JSImport("@ant-design/react-native/lib/search-bar", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

