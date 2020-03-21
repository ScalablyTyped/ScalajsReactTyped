package typingsJapgolly.antdMobileRn.sliderIndexNativeMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antdMobileRn.sliderPropsTypeMod.SliderPropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderProps extends SliderPropsType {
  var maximumTrackTintColor: js.UndefOr[String] = js.undefined
  var minimumTrackTintColor: js.UndefOr[String] = js.undefined
}

object SliderProps {
  @scala.inline
  def apply(
    defaultValue: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    handle: js.Any = null,
    max: Int | Double = null,
    maximumTrackTintColor: String = null,
    min: Int | Double = null,
    minimumTrackTintColor: String = null,
    onAfterChange: /* value */ js.UndefOr[Double] => Callback = null,
    onChange: /* value */ js.UndefOr[Double] => Callback = null,
    step: Int | Double = null,
    tipFormatter: /* value */ js.UndefOr[String] => CallbackTo[Node] = null,
    value: Int | Double = null
  ): SliderProps = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maximumTrackTintColor != null) __obj.updateDynamic("maximumTrackTintColor")(maximumTrackTintColor.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minimumTrackTintColor != null) __obj.updateDynamic("minimumTrackTintColor")(minimumTrackTintColor.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[scala.Double]) => onAfterChange(t0).runNow()))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[scala.Double]) => onChange(t0).runNow()))
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1((t0: /* value */ js.UndefOr[java.lang.String]) => tipFormatter(t0).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderProps]
  }
}

