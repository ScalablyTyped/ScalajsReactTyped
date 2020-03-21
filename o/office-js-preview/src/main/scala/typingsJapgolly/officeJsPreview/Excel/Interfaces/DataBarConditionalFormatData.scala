package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.ConditionalDataBarAxisFormat
import typingsJapgolly.officeJsPreview.Excel.ConditionalDataBarDirection
import typingsJapgolly.officeJsPreview.Excel.ConditionalDataBarRule
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Automatic
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.CellMidPoint
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Context
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.LeftToRight
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.None
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.RightToLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `dataBarConditionalFormat.toJSON()`. */
trait DataBarConditionalFormatData extends js.Object {
  /**
    *
    * HTML color code representing the color of the Axis line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    "" (empty string) if no axis is present or set.
    *
    * [Api set: ExcelApi 1.6]
    */
  var axisColor: js.UndefOr[String] = js.undefined
  /**
    *
    * Representation of how the axis is determined for an Excel data bar.
    *
    * [Api set: ExcelApi 1.6]
    */
  var axisFormat: js.UndefOr[ConditionalDataBarAxisFormat | Automatic | None | CellMidPoint] = js.undefined
  /**
    *
    * Represents the direction that the data bar graphic should be based on.
    *
    * [Api set: ExcelApi 1.6]
    */
  var barDirection: js.UndefOr[ConditionalDataBarDirection | Context | LeftToRight | RightToLeft] = js.undefined
  /**
    *
    * The rule for what consistutes the lower bound (and how to calculate it, if applicable) for a data bar.
    The `ConditionalDataBarRule` object must be set as a JSON object (use `x.lowerBoundRule = {...}` instead of `x.lowerBoundRule.formula = ...`).
    *
    * [Api set: ExcelApi 1.6]
    */
  var lowerBoundRule: js.UndefOr[ConditionalDataBarRule] = js.undefined
  /**
    *
    * Representation of all values to the left of the axis in an Excel data bar. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var negativeFormat: js.UndefOr[ConditionalDataBarNegativeFormatData] = js.undefined
  /**
    *
    * Representation of all values to the right of the axis in an Excel data bar. Read-only.
    *
    * [Api set: ExcelApi 1.6]
    */
  var positiveFormat: js.UndefOr[ConditionalDataBarPositiveFormatData] = js.undefined
  /**
    *
    * If true, hides the values from the cells where the data bar is applied.
    *
    * [Api set: ExcelApi 1.6]
    */
  var showDataBarOnly: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The rule for what constitutes the upper bound (and how to calculate it, if applicable) for a data bar.
    The `ConditionalDataBarRule` object must be set as a JSON object (use `x.upperBoundRule = {...}` instead of `x.upperBoundRule.formula = ...`).
    *
    * [Api set: ExcelApi 1.6]
    */
  var upperBoundRule: js.UndefOr[ConditionalDataBarRule] = js.undefined
}

object DataBarConditionalFormatData {
  @scala.inline
  def apply(
    axisColor: String = null,
    axisFormat: ConditionalDataBarAxisFormat | Automatic | None | CellMidPoint = null,
    barDirection: ConditionalDataBarDirection | Context | LeftToRight | RightToLeft = null,
    lowerBoundRule: ConditionalDataBarRule = null,
    negativeFormat: ConditionalDataBarNegativeFormatData = null,
    positiveFormat: ConditionalDataBarPositiveFormatData = null,
    showDataBarOnly: js.UndefOr[Boolean] = js.undefined,
    upperBoundRule: ConditionalDataBarRule = null
  ): DataBarConditionalFormatData = {
    val __obj = js.Dynamic.literal()
    if (axisColor != null) __obj.updateDynamic("axisColor")(axisColor.asInstanceOf[js.Any])
    if (axisFormat != null) __obj.updateDynamic("axisFormat")(axisFormat.asInstanceOf[js.Any])
    if (barDirection != null) __obj.updateDynamic("barDirection")(barDirection.asInstanceOf[js.Any])
    if (lowerBoundRule != null) __obj.updateDynamic("lowerBoundRule")(lowerBoundRule.asInstanceOf[js.Any])
    if (negativeFormat != null) __obj.updateDynamic("negativeFormat")(negativeFormat.asInstanceOf[js.Any])
    if (positiveFormat != null) __obj.updateDynamic("positiveFormat")(positiveFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(showDataBarOnly)) __obj.updateDynamic("showDataBarOnly")(showDataBarOnly.asInstanceOf[js.Any])
    if (upperBoundRule != null) __obj.updateDynamic("upperBoundRule")(upperBoundRule.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataBarConditionalFormatData]
  }
}

