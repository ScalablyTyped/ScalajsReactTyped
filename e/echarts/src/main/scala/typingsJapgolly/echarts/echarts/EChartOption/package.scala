package typingsJapgolly.echarts.echarts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object EChartOption {
  type Calendar = typingsJapgolly.echarts.echarts.EChartOption.Calendar_
  /**
    * Color type for itemStyle / areaStyle etc.
    * [Color](https://echarts.apache.org/zh/option.html#series-line.areaStyle)
    * + Linear gradient. First four parameters are x0, y0, x2, and y2, each ranged from 0 to 1, standing for percentage in the bounding box. If global is `true`, then the first four parameters are in absolute pixel positions.
    * + Radial gradient. First three parameters are x and y positions of center, and radius, similar to linear gradient.
    * + Fill with texture
    */
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsJapgolly.echarts.AnonType
    - typingsJapgolly.echarts.AnonX
    - typingsJapgolly.echarts.AnonImage
  */
  type Color = typingsJapgolly.echarts.echarts.EChartOption._Color | java.lang.String
  /**
    * Data zoom component of inside type.
    * Refer to dataZoom for more information.
    * The inside means it's inside the coordinates.
    * Translation: data area can be translated when moving in coordinates.
    * Scaling:
    * PC: when mouse rolls (similar with touch pad) in coordinates.
    * Mobile: when touches and moved with two fingers in coordinates
    * on touch screens.
    *
    * @todo describe
    * @see https://echarts.apache.org/en/option.html#dataZoom-inside
    * @see https://echarts.apache.org/en/option.html#dataZoom-slider
    */
  type DataZoom = typingsJapgolly.echarts.echarts.EChartOption.DataZoom.Inside | typingsJapgolly.echarts.echarts.EChartOption.DataZoom.Slider
  type Dataset = typingsJapgolly.echarts.echarts.EChartOption.Dataset_
  type Legend = typingsJapgolly.echarts.echarts.EChartOption.Legend_
  /**
    * @see https://echarts.apache.org/en/tutorial.html#Rich%20Text
    */
  type RichStyle = org.scalablytyped.runtime.StringDictionary[typingsJapgolly.echarts.echarts.EChartOption.TextStyle]
  type Series = typingsJapgolly.echarts.echarts.EChartOption.SeriesLine | typingsJapgolly.echarts.echarts.EChartOption.SeriesBar | typingsJapgolly.echarts.echarts.EChartOption.SeriesPie | typingsJapgolly.echarts.echarts.EChartOption.SeriesScatter | typingsJapgolly.echarts.echarts.EChartOption.SeriesEffectScatter | typingsJapgolly.echarts.echarts.EChartOption.SeriesRadar | typingsJapgolly.echarts.echarts.EChartOption.SeriesTree | typingsJapgolly.echarts.echarts.EChartOption.SeriesTreemap | typingsJapgolly.echarts.echarts.EChartOption.SeriesSunburst | typingsJapgolly.echarts.echarts.EChartOption.SeriesBoxplot | typingsJapgolly.echarts.echarts.EChartOption.SeriesCandlestick | typingsJapgolly.echarts.echarts.EChartOption.SeriesHeatmap | typingsJapgolly.echarts.echarts.EChartOption.SeriesMap | typingsJapgolly.echarts.echarts.EChartOption.SeriesParallel | typingsJapgolly.echarts.echarts.EChartOption.SeriesLines | typingsJapgolly.echarts.echarts.EChartOption.SeriesGraph | typingsJapgolly.echarts.echarts.EChartOption.SeriesSankey | typingsJapgolly.echarts.echarts.EChartOption.SeriesFunnel | typingsJapgolly.echarts.echarts.EChartOption.SeriesGauge | typingsJapgolly.echarts.echarts.EChartOption.SeriesPictorialBar | typingsJapgolly.echarts.echarts.EChartOption.SeriesThemeRiver | typingsJapgolly.echarts.echarts.EChartOption.SeriesCustom
  type SeriesBar = typingsJapgolly.echarts.echarts.EChartOption.SeriesBar_
  type SeriesBoxplot = typingsJapgolly.echarts.echarts.EChartOption.SeriesBoxplot_
  type SeriesCandlestick = typingsJapgolly.echarts.echarts.EChartOption.SeriesCandlestick_
  type SeriesCustom = typingsJapgolly.echarts.echarts.EChartOption.SeriesCustom_
  type SeriesEffectScatter = typingsJapgolly.echarts.echarts.EChartOption.SeriesEffectScatter_
  type SeriesFunnel = typingsJapgolly.echarts.echarts.EChartOption.SeriesFunnel_
  type SeriesGraph = typingsJapgolly.echarts.echarts.EChartOption.SeriesGraph_
  type SeriesHeatmap = typingsJapgolly.echarts.echarts.EChartOption.SeriesHeatmap_
  type SeriesLine = typingsJapgolly.echarts.echarts.EChartOption.SeriesLine_
  type SeriesLines = typingsJapgolly.echarts.echarts.EChartOption.SeriesLines_
  type SeriesMap = typingsJapgolly.echarts.echarts.EChartOption.SeriesMap_
  type SeriesParallel = typingsJapgolly.echarts.echarts.EChartOption.SeriesParallel_
  type SeriesPictorialBar = typingsJapgolly.echarts.echarts.EChartOption.SeriesPictorialBar_
  type SeriesPie = typingsJapgolly.echarts.echarts.EChartOption.SeriesPie_
  type SeriesRadar = typingsJapgolly.echarts.echarts.EChartOption.SeriesRadar_
  type SeriesSankey = typingsJapgolly.echarts.echarts.EChartOption.SeriesSankey_
  type SeriesScatter = typingsJapgolly.echarts.echarts.EChartOption.SeriesScatter_
  type SeriesSunburst = typingsJapgolly.echarts.echarts.EChartOption.SeriesSunburst_
  type SeriesThemeRiver = typingsJapgolly.echarts.echarts.EChartOption.SeriesThemeRiver_
  type SeriesTree = typingsJapgolly.echarts.echarts.EChartOption.SeriesTree_
  type SeriesTreemap = typingsJapgolly.echarts.echarts.EChartOption.SeriesTreemap_
  type Tooltip = typingsJapgolly.echarts.echarts.EChartOption.Tooltip_
}
