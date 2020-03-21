package typingsJapgolly.bootstrapSlider

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.bootstrapSlider.bootstrapSliderStrings.auto
import typingsJapgolly.bootstrapSlider.bootstrapSliderStrings.bottom
import typingsJapgolly.bootstrapSlider.bootstrapSliderStrings.left
import typingsJapgolly.bootstrapSlider.bootstrapSliderStrings.linear
import typingsJapgolly.bootstrapSlider.bootstrapSliderStrings.logarithmic
import typingsJapgolly.bootstrapSlider.bootstrapSliderStrings.right
import typingsJapgolly.bootstrapSlider.bootstrapSliderStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderOptions extends js.Object {
  /**
    * Default: true
    * whether or not the slider is initially enabled
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    * Focus the appropriate slider handle after a value change.
    */
  var focus: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: returns the plain value
    * formatter callback. Return the value wanted to be displayed in the tooltip
    * @param val the current value to display
    */
  var formatter: js.UndefOr[js.Function1[/* val */ Double, String]] = js.undefined
  /**
    * Default: 'round'
    * handle shape. Accepts: 'round', 'square', 'triangle' or 'custom'
    */
  var handle: js.UndefOr[String] = js.undefined
  /**
    * Default: ''
    * set the id of the slider element when it's created
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Default: null
    * ARIA labels for the slider handle's, Use array for multiple values in a
    * range slider.
    */
  var labelledby: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Default: 10
    * maximum possible value
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * Default: 0
    * minimum possible value
    */
  var min: js.UndefOr[Double] = js.undefined
  /**
    * Default: false
    * The natural order is used for the arrow keys. Arrow up select the upper slider value for vertical sliders,
    * arrow right the righter slider value for a horizontal slider - no matter if the slider was reversed or not.
    * By default the arrow keys are oriented by arrow up/right to the higher slider value, arrow down/left to the lower slider value.
    */
  var natural_arrow_keys: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: 'horizontal'
    * set the orientation. Accepts 'vertical' or 'horizontal'
    */
  var orientation: js.UndefOr[String] = js.undefined
  /**
    * Default: number of digits after the decimal of step value
    * The number of digits shown after the decimal. Defaults to the number of digits after the decimal of step value.
    */
  var precision: js.UndefOr[Double] = js.undefined
  /**
    * Default: false
    * make range slider. Optional if initial value is an array. If initial value is scalar, max will be used for second value.
    */
  var range: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: []
    * Defines a range array that you want to highlight, for example:
    * [{'start':val1, 'end': val2, 'class': 'optionalAdditionalClassName'}].
    */
  var rangeHighlights: js.UndefOr[js.Array[RangeHighlight]] = js.undefined
  /**
    * Default: false
    * whether or not the slider should be reversed
    */
  var reversed: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: 'auto'
    */
  var rtl: js.UndefOr[Boolean | auto] = js.undefined
  /**
    * Default: 'linear'
    * Set to 'logarithmic' to use a logarithmic scale.
    */
  var scale: js.UndefOr[linear | logarithmic] = js.undefined
  /**
    * Default: 'before'
    * selection placement. Accepts: 'before', 'after' or 'none'. In case of a range slider, the selection will be placed between the handles
    */
  var selection: js.UndefOr[String] = js.undefined
  /**
    * Default: 1
    * increment step
    */
  var step: js.UndefOr[Double] = js.undefined
  /**
    * Default: [ ]
    * Used to define the values of ticks. Tick marks are indicators to denote special values in the range. This option overwrites min and max options.
    */
  var ticks: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Default: [ ]
    * Defines the labels below the tick marks. Accepts HTML input.
    */
  var ticks_labels: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Default: [ ]
    * Defines the positions of the tick values in percentages. The first value should alwasy be 0, the last value should always be 100 percent.
    */
  var ticks_positions: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Default: 0
    * Used to define the snap bounds of a tick. Snaps to the tick if value is within these bounds.
    */
  var ticks_snap_bounds: js.UndefOr[Double] = js.undefined
  /**
    * Default: false
    * Used to allow for a user to hover over a given tick to see it's value.
    * Useful if custom formatter passed in
    */
  var ticks_tooltip: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: 'show'
    * whether to show the tooltip on drag, hide the tooltip, or always show the tooltip. Accepts: 'show', 'hide', or 'always'
    */
  var tooltip: js.UndefOr[String] = js.undefined
  /**
    * Default: null
    * Position of tooltip, relative to slider. Accepts 'top'/'bottom' for
    * horizontal sliders and 'left'/'right' for vertically orientated sliders.
    * Default positions are 'top' for horizontal and 'right' for vertical
    * slider.
    */
  var tooltip_position: js.UndefOr[top | bottom | left | right] = js.undefined
  /**
    * Default: false
    * if false show one tootip if true show two tooltips one for each handler
    */
  var tooltip_split: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: 5
    * initial value. Use array to have a range slider.
    */
  var value: js.UndefOr[Double | js.Array[Double]] = js.undefined
}

object SliderOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    focus: js.UndefOr[Boolean] = js.undefined,
    formatter: /* val */ Double => CallbackTo[String] = null,
    handle: String = null,
    id: String = null,
    labelledby: String | js.Array[String] = null,
    max: Int | Double = null,
    min: Int | Double = null,
    natural_arrow_keys: js.UndefOr[Boolean] = js.undefined,
    orientation: String = null,
    precision: Int | Double = null,
    range: js.UndefOr[Boolean] = js.undefined,
    rangeHighlights: js.Array[RangeHighlight] = null,
    reversed: js.UndefOr[Boolean] = js.undefined,
    rtl: Boolean | auto = null,
    scale: linear | logarithmic = null,
    selection: String = null,
    step: Int | Double = null,
    ticks: js.Array[Double] = null,
    ticks_labels: js.Array[String] = null,
    ticks_positions: js.Array[Double] = null,
    ticks_snap_bounds: Int | Double = null,
    ticks_tooltip: js.UndefOr[Boolean] = js.undefined,
    tooltip: String = null,
    tooltip_position: top | bottom | left | right = null,
    tooltip_split: js.UndefOr[Boolean] = js.undefined,
    value: Double | js.Array[Double] = null
  ): SliderOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(focus)) __obj.updateDynamic("focus")(focus.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction1((t0: /* val */ scala.Double) => formatter(t0).runNow()))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (labelledby != null) __obj.updateDynamic("labelledby")(labelledby.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(natural_arrow_keys)) __obj.updateDynamic("natural_arrow_keys")(natural_arrow_keys.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(range)) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (rangeHighlights != null) __obj.updateDynamic("rangeHighlights")(rangeHighlights.asInstanceOf[js.Any])
    if (!js.isUndefined(reversed)) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (rtl != null) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (ticks_labels != null) __obj.updateDynamic("ticks_labels")(ticks_labels.asInstanceOf[js.Any])
    if (ticks_positions != null) __obj.updateDynamic("ticks_positions")(ticks_positions.asInstanceOf[js.Any])
    if (ticks_snap_bounds != null) __obj.updateDynamic("ticks_snap_bounds")(ticks_snap_bounds.asInstanceOf[js.Any])
    if (!js.isUndefined(ticks_tooltip)) __obj.updateDynamic("ticks_tooltip")(ticks_tooltip.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltip_position != null) __obj.updateDynamic("tooltip_position")(tooltip_position.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltip_split)) __obj.updateDynamic("tooltip_split")(tooltip_split.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderOptions]
  }
}

