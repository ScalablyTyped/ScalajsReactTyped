package typingsJapgolly.rmcInputNumber.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsType
  extends typingsJapgolly.rmcInputNumber.baseMod.PropsType {
  var className: js.UndefOr[js.Any] = js.undefined
  var downHandler: js.UndefOr[Node] = js.undefined
  var focusOnUpDown: js.UndefOr[Boolean] = js.undefined
  var formatter: js.UndefOr[js.Function1[/* v */ js.Any, Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var upHandler: js.UndefOr[Node] = js.undefined
}

object PropsType {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: js.Any = null,
    defaultValue: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    downHandler: VdomNode = null,
    focusOnUpDown: js.UndefOr[Boolean] = js.undefined,
    formatter: /* v */ js.Any => Callback = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onBlur: /* e */ js.Any => Callback = null,
    onChange: /* e */ js.Any => Callback = null,
    onFocus: /* e */ js.UndefOr[js.Any] => Callback = null,
    parser: /* v */ js.Any => Callback = null,
    precision: Int | Double = null,
    prefixCls: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    step: String | Double = null,
    style: js.Any = null,
    tabIndex: Int | Double = null,
    upHandler: VdomNode = null,
    value: Int | Double = null
  ): PropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (downHandler != null) __obj.updateDynamic("downHandler")(downHandler.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnUpDown)) __obj.updateDynamic("focusOnUpDown")(focusOnUpDown.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1((t0: /* v */ js.Any) => formatter(t0).runNow()))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: /* e */ js.Any) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* e */ js.Any) => onChange(t0).runNow()))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1((t0: /* e */ js.UndefOr[js.Any]) => onFocus(t0).runNow()))
    if (parser != null) __obj.updateDynamic("parser")(js.Any.fromFunction1((t0: /* v */ js.Any) => parser(t0).runNow()))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (upHandler != null) __obj.updateDynamic("upHandler")(upHandler.rawNode.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsType]
  }
}

