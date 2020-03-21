package typingsJapgolly.reactNativeModalFilterPicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Element
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.FlatListProps
import typingsJapgolly.reactNative.mod.KeyboardAvoidingView
import typingsJapgolly.reactNative.mod.ListViewProps
import typingsJapgolly.reactNative.mod.ModalProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeModalFilterPicker.mod.ModalFilterPickerOption
import typingsJapgolly.reactNativeModalFilterPicker.mod.ModalFilterPickerProps
import typingsJapgolly.reactNativeModalFilterPicker.mod.default
import typingsJapgolly.reactNativeModalFilterPicker.reactNativeModalFilterPickerStrings.always
import typingsJapgolly.reactNativeModalFilterPicker.reactNativeModalFilterPickerStrings.handle
import typingsJapgolly.reactNativeModalFilterPicker.reactNativeModalFilterPickerStrings.never
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeModalFilterPicker {
  def apply[T /* <: ModalFilterPickerOption */](
    options: js.Array[T],
    onCancel: Callback,
    onSelect: String => Callback,
    androidUnderlineColor: String = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    cancelButtonStyle: StyleProp[ViewStyle] = null,
    cancelButtonText: String = null,
    cancelButtonTextStyle: StyleProp[TextStyle] = null,
    cancelContainerStyle: StyleProp[ViewStyle] = null,
    filterTextInputContainerStyle: StyleProp[ViewStyle] = null,
    filterTextInputStyle: StyleProp[TextStyle] = null,
    keyboardShouldPersistTaps: never | always | handle = null,
    listContainerStyle: StyleProp[ViewStyle] = null,
    listViewProps: Partial[ListViewProps | FlatListProps[T]] = null,
    modal: ModalProps = null,
    noResultsText: String = null,
    optionTextStyle: StyleProp[TextStyle] = null,
    overlayStyle: StyleProp[KeyboardAvoidingView | ViewStyle] = null,
    placeholderText: String = null,
    placeholderTextColor: String = null,
    renderCancelButton: js.UndefOr[CallbackTo[Element]] = js.undefined,
    renderList: js.UndefOr[CallbackTo[Element]] = js.undefined,
    renderOption: (T, /* isSelected */ Boolean) => CallbackTo[Element] = null,
    selectedOption: String = null,
    selectedOptionTextStyle: StyleProp[TextStyle] = null,
    showFilter: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    titleTextStyle: StyleProp[TextStyle] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ModalFilterPickerProps[T], default[T], Unit, ModalFilterPickerProps[T]] = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
  
      __obj.updateDynamic("onCancel")(onCancel.toJsFn)
    __obj.updateDynamic("onSelect")(js.Any.fromFunction1((t0: java.lang.String) => onSelect(t0).runNow()))
    if (androidUnderlineColor != null) __obj.updateDynamic("androidUnderlineColor")(androidUnderlineColor.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (cancelButtonStyle != null) __obj.updateDynamic("cancelButtonStyle")(cancelButtonStyle.asInstanceOf[js.Any])
    if (cancelButtonText != null) __obj.updateDynamic("cancelButtonText")(cancelButtonText.asInstanceOf[js.Any])
    if (cancelButtonTextStyle != null) __obj.updateDynamic("cancelButtonTextStyle")(cancelButtonTextStyle.asInstanceOf[js.Any])
    if (cancelContainerStyle != null) __obj.updateDynamic("cancelContainerStyle")(cancelContainerStyle.asInstanceOf[js.Any])
    if (filterTextInputContainerStyle != null) __obj.updateDynamic("filterTextInputContainerStyle")(filterTextInputContainerStyle.asInstanceOf[js.Any])
    if (filterTextInputStyle != null) __obj.updateDynamic("filterTextInputStyle")(filterTextInputStyle.asInstanceOf[js.Any])
    if (keyboardShouldPersistTaps != null) __obj.updateDynamic("keyboardShouldPersistTaps")(keyboardShouldPersistTaps.asInstanceOf[js.Any])
    if (listContainerStyle != null) __obj.updateDynamic("listContainerStyle")(listContainerStyle.asInstanceOf[js.Any])
    if (listViewProps != null) __obj.updateDynamic("listViewProps")(listViewProps.asInstanceOf[js.Any])
    if (modal != null) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (noResultsText != null) __obj.updateDynamic("noResultsText")(noResultsText.asInstanceOf[js.Any])
    if (optionTextStyle != null) __obj.updateDynamic("optionTextStyle")(optionTextStyle.asInstanceOf[js.Any])
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle.asInstanceOf[js.Any])
    if (placeholderText != null) __obj.updateDynamic("placeholderText")(placeholderText.asInstanceOf[js.Any])
    if (placeholderTextColor != null) __obj.updateDynamic("placeholderTextColor")(placeholderTextColor.asInstanceOf[js.Any])
    renderCancelButton.foreach(p => __obj.updateDynamic("renderCancelButton")(p.toJsFn))
    renderList.foreach(p => __obj.updateDynamic("renderList")(p.toJsFn))
    if (renderOption != null) __obj.updateDynamic("renderOption")(js.Any.fromFunction2((t0: T, t1: /* isSelected */ scala.Boolean) => renderOption(t0, t1).runNow()))
    if (selectedOption != null) __obj.updateDynamic("selectedOption")(selectedOption.asInstanceOf[js.Any])
    if (selectedOptionTextStyle != null) __obj.updateDynamic("selectedOptionTextStyle")(selectedOptionTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showFilter)) __obj.updateDynamic("showFilter")(showFilter.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleTextStyle != null) __obj.updateDynamic("titleTextStyle")(titleTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactNativeModalFilterPicker.mod.ModalFilterPickerProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactNativeModalFilterPicker.mod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactNativeModalFilterPicker.mod.ModalFilterPickerProps[T]])(children: _*)
  }
  @JSImport("react-native-modal-filter-picker", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

