package typingsJapgolly.officeJs.Excel.Interfaces

import typingsJapgolly.officeJs.Excel.AggregationFunction
import typingsJapgolly.officeJs.Excel.ShowAsRule
import typingsJapgolly.officeJs.officeJsStrings.Automatic
import typingsJapgolly.officeJs.officeJsStrings.Average
import typingsJapgolly.officeJs.officeJsStrings.Count
import typingsJapgolly.officeJs.officeJsStrings.CountNumbers
import typingsJapgolly.officeJs.officeJsStrings.Max
import typingsJapgolly.officeJs.officeJsStrings.Min
import typingsJapgolly.officeJs.officeJsStrings.Product
import typingsJapgolly.officeJs.officeJsStrings.StandardDeviation
import typingsJapgolly.officeJs.officeJsStrings.StandardDeviationP
import typingsJapgolly.officeJs.officeJsStrings.Sum
import typingsJapgolly.officeJs.officeJsStrings.Unknown_
import typingsJapgolly.officeJs.officeJsStrings.Variance
import typingsJapgolly.officeJs.officeJsStrings.VarianceP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `dataPivotHierarchy.toJSON()`. */
trait DataPivotHierarchyData extends js.Object {
  /**
    *
    * Returns the PivotFields associated with the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var field: js.UndefOr[PivotFieldData] = js.undefined
  /**
    *
    * Id of the DataPivotHierarchy.
    *
    * [Api set: ExcelApi 1.8]
    */
  var id: js.UndefOr[String] = js.undefined
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

object DataPivotHierarchyData {
  @scala.inline
  def apply(
    field: PivotFieldData = null,
    id: String = null,
    name: String = null,
    numberFormat: String = null,
    position: Int | Double = null,
    showAs: ShowAsRule = null,
    summarizeBy: AggregationFunction | Unknown_ | Automatic | Sum | Count | Average | Max | Min | Product | CountNumbers | StandardDeviation | StandardDeviationP | Variance | VarianceP = null
  ): DataPivotHierarchyData = {
    val __obj = js.Dynamic.literal()
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (showAs != null) __obj.updateDynamic("showAs")(showAs.asInstanceOf[js.Any])
    if (summarizeBy != null) __obj.updateDynamic("summarizeBy")(summarizeBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataPivotHierarchyData]
  }
}

