package typingsJapgolly.reactNativeModalFilterPicker.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.reactNative.mod.FlatListProps
import typingsJapgolly.reactNative.mod.KeyboardAvoidingView
import typingsJapgolly.reactNative.mod.ListViewProps
import typingsJapgolly.reactNative.mod.ModalProps
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeModalFilterPicker.reactNativeModalFilterPickerStrings.always
import typingsJapgolly.reactNativeModalFilterPicker.reactNativeModalFilterPickerStrings.handle
import typingsJapgolly.reactNativeModalFilterPicker.reactNativeModalFilterPickerStrings.never
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalFilterPickerProps[T /* <: ModalFilterPickerOption */] extends js.Object {
  var androidUnderlineColor: js.UndefOr[String] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var cancelButtonStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var cancelButtonText: js.UndefOr[String] = js.undefined
  var cancelButtonTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var cancelContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var filterTextInputContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var filterTextInputStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var keyboardShouldPersistTaps: js.UndefOr[never | always | handle] = js.undefined
  var listContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var listViewProps: js.UndefOr[Partial[ListViewProps | FlatListProps[T]]] = js.undefined
  var modal: js.UndefOr[ModalProps] = js.undefined
  var noResultsText: js.UndefOr[String] = js.undefined
  var optionTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var options: js.Array[T]
  // styling props
  var overlayStyle: js.UndefOr[StyleProp[KeyboardAvoidingView | ViewStyle]] = js.undefined
  var placeholderText: js.UndefOr[String] = js.undefined
  var placeholderTextColor: js.UndefOr[String] = js.undefined
  var renderCancelButton: js.UndefOr[js.Function0[Element]] = js.undefined
  var renderList: js.UndefOr[js.Function0[Element]] = js.undefined
  var renderOption: js.UndefOr[js.Function2[/* option */ T, /* isSelected */ Boolean, Element]] = js.undefined
  var selectedOption: js.UndefOr[String] = js.undefined
  var selectedOptionTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var showFilter: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var titleTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
  def onCancel(): Unit
  def onSelect(key: String): Unit
}

object ModalFilterPickerProps {
  @scala.inline
  def apply[T /* <: ModalFilterPickerOption */](
    onCancel: Callback,
    onSelect: String => Callback,
    options: js.Array[T],
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
    renderOption: (/* option */ T, /* isSelected */ Boolean) => CallbackTo[Element] = null,
    selectedOption: String = null,
    selectedOptionTextStyle: StyleProp[TextStyle] = null,
    showFilter: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    titleTextStyle: StyleProp[TextStyle] = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ModalFilterPickerProps[T] = {
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
    if (renderOption != null) __obj.updateDynamic("renderOption")(js.Any.fromFunction2((t0: /* option */ T, t1: /* isSelected */ scala.Boolean) => renderOption(t0, t1).runNow()))
    if (selectedOption != null) __obj.updateDynamic("selectedOption")(selectedOption.asInstanceOf[js.Any])
    if (selectedOptionTextStyle != null) __obj.updateDynamic("selectedOptionTextStyle")(selectedOptionTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(showFilter)) __obj.updateDynamic("showFilter")(showFilter.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleTextStyle != null) __obj.updateDynamic("titleTextStyle")(titleTextStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModalFilterPickerProps[T]]
  }
}

