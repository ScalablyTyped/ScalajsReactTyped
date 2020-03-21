package typingsJapgolly.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartSeriesDefaults extends js.Object {
  var area: js.UndefOr[js.Any] = js.undefined
  var bar: js.UndefOr[js.Any] = js.undefined
  var border: js.UndefOr[ChartSeriesDefaultsBorder] = js.undefined
  var bubble: js.UndefOr[js.Any] = js.undefined
  var candlestick: js.UndefOr[js.Any] = js.undefined
  var column: js.UndefOr[js.Any] = js.undefined
  var donut: js.UndefOr[js.Any] = js.undefined
  var gap: js.UndefOr[Double] = js.undefined
  var labels: js.UndefOr[ChartSeriesDefaultsLabels] = js.undefined
  var line: js.UndefOr[js.Any] = js.undefined
  var notes: js.UndefOr[ChartSeriesDefaultsNotes] = js.undefined
  var ohlc: js.UndefOr[js.Any] = js.undefined
  var overlay: js.UndefOr[ChartSeriesDefaultsOverlay] = js.undefined
  var pie: js.UndefOr[js.Any] = js.undefined
  var rangeArea: js.UndefOr[js.Any] = js.undefined
  var scatter: js.UndefOr[js.Any] = js.undefined
  var scatterLine: js.UndefOr[js.Any] = js.undefined
  var spacing: js.UndefOr[Double] = js.undefined
  var stack: js.UndefOr[Boolean | ChartSeriesDefaultsStack] = js.undefined
  var tooltip: js.UndefOr[ChartSeriesDefaultsTooltip] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var verticalArea: js.UndefOr[js.Any] = js.undefined
  var verticalLine: js.UndefOr[js.Any] = js.undefined
  var verticalRangeArea: js.UndefOr[js.Any] = js.undefined
  var visual: js.UndefOr[js.Function] = js.undefined
}

object ChartSeriesDefaults {
  @scala.inline
  def apply(
    area: js.Any = null,
    bar: js.Any = null,
    border: ChartSeriesDefaultsBorder = null,
    bubble: js.Any = null,
    candlestick: js.Any = null,
    column: js.Any = null,
    donut: js.Any = null,
    gap: Int | Double = null,
    labels: ChartSeriesDefaultsLabels = null,
    line: js.Any = null,
    notes: ChartSeriesDefaultsNotes = null,
    ohlc: js.Any = null,
    overlay: ChartSeriesDefaultsOverlay = null,
    pie: js.Any = null,
    rangeArea: js.Any = null,
    scatter: js.Any = null,
    scatterLine: js.Any = null,
    spacing: Int | Double = null,
    stack: Boolean | ChartSeriesDefaultsStack = null,
    tooltip: ChartSeriesDefaultsTooltip = null,
    `type`: String = null,
    verticalArea: js.Any = null,
    verticalLine: js.Any = null,
    verticalRangeArea: js.Any = null,
    visual: js.Function = null
  ): ChartSeriesDefaults = {
    val __obj = js.Dynamic.literal()
    if (area != null) __obj.updateDynamic("area")(area.asInstanceOf[js.Any])
    if (bar != null) __obj.updateDynamic("bar")(bar.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (bubble != null) __obj.updateDynamic("bubble")(bubble.asInstanceOf[js.Any])
    if (candlestick != null) __obj.updateDynamic("candlestick")(candlestick.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (donut != null) __obj.updateDynamic("donut")(donut.asInstanceOf[js.Any])
    if (gap != null) __obj.updateDynamic("gap")(gap.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (ohlc != null) __obj.updateDynamic("ohlc")(ohlc.asInstanceOf[js.Any])
    if (overlay != null) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (pie != null) __obj.updateDynamic("pie")(pie.asInstanceOf[js.Any])
    if (rangeArea != null) __obj.updateDynamic("rangeArea")(rangeArea.asInstanceOf[js.Any])
    if (scatter != null) __obj.updateDynamic("scatter")(scatter.asInstanceOf[js.Any])
    if (scatterLine != null) __obj.updateDynamic("scatterLine")(scatterLine.asInstanceOf[js.Any])
    if (spacing != null) __obj.updateDynamic("spacing")(spacing.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verticalArea != null) __obj.updateDynamic("verticalArea")(verticalArea.asInstanceOf[js.Any])
    if (verticalLine != null) __obj.updateDynamic("verticalLine")(verticalLine.asInstanceOf[js.Any])
    if (verticalRangeArea != null) __obj.updateDynamic("verticalRangeArea")(verticalRangeArea.asInstanceOf[js.Any])
    if (visual != null) __obj.updateDynamic("visual")(visual.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartSeriesDefaults]
  }
}

