package typingsJapgolly.echarts.echarts.EChartOption

import typingsJapgolly.echarts.AnonAnimationDelay
import typingsJapgolly.echarts.AnonAnimationDelayUpdate
import typingsJapgolly.echarts.AnonAnimationDuration
import typingsJapgolly.echarts.AnonBorderRadius
import typingsJapgolly.echarts.AnonBrushType
import typingsJapgolly.echarts.AnonExtraCssText
import typingsJapgolly.echarts.AnonItemStyleLabel
import typingsJapgolly.echarts.AnonShadowOffsetY
import typingsJapgolly.echarts.echarts.EChartOption.SeriesEffectScatter.DataObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The scatter (bubble) graph with ripple animation.
  * The special animation effect can visually highlights some data.
  *
  * **Tip:** The effects of map was achieved through markPoint in ECharts
  * 2.x.
  * However, in ECharts 3, effectScatter on geographic coordinate is
  * recommended for achieving that effects of map.
  *
  * **Here is the example:**
  *
  * [see doc](https://echarts.apache.org/en/option.html#series-effectScatter)
  *
  *
  * @see https://echarts.apache.org/en/option.html#series-effectScatter
  */
trait SeriesEffectScatter_ extends js.Object {
  /**
    * Whether to enable animation.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.animation
    */
  var animation: js.UndefOr[Boolean] = js.undefined
  /**
    * Delay before updating the first animation, which supports callback
    * function for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-effectScatter.effectScatter)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.animationDelay
    */
  var animationDelay: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Delay before updating animation, which supports callback function
    * for different data to have different animation effect.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-effectScatter.effectScatter)
    *
    * See
    * [this example](https://echarts.apache.org/examples/en/editor.html?c=bar-animation-delay)
    * for more information.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.animationDelayUpdate
    */
  var animationDelayUpdate: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Duration of the first animation, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-effectScatter.effectScatter)
    *
    *
    * @default
    * 1000
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.animationDuration
    */
  var animationDuration: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Time for animation to complete, which supports callback function
    * for different data to have different animation effect:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-effectScatter.effectScatter)
    *
    *
    * @default
    * 300
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.animationDurationUpdate
    */
  var animationDurationUpdate: js.UndefOr[js.Function | Double] = js.undefined
  /**
    * Easing method used for the first animation.
    * Varied easing effects can be found at
    * [easing effect example](https://echarts.apache.org/examples/en/editor.html?c=line-easing)
    * .
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.animationEasing
    */
  var animationEasing: js.UndefOr[String] = js.undefined
  /**
    * Easing method used for animation.
    *
    *
    * @default
    * "cubicOut"
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.animationEasingUpdate
    */
  var animationEasingUpdate: js.UndefOr[String] = js.undefined
  /**
    * Whether to set graphic number threshold to animation.
    * Animation will be disabled when graphic number is larger than
    * threshold.
    *
    *
    * @default
    * 2000
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.animationThreshold
    */
  var animationThreshold: js.UndefOr[Double] = js.undefined
  /**
    * Index of
    * [calendar coordinates](https://echarts.apache.org/en/option.html#calendar)
    * to combine with, which is useful for multiple calendar coordinates
    * in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.calendarIndex
    */
  var calendarIndex: js.UndefOr[Double] = js.undefined
  /**
    * The coordinate used in the series, whose options are:
    *
    * + `'cartesian2d'`
    *
    * Use a two-dimensional rectangular coordinate (also known as Cartesian
    * coordinate), with
    * [xAxisIndex](https://echarts.apache.org/en/option.html#series-bar.xAxisIndex)
    * and
    * [yAxisIndex](https://echarts.apache.org/en/option.html#series-bar.yAxisIndex)
    * to assign the corresponding axis component.
    *
    * + `'polar'`
    *
    * Use polar coordinates, with
    * [polarIndex](https://echarts.apache.org/en/option.html#series-bar.polarIndex)
    * to assign the corresponding polar coordinate component.
    *
    * + `'geo'`
    *
    * Use geographic coordinate, with
    * [geoIndex](https://echarts.apache.org/en/option.html#series-bar.geoIndex)
    * to assign the corresponding geographic coordinate components.
    *
    *
    * @default
    * "cartesian2d"
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.coordinateSystem
    */
  var coordinateSystem: js.UndefOr[String] = js.undefined
  /**
    * The mouse style when mouse hovers on an element, the same as
    * `cursor` property in `CSS`.
    *
    *
    * @default
    * "pointer"
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.cursor
    */
  var cursor: js.UndefOr[String] = js.undefined
  /**
    * Data array of series, which can be in the following forms:
    *
    * Notice, if no `data` specified in series, and there is
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
    * in option, series will use the first
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
    * as its datasource. If `data` has been specified,
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
    * will not used.
    *
    * `series.datasetIndex` can be used to specify other
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
    * .
    *
    * Basically, data is represented by a two-dimension array, like
    * the example below, where each colum is named as a "dimension".
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-effectScatter.effectScatter)
    *
    * + In
    * [cartesian (grid)](https://echarts.apache.org/en/option.html#grid)
    * , "dimX" and "dimY" correspond to
    * [xAxis](https://echarts.apache.org/en/option.html#xAxis)
    * and
    * [yAxis](https://echarts.apache.org/en/option.html#yAxis)
    * repectively.
    * + In
    * [polar](https://echarts.apache.org/en/option.html#polar)
    * "dimX" and "dimY" correspond to
    * [radiusAxis](https://echarts.apache.org/en/option.html#radiusAxis)
    * 和
    * [angleAxis](https://echarts.apache.org/en/option.html#anbleAxis)
    * repectively.
    * + Other dimensions are optional, which can be used in other place.
    * For example:
    * + [visualMap](https://echarts.apache.org/en/option.html#visualMap)
    * can map one or more dimensions to viusal (color, symbol size
    * ...).
    * + [series.symbolSize](https://echarts.apache.org/en/option.html#series.symbolSize)
    * can be set as a callback function, where symbol size can be calculated
    * by values of a certain dimension.
    * + Values in other dimensions can be shown by
    * [tooltip.formatter](https://echarts.apache.org/en/option.html#tooltip.formatter)
    * or
    * [series.label.formatter](https://echarts.apache.org/en/option.html#series.label.formatter)
    * .
    *
    * Especially, when there is one and only one category axis (axis.type
    * is `'category'`), data can be simply be represented by a one-dimension
    * array, like:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-effectScatter.effectScatter)
    *
    * **Relationship between "value" and
    * [axis.type](https://echarts.apache.org/en/option.html#xAxis.type)
    * **
    *
    * + When a dimension corresponds to a value axis (axis.type
    * is `'value'` or `'log'`):
    *
    * The value can be a `number` (like `12`) (can also be a number
    * in a `string` format, like `'12'`).
    *
    * + When a dimension corresponds to a category axis (axis.type
    * is `'category'`):
    *
    * The value should be the ordinal of the axis.data
    * (based on `0`), the string value of the axis.data.
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-effectScatter.effectScatter)
    *
    * There is an example of double category axes:
    * [Github Punchcard](https://echarts.apache.org/examples/en/editor.html?c=scatter-punchCard)
    * .
    *
    * + When a dimension corresponds to a time axis (type is `'time'`),
    * the value can be:
    *
    * + a timestamp, like `1484141700832`, which represents a UTC time.
    * + a date string, in one of the formats below:
    * + a subset of
    * [ISO 8601](http://www.ecma-international.org/ecma-262/5.1/#se
    * c-15.9.1.15)
    * , only including (all of these are treated as local time unless
    * timezone is specified, which is consistent with
    * [moment](https://momentjs.com/)
    * ):
    * + only part of year/month/date/time are specified: `'2012-03'`,
    * `'2012-03-01'`, `'2012-03-01 05'`, `'2012-03-01 05:06'`.
    * + separated by `"T"` or a space: `'2012-03-01T12:22:33.123'`,
    * `'2012-03-01 12:22:33.123'`.
    * + timezone specified: `'2012-03-01T12:22:33Z'`, `'2012-03-01T12:22:33+8000'`,
    * `'2012-03-01T12:22:33-05:00'`.
    * + other date string format (all of these are treated as local
    * time): `'2012'`, `'2012-3-1'`, `'2012/3/1'`, `'2012/03/01'`,
    * `'2009/6/12 2:00'`, `'2009/6/12 2:05:08'`, `'2009/6/12 2:05:08.123'`.
    * + a JavaScript Date instance created by user:
    * + Caution, when using a data string to create a Date instance,
    * [browser differences and inconsistencies](http://dygraphs.com/date-formats.html)
    * should be considered.
    * + For example: In chrome, `new Date('2012-01-01')` is treated
    * as a Jan 1st 2012 in UTC, while `new Date('2012-1-1')` and `new
    * Date('2012/01/01')` are treated as Jan 1st 2012 in local timezone.
    * In safari `new Date('2012-1-1')` is not supported.
    * + So if you intent to perform `new Date(dateString)`, it is strongly
    * recommended to use a time parse library (e.g.,
    * [moment](https://momentjs.com/)
    * ), or use `echarts.number.parseDate`, or check
    * [this](http://dygraphs.com/date-formats.html)
    * .
    *
    * **Customize a data item:**
    *
    * When needing to customize a data item, it can be set as an object,
    * where property `value` reprensent real value. For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-effectScatter.effectScatter)
    *
    * **Empty value:**
    *
    * `'-'` or `null` or `undefined` or `NaN` can be used to describe
    * that a data item is not exists (ps：_not exist_ does not means
    * its value is `0`).
    *
    * For example, line chart can break when encounter an empty value,
    * and scatter chart do not display graphic elements for empty values.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.data
    */
  var data: js.UndefOr[
    js.Array[
      (js.Array[Unit | Double | String | DataObject]) | DataObject | Double | String | Unit
    ]
  ] = js.undefined
  /**
    * If
    * [series.data](https://echarts.apache.org/en/option.html#series.data)
    * is not specified, and
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
    * exists, the series will use `dataset`.
    * `datasetIndex` specifies which dataset will be used.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.datasetIndex
    */
  var datasetIndex: js.UndefOr[Double] = js.undefined
  /**
    * `dimensions` can be used to define dimension info for `series.data`
    * or `dataset.source`.
    *
    * Notice: if
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
    * is used, we can provide dimension names in the first column/row
    * of
    * [dataset.source](https://echarts.apache.org/en/option.html#dataset.source)
    * , and not need to specify `dimensions` here.
    * But if `dimensions` is specified here, echarts will not retrieve
    * dimension names from the first row/column of `dataset.source`
    * any more.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-effectScatter.effectScatter)
    * [see doc](https://echarts.apache.org/en/option.html#series-effectScatter.effectScatter)
    *
    * Each data item of `dimensions` can be:
    *
    * + `string`, for example, `'someName'`, which equals to `{name:
    * 'someName'}`.
    * + `Object`, where the attributes can be:
    * + name: `string`.
    * + type: `string`, supports:
    * + `number`
    * + `float`, that is,
    * [Float64Array](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float64Array)
    *
    * + `int`, that is,
    * [Int32Array](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Int32Array)
    *
    * + `ordinal`, discrete value, which represents string generally.
    * + `time`, time value, see
    * [data](https://echarts.apache.org/en/option.html#series.data)
    * to check the format of time value.
    * + displayName: `string`, generally used in tooltip for dimension
    * display. If not specified, use `name` by default.
    *
    * When `dimensions` is specified, the default `tooltip` will be
    * displayed vertically, which is better to show diemsion names.
    * Otherwise, `tooltip` will displayed only value horizontally.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.dimensions
    */
  var dimensions: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Type of effect.
    * Only ripple effect of `'ripple'` is supported currently.
    *
    *
    * @default
    * "ripple"
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.effectType
    */
  var effectType: js.UndefOr[String] = js.undefined
  /**
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.emphasis
    */
  var emphasis: js.UndefOr[AnonItemStyleLabel] = js.undefined
  /**
    * Define what is encoded to for each dimension of `data`.
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-effectScatter.effectScatter)
    *
    * Attributes of encode are different according to the type of coordinate
    * systtems. For
    * [cartesian2d](https://echarts.apache.org/en/option.html#grid)
    * , `x` and `y` can be defined. For
    * [polar](https://echarts.apache.org/en/option.html#polar)
    * , `radius` and `angle` can be defined. For
    * [geo](https://echarts.apache.org/en/option.html#geo)
    * , `lng` and `lat` can be defined.
    * Attribute `tooltip` and `itemName` (data item name in tooltip)
    * are always able to be defined.
    *
    * When
    * [dimensions](https://echarts.apache.org/en/option.html#series.dimensions)
    * is used to defined name for a certain dimension, `encode` can
    * refer the name directly. For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-effectScatter.effectScatter)
    *
    * Specially, in \[custom series(~series-custom), some property
    * in `encode`, corresponding to axis, can be set as null to make
    * the series not controlled by the axis, that is, the series data
    * will not be count in the extent of the axis, and the
    * [dataZoom](https://echarts.apache.org/en/option.html#dataZoom)
    * on the axis will not filter the series.
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-effectScatter.effectScatter)
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.encode
    */
  var encode: js.UndefOr[js.Object] = js.undefined
  /**
    * Index of
    * [geographic coordinate](https://echarts.apache.org/en/option.html#geo)
    * to combine with, which is useful for multiple geographic axes
    * in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.geoIndex
    */
  var geoIndex: js.UndefOr[Double] = js.undefined
  /**
    * Component ID, not specified by default.
    * If specified, it can be used to refer the component in option
    * or API.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.id
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * Graphic style of , `emphasis` is the style when it is highlighted,
    * like being hovered by mouse, or highlighted via legend connect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.itemStyle
    */
  var itemStyle: js.UndefOr[AnonShadowOffsetY] = js.undefined
  /**
    * Text label of , to explain some data information about graphic
    * item like value, name and so on.
    * `label` is placed under `itemStyle` in ECharts 2.x.
    * In ECharts 3, to make the configuration structure flatter, `label`is
    * taken to be at the same level with `itemStyle`, and has `emphasis`
    * as `itemStyle` does.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.label
    */
  var label: js.UndefOr[AnonBorderRadius] = js.undefined
  /**
    * Whether to enable highlighting chart when
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * is being hovered.
    *
    *
    * @default
    * "true"
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.legendHoverLink
    */
  var legendHoverLink: js.UndefOr[Boolean] = js.undefined
  /**
    * Used to mark an area in chart.
    * For example, mark a time interval.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.markArea
    */
  var markArea: js.UndefOr[AnonAnimationDelayUpdate] = js.undefined
  /**
    * Use a line in the chart to illustrate.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.markLine
    */
  var markLine: js.UndefOr[AnonAnimationDelay] = js.undefined
  /**
    * Mark point in a chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.markPoint
    */
  var markPoint: js.UndefOr[AnonAnimationDuration] = js.undefined
  /**
    * Series name used for displaying in
    * [tooltip](https://echarts.apache.org/en/option.html#tooltip)
    * and filtering with
    * [legend](https://echarts.apache.org/en/option.html#legend)
    * , or updaing data and configuration with `setOption`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.name
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Index of
    * [polar coordinate](https://echarts.apache.org/en/option.html#polar)
    * to combine with, which is useful for multiple polar axes in one
    * chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.polarIndex
    */
  var polarIndex: js.UndefOr[Double] = js.undefined
  /**
    * Related configurations about ripple effect.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.rippleEffect
    */
  var rippleEffect: js.UndefOr[AnonBrushType] = js.undefined
  /**
    * When
    * [dataset](https://echarts.apache.org/en/option.html#dataset)
    * is used, `seriesLayoutBy` specifies whether the column or the
    * row of `dataset` is mapped to the series, namely, the series
    * is "layout" on columns or rows. Optional values:
    *
    * + 'column': by default, the columns of `dataset` are mapped the
    * series. In this case, each column represents a dimension.
    * + 'row'：the rows of `dataset` are mapped to the series.
    * In this case, each row represents a dimension.
    *
    * Check this
    * [example](https://echarts.apache.org/examples/en/editor.html?c=dataset-series-layout-by)
    * .
    *
    *
    * @default
    * "column"
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.seriesLayoutBy
    */
  var seriesLayoutBy: js.UndefOr[String] = js.undefined
  /**
    * When to show the effect.
    *
    * **Options:**
    *
    * + `'render'` Show the effect when rendering is done.
    * + `'emphasis'` Show the effect when it is highlight (hover).
    *
    *
    * @default
    * "render"
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.showEffectOn
    */
  var showEffectOn: js.UndefOr[String] = js.undefined
  /**
    * Symbol of .
    *
    * Icon types provided by ECharts includes `'circle'`, `'rect'`,
    * `'roundRect'`, `'triangle'`, `'diamond'`, `'pin'`, `'arrow'`,
    * `'none'`
    *
    * It can be set to an image with `'image://url'` , in which URL
    * is the link to an image, or `dataURI` of an image.
    *
    * An image URL example:
    *
    * ```
    * 'image://http://xxx.xxx.xxx/a/b.png'
    *
    * ```
    *
    * A `dataURI` example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-effectScatter.effectScatter)
    *
    * Icons can be set to arbitrary vector path via `'path://'` in
    * ECharts.
    * As compared with raster image, vector paths prevent from jagging
    * and blurring when scaled, and have a better control over changing
    * colors.
    * Size of vectoer icon will be adapted automatically. Refer to
    * [SVG PathData](http://www.w3.org/TR/SVG/paths.html#PathData)
    * for more information about format of path.
    * You may export vector paths from tools like Adobe Illustrator.
    *
    * For example:
    *
    * [see doc](https://echarts.apache.org/en/option.html#series-effectScatter.effectScatter)
    *
    *
    * @default
    * "circle"
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.symbol
    */
  var symbol: js.UndefOr[String] = js.undefined
  /**
    * Whether to keep aspect for symbols in the form of `path://`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.symbolKeepAspect
    */
  var symbolKeepAspect: js.UndefOr[Boolean] = js.undefined
  /**
    * Offset of symbol relative to original position.
    * By default, symbol will be put in the center position of data.
    * But if symbol is from user-defined vector path or image, you
    * may not expect symbol to be in center.
    * In this case, you may use this attribute to set offset to default
    * position.
    * It can be in absolute pixel value, or in relative percentage
    * value.
    *
    * For example, `[0, '50%']` means to move upside side position
    * of symbol height.
    * It can be used to make the arrow in the bottom to be at data
    * position when symbol is pin.
    *
    *
    * @default
    * [0, 0]
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.symbolOffset
    */
  var symbolOffset: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Rotate degree of symbol.
    * Note that when `symbol` is set to be `'arrow'` in `markLine`,
    * `symbolRotate` value will be ignored, and compulsively use tangent
    * angle.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.symbolRotate
    */
  var symbolRotate: js.UndefOr[Double] = js.undefined
  /**
    * symbol size.
    * It can be set to single numbers like `10`, or use an array to
    * represent width and height.
    * For example, `[20, 10]` means symbol width is `20`, and height
    * is`10`.
    *
    *
    * @default
    * 10
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.symbolSize
    */
  var symbolSize: js.UndefOr[js.Array[_] | Double] = js.undefined
  /**
    * tooltip settings in this series.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.tooltip
    */
  var tooltip: js.UndefOr[AnonExtraCssText] = js.undefined
  /**
    * @default
    * "effectScatter"
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.type
    */
  var `type`: js.UndefOr[String] = js.undefined
  /**
    * Index of
    * [x axis](https://echarts.apache.org/en/option.html#xAxis)
    * to combine with, which is useful for multiple x axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.xAxisIndex
    */
  var xAxisIndex: js.UndefOr[Double] = js.undefined
  /**
    * Index of
    * [y axis](https://echarts.apache.org/en/option.html#yAxis)
    * to combine with, which is useful for multiple y axes in one chart.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.yAxisIndex
    */
  var yAxisIndex: js.UndefOr[Double] = js.undefined
  /**
    * `z` value of all graghical elements in , which controls order
    * of drawing graphical components.
    * Components with smaller `z` values may be overwritten by those
    * with larger `z` values.
    *
    * `z` has a lower priority to `zlevel`, and will not create new
    * Canvas.
    *
    *
    * @default
    * 2
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.z
    */
  var z: js.UndefOr[Double] = js.undefined
  /**
    * `zlevel` value of all graghical elements in .
    *
    * `zlevel` is used to make layers with Canvas.
    * Graphical elements with different `zlevel` values will be placed
    * in different Canvases, which is a common optimization technique.
    * We can put those frequently changed elements (like those with
    * animations) to a seperate `zlevel`.
    * Notice that too many Canvases will increase memory cost, and
    * should be used carefully on mobile phones to avoid crash.
    *
    * Canvases with bigger `zlevel` will be placed on Canvases with
    * smaller `zlevel`.
    *
    *
    * @see https://echarts.apache.org/en/option.html#series-effectScatter.zlevel
    */
  var zlevel: js.UndefOr[Double] = js.undefined
}

