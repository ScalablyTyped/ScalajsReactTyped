package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.devextremeStrings.Bright
import typingsJapgolly.devextreme.devextremeStrings.Carmine
import typingsJapgolly.devextreme.devextremeStrings.Default
import typingsJapgolly.devextreme.devextremeStrings.Material
import typingsJapgolly.devextreme.devextremeStrings.Ocean
import typingsJapgolly.devextreme.devextremeStrings.Office
import typingsJapgolly.devextreme.devextremeStrings.Pastel
import typingsJapgolly.devextreme.devextremeStrings.Soft
import typingsJapgolly.devextreme.devextremeStrings.Vintage
import typingsJapgolly.devextreme.devextremeStrings.Violet
import typingsJapgolly.devextreme.devextremeStrings.`Dark Moon`
import typingsJapgolly.devextreme.devextremeStrings.`Dark Violet`
import typingsJapgolly.devextreme.devextremeStrings.`Green Mist`
import typingsJapgolly.devextreme.devextremeStrings.`Harmony Light`
import typingsJapgolly.devextreme.devextremeStrings.`Soft Blue`
import typingsJapgolly.devextreme.devextremeStrings.`Soft Pastel`
import typingsJapgolly.devextreme.devextremeStrings.alternate
import typingsJapgolly.devextreme.devextremeStrings.blend
import typingsJapgolly.devextreme.devextremeStrings.extrapolate
import typingsJapgolly.devextreme.mod.DevExpress.viz.ChartSeries
import typingsJapgolly.devextreme.mod.DevExpress.viz.dxChartCommonSeriesSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBarGroupPadding extends js.Object {
  var barGroupPadding: js.UndefOr[Double] = js.undefined
  var barGroupWidth: js.UndefOr[Double] = js.undefined
  var barWidth: js.UndefOr[Double] = js.undefined
  var bottomIndent: js.UndefOr[Double] = js.undefined
  var commonSeriesSettings: js.UndefOr[dxChartCommonSeriesSettings] = js.undefined
  var dataPrepareSettings: js.UndefOr[AnonConvertToAxisDataType] = js.undefined
  var equalBarWidth: js.UndefOr[Boolean] = js.undefined
  var maxBubbleSize: js.UndefOr[Double] = js.undefined
  var minBubbleSize: js.UndefOr[Double] = js.undefined
  var negativesAsZeroes: js.UndefOr[Boolean] = js.undefined
  var palette: js.UndefOr[
    js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.undefined
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.undefined
  var series: js.UndefOr[ChartSeries | js.Array[ChartSeries]] = js.undefined
  var seriesTemplate: js.UndefOr[AnonCustomizeSeries] = js.undefined
  var topIndent: js.UndefOr[Double] = js.undefined
  var useAggregation: js.UndefOr[Boolean] = js.undefined
  var valueAxis: js.UndefOr[AnonInverted] = js.undefined
}

object AnonBarGroupPadding {
  @scala.inline
  def apply(
    barGroupPadding: Int | Double = null,
    barGroupWidth: Int | Double = null,
    barWidth: Int | Double = null,
    bottomIndent: Int | Double = null,
    commonSeriesSettings: dxChartCommonSeriesSettings = null,
    dataPrepareSettings: AnonConvertToAxisDataType = null,
    equalBarWidth: js.UndefOr[Boolean] = js.undefined,
    maxBubbleSize: Int | Double = null,
    minBubbleSize: Int | Double = null,
    negativesAsZeroes: js.UndefOr[Boolean] = js.undefined,
    palette: js.Array[String] | Bright | Default | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office = null,
    paletteExtensionMode: alternate | blend | extrapolate = null,
    series: ChartSeries | js.Array[ChartSeries] = null,
    seriesTemplate: AnonCustomizeSeries = null,
    topIndent: Int | Double = null,
    useAggregation: js.UndefOr[Boolean] = js.undefined,
    valueAxis: AnonInverted = null
  ): AnonBarGroupPadding = {
    val __obj = js.Dynamic.literal()
    if (barGroupPadding != null) __obj.updateDynamic("barGroupPadding")(barGroupPadding.asInstanceOf[js.Any])
    if (barGroupWidth != null) __obj.updateDynamic("barGroupWidth")(barGroupWidth.asInstanceOf[js.Any])
    if (barWidth != null) __obj.updateDynamic("barWidth")(barWidth.asInstanceOf[js.Any])
    if (bottomIndent != null) __obj.updateDynamic("bottomIndent")(bottomIndent.asInstanceOf[js.Any])
    if (commonSeriesSettings != null) __obj.updateDynamic("commonSeriesSettings")(commonSeriesSettings.asInstanceOf[js.Any])
    if (dataPrepareSettings != null) __obj.updateDynamic("dataPrepareSettings")(dataPrepareSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(equalBarWidth)) __obj.updateDynamic("equalBarWidth")(equalBarWidth.asInstanceOf[js.Any])
    if (maxBubbleSize != null) __obj.updateDynamic("maxBubbleSize")(maxBubbleSize.asInstanceOf[js.Any])
    if (minBubbleSize != null) __obj.updateDynamic("minBubbleSize")(minBubbleSize.asInstanceOf[js.Any])
    if (!js.isUndefined(negativesAsZeroes)) __obj.updateDynamic("negativesAsZeroes")(negativesAsZeroes.asInstanceOf[js.Any])
    if (palette != null) __obj.updateDynamic("palette")(palette.asInstanceOf[js.Any])
    if (paletteExtensionMode != null) __obj.updateDynamic("paletteExtensionMode")(paletteExtensionMode.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (seriesTemplate != null) __obj.updateDynamic("seriesTemplate")(seriesTemplate.asInstanceOf[js.Any])
    if (topIndent != null) __obj.updateDynamic("topIndent")(topIndent.asInstanceOf[js.Any])
    if (!js.isUndefined(useAggregation)) __obj.updateDynamic("useAggregation")(useAggregation.asInstanceOf[js.Any])
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBarGroupPadding]
  }
}

