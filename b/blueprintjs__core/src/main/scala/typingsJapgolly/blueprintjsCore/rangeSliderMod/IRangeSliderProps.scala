package typingsJapgolly.blueprintjsCore.rangeSliderMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.blueprintjsCore.intentMod.Intent
import typingsJapgolly.blueprintjsCore.multiSliderMod.ISliderBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRangeSliderProps extends ISliderBaseProps {
  /** Callback invoked when the range value changes. */
  var onChange: js.UndefOr[js.Function1[/* value */ NumberRange, Unit]] = js.undefined
  /** Callback invoked when a handle is released. */
  var onRelease: js.UndefOr[js.Function1[/* value */ NumberRange, Unit]] = js.undefined
  /**
    * Range value of slider. Handles will be rendered at each position in the range.
    * @default [0, 10]
    */
  var value: js.UndefOr[NumberRange] = js.undefined
}

object IRangeSliderProps {
  @scala.inline
  def apply(
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    intent: Intent = null,
    labelPrecision: Int | Double = null,
    labelRenderer: Boolean | (js.Function1[/* value */ Double, String | Element]) = null,
    labelStepSize: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: /* value */ NumberRange => Callback = null,
    onRelease: /* value */ NumberRange => Callback = null,
    showTrackFill: js.UndefOr[Boolean] = js.undefined,
    stepSize: Int | Double = null,
    value: NumberRange = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): IRangeSliderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (labelPrecision != null) __obj.updateDynamic("labelPrecision")(labelPrecision.asInstanceOf[js.Any])
    if (labelRenderer != null) __obj.updateDynamic("labelRenderer")(labelRenderer.asInstanceOf[js.Any])
    if (labelStepSize != null) __obj.updateDynamic("labelStepSize")(labelStepSize.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.blueprintjsCore.rangeSliderMod.NumberRange) => onChange(t0).runNow()))
    if (onRelease != null) __obj.updateDynamic("onRelease")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.blueprintjsCore.rangeSliderMod.NumberRange) => onRelease(t0).runNow()))
    if (!js.isUndefined(showTrackFill)) __obj.updateDynamic("showTrackFill")(showTrackFill.asInstanceOf[js.Any])
    if (stepSize != null) __obj.updateDynamic("stepSize")(stepSize.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRangeSliderProps]
  }
}

