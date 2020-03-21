package typingsJapgolly.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataLabelsOptionsObject extends js.Object {
  /**
    * The alignment of the data label compared to the point. If `right`, the
    * right side of the label should be touching the point. For points with an
    * extent, like columns, the alignments also dictates how to align it inside
    * the box, as given with the inside option. Can be one of `left`, `center`
    * or `right`.
    */
  var align: js.UndefOr[AlignValue | Null] = js.undefined
  /**
    * Whether to allow data labels to overlap. To make the labels less
    * sensitive for overlapping, the dataLabels.padding can be set to 0.
    */
  var allowOverlap: js.UndefOr[Boolean] = js.undefined
  /**
    * The background color or gradient for the data label.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * The border color for the data label. Defaults to `undefined`.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * The border radius in pixels for the data label.
    */
  var borderRadius: js.UndefOr[Double] = js.undefined
  /**
    * The border width in pixels for the data label.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  /**
    * A class name for the data label. Particularly in styled mode, this can be
    * used to give each series' or point's data label unique styling. In
    * addition to this option, a default color class name is added so that we
    * can give the labels a contrast text shadow.
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * The text color for the data labels. Defaults to `undefined`. For certain
    * series types, like column or map, the data labels can be drawn inside the
    * points. In this case the data label will be drawn with maximum contrast
    * by default. Additionally, it will be given a `text-outline` style with
    * the opposite color, to further increase the contrast. This can be
    * overridden by setting the `text-outline` style to `none` in the
    * `dataLabels.style` option.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  /**
    * Whether to hide data labels that are outside the plot area. By default,
    * the data label is moved inside the plot area according to the overflow
    * option.
    */
  var crop: js.UndefOr[Boolean] = js.undefined
  /**
    * (Highcharts, Highstock, Gantt) Whether to defer displaying the data
    * labels until the initial series animation has finished.
    */
  var defer: js.UndefOr[Boolean] = js.undefined
  /**
    * Enable or disable the data labels.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A declarative filter to control of which data labels to display. The
    * declarative filter is designed for use when callback functions are not
    * available, like when the chart options require a pure JSON structure or
    * for use with graphical editors. For programmatic control, use the
    * `formatter` instead, and return `undefined` to disable a single data
    * label.
    */
  var filter: js.UndefOr[DataLabelsFilterOptionsObject] = js.undefined
  /**
    * A format string for the data label. Available variables are the same as
    * for `formatter`.
    */
  var format: js.UndefOr[String] = js.undefined
  /**
    * Callback JavaScript function to format the data label. Note that if a
    * `format` is defined, the format takes precedence and the formatter is
    * ignored.
    */
  var formatter: js.UndefOr[DataLabelsFormatterCallbackFunction] = js.undefined
  /**
    * For points with an extent, like columns or map areas, whether to align
    * the data label inside the box or to the actual value point. Defaults to
    * `false` in most cases, `true` in stacked columns.
    */
  var inside: js.UndefOr[Boolean] = js.undefined
  /**
    * Format for points with the value of null. Works analogously to format.
    * `nullFormat` can be applied only to series which support displaying null
    * points.
    */
  var nullFormat: js.UndefOr[Boolean | String] = js.undefined
  /**
    * Callback JavaScript function that defines formatting for points with the
    * value of null. Works analogously to formatter. `nullPointFormatter` can
    * be applied only to series which support displaying null points.
    */
  var nullFormatter: js.UndefOr[DataLabelsFormatterCallbackFunction] = js.undefined
  /**
    * How to handle data labels that flow outside the plot area. The default is
    * `"justify"`, which aligns them inside the plot area. For columns and
    * bars, this means it will be moved inside the bar. To display data labels
    * outside the plot area, set `crop` to `false` and `overflow` to `"allow"`.
    */
  var overflow: js.UndefOr[DataLabelsOverflowValue] = js.undefined
  /**
    * When either the `borderWidth` or the `backgroundColor` is set, this is
    * the padding within the box.
    */
  var padding: js.UndefOr[Double] = js.undefined
  /**
    * Text rotation in degrees. Note that due to a more complex structure,
    * backgrounds, borders and padding will be lost on a rotated data label.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /**
    * The shadow of the box. Works best with `borderWidth` or
    * `backgroundColor`. Since 2.3 the shadow can be an object configuration
    * containing `color`, `offsetX`, `offsetY`, `opacity` and `width`.
    */
  var shadow: js.UndefOr[Boolean | ShadowOptionsObject] = js.undefined
  /**
    * The name of a symbol to use for the border around the label. Symbols are
    * predefined functions on the Renderer object.
    */
  var shape: js.UndefOr[String] = js.undefined
  /**
    * Styles for the label. The default `color` setting is `"contrast"`, which
    * is a pseudo color that Highcharts picks up and applies the maximum
    * contrast to the underlying point item, for example the bar in a bar
    * chart.
    *
    * The `textOutline` is a pseudo property that applies an outline of the
    * given width with the given color, which by default is the maximum
    * contrast to the text. So a bright text color will result in a black text
    * outline for maximum readability on a mixed background. In some cases,
    * especially with grayscale text, the text outline doesn't work well, in
    * which cases it can be disabled by setting it to `"none"`. When `useHTML`
    * is true, the `textOutline` will not be picked up. In this, case, the same
    * effect can be acheived through the `text-shadow` CSS property.
    *
    * For some series types, where each point has an extent, like for example
    * tree maps, the data label may overflow the point. There are two
    * strategies for handling overflow. By default, the text will wrap to
    * multiple lines. The other strategy is to set `style.textOverflow` to
    * `ellipsis`, which will keep the text on one line plus it will break
    * inside long words.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * Options for a label text which should follow marker's shape. Border and
    * background are disabled for a label that follows a path. **Note:** Only
    * SVG-based renderer supports this option. Setting `useHTML` to true will
    * disable this option.
    */
  var textPath: js.UndefOr[DataLabelsTextPathOptionsObject] = js.undefined
  /**
    * Whether to use HTML to render the labels.
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined
  /**
    * The vertical alignment of a data label. Can be one of `top`, `middle` or
    * `bottom`. The default value depends on the data, for instance in a column
    * chart, the label is above positive values and below negative values.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue | Null] = js.undefined
  /**
    * The x position offset of the label relative to the point in pixels.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * The y position offset of the label relative to the point in pixels.
    */
  var y: js.UndefOr[Double] = js.undefined
  /**
    * The Z index of the data labels. The default Z index puts it above the
    * series. Use a Z index of 2 to display it behind the series.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}

object DataLabelsOptionsObject {
  @scala.inline
  def apply(
    align: AlignValue = null,
    allowOverlap: js.UndefOr[Boolean] = js.undefined,
    backgroundColor: ColorString | GradientColorObject | PatternObject = null,
    borderColor: ColorString | GradientColorObject | PatternObject = null,
    borderRadius: Int | Double = null,
    borderWidth: Int | Double = null,
    className: String = null,
    color: ColorString | GradientColorObject | PatternObject = null,
    crop: js.UndefOr[Boolean] = js.undefined,
    defer: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    filter: DataLabelsFilterOptionsObject = null,
    format: String = null,
    formatter: DataLabelsFormatterCallbackFunction = null,
    inside: js.UndefOr[Boolean] = js.undefined,
    nullFormat: Boolean | String = null,
    nullFormatter: DataLabelsFormatterCallbackFunction = null,
    overflow: DataLabelsOverflowValue = null,
    padding: Int | Double = null,
    rotation: Int | Double = null,
    shadow: Boolean | ShadowOptionsObject = null,
    shape: String = null,
    style: CSSObject = null,
    textPath: DataLabelsTextPathOptionsObject = null,
    useHTML: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: VerticalAlignValue = null,
    x: Int | Double = null,
    y: Int | Double = null,
    zIndex: Int | Double = null
  ): DataLabelsOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(allowOverlap)) __obj.updateDynamic("allowOverlap")(allowOverlap.asInstanceOf[js.Any])
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop.asInstanceOf[js.Any])
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (!js.isUndefined(inside)) __obj.updateDynamic("inside")(inside.asInstanceOf[js.Any])
    if (nullFormat != null) __obj.updateDynamic("nullFormat")(nullFormat.asInstanceOf[js.Any])
    if (nullFormatter != null) __obj.updateDynamic("nullFormatter")(nullFormatter.asInstanceOf[js.Any])
    if (overflow != null) __obj.updateDynamic("overflow")(overflow.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (textPath != null) __obj.updateDynamic("textPath")(textPath.asInstanceOf[js.Any])
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataLabelsOptionsObject]
  }
}

