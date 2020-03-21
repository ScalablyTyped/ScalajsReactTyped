package typingsJapgolly.officeJsPreview.Excel

import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.DifferenceFrom
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Index
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.None
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.PercentDifferenceFrom
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.PercentOf
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.PercentOfColumnTotal
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.PercentOfGrandTotal
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.PercentOfParentColumnTotal
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.PercentOfParentRowTotal
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.PercentOfParentTotal
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.PercentOfRowTotal
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.PercentRunningTotal
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.RankAscending
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.RankDecending
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.RunningTotal
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * [Api set: ExcelApi 1.8]
  */
trait ShowAsRule extends js.Object {
  /**
    *
    * The base PivotField to base the ShowAs calculation, if applicable based on the ShowAsCalculation type, else null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var baseField: js.UndefOr[PivotField] = js.undefined
  /**
    *
    * The base Item to base the ShowAs calculation on, if applicable based on the ShowAsCalculation type, else null.
    *
    * [Api set: ExcelApi 1.8]
    */
  var baseItem: js.UndefOr[PivotItem] = js.undefined
  /**
    *
    * The ShowAs Calculation to use for the Data PivotField. See Excel.ShowAsCalculation for Details.
    *
    * [Api set: ExcelApi 1.8]
    */
  var calculation: ShowAsCalculation | Unknown_ | None | PercentOfGrandTotal | PercentOfRowTotal | PercentOfColumnTotal | PercentOfParentRowTotal | PercentOfParentColumnTotal | PercentOfParentTotal | PercentOf | RunningTotal | PercentRunningTotal | DifferenceFrom | PercentDifferenceFrom | RankAscending | RankDecending | Index
}

object ShowAsRule {
  @scala.inline
  def apply(
    calculation: ShowAsCalculation | Unknown_ | None | PercentOfGrandTotal | PercentOfRowTotal | PercentOfColumnTotal | PercentOfParentRowTotal | PercentOfParentColumnTotal | PercentOfParentTotal | PercentOf | RunningTotal | PercentRunningTotal | DifferenceFrom | PercentDifferenceFrom | RankAscending | RankDecending | Index,
    baseField: PivotField = null,
    baseItem: PivotItem = null
  ): ShowAsRule = {
    val __obj = js.Dynamic.literal(calculation = calculation.asInstanceOf[js.Any])
    if (baseField != null) __obj.updateDynamic("baseField")(baseField.asInstanceOf[js.Any])
    if (baseItem != null) __obj.updateDynamic("baseItem")(baseItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowAsRule]
  }
}

