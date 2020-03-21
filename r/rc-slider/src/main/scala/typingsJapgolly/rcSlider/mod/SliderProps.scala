package typingsJapgolly.rcSlider.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.raw.React.Node
import org.scalajs.dom.raw.Element
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FocusEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends CommonApiProps {
  /**
    * Set initial value of slider.
    *  @default 0
    */
  var defaultValue: js.UndefOr[Double] = js.undefined
  /**
    * onAfterChange will be triggered when ontouchend or onmouseup is triggered.
    */
  var onAfterChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /**
    * onBeforeChange will be triggered when ontouchstart or onmousedown is triggered.
    */
  var onBeforeChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /**
    * Handle blur event on the control
    */
  var onBlur: js.UndefOr[FocusEventHandler[Element]] = js.undefined
  /**
    * onChange will be triggered while the value of Slider changing.
    */
  var onChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /**
    * Set the tabIndex of the slider handle.
    * @default 0
    */
  var tabIndex: js.UndefOr[Double] = js.undefined
  /**
    * Set current value of slider.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    activeDotStyle: CSSProperties = null,
    className: String = null,
    defaultValue: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dotStyle: CSSProperties = null,
    dots: js.UndefOr[Boolean] = js.undefined,
    handle: /* props */ js.Any => CallbackTo[Node] = null,
    handleStyle: js.Array[CSSProperties] | CSSProperties = null,
    included: js.UndefOr[Boolean] = js.undefined,
    marks: Marks = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onAfterChange: /* value */ Double => Callback = null,
    onBeforeChange: /* value */ Double => Callback = null,
    onBlur: ReactFocusEventFrom[Element] => Callback = null,
    onChange: /* value */ Double => Callback = null,
    railStyle: CSSProperties = null,
    reverse: js.UndefOr[Boolean] = js.undefined,
    step: Int | Double = null,
    style: js.Array[CSSProperties] | CSSProperties = null,
    tabIndex: Int | Double = null,
    tipFormatter: /* value */ js.Any => CallbackTo[js.UndefOr[js.Any]] = null,
    tipTransitionName: String = null,
    trackStyle: js.Array[CSSProperties] | CSSProperties = null,
    value: Int | Double = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): SliderProps = {
    val __obj = js.Dynamic.literal()
    if (activeDotStyle != null) __obj.updateDynamic("activeDotStyle")(activeDotStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
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
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1((t0: /* value */ scala.Double) => onAfterChange(t0).runNow()))
    if (onBeforeChange != null) __obj.updateDynamic("onBeforeChange")(js.Any.fromFunction1((t0: /* value */ scala.Double) => onBeforeChange(t0).runNow()))
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1((t0: japgolly.scalajs.react.ReactFocusEventFrom[org.scalajs.dom.raw.Element]) => onBlur(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ scala.Double) => onChange(t0).runNow()))
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
    __obj.asInstanceOf[SliderProps]
  }
}

