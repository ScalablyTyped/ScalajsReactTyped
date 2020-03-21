package typingsJapgolly.officeJsPreview.Excel.Interfaces

import typingsJapgolly.officeJsPreview.Excel.AggregationFunction
import typingsJapgolly.officeJsPreview.Excel.ShowAsRule
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Automatic
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Average
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Count
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.CountNumbers
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Max
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Min
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Product
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.StandardDeviation
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.StandardDeviationP
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Sum
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Unknown_
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Variance
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.VarianceP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the DataPivotHierarchy object, for use in `dataPivotHierarchy.set({ ... })`. */
trait DataPivotHierarchyUpdateData extends js.Object {
  /**
    *
    * Returns the PivotFields associated with the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var field: js.UndefOr[PivotFieldUpdateData] = js.undefined
  /**
    *
    * Name of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    *
    * Number format of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var numberFormat: js.UndefOr[String] = js.undefined
  /**
    *
    * Position of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var position: js.UndefOr[Double] = js.undefined
  /**
    *
    * Determines whether the data should be shown as a specific summary calculation or not.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showAs: js.UndefOr[ShowAsRule] = js.undefined
  /**
    *
    * Determines whether to show all items of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var summarizeBy: js.UndefOr[
    AggregationFunction | Unknown_ | Automatic | Sum | Count | Average | Max | Min | Product | CountNumbers | StandardDeviation | StandardDeviationP | Variance | VarianceP
  ] = js.undefined
}

object DataPivotHierarchyUpdateData {
  @scala.inline
  def apply(
    field: PivotFieldUpdateData = null,
    name: String = null,
    numberFormat: String = null,
    position: Int | Double = null,
    showAs: ShowAsRule = null,
    summarizeBy: AggregationFunction | Unknown_ | Automatic | Sum | Count | Average | Max | Min | Product | CountNumbers | StandardDeviation | StandardDeviationP | Variance | VarianceP = null
  ): DataPivotHierarchyUpdateData = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (showAs != null) __obj.updateDynamic("showAs")(showAs.asInstanceOf[js.Any])
    if (summarizeBy != null) __obj.updateDynamic("summarizeBy")(summarizeBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPivotHierarchyUpdateData]
  }
}

