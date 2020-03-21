package typingsJapgolly.blueprintjsCore.multiSliderMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.blueprintjsCore.intentMod.Intent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultiSliderProps extends ISliderBaseProps {
  /** Default intent of a track segment, used only if no handle specifies `intentBefore/After`. */
  var defaultTrackIntent: js.UndefOr[Intent] = js.undefined
  /** Callback invoked when a handle value changes. Receives handle values in sorted order. */
  var onChange: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.undefined
  /** Callback invoked when a handle is released. Receives handle values in sorted order. */
  var onRelease: js.UndefOr[js.Function1[/* values */ js.Array[Double], Unit]] = js.undefined
}

object IMultiSliderProps {
  @scala.inline
  def apply(
    className: String = null,
    defaultTrackIntent: Intent = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    intent: Intent = null,
    labelPrecision: Int | Double = null,
    labelRenderer: Boolean | (js.Function1[/* value */ Double, String | Element]) = null,
    labelStepSize: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null,
    onChange: /* values */ js.Array[Double] => Callback = null,
    onRelease: /* values */ js.Array[Double] => Callback = null,
    showTrackFill: js.UndefOr[Boolean] = js.undefined,
    stepSize: Int | Double = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): IMultiSliderProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultTrackIntent != null) __obj.updateDynamic("defaultTrackIntent")(defaultTrackIntent.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (labelPrecision != null) __obj.updateDynamic("labelPrecision")(labelPrecision.asInstanceOf[js.Any])
    if (labelRenderer != null) __obj.updateDynamic("labelRenderer")(labelRenderer.asInstanceOf[js.Any])
    if (labelStepSize != null) __obj.updateDynamic("labelStepSize")(labelStepSize.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1((t0: /* values */ js.Array[scala.Double]) => onChange(t0).runNow()))
    if (onRelease != null) __obj.updateDynamic("onRelease")(js.Any.fromFunction1((t0: /* values */ js.Array[scala.Double]) => onRelease(t0).runNow()))
    if (!js.isUndefined(showTrackFill)) __obj.updateDynamic("showTrackFill")(showTrackFill.asInstanceOf[js.Any])
    if (stepSize != null) __obj.updateDynamic("stepSize")(stepSize.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMultiSliderProps]
  }
}

