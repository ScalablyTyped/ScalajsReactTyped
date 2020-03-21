package typingsJapgolly.antdMobile.rangeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antdMobile.rangePropsTypeMod.RangePropsType
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeProps extends RangePropsType {
  var handleStyle: js.UndefOr[js.Array[CSSProperties]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var railStyle: js.UndefOr[CSSProperties] = js.undefined
  var trackStyle: js.UndefOr[js.Array[CSSProperties]] = js.undefined
}

object RangeProps {
  @scala.inline
  def apply(
    defaultValue: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    handleStyle: js.Array[CSSProperties] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onAfterChange: /* value */ js.UndefOr[Double] => Callback = null,
    onChange: /* value */ js.UndefOr[Double] => Callback = null,
    prefixCls: String = null,
    railStyle: CSSProperties = null,
    step: Int | Double = null,
    tipFormatter: /* value */ js.UndefOr[Double] => CallbackTo[Node] = null,
    trackStyle: js.Array[CSSProperties] = null,
    value: Int | Double = null
  ): RangeProps = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (handleStyle != null) __obj.updateDynamic("handleStyle")(handleStyle.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[scala.Double]) => onAfterChange(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[scala.Double]) => onChange(t0).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (railStyle != null) __obj.updateDynamic("railStyle")(railStyle.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[scala.Double]) => tipFormatter(t0).runNow()))
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeProps]
  }
}

