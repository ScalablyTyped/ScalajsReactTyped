package typingsJapgolly.antdMobileRn.searchBarPropsTypeMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchBarPropsType extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var cancelText: js.UndefOr[String] = js.undefined
  var defaultValue: js.UndefOr[String] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var focused: js.UndefOr[Boolean] = js.undefined
  var maxLength: js.UndefOr[Double] = js.undefined
  var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onCancel: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var onClear: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onSubmit: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var showCancelButton: js.UndefOr[Boolean] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object SearchBarPropsType {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    cancelText: String = null,
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
    showCancelButton: js.UndefOr[Boolean] = js.undefined,
    styles: js.Any = null,
    value: String = null
  ): SearchBarPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
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
    if (!js.isUndefined(showCancelButton)) __obj.updateDynamic("showCancelButton")(showCancelButton.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchBarPropsType]
  }
}

