package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.officeJsStrings.None
import typingsJapgolly.officeJs.officeJsStrings.Normal
import typingsJapgolly.officeJs.officeJsStrings.Unlocked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the options in sheet protection.
  *
  * [Api set: ExcelApi 1.2]
  */
trait WorksheetProtectionOptions extends js.Object {
  /**
    *
    * Represents the worksheet protection option of allowing using auto filter feature.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowAutoFilter: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing deleting columns.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowDeleteColumns: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing deleting rows.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowDeleteRows: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing editing objects.
    *
    * [Api set: ExcelApi 1.7]
    */
  var allowEditObjects: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing editing scenarios.
    *
    * [Api set: ExcelApi 1.7]
    */
  var allowEditScenarios: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing formatting cells.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowFormatCells: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing formatting columns.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowFormatColumns: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing formatting rows.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowFormatRows: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing inserting columns.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowInsertColumns: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing inserting hyperlinks.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowInsertHyperlinks: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing inserting rows.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowInsertRows: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing using PivotTable feature.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowPivotTables: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of allowing using sort feature.
    *
    * [Api set: ExcelApi 1.2]
    */
  var allowSort: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the worksheet protection option of selection mode.
    *
    * [Api set: ExcelApi 1.7]
    */
  var selectionMode: js.UndefOr[ProtectionSelectionMode | Normal | Unlocked | None] = js.undefined
}

object WorksheetProtectionOptions {
  @scala.inline
  def apply(
    allowAutoFilter: js.UndefOr[Boolean] = js.undefined,
    allowDeleteColumns: js.UndefOr[Boolean] = js.undefined,
    allowDeleteRows: js.UndefOr[Boolean] = js.undefined,
    allowEditObjects: js.UndefOr[Boolean] = js.undefined,
    allowEditScenarios: js.UndefOr[Boolean] = js.undefined,
    allowFormatCells: js.UndefOr[Boolean] = js.undefined,
    allowFormatColumns: js.UndefOr[Boolean] = js.undefined,
    allowFormatRows: js.UndefOr[Boolean] = js.undefined,
    allowInsertColumns: js.UndefOr[Boolean] = js.undefined,
    allowInsertHyperlinks: js.UndefOr[Boolean] = js.undefined,
    allowInsertRows: js.UndefOr[Boolean] = js.undefined,
    allowPivotTables: js.UndefOr[Boolean] = js.undefined,
    allowSort: js.UndefOr[Boolean] = js.undefined,
    selectionMode: ProtectionSelectionMode | Normal | Unlocked | None = null
  ): WorksheetProtectionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowAutoFilter)) __obj.updateDynamic("allowAutoFilter")(allowAutoFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDeleteColumns)) __obj.updateDynamic("allowDeleteColumns")(allowDeleteColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDeleteRows)) __obj.updateDynamic("allowDeleteRows")(allowDeleteRows.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEditObjects)) __obj.updateDynamic("allowEditObjects")(allowEditObjects.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEditScenarios)) __obj.updateDynamic("allowEditScenarios")(allowEditScenarios.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFormatCells)) __obj.updateDynamic("allowFormatCells")(allowFormatCells.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFormatColumns)) __obj.updateDynamic("allowFormatColumns")(allowFormatColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFormatRows)) __obj.updateDynamic("allowFormatRows")(allowFormatRows.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInsertColumns)) __obj.updateDynamic("allowInsertColumns")(allowInsertColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInsertHyperlinks)) __obj.updateDynamic("allowInsertHyperlinks")(allowInsertHyperlinks.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInsertRows)) __obj.updateDynamic("allowInsertRows")(allowInsertRows.asInstanceOf[js.Any])
    if (!js.isUndefined(allowPivotTables)) __obj.updateDynamic("allowPivotTables")(allowPivotTables.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSort)) __obj.updateDynamic("allowSort")(allowSort.asInstanceOf[js.Any])
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorksheetProtectionOptions]
  }
}

