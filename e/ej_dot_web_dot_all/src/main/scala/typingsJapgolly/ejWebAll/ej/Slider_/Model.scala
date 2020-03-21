package typingsJapgolly.ejWebAll.ej.Slider_

import japgolly.scalajs.react.Callback
import typingsJapgolly.ejWebAll.ej.Orientation
import typingsJapgolly.ejWebAll.ej.slider.sliderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Specifies the allowMouseWheel of the slider.
    * @Default {false}
    */
  var allowMouseWheel: js.UndefOr[Boolean] = js.undefined
  /** Specifies the animationSpeed of the slider.
    * @Default {500}
    */
  var animationSpeed: js.UndefOr[Double] = js.undefined
  /** Fires once Slider control value is changed successfully.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
  /** Fires once Slider control has been created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Specify the CSS class to slider to achieve custom theme.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Fires when Slider control has been destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Specifies the animation behavior of the slider.
    * @Default {true}
    */
  var enableAnimation: js.UndefOr[Boolean] = js.undefined
  /** Specify the enablePersistence to slider to save current model value to browser cookies for state maintains
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** Specifies the Right to Left Direction of the slider.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Specifies the state of the slider.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the height of the slider.
    * @Default {14}
    */
  var height: js.UndefOr[String] = js.undefined
  /** Specifies the HTML Attributes of the ejSlider.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Specifies the incremental step value of the slider.
    * @Default {1}
    */
  var incrementStep: js.UndefOr[Double] = js.undefined
  /** Specifies the distance between two major (large) ticks from the scale of the slider.
    * @Default {10}
    */
  var largeStep: js.UndefOr[Double] = js.undefined
  /** Specifies the ending value of the slider.
    * @Default {100}
    */
  var maxValue: js.UndefOr[Double] = js.undefined
  /** Specifies the starting value of the slider.
    * @Default {0}
    */
  var minValue: js.UndefOr[Double] = js.undefined
  /** Specifies the orientation of the slider.
    * @Default {ej.orientation.Horizontal}
    */
  var orientation: js.UndefOr[Orientation | String] = js.undefined
  /** Specifies the readOnly of the slider.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** Fires before creating each slider scale tick. You can use this event to add custom text in tick values.
    */
  var renderingTicks: js.UndefOr[js.Function1[/* e */ RenderingTicksEventArgs, Unit]] = js.undefined
  /** Shows/Hides the increment and decrement buttons of the slider.
    * @Default {false}
    */
  var showButtons: js.UndefOr[Boolean] = js.undefined
  /** Specifies the rounded corner behavior for slider.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
  /** Shows/Hide the major (large) and minor (small) ticks in the scale of the slider.
    * @Default {false}
    */
  var showScale: js.UndefOr[Boolean] = js.undefined
  /** Specifies the small ticks from the scale of the slider.
    * @Default {true}
    */
  var showSmallTicks: js.UndefOr[Boolean] = js.undefined
  /** Specifies the showTooltip to shows the current Slider value, while moving the Slider handle or clicking on the slider handle of the slider.
    * @Default {true}
    */
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  /** Fires once Slider control is sliding successfully.
    */
  var slide: js.UndefOr[js.Function1[/* e */ SlideEventArgs, Unit]] = js.undefined
  /** Specifies the sliderType of the slider.
    * @Default {ej.SliderType.Default}
    */
  var sliderType: js.UndefOr[typingsJapgolly.ejWebAll.ej.slider.sliderType | String] = js.undefined
  /** Specifies the distance between two minor (small) ticks from the scale of the slider.
    * @Default {1}
    */
  var smallStep: js.UndefOr[Double] = js.undefined
  /** Fires once Slider control is started successfully.
    */
  var start: js.UndefOr[js.Function1[/* e */ StartEventArgs, Unit]] = js.undefined
  /** Fires when Slider control is stopped successfully.
    */
  var stop: js.UndefOr[js.Function1[/* e */ StopEventArgs, Unit]] = js.undefined
  /** Fires when display the custom tooltip.
    */
  var tooltipChange: js.UndefOr[js.Function1[/* e */ TooltipChangeEventArgs, Unit]] = js.undefined
  /** Specifies the value of the slider. But it's not applicable for range slider. To range slider we can use values property.
    * @Default {0}
    */
  var value: js.UndefOr[Double] = js.undefined
  /** Specifies the values of the range slider. But it's not applicable for default and minRange sliders. we can use value property for default and minRange sliders.
    * @Default {[minValue,maxValue]}
    */
  var values: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies the width of the slider.
    * @Default {100%}
    */
  var width: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowMouseWheel: js.UndefOr[Boolean] = js.undefined,
    animationSpeed: Int | Double = null,
    change: /* e */ ChangeEventArgs => Callback = null,
    create: /* e */ CreateEventArgs => Callback = null,
    cssClass: String = null,
    destroy: /* e */ DestroyEventArgs => Callback = null,
    enableAnimation: js.UndefOr[Boolean] = js.undefined,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    height: String = null,
    htmlAttributes: js.Any = null,
    incrementStep: Int | Double = null,
    largeStep: Int | Double = null,
    maxValue: Int | Double = null,
    minValue: Int | Double = null,
    orientation: Orientation | String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    renderingTicks: /* e */ RenderingTicksEventArgs => Callback = null,
    showButtons: js.UndefOr[Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    showScale: js.UndefOr[Boolean] = js.undefined,
    showSmallTicks: js.UndefOr[Boolean] = js.undefined,
    showTooltip: js.UndefOr[Boolean] = js.undefined,
    slide: /* e */ SlideEventArgs => Callback = null,
    sliderType: sliderType | String = null,
    smallStep: Int | Double = null,
    start: /* e */ StartEventArgs => Callback = null,
    stop: /* e */ StopEventArgs => Callback = null,
    tooltipChange: /* e */ TooltipChangeEventArgs => Callback = null,
    value: Int | Double = null,
    values: js.Array[_] = null,
    width: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowMouseWheel)) __obj.updateDynamic("allowMouseWheel")(allowMouseWheel.asInstanceOf[js.Any])
    if (animationSpeed != null) __obj.updateDynamic("animationSpeed")(animationSpeed.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Slider_.ChangeEventArgs) => change(t0).runNow()))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Slider_.CreateEventArgs) => create(t0).runNow()))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Slider_.DestroyEventArgs) => destroy(t0).runNow()))
    if (!js.isUndefined(enableAnimation)) __obj.updateDynamic("enableAnimation")(enableAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (incrementStep != null) __obj.updateDynamic("incrementStep")(incrementStep.asInstanceOf[js.Any])
    if (largeStep != null) __obj.updateDynamic("largeStep")(largeStep.asInstanceOf[js.Any])
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (renderingTicks != null) __obj.updateDynamic("renderingTicks")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Slider_.RenderingTicksEventArgs) => renderingTicks(t0).runNow()))
    if (!js.isUndefined(showButtons)) __obj.updateDynamic("showButtons")(showButtons.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner.asInstanceOf[js.Any])
    if (!js.isUndefined(showScale)) __obj.updateDynamic("showScale")(showScale.asInstanceOf[js.Any])
    if (!js.isUndefined(showSmallTicks)) __obj.updateDynamic("showSmallTicks")(showSmallTicks.asInstanceOf[js.Any])
    if (!js.isUndefined(showTooltip)) __obj.updateDynamic("showTooltip")(showTooltip.asInstanceOf[js.Any])
    if (slide != null) __obj.updateDynamic("slide")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Slider_.SlideEventArgs) => slide(t0).runNow()))
    if (sliderType != null) __obj.updateDynamic("sliderType")(sliderType.asInstanceOf[js.Any])
    if (smallStep != null) __obj.updateDynamic("smallStep")(smallStep.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Slider_.StartEventArgs) => start(t0).runNow()))
    if (stop != null) __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Slider_.StopEventArgs) => stop(t0).runNow()))
    if (tooltipChange != null) __obj.updateDynamic("tooltipChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Slider_.TooltipChangeEventArgs) => tooltipChange(t0).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

