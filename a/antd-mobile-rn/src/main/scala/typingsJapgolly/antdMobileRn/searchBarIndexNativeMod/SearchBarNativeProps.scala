package typingsJapgolly.antdMobileRn.searchBarIndexNativeMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.antdMobileRn.AnonNativeEvent
import typingsJapgolly.antdMobileRn.searchBarPropsTypeMod.SearchBarPropsType
import typingsJapgolly.antdMobileRn.searchBarStyleIndexNativeMod.ISearchBarStyle
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarNativeProps extends SearchBarPropsType {
  var onChangeText: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  var onSubmitEditing: js.UndefOr[js.Function1[/* event */ AnonNativeEvent, Unit]] = js.undefined
  var style: js.UndefOr[StyleProp[TextStyle]] = js.undefined
  @JSName("styles")
  var styles_SearchBarNativeProps: ISearchBarStyle
}

object SearchBarNativeProps {
  @scala.inline
  def apply(
    styles: ISearchBarStyle,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    cancelText: String = null,
    defaultValue: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    maxLength: Int | Double = null,
    onBlur: js.UndefOr[Callback] = js.undefined,
    onCancel: /* value */ String => Callback = null,
    onChange: /* value */ String => Callback = null,
    onChangeText: /* text */ String => Callback = null,
    onClear: /* value */ String => Callback = null,
    onFocus: js.UndefOr[Callback] = js.undefined,
    onSubmit: /* value */ String => Callback = null,
    onSubmitEditing: /* event */ AnonNativeEvent => Callback = null,
    placeholder: String = null,
    showCancelButton: js.UndefOr[Boolean] = js.undefined,
    style: StyleProp[TextStyle] = null,
    value: String = null
  ): SearchBarNativeProps = {
    val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    onBlur.foreach(p => __obj.updateDynamic("onBlur")(p.toJsFn))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onCancel(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onChange(t0).runNow()))
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(js.Any.fromFunction1((t0: /* text */ java.lang.String) => onChangeText(t0).runNow()))
    if (onClear != null) __obj.updateDynamic("onClear")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onClear(t0).runNow()))
    onFocus.foreach(p => __obj.updateDynamic("onFocus")(p.toJsFn))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => onSubmit(t0).runNow()))
    if (onSubmitEditing != null) __obj.updateDynamic("onSubmitEditing")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.antdMobileRn.AnonNativeEvent) => onSubmitEditing(t0).runNow()))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(showCancelButton)) __obj.updateDynamic("showCancelButton")(showCancelButton.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarNativeProps]
  }
}

