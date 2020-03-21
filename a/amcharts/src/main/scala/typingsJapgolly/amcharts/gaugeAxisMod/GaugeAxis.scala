package typingsJapgolly.amcharts.gaugeAxisMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaugeAxis extends js.Object {
  /**
    * Axis opacity.
    * @default 1
    */
  var axisAlpha: Double
  /**
    * Axis color.
    * @default #000000
    */
  var axisColor: String
  /**
    * Thickness of the axis outline.
    * @default 1
    */
  var axisThickness: Double
  /**
    * Opacity of band fills.
    * @default 1
    */
  var bandAlpha: Double
  /**
    * Example: [-0.2, 0, -0.2]. Will make bands to be filled with color gradients.
    * Negative value means the color will be darker than the original,
    * and positive number means the color will be lighter.
    * @default []
    */
  var bandGradientRatio: js.Array[Double]
  /**
    * Opacity of band outlines.
    * @default 0
    */
  var bandOutlineAlpha: Double
  /**
    * Color of band outlines.
    * @default #000000
    */
  var bandOutlineColor: String
  /**
    * Thickness of band outlines.
    * @default 0
    */
  var bandOutlineThickness: Double
  /**
    * Array of bands - GaugeBand objects. Bands are used to draw color fills between specified values.
    */
  var bands: js.Array[typingsJapgolly.amcharts.gaugeBandMod.default]
  /**
    * Text displayed below the axis center.
    */
  var bottomText: String
  /**
    * Specifies if text should be bold.
    * @default true
    */
  var bottomTextBold: Boolean
  /**
    * Bottom text color.
    */
  var bottomTextColor: String
  /**
    * Font size of bottom text.
    */
  var bottomTextFontSize: Double
  /**
    * Y offset of bottom text.
    * @default 0
    */
  var bottomTextYOffset: Double
  /**
    * X position of the axis, relative to the center of the gauge.
    * @default '0%'
    */
  var centerX: js.Any
  /**
    * Y position of the axis, relative to the center of the gauge.
    * @default '0%'
    */
  var centerY: js.Any
  /**
    * Specifies labels color of the axis.
    */
  var color: String
  /**
    * Axis end angle. Valid values are from - 180 to 180.
    * @default 120
    */
  var endAngle: Double
  /**
    * Axis end (max) value
    */
  var endValue: Double
  /**
    * Font size for axis labels.
    */
  var fontSize: Double
  /**
    * Number of grid lines. Note, GaugeAxis doesn't adjust gridCount,
    * so you should check your values and choose a proper gridCount which would result grids at round numbers.
    * @default 5
    */
  var gridCount: Double
  /**
    * Specifies if grid should be drawn inside or outside the axis.
    * @default true
    */
  var gridInside: Boolean
  /**
    * Unique id of an axis.
    */
  var id: js.Any
  /**
    * Specifies if labels should be placed inside or outside the axis.
    * @default true
    */
  var inside: Boolean
  /**
    * Frequency of labels.
    * @default 1
    */
  var labelFrequency: Double
  /**
    * Distance from axis to the labels.
    * @default 15
    */
  var labelOffset: Double
  /**
    * Specifies if labels on the axis should be shown.
    * @default true
    */
  var labelsEnabled: Boolean
  /**
    * You can add listeners of events using this property.
    * Example: listeners = [{"event":"clickBand", "method":handleClick}];
    */
  var listeners: js.Array[js.Object]
  /**
    * Interval, at which minor ticks should be placed.
    */
  var minorTickInterval: Double
  /**
    * Length of a minor tick.
    * @default 5
    */
  var minorTickLength: Double
  /**
    * Axis radius.
    * @default '95%'
    */
  var radius: js.Any
  /**
    * Specifies if the first label should be shown.
    * @default true
    */
  var showFirstLabel: Boolean
  /**
    * Specifies if the last label should be shown.
    * @default true
    */
  var showLastLabel: Boolean
  /**
    * Axis start angle. Valid values are from - 180 to 180.
    * @default -120
    */
  var startAngle: Double
  /**
    * Axis start (min) value.
    * @default 0
    */
  var startValue: Double
  /**
    * Opacity of axis ticks.
    * @default 1
    */
  var tickAlpha: Double
  /**
    * Color of axis ticks.
    * @default #555555
    */
  var tickColor: String
  /**
    * Length of a major tick.
    * @default 10
    */
  var tickLength: Double
  /**
    * Tick thickness.
    * @default 1
    */
  var tickThickness: Double
  /**
    * Text displayed above the axis center.
    */
  var topText: String
  /**
    * Specifies if text should be bold.
    * @default true
    */
  var topTextBold: Boolean
  /**
    * Color of top text.
    */
  var topTextColor: String
  /**
    * Font size of top text.
    */
  var topTextFontSize: Double
  /**
    * Y offset of top text.
    * @default 0
    */
  var topTextYOffset: Double
  /**
    * A string which can be placed next to axis labels.
    */
  var unit: String
  /**
    * Position of the unit.
    * @default right
    */
  var unitPosition: String
  /**
    * Specifies if small and big numbers should use prefixes to make them more readable.
    * @default false
    */
  var usePrefixes: Boolean
  /**
    * Interval, at which ticks with values should be placed.
    */
  var valueInterval: Double
  /**
    * Adds event listener to the object.
    */
  def addListener(`type`: String, handler: js.Any): Unit
  /**
    * You can use this function to format axis labels.
    * This function is called and value is passed as a attribute: labelFunction(value);
    */
  def labelFunction(value: Double): String
  /**
    * Removes event listener from chart object.
    */
  def removeListener(chart: typingsJapgolly.amcharts.amChartMod.default, `type`: String, handler: js.Any): Unit
  /**
    * Sets bottom text.
    */
  def setBottomText(text: String): Unit
  /**
    * Sets top text.
    */
  def setTopText(textstring: String): Unit
  /**
    * Returns angle of the value.
    */
  def value2angle(value: Double): Unit
}

