package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.ChartLegendPosition
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Bottom
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Corner
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Custom
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Invalid
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Left
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Right
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartLegend.toJSON()`. */
trait ChartLegendData extends js.Object {
  /**
    *
    * Represents the formatting of a chart legend, which includes fill and font formatting. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartLegendFormatData] = js.undefined
  /**
    *
    * Represents the height, in points, of the legend on the chart. Null if legend is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the left, in points, of a chart legend. Null if legend is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents a collection of legendEntries in the legend. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var legendEntries: js.UndefOr[js.Array[ChartLegendEntryData]] = js.undefined
  /**
    *
    * Boolean value for whether the chart legend should overlap with the main body of the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var overlay: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the position of the legend on the chart. See Excel.ChartLegendPosition for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var position: js.UndefOr[ChartLegendPosition | Invalid | Top | Bottom | Left | Right | Corner | Custom] = js.undefined
  /**
    *
    * Represents if the legend has a shadow on the chart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showShadow: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the top of a chart legend.
    *
    * [Api set: ExcelApi 1.7]
    */
  var top: js.UndefOr[Double] = js.undefined
  /**
    *
    * A boolean value the represents the visibility of a ChartLegend object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var visible: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the width, in points, of the legend on the chart. Null if legend is not visible.
    *
    * [Api set: ExcelApi 1.7]
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ChartLegendData {
  @scala.inline
  def apply(
    format: ChartLegendFormatData = null,
    height: Int | Double = null,
    left: Int | Double = null,
    legendEntries: js.Array[ChartLegendEntryData] = null,
    overlay: js.UndefOr[Boolean] = js.undefined,
    position: ChartLegendPosition | Invalid | Top | Bottom | Left | Right | Corner | Custom = null,
    showShadow: js.UndefOr[Boolean] = js.undefined,
    top: Int | Double = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Int | Double = null
  ): ChartLegendData = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (legendEntries != null) __obj.updateDynamic("legendEntries")(legendEntries.asInstanceOf[js.Any])
    if (!js.isUndefined(overlay)) __obj.updateDynamic("overlay")(overlay.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showShadow)) __obj.updateDynamic("showShadow")(showShadow.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartLegendData]
  }
}

