package typingsJapgolly.rmcInputNumber.indexIosMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType
  extends typingsJapgolly.rmcInputNumber.baseMod.PropsType {
  var downStyle: js.UndefOr[js.Any] = js.undefined
  var inputStyle: js.UndefOr[js.Any] = js.undefined
  var keyboardType: js.UndefOr[js.Any] = js.undefined
  var styles: js.UndefOr[js.Any] = js.undefined
  var upStyle: js.UndefOr[js.Any] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    defaultValue: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    downStyle: js.Any = null,
    inputStyle: js.Any = null,
    keyboardType: js.Any = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onBlur: /* e */ js.Any => Callback = null,
    onChange: /* e */ js.Any => Callback = null,
    onFocus: /* e */ js.UndefOr[js.Any] => Callback = null,
    parser: /* v */ js.Any => Callback = null,
    precision: Int | Double = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    step: String | Double = null,
    style: js.Any = null,
    styles: js.Any = null,
    upStyle: js.Any = null,
    value: Int | Double = null
  ): PropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (downStyle != null) __obj.updateDynamic("downStyle")(downStyle.asInstanceOf[js.Any])
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle.asInstanceOf[js.Any])
    if (keyboardType != null) __obj.updateDynamic("keyboardType")(keyboardType.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* e */ js.Any) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ js.Any) => onChange(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[js.Any]) => onFocus(t0).runNow()))
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction1((t0: /* v */ js.Any) => parser(t0).runNow()))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (upStyle != null) __obj.updateDynamic("upStyle")(upStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