object GaugeAxis {
  @scala.inline
  def apply(
    addListener: (String, js.Any) => Callback,
    axisAlpha: Double,
    axisColor: String,
    axisThickness: Double,
    bandAlpha: Double,
    bandGradientRatio: js.Array[Double],
    bandOutlineAlpha: Double,
    bandOutlineColor: String,
    bandOutlineThickness: Double,
    bands: js.Array[typingsJapgolly.amcharts.gaugeBandMod.default],
    bottomText: String,
    bottomTextBold: Boolean,
    bottomTextColor: String,
    bottomTextFontSize: Double,
    bottomTextYOffset: Double,
    centerX: js.Any,
    centerY: js.Any,
    color: String,
    endAngle: Double,
    endValue: Double,
    fontSize: Double,
    gridCount: Double,
    gridInside: Boolean,
    id: js.Any,
    inside: Boolean,
    labelFrequency: Double,
    labelFunction: Double => CallbackTo[String],
    labelOffset: Double,
    labelsEnabled: Boolean,
    listeners: js.Array[js.Object],
    minorTickInterval: Double,
    minorTickLength: Double,
    radius: js.Any,
    removeListener: (typingsJapgolly.amcharts.amChartMod.default, String, js.Any) => Callback,
    setBottomText: String => Callback,
    setTopText: String => Callback,
    showFirstLabel: Boolean,
    showLastLabel: Boolean,
    startAngle: Double,
    startValue: Double,
    tickAlpha: Double,
    tickColor: String,
    tickLength: Double,
    tickThickness: Double,
    topText: String,
    topTextBold: Boolean,
    topTextColor: String,
    topTextFontSize: Double,
    topTextYOffset: Double,
    unit: String,
    unitPosition: String,
    usePrefixes: Boolean,
    value2angle: Double => Callback,
    valueInterval: Double
  ): GaugeAxis = {
    val __obj = js.Dynamic.literal(axisAlpha = axisAlpha.asInstanceOf[js.Any], axisColor = axisColor.asInstanceOf[js.Any], axisThickness = axisThickness.asInstanceOf[js.Any], bandAlpha = bandAlpha.asInstanceOf[js.Any], bandGradientRatio = bandGradientRatio.asInstanceOf[js.Any], bandOutlineAlpha = bandOutlineAlpha.asInstanceOf[js.Any], bandOutlineColor = bandOutlineColor.asInstanceOf[js.Any], bandOutlineThickness = bandOutlineThickness.asInstanceOf[js.Any], bands = bands.asInstanceOf[js.Any], bottomText = bottomText.asInstanceOf[js.Any], bottomTextBold = bottomTextBold.asInstanceOf[js.Any], bottomTextColor = bottomTextColor.asInstanceOf[js.Any], bottomTextFontSize = bottomTextFontSize.asInstanceOf[js.Any], bottomTextYOffset = bottomTextYOffset.asInstanceOf[js.Any], centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], endAngle = endAngle.asInstanceOf[js.Any], endValue = endValue.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], gridCount = gridCount.asInstanceOf[js.Any], gridInside = gridInside.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inside = inside.asInstanceOf[js.Any], labelFrequency = labelFrequency.asInstanceOf[js.Any], labelOffset = labelOffset.asInstanceOf[js.Any], labelsEnabled = labelsEnabled.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], minorTickInterval = minorTickInterval.asInstanceOf[js.Any], minorTickLength = minorTickLength.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], showFirstLabel = showFirstLabel.asInstanceOf[js.Any], showLastLabel = showLastLabel.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], startValue = startValue.asInstanceOf[js.Any], tickAlpha = tickAlpha.asInstanceOf[js.Any], tickColor = tickColor.asInstanceOf[js.Any], tickLength = tickLength.asInstanceOf[js.Any], tickThickness = tickThickness.asInstanceOf[js.Any], topText = topText.asInstanceOf[js.Any], topTextBold = topTextBold.asInstanceOf[js.Any], topTextColor = topTextColor.asInstanceOf[js.Any], topTextFontSize = topTextFontSize.asInstanceOf[js.Any], topTextYOffset = topTextYOffset.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], unitPosition = unitPosition.asInstanceOf[js.Any], usePrefixes = usePrefixes.asInstanceOf[js.Any], valueInterval = valueInterval.asInstanceOf[js.Any])
    __obj.updateDynamic("addListener")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => addListener(t0, t1).runNow()))
    __obj.updateDynamic("labelFunction")(js.Any.fromFunction1((t0: scala.Double) => labelFunction(t0).runNow()))
    __obj.updateDynamic("removeListener")(js.Any.fromFunction3((t0: typingsJapgolly.amcharts.amChartMod.default, t1: java.lang.String, t2: js.Any) => removeListener(t0, t1, t2).runNow()))
    __obj.updateDynamic("setBottomText")(js.Any.fromFunction1((t0: java.lang.String) => setBottomText(t0).runNow()))
    __obj.updateDynamic("setTopText")(js.Any.fromFunction1((t0: java.lang.String) => setTopText(t0).runNow()))
    __obj.updateDynamic("value2angle")(js.Any.fromFunction1((t0: scala.Double) => value2angle(t0).runNow()))
    __obj.asInstanceOf[GaugeAxis]
  }
}

