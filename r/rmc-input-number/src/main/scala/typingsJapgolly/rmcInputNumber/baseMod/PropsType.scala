package typingsJapgolly.rmcInputNumber.baseMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType extends js.Object {
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var defaultValue: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ js.Any, Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[js.Any], Unit]] = js.undefined
  var parser: js.UndefOr[js.Function1[/* v */ js.Any, Unit]] = js.undefined
  var precision: js.UndefOr[Double] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[String | Double] = js.undefined
  var style: js.UndefOr[js.Any] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    defaultValue: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
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
    value: Int | Double = null
  ): PropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
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
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