object SeriesEffectScatter_ {
  @scala.inline
  def apply(
    animation: js.UndefOr[Boolean] = js.undefined,
    animationDelay: js.Function | Double = null,
    animationDelayUpdate: js.Function | Double = null,
    animationDuration: js.Function | Double = null,
    animationDurationUpdate: js.Function | Double = null,
    animationEasing: String = null,
    animationEasingUpdate: String = null,
    animationThreshold: Int | Double = null,
    calendarIndex: Int | Double = null,
    coordinateSystem: String = null,
    cursor: String = null,
    data: js.Array[
      (js.Array[Unit | Double | String | DataObject]) | DataObject | Double | String | Unit
    ] = null,
    datasetIndex: Int | Double = null,
    dimensions: js.Array[_] = null,
    effectType: String = null,
    emphasis: AnonItemStyleLabel = null,
    encode: js.Object = null,
    geoIndex: Int | Double = null,
    id: String = null,
    itemStyle: AnonShadowOffsetY = null,
    label: AnonBorderRadius = null,
    legendHoverLink: js.UndefOr[Boolean] = js.undefined,
    markArea: AnonAnimationDelayUpdate = null,
    markLine: AnonAnimationDelay = null,
    markPoint: AnonAnimationDuration = null,
    name: String = null,
    polarIndex: Int | Double = null,
    rippleEffect: AnonBrushType = null,
    seriesLayoutBy: String = null,
    showEffectOn: String = null,
    symbol: String = null,
    symbolKeepAspect: js.UndefOr[Boolean] = js.undefined,
    symbolOffset: js.Array[_] = null,
    symbolRotate: Int | Double = null,
    symbolSize: js.Array[_] | Double = null,
    tooltip: AnonExtraCssText = null,
    `type`: String = null,
    xAxisIndex: Int | Double = null,
    yAxisIndex: Int | Double = null,
    z: Int | Double = null,
    zlevel: Int | Double = null
  ): SeriesEffectScatter_ = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animation)) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (animationDelay != null) __obj.updateDynamic("animationDelay")(animationDelay.asInstanceOf[js.Any])
    if (animationDelayUpdate != null) __obj.updateDynamic("animationDelayUpdate")(animationDelayUpdate.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationDurationUpdate != null) __obj.updateDynamic("animationDurationUpdate")(animationDurationUpdate.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing.asInstanceOf[js.Any])
    if (animationEasingUpdate != null) __obj.updateDynamic("animationEasingUpdate")(animationEasingUpdate.asInstanceOf[js.Any])
    if (animationThreshold != null) __obj.updateDynamic("animationThreshold")(animationThreshold.asInstanceOf[js.Any])
    if (calendarIndex != null) __obj.updateDynamic("calendarIndex")(calendarIndex.asInstanceOf[js.Any])
    if (coordinateSystem != null) __obj.updateDynamic("coordinateSystem")(coordinateSystem.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (datasetIndex != null) __obj.updateDynamic("datasetIndex")(datasetIndex.asInstanceOf[js.Any])
    if (dimensions != null) __obj.updateDynamic("dimensions")(dimensions.asInstanceOf[js.Any])
    if (effectType != null) __obj.updateDynamic("effectType")(effectType.asInstanceOf[js.Any])
    if (emphasis != null) __obj.updateDynamic("emphasis")(emphasis.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(encode.asInstanceOf[js.Any])
    if (geoIndex != null) __obj.updateDynamic("geoIndex")(geoIndex.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(legendHoverLink)) __obj.updateDynamic("legendHoverLink")(legendHoverLink.asInstanceOf[js.Any])
    if (markArea != null) __obj.updateDynamic("markArea")(markArea.asInstanceOf[js.Any])
    if (markLine != null) __obj.updateDynamic("markLine")(markLine.asInstanceOf[js.Any])
    if (markPoint != null) __obj.updateDynamic("markPoint")(markPoint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (polarIndex != null) __obj.updateDynamic("polarIndex")(polarIndex.asInstanceOf[js.Any])
    if (rippleEffect != null) __obj.updateDynamic("rippleEffect")(rippleEffect.asInstanceOf[js.Any])
    if (seriesLayoutBy != null) __obj.updateDynamic("seriesLayoutBy")(seriesLayoutBy.asInstanceOf[js.Any])
    if (showEffectOn != null) __obj.updateDynamic("showEffectOn")(showEffectOn.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(symbolKeepAspect)) __obj.updateDynamic("symbolKeepAspect")(symbolKeepAspect.asInstanceOf[js.Any])
    if (symbolOffset != null) __obj.updateDynamic("symbolOffset")(symbolOffset.asInstanceOf[js.Any])
    if (symbolRotate != null) __obj.updateDynamic("symbolRotate")(symbolRotate.asInstanceOf[js.Any])
    if (symbolSize != null) __obj.updateDynamic("symbolSize")(symbolSize.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (xAxisIndex != null) __obj.updateDynamic("xAxisIndex")(xAxisIndex.asInstanceOf[js.Any])
    if (yAxisIndex != null) __obj.updateDynamic("yAxisIndex")(yAxisIndex.asInstanceOf[js.Any])
    if (z != null) __obj.updateDynamic("z")(z.asInstanceOf[js.Any])
    if (zlevel != null) __obj.updateDynamic("zlevel")(zlevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeriesEffectScatter_]
  }
}

