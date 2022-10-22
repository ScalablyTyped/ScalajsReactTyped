package typingsJapgolly.highcharts.mod

import typingsJapgolly.highcharts.anon.PartialAnimationOptionsOb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SeriesSunburstDataLabelsOptionsObject extends StObject {
  
  /**
    * (Highcharts, Highmaps) Alignment method for data labels. Possible values
    * are:
    *
    * - `plotEdges`: Each label touches the nearest vertical edge of the plot
    * area.
    *
    * - `connectors`: Connectors have the same x position and the widest label
    * of each half (left & right) touches the nearest vertical edge of the plot
    * area.
    */
  var alignTo: js.UndefOr[String] = js.undefined
  
  var allowOverlap: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the initial
    * animation when a series is displayed for the `dataLabels`. The animation
    * can also be set as a configuration object. Please note that this option
    * only applies to the initial animation. For other animations, see
    * chart.animation and the animation parameter under the API methods. The
    * following properties are supported:
    *
    * - `defer`: The animation delay time in milliseconds.
    */
  var animation: js.UndefOr[
    Boolean | PlotSunburstDataLabelsAnimationOptions | PlotSunburstLevelsDataLabelsAnimationOptions | PartialAnimationOptionsOb
  ] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The background color or gradient
    * for the data label.
    */
  var backgroundColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The border color for the data
    * label. Defaults to `undefined`.
    */
  var borderColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The border radius in pixels for
    * the data label.
    */
  var borderRadius: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The border width in pixels for
    * the data label.
    */
  var borderWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A class name for the data label.
    * Particularly in styled mode, this can be used to give each series' or
    * point's data label unique styling. In addition to this option, a default
    * color class name is added so that we can give the labels a contrast text
    * shadow.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The text color for the data
    * labels. Defaults to `undefined`. For certain series types, like column or
    * map, the data labels can be drawn inside the points. In this case the
    * data label will be drawn with maximum contrast by default. Additionally,
    * it will be given a `text-outline` style with the opposite color, to
    * further increase the contrast. This can be overridden by setting the
    * `text-outline` style to `none` in the `dataLabels.style` option.
    */
  var color: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts, Highmaps) The color of the line connecting the data label to
    * the pie slice. The default color is the same as the point's color.
    *
    * In styled mode, the connector stroke is given in the
    * `.highcharts-data-label-connector` class.
    */
  var connectorColor: js.UndefOr[ColorString | GradientColorObject | PatternObject] = js.undefined
  
  /**
    * (Highcharts, Highmaps) The distance from the data label to the connector.
    * Note that data labels also have a default `padding`, so in order for the
    * connector to touch the text, the `padding` must also be 0.
    */
  var connectorPadding: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highmaps) Specifies the method that is used to generate the
    * connector path. Highcharts provides 3 built-in connector shapes:
    * `'fixedOffset'` (default), `'straight'` and `'crookedLine'`. Using
    * `'crookedLine'` has the most sense (in most of the cases) when
    * `'alignTo'` is set.
    *
    * Users can provide their own method by passing a function instead of a
    * String. 3 arguments are passed to the callback:
    *
    * - Object that holds the information about the coordinates of the label
    * (`x` & `y` properties) and how the label is located in relation to the
    * pie (`alignment` property). `alignment` can by one of the following:
    * `'left'` (pie on the left side of the data label), `'right'` (pie on the
    * right side of the data label) or `'center'` (data label overlaps the
    * pie).
    *
    * - Object that holds the information about the position of the connector.
    * Its `touchingSliceAt` porperty tells the position of the place where the
    * connector touches the slice.
    *
    * - Data label options
    *
    * The function has to return an SVG path definition in array form (see the
    * example).
    */
  var connectorShape: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * (Highcharts, Highmaps) The width of the line connecting the data label to
    * the pie slice.
    *
    * In styled mode, the connector stroke width is given in the
    * `.highcharts-data-label-connector` class.
    */
  var connectorWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highmaps) Works only if `connectorShape` is `'crookedLine'`.
    * It defines how far from the vertical plot edge the coonnector path should
    * be crooked.
    */
  var crookDistance: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to hide data labels that
    * are outside the plot area. By default, the data label is moved inside the
    * plot area according to the overflow option.
    */
  var crop: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Gantt) Whether to defer displaying the data
    * labels until the initial series animation has finished. Setting to
    * `false` renders the data label immediately. If set to `true` inherits the
    * defer time set in plotOptions.series.animation. If set to a number, a
    * defer time is specified in milliseconds.
    */
  var defer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highmaps) The distance of the data label from the pie's
    * edge. Negative numbers put the data label on top of the pie slices. Can
    * also be defined as a percentage of pie's radius. Connectors are only
    * shown for data labels outside the pie.
    */
  var distance: js.UndefOr[Double | String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Enable or disable the data
    * labels.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A declarative filter to control
    * of which data labels to display. The declarative filter is designed for
    * use when callback functions are not available, like when the chart
    * options require a pure JSON structure or for use with graphical editors.
    * For programmatic control, use the `formatter` instead, and return
    * `undefined` to disable a single data label.
    */
  var filter: js.UndefOr[DataLabelsFilterOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) A format string for the data
    * label. Available variables are the same as for `formatter`.
    */
  var format: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function to
    * format the data label. Note that if a `format` is defined, the format
    * takes precedence and the formatter is ignored.
    */
  var formatter: js.UndefOr[DataLabelsFormatterCallbackFunction] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Format for points with the value
    * of null. Works analogously to format. `nullFormat` can be applied only to
    * series which support displaying null points.
    */
  var nullFormat: js.UndefOr[Boolean | String] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Callback JavaScript function
    * that defines formatting for points with the value of null. Works
    * analogously to formatter. `nullPointFormatter` can be applied only to
    * series which support displaying null points.
    */
  var nullFormatter: js.UndefOr[DataLabelsFormatterCallbackFunction] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) How to handle data labels that
    * flow outside the plot area. The default is `"justify"`, which aligns them
    * inside the plot area. For columns and bars, this means it will be moved
    * inside the bar. To display data labels outside the plot area, set `crop`
    * to `false` and `overflow` to `"allow"`.
    */
  var overflow: js.UndefOr[DataLabelsOverflowValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) When either the `borderWidth` or
    * the `backgroundColor` is set, this is the padding within the box.
    */
  var padding: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Aligns data labels relative to
    * points. If `center` alignment is not possible, it defaults to `right`.
    */
  var position: js.UndefOr[AlignValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Text rotation in degrees. Note
    * that due to a more complex structure, backgrounds, borders and padding
    * will be lost on a rotated data label.
    */
  var rotation: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Decides how the data label will
    * be rotated relative to the perimeter of the sunburst. Valid values are
    * `auto`, `circular`, `parallel` and `perpendicular`. When `auto`, the best
    * fit will be computed for the point. The `circular` option works similiar
    * to `auto`, but uses the `textPath` feature - labels are curved, resulting
    * in a better layout, however multiple lines and `textOutline` are not
    * supported.
    *
    * The `rotation` option takes precedence over `rotationMode`.
    */
  var rotationMode: js.UndefOr[OptionsRotationModeValue] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The shadow of the box. Works
    * best with `borderWidth` or `backgroundColor`. Since 2.3 the shadow can be
    * an object configuration containing `color`, `offsetX`, `offsetY`,
    * `opacity` and `width`.
    */
  var shadow: js.UndefOr[Boolean | ShadowOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The name of a symbol to use for
    * the border around the label. Symbols are predefined functions on the
    * Renderer object.
    */
  var shape: js.UndefOr[String] = js.undefined
  
  /**
    * (Highcharts, Highmaps) Whether to render the connector as a soft arc or a
    * line with sharp break. Works only if `connectorShape` equals to
    * `fixedOffset`.
    */
  var softConnector: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Styles for the label. The
    * default `color` setting is `"contrast"`, which is a pseudo color that
    * Highcharts picks up and applies the maximum contrast to the underlying
    * point item, for example the bar in a bar chart.
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
    * (Highcharts, Highstock, Highmaps, Gantt) Options for a label text which
    * should follow marker's shape. Border and background are disabled for a
    * label that follows a path.
    *
    * **Note:** Only SVG-based renderer supports this option. Setting `useHTML`
    * to true will disable this option.
    */
  var textPath: js.UndefOr[DataLabelsTextPathOptionsObject] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) Whether to use HTML to render
    * the labels.
    */
  var useHTML: js.UndefOr[Boolean] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The vertical alignment of a data
    * label. Can be one of `top`, `middle` or `bottom`. The default value
    * depends on the data, for instance in a column chart, the label is above
    * positive values and below negative values.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue | Null] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The x position offset of the
    * label relative to the point in pixels.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The y position offset of the
    * label relative to the point in pixels.
    */
  var y: js.UndefOr[Double] = js.undefined
  
  /**
    * (Highcharts, Highstock, Highmaps, Gantt) The z index of the data labels.
    * Use a `zIndex` of 6 to display it above the series, or use a `zIndex` of
    * 2 to display it behind the series.
    */
  var zIndex: js.UndefOr[Double] = js.undefined
}
object SeriesSunburstDataLabelsOptionsObject {
  
  inline def apply(): SeriesSunburstDataLabelsOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesSunburstDataLabelsOptionsObject]
  }
  
  extension [Self <: SeriesSunburstDataLabelsOptionsObject](x: Self) {
    
    inline def setAlignTo(value: String): Self = StObject.set(x, "alignTo", value.asInstanceOf[js.Any])
    
    inline def setAlignToUndefined: Self = StObject.set(x, "alignTo", js.undefined)
    
    inline def setAllowOverlap(value: Boolean): Self = StObject.set(x, "allowOverlap", value.asInstanceOf[js.Any])
    
    inline def setAllowOverlapUndefined: Self = StObject.set(x, "allowOverlap", js.undefined)
    
    inline def setAnimation(
      value: Boolean | PlotSunburstDataLabelsAnimationOptions | PlotSunburstLevelsDataLabelsAnimationOptions | PartialAnimationOptionsOb
    ): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setBackgroundColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setBorderColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
    
    inline def setBorderRadius(value: Double): Self = StObject.set(x, "borderRadius", value.asInstanceOf[js.Any])
    
    inline def setBorderRadiusUndefined: Self = StObject.set(x, "borderRadius", js.undefined)
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setBorderWidthUndefined: Self = StObject.set(x, "borderWidth", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setConnectorColor(value: ColorString | GradientColorObject | PatternObject): Self = StObject.set(x, "connectorColor", value.asInstanceOf[js.Any])
    
    inline def setConnectorColorUndefined: Self = StObject.set(x, "connectorColor", js.undefined)
    
    inline def setConnectorPadding(value: Double): Self = StObject.set(x, "connectorPadding", value.asInstanceOf[js.Any])
    
    inline def setConnectorPaddingUndefined: Self = StObject.set(x, "connectorPadding", js.undefined)
    
    inline def setConnectorShape(value: String | js.Function): Self = StObject.set(x, "connectorShape", value.asInstanceOf[js.Any])
    
    inline def setConnectorShapeUndefined: Self = StObject.set(x, "connectorShape", js.undefined)
    
    inline def setConnectorWidth(value: Double): Self = StObject.set(x, "connectorWidth", value.asInstanceOf[js.Any])
    
    inline def setConnectorWidthUndefined: Self = StObject.set(x, "connectorWidth", js.undefined)
    
    inline def setCrookDistance(value: Double): Self = StObject.set(x, "crookDistance", value.asInstanceOf[js.Any])
    
    inline def setCrookDistanceUndefined: Self = StObject.set(x, "crookDistance", js.undefined)
    
    inline def setCrop(value: Boolean): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
    
    inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
    
    inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
    
    inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
    
    inline def setDistance(value: Double | String): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setFilter(value: DataLabelsFilterOptionsObject): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormatter(value: DataLabelsFormatterCallbackFunction): Self = StObject.set(x, "formatter", value.asInstanceOf[js.Any])
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setNullFormat(value: Boolean | String): Self = StObject.set(x, "nullFormat", value.asInstanceOf[js.Any])
    
    inline def setNullFormatUndefined: Self = StObject.set(x, "nullFormat", js.undefined)
    
    inline def setNullFormatter(value: DataLabelsFormatterCallbackFunction): Self = StObject.set(x, "nullFormatter", value.asInstanceOf[js.Any])
    
    inline def setNullFormatterUndefined: Self = StObject.set(x, "nullFormatter", js.undefined)
    
    inline def setOverflow(value: DataLabelsOverflowValue): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
    
    inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPosition(value: AlignValue): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setRotationMode(value: OptionsRotationModeValue): Self = StObject.set(x, "rotationMode", value.asInstanceOf[js.Any])
    
    inline def setRotationModeUndefined: Self = StObject.set(x, "rotationMode", js.undefined)
    
    inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    
    inline def setShadow(value: Boolean | ShadowOptionsObject): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSoftConnector(value: Boolean): Self = StObject.set(x, "softConnector", value.asInstanceOf[js.Any])
    
    inline def setSoftConnectorUndefined: Self = StObject.set(x, "softConnector", js.undefined)
    
    inline def setStyle(value: CSSObject): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTextPath(value: DataLabelsTextPathOptionsObject): Self = StObject.set(x, "textPath", value.asInstanceOf[js.Any])
    
    inline def setTextPathUndefined: Self = StObject.set(x, "textPath", js.undefined)
    
    inline def setUseHTML(value: Boolean): Self = StObject.set(x, "useHTML", value.asInstanceOf[js.Any])
    
    inline def setUseHTMLUndefined: Self = StObject.set(x, "useHTML", js.undefined)
    
    inline def setVerticalAlign(value: VerticalAlignValue): Self = StObject.set(x, "verticalAlign", value.asInstanceOf[js.Any])
    
    inline def setVerticalAlignNull: Self = StObject.set(x, "verticalAlign", null)
    
    inline def setVerticalAlignUndefined: Self = StObject.set(x, "verticalAlign", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
