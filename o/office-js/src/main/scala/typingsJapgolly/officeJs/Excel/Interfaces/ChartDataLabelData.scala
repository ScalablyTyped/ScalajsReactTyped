package typingsJapgolly.officeJs.Excel.Interfaces

import typingsJapgolly.officeJs.Excel.ChartDataLabelPosition
import typingsJapgolly.officeJs.Excel.ChartTextHorizontalAlignment
import typingsJapgolly.officeJs.Excel.ChartTextVerticalAlignment
import typingsJapgolly.officeJs.officeJsStrings.BestFit
import typingsJapgolly.officeJs.officeJsStrings.Bottom
import typingsJapgolly.officeJs.officeJsStrings.Callout
import typingsJapgolly.officeJs.officeJsStrings.Center
import typingsJapgolly.officeJs.officeJsStrings.Distributed
import typingsJapgolly.officeJs.officeJsStrings.InsideBase
import typingsJapgolly.officeJs.officeJsStrings.InsideEnd
import typingsJapgolly.officeJs.officeJsStrings.Invalid
import typingsJapgolly.officeJs.officeJsStrings.Justify
import typingsJapgolly.officeJs.officeJsStrings.Left
import typingsJapgolly.officeJs.officeJsStrings.None
import typingsJapgolly.officeJs.officeJsStrings.OutsideEnd
import typingsJapgolly.officeJs.officeJsStrings.Right
import typingsJapgolly.officeJs.officeJsStrings.Top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartDataLabel.toJSON()`. */
trait ChartDataLabelData extends js.Object {
  /**
    *
    * Boolean value representing if data label automatically generates appropriate text based on context.
    *
    * [Api set: ExcelApi 1.8]
    */
  var autoText: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the format of chart data label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var format: js.UndefOr[ChartDataLabelFormatData] = js.undefined
  /**
    *
    * String value that represents the formula of chart data label using A1-style notation.
    *
    * [Api set: ExcelApi 1.8]
    */
  var formula: js.UndefOr[String] = js.undefined
  /**
    *
    * Returns the height, in points, of the chart data label. Read-only. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the horizontal alignment for chart data label. See Excel.ChartTextHorizontalAlignment for details.
    This property is valid only when TextOrientation of data label is -90, 90, or 180.
    *
    * [Api set: ExcelApi 1.8]
    */
  var horizontalAlignment: js.UndefOr[ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed] = js.undefined
  /**
    *
    * Represents the distance, in points, from the left edge of chart data label to the left edge of chart area. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var left: js.UndefOr[Double] = js.undefined
  /**
    *
    * Boolean value representing if the number format is linked to the cells (so that the number format changes in the labels when it changes in the cells).
    *
    * [Api set: ExcelApi 1.9]
    */
  var linkNumberFormat: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * String value that represents the format code for data label.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[String] = js.undefined
  /**
    *
    * DataLabelPosition value that represents the position of the data label. See Excel.ChartDataLabelPosition for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var position: js.UndefOr[
    ChartDataLabelPosition | Invalid | None | Center | InsideEnd | InsideBase | OutsideEnd | Left | Right | Top | Bottom | BestFit | Callout
  ] = js.undefined
  /**
    *
    * String representing the separator used for the data label on a chart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var separator: js.UndefOr[String] = js.undefined
  /**
    *
    * Boolean value representing if the data label bubble size is visible or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showBubbleSize: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the data label category name is visible or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showCategoryName: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the data label legend key is visible or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showLegendKey: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the data label percentage is visible or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showPercentage: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the data label series name is visible or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showSeriesName: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Boolean value representing if the data label value is visible or not.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showValue: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * String representing the text of the data label on a chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var text: js.UndefOr[String] = js.undefined
  /**
    *
    * Represents the angle to which the text is oriented for the chart data label. The value should either be an integer from -90 to 90 or the integer 180 for vertically-oriented text.
    *
    * [Api set: ExcelApi 1.8]
    */
  var textOrientation: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the distance, in points, from the top edge of chart data label to the top of chart area. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var top: js.UndefOr[Double] = js.undefined
  /**
    *
    * Represents the vertical alignment of chart data label. See Excel.ChartTextVerticalAlignment for details.
    This property is valid only when TextOrientation of data label is 0.
    *
    * [Api set: ExcelApi 1.8]
    */
  var verticalAlignment: js.UndefOr[ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed] = js.undefined
  /**
    *
    * Returns the width, in points, of the chart data label. Read-only. Null if chart data label is not visible.
    *
    * [Api set: ExcelApi 1.8]
    */
  var width: js.UndefOr[Double] = js.undefined
}

object ChartDataLabelData {
  @scala.inline
  def apply(
    autoText: js.UndefOr[Boolean] = js.undefined,
    format: ChartDataLabelFormatData = null,
    formula: String = null,
    height: Int | Double = null,
    horizontalAlignment: ChartTextHorizontalAlignment | Center | Left | Right | Justify | Distributed = null,
    left: Int | Double = null,
    linkNumberFormat: js.UndefOr[Boolean] = js.undefined,
    numberFormat: String = null,
    position: ChartDataLabelPosition | Invalid | None | Center | InsideEnd | InsideBase | OutsideEnd | Left | Right | Top | Bottom | BestFit | Callout = null,
    separator: String = null,
    showBubbleSize: js.UndefOr[Boolean] = js.undefined,
    showCategoryName: js.UndefOr[Boolean] = js.undefined,
    showLegendKey: js.UndefOr[Boolean] = js.undefined,
    showPercentage: js.UndefOr[Boolean] = js.undefined,
    showSeriesName: js.UndefOr[Boolean] = js.undefined,
    showValue: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    textOrientation: Int | Double = null,
    top: Int | Double = null,
    verticalAlignment: ChartTextVerticalAlignment | Center | Bottom | Top | Justify | Distributed = null,
    width: Int | Double = null
  ): ChartDataLabelData = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoText)) __obj.updateDynamic("autoText")(autoText.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (formula != null) __obj.updateDynamic("formula")(formula.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (horizontalAlignment != null) __obj.updateDynamic("horizontalAlignment")(horizontalAlignment.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(linkNumberFormat)) __obj.updateDynamic("linkNumberFormat")(linkNumberFormat.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (!js.isUndefined(showBubbleSize)) __obj.updateDynamic("showBubbleSize")(showBubbleSize.asInstanceOf[js.Any])
    if (!js.isUndefined(showCategoryName)) __obj.updateDynamic("showCategoryName")(showCategoryName.asInstanceOf[js.Any])
    if (!js.isUndefined(showLegendKey)) __obj.updateDynamic("showLegendKey")(showLegendKey.asInstanceOf[js.Any])
    if (!js.isUndefined(showPercentage)) __obj.updateDynamic("showPercentage")(showPercentage.asInstanceOf[js.Any])
    if (!js.isUndefined(showSeriesName)) __obj.updateDynamic("showSeriesName")(showSeriesName.asInstanceOf[js.Any])
    if (!js.isUndefined(showValue)) __obj.updateDynamic("showValue")(showValue.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (textOrientation != null) __obj.updateDynamic("textOrientation")(textOrientation.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (verticalAlignment != null) __obj.updateDynamic("verticalAlignment")(verticalAlignment.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartDataLabelData]
  }
}

