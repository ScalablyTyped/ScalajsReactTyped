package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.officeJsStrings.DifferenceFrom
import typingsJapgolly.officeJs.officeJsStrings.Index
import typingsJapgolly.officeJs.officeJsStrings.None
import typingsJapgolly.officeJs.officeJsStrings.PercentDifferenceFrom
import typingsJapgolly.officeJs.officeJsStrings.PercentOf
import typingsJapgolly.officeJs.officeJsStrings.PercentOfColumnTotal
import typingsJapgolly.officeJs.officeJsStrings.PercentOfGrandTotal
import typingsJapgolly.officeJs.officeJsStrings.PercentOfParentColumnTotal
import typingsJapgolly.officeJs.officeJsStrings.PercentOfParentRowTotal
import typingsJapgolly.officeJs.officeJsStrings.PercentOfParentTotal
import typingsJapgolly.officeJs.officeJsStrings.PercentOfRowTotal
import typingsJapgolly.officeJs.officeJsStrings.PercentRunningTotal
import typingsJapgolly.officeJs.officeJsStrings.RankAscending
import typingsJapgolly.officeJs.officeJsStrings.RankDecending
import typingsJapgolly.officeJs.officeJsStrings.RunningTotal
import typingsJapgolly.officeJs.officeJsStrings.Unknown_
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

