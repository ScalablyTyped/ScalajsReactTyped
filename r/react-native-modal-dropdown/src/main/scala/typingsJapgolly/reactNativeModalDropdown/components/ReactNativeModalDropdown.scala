package typingsJapgolly.reactNativeModalDropdown.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeModalDropdown.mod.RNModalDropdown.ModalDropdownProps
import typingsJapgolly.reactNativeModalDropdown.mod.RNModalDropdown.PositionStyle
import typingsJapgolly.reactNativeModalDropdown.mod.^
import typingsJapgolly.reactNativeModalDropdown.reactNativeModalDropdownStrings.always
import typingsJapgolly.reactNativeModalDropdown.reactNativeModalDropdownStrings.handled
import typingsJapgolly.reactNativeModalDropdown.reactNativeModalDropdownStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeModalDropdown {
  def apply(
    accessible: js.UndefOr[Boolean] = js.undefined,
    adjustFrame: /* positionStyle */ PositionStyle => Callback = null,
    animated: js.UndefOr[Boolean] = js.undefined,
    defaultIndex: Int | Double = null,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropdownStyle: js.Any = null,
    dropdownTextHighlightStyle: js.Any = null,
    dropdownTextStyle: js.Any = null,
    keyboardShouldPersistTaps: always | never | handled = null,
    onDropdownWillHide: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    onDropdownWillShow: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    onSelect: (/* index */ Double, /* option */ js.Any) => Callback = null,
    options: js.Array[_] = null,
    renderButtonText: /* text */ js.Any => CallbackTo[js.Any] = null,
    renderRow: (/* option */ js.Any, /* index */ Double, /* isSelected */ Boolean) => CallbackTo[js.Any] = null,
    renderSeparator: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    scrollEnabled: js.UndefOr[Boolean] = js.undefined,
    showsVerticalScrollIndicator: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    textStyle: js.Any = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ModalDropdownProps, ^, Unit, ModalDropdownProps] = {
    val __obj = js.Dynamic.literal()
  
      if (!js.isUndefined(accessible)) __obj.updateDynamic("accessible")(accessible.asInstanceOf[js.Any])
    if (adjustFrame != null) __obj.updateDynamic("adjustFrame")(js.Any.fromFunction1((t0: /* positionStyle */ typingsJapgolly.reactNativeModalDropdown.mod.RNModalDropdown.PositionStyle) => adjustFrame(t0).runNow()))
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated.asInstanceOf[js.Any])
    if (defaultIndex != null) __obj.updateDynamic("defaultIndex")(defaultIndex.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dropdownStyle != null) __obj.updateDynamic("dropdownStyle")(dropdownStyle.asInstanceOf[js.Any])
    if (dropdownTextHighlightStyle != null) __obj.updateDynamic("dropdownTextHighlightStyle")(dropdownTextHighlightStyle.asInstanceOf[js.Any])
    if (dropdownTextStyle != null) __obj.updateDynamic("dropdownTextStyle")(dropdownTextStyle.asInstanceOf[js.Any])
    if (keyboardShouldPersistTaps != null) __obj.updateDynamic("keyboardShouldPersistTaps")(keyboardShouldPersistTaps.asInstanceOf[js.Any])
    onDropdownWillHide.foreach(p => __obj.updateDynamic("onDropdownWillHide")(p.toJsFn))
    onDropdownWillShow.foreach(p => __obj.updateDynamic("onDropdownWillShow")(p.toJsFn))
    if (onSelect != null) __obj.updateDynamic("onSelect")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* option */ js.Any) => onSelect(t0, t1).runNow()))
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (renderButtonText != null) __obj.updateDynamic("renderButtonText")(js.Any.fromFunction1((t0: /* text */ js.Any) => renderButtonText(t0).runNow()))
    if (renderRow != null) __obj.updateDynamic("renderRow")(js.Any.fromFunction3((t0: /* option */ js.Any, t1: /* index */ scala.Double, t2: /* isSelected */ scala.Boolean) => renderRow(t0, t1, t2).runNow()))
    renderSeparator.foreach(p => __obj.updateDynamic("renderSeparator")(p.toJsFn))
    if (!js.isUndefined(scrollEnabled)) __obj.updateDynamic("scrollEnabled")(scrollEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(showsVerticalScrollIndicator)) __obj.updateDynamic("showsVerticalScrollIndicator")(showsVerticalScrollIndicator.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textStyle != null) __obj.updateDynamic("textStyle")(textStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeModalDropdown.mod.RNModalDropdown.ModalDropdownProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeModalDropdown.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeModalDropdown.mod.RNModalDropdown.ModalDropdownProps])(children: _*)
  }
  @JSImport("react-native-modal-dropdown", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

