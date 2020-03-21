package typingsJapgolly.rcSlider.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeProps extends CommonApiProps {
  /**
    * allowCross could be set as true to allow those handles to cross.
    *  @default true
    */
  var allowCross: js.UndefOr[Boolean] = js.undefined
  /**
    * Determine how many ranges to render, and multiple handles will be rendered (number + 1).
    *  @default 1
    */
  var count: js.UndefOr[Double] = js.undefined
  /**
    * Set initial positions of handles.
    *  @default [0,0]
    */
  var defaultValue: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * onAfterChange will be triggered when ontouchend or onmouseup is triggered.
    * For prop (count = -1) type returned is [number, undefined]. Bug raised in rc-slider https://github.com/react-component/slider/issues/457
    */
  var onAfterChange: js.UndefOr[js.Function1[/* value */ js.Array[Double], Unit]] = js.undefined
  /**
    * onBeforeChange will be triggered when ontouchstart or onmousedown is triggered.
    * For prop (count = -1) type returned is [number, undefined]. Bug raised in rc-slider https://github.com/react-component/slider/issues/457
    */
  var onBeforeChange: js.UndefOr[js.Function1[/* value */ js.Array[Double], Unit]] = js.undefined
  /**
    * onChange will be triggered while the value of Slider changing.
    * For prop (count = -1) type returned is [number, undefined]. Bug raised in rc-slider https://github.com/react-component/slider/issues/457
    */
  var onChange: js.UndefOr[js.Function1[/* value */ js.Array[Double], Unit]] = js.undefined
  /**
    * pushable could be set as true to allow pushing of surrounding handles when moving an handle. When set to a number, the number will be the minimum ensured distance between handles.
    *  @default true
    */
  var pushable: js.UndefOr[Boolean | Double] = js.undefined
  /**
    * Set the tabIndex of each handle.
    * @default [0,0]
    */
  var tabIndex: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Set current positions of handles.
    */
  var value: js.UndefOr[js.Array[Double]] = js.undefined
}

object RangeProps {
  @scala.inline
  def apply(
    activeDotStyle: CSSProperties = null,
    allowCross: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    count: Int | Double = null,
    defaultValue: js.Array[Double] = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dotStyle: CSSProperties = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    handle: /* props */ js.Any => CallbackTo[Node] = null,
    handleStyle: js.Array[CSSProperties] | CSSProperties = null,
    included: js.UndefOr[Boolean] = js.undefined,
    marks: Marks = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onAfterChange: /* value */ js.Array[Double] => Callback = null,
    onBeforeChange: /* value */ js.Array[Double] => Callback = null,
    onChange: /* value */ js.Array[Double] => Callback = null,
    pushable: Boolean | Double = null,
    railStyle: CSSProperties = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    style: js.Array[CSSProperties] | CSSProperties = null,
    tabIndex: js.Array[Double] = null,
    tipFormatter: /* value */ js.Any => CallbackTo[js.UndefOr[js.Any]] = null,
    tipTransitionName: String = null,
    trackStyle: js.Array[CSSProperties] | CSSProperties = null,
    value: js.Array[Double] = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): RangeProps = {
    val __obj = js.Dynamic.literal()
    if (activeDotStyle != null) __obj.updateDynamic("activeDotStyle")(activeDotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(allowCross)) __obj.updateDynamic("allowCross")(allowCross.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dots)) __obj.updateDynamic("dots")(dots.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(js.Any.fromFunction1((t0: /* props */ js.Any) => handle(t0).runNow()))
    if (handleStyle != null) __obj.updateDynamic("handleStyle")(handleStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(included)) __obj.updateDynamic("included")(included.asInstanceOf[js.Any])
    if (marks != null) __obj.updateDynamic("marks")(marks.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1((t0: /* value */ js.Array[scala.Double]) => onAfterChange(t0).runNow()))
    if (onBeforeChange != null) __obj.updateDynamic("onBeforeChange")(js.Any.fromFunction1((t0: /* value */ js.Array[scala.Double]) => onBeforeChange(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.Array[scala.Double]) => onChange(t0).runNow()))
    if (pushable != null) __obj.updateDynamic("pushable")(pushable.asInstanceOf[js.Any])
    if (railStyle != null) __obj.updateDynamic("railStyle")(railStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(reverse)) __obj.updateDynamic("reverse")(reverse.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1((t0: /* value */ js.Any) => tipFormatter(t0).runNow()))
    if (tipTransitionName != null) __obj.updateDynamic("tipTransitionName")(tipTransitionName.asInstanceOf[js.Any])
    if (trackStyle != null) __obj.updateDynamic("trackStyle")(trackStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeProps]
  }
}

