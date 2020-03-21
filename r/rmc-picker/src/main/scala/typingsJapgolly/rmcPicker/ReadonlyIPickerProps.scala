package typingsJapgolly.rmcPicker

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<rmc-picker.rmc-picker/lib/PickerTypes.IPickerProps> */
trait ReadonlyIPickerProps extends js.Object {
  val className: js.UndefOr[String] = js.undefined
  val defaultSelectedValue: js.UndefOr[js.Any] = js.undefined
  val disabled: js.UndefOr[Boolean] = js.undefined
  val indicatorClassName: js.UndefOr[String] = js.undefined
  val indicatorStyle: js.UndefOr[js.Any] = js.undefined
  val itemStyle: js.UndefOr[js.Any] = js.undefined
  val noAnimate: js.UndefOr[Boolean] = js.undefined
  val onScrollChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  val onValueChange: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  val prefixCls: js.UndefOr[String] = js.undefined
  val selectedValue: js.UndefOr[js.Any] = js.undefined
  val style: js.UndefOr[js.Any] = js.undefined
}

object ReadonlyIPickerProps {
  @scala.inline
  def apply(
    className: String = null,
    defaultSelectedValue: js.Any = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    indicatorClassName: String = null,
    indicatorStyle: js.Any = null,
    itemStyle: js.Any = null,
    noAnimate: js.UndefOr[Boolean] = js.undefined,
    onScrollChange: /* value */ js.Any => Callback = null,
    onValueChange: /* value */ js.Any => Callback = null,
    prefixCls: String = null,
    selectedValue: js.Any = null,
    style: js.Any = null
  ): ReadonlyIPickerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultSelectedValue != null) __obj.updateDynamic("defaultSelectedValue")(defaultSelectedValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (indicatorClassName != null) __obj.updateDynamic("indicatorClassName")(indicatorClassName.asInstanceOf[js.Any])
    if (indicatorStyle != null) __obj.updateDynamic("indicatorStyle")(indicatorStyle.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(noAnimate)) __obj.updateDynamic("noAnimate")(noAnimate.asInstanceOf[js.Any])
    if (onScrollChange != null) __obj.updateDynamic("onScrollChange")(js.Any.fromFunction1((t0: /* value */ js.Any) => onScrollChange(t0).runNow()))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1((t0: /* value */ js.Any) => onValueChange(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (selectedValue != null) __obj.updateDynamic("selectedValue")(selectedValue.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIPickerProps]
  }
}

